package com.satishlabs;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaCallback;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.support.JpaDaoSupport;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class JpaCustomerImpl extends JpaDaoSupport implements CustomerDAO{
	
	@Autowired
	private JpaTransactionManager txManager = null;
	
	@Override
	public void addCustomer(CustomerTO cto) {
		Customer cust = new Customer(cto.getCid(), cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity());
		JpaCallback<EntityManager> jc = new JpaCallback<EntityManager>() {

			@Override
			public EntityManager doInJpa(EntityManager manager) throws PersistenceException {
				manager.persist(cust);
				return manager;
			}
		};
		
		TransactionDefinition txDef = new DefaultTransactionDefinition();
		TransactionStatus ts = txManager.getTransaction(txDef);
		getJpaTemplate().execute(jc);
		txManager.commit(ts);
	}

}
