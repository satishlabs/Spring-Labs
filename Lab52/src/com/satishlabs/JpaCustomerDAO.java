package com.satishlabs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class JpaCustomerDAO implements CustomerDAO{
	
	@Autowired
	private JpaTemplate jpaTemp;
	
	@Autowired
	private JpaTransactionManager txManager = null;
	
	@Override
	public void addCustomer(CustomerTO cto) {
		Customer cust = new Customer(cto.getCid(), cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity());
		TransactionDefinition txDef = new DefaultTransactionDefinition();
		TransactionStatus ts = txManager.getTransaction(txDef);
		jpaTemp.persist(cust);
		txManager.commit(ts);
	}

	@Override
	public void updateCustomer(CustomerTO cto) {
		TransactionDefinition txDef = new DefaultTransactionDefinition();
		TransactionStatus ts = txManager.getTransaction(txDef);
		Customer c = jpaTemp.find(Customer.class,cto.getCid());
		c.setCid(cto.getCid());
		c.setCname(cto.getCname());
		c.setEmail(cto.getEmail());
		c.setPhone(cto.getPhone());
		c.setCity(cto.getCity());
		jpaTemp.merge(c);
		txManager.commit(ts);
	}

	@Override
	public void deleteCustomer(int cid) {
		TransactionDefinition txDef = new DefaultTransactionDefinition();
		TransactionStatus ts = txManager.getTransaction(txDef);
		Customer c = jpaTemp.find(Customer.class,cid);
		jpaTemp.remove(c);
		txManager.commit(ts);
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		Customer c = jpaTemp.find(Customer.class,cid);
		CustomerTO cto = new CustomerTO(c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
		return cto;
	}

}
