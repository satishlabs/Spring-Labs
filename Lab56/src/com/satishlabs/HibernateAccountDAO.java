package com.satishlabs;

import org.hibernate.LockMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class HibernateAccountDAO implements AccountDAO{
	@Autowired
	private HibernateTemplate hibernateTemp = null;
	
	@Autowired
	private HibernateTransactionManager txManager = null;
	
	@Override
	public void deposit(int accno, double amt) {
		TransactionDefinition txDef = new DefaultTransactionDefinition();
		TransactionStatus ts = txManager.getTransaction(txDef);
		Account acc = hibernateTemp.load(Account.class,	accno, LockMode.READ);
		acc.setBalance(acc.getBalance()+amt);
		txManager.commit(ts);
	}

	@Override
	public void withdraw(int accno, double amt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fundsTransfer(int accno, int daccno, double amt) {
		TransactionDefinition txDef = new DefaultTransactionDefinition();
		TransactionStatus ts = txManager.getTransaction(txDef);
		
		try {
			Account acc1 = hibernateTemp.load(Account.class, daccno, LockMode.READ);
			acc1.setBalance(acc1.getBalance()+amt);
			
			Account acc2 = hibernateTemp.load(Account.class, accno, LockMode.READ);
			double scbal = acc2.getBalance();
			if(scbal >= 500+amt) {
				acc2.setBalance(scbal-amt);
				hibernateTemp.update(acc2);
			}else {
				throw new InSufficientFundsException();
			}
			txManager.commit(ts);
		}catch (Exception e) {
			txManager.rollback(ts);
		}
		
	}

	@Override
	public double getBalance(int accno) {
		System.out.println(hibernateTemp);
		Account acc = hibernateTemp.load(Account.class, accno, LockMode.READ);
		double cbal = acc.getBalance();
		return cbal;
	}

}
