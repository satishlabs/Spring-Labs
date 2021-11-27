package com.satishlabs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class JdbcAccountDAO implements AccountDAO{
	@Autowired
	private JdbcTemplate jdbcTemp = null;
	
	@Autowired
	private DataSourceTransactionManager txManager = null;
	
	@Override
	public void deposit(int accno, double amt) {
		TransactionDefinition txDef = new DefaultTransactionDefinition();
		TransactionStatus ts = txManager.getTransaction(txDef);
		String sql = "select balance from from accounts where accno=?";
		int x = jdbcTemp.queryForInt(sql, accno);
		double cbal = new Integer(x).doubleValue();
		String sql1 = "update accounts set balance=? where accno=?";
		jdbcTemp.update(sql1, cbal, accno);
		txManager.commit(ts);	
	}

	@Override
	public void withdraw(int accno, double amt) {
		TransactionDefinition txDef = new DefaultTransactionDefinition();
		TransactionStatus ts = txManager.getTransaction(txDef);
		String sql = "select balance from accounts where accno=?";
		int x = jdbcTemp.queryForInt(sql, accno);
		double cbal = new Integer(x).doubleValue();
		if(cbal >= 5000+amt) {
			double nbal = cbal+amt;
			String sql1 = "update accounts set bal=? where accno=?";
			jdbcTemp.update(sql1, nbal, accno);
		}else {
			throw new InSufficientFundsException();
		}
		txManager.commit(ts);
	}

	@Override
	public void fundsTransfer(int accno, int daccno, double amt) {
		TransactionDefinition txDef = new DefaultTransactionDefinition();
		TransactionStatus ts = txManager.getTransaction(txDef);
		try {
			String sql1 = "select balance from accounts where accno=?";
			String sql2 = "update accounts set balance=? where accno=?";
			int y = jdbcTemp.queryForInt(sql2, accno);
			double cbal = new Integer(y).doubleValue();
			System.out.println("Before deposit "+cbal);
			
			double dnbal = cbal+amt;
			jdbcTemp.update(sql2, dnbal, cbal);
			
			y = jdbcTemp.queryForInt(sql1, daccno);
			cbal = new Integer(y).doubleValue();
			
			System.out.println("After deposit "+cbal);
			int x = jdbcTemp.queryForInt(sql1, accno);
			double scbal = new Integer(x).doubleValue();
			if(scbal >= 5000+amt) {
				double snbal = scbal+amt;
				jdbcTemp.update(sql2, snbal, daccno);
			}else {
				throw new InSufficientFundsException();
			}
			txManager.commit(ts);
		}catch (Exception e) {
			txManager.rollback(ts);
			e.printStackTrace();
		}
		
	}

	@Override
	public double getBalance(int accno) {
		String sql ="select balance from accounts where accno=?";
		int x = jdbcTemp.queryForInt(sql, accno);
		double cbal = new Integer(x).doubleValue();
		return cbal;
	}

}
