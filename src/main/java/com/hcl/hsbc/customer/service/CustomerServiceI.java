package com.hcl.hsbc.customer.service;

import java.util.List;
import java.util.Optional;

import com.hcl.hsbc.customer.entity.CustomerEntity;
import com.hcl.hsbc.customer.paymentEntity.PaymentEntity;

public interface CustomerServiceI {
	public CustomerEntity addCustomer(CustomerEntity entity);
	
	public Optional<CustomerEntity> findCustomerById(Long id);

	public List<CustomerEntity> findCustomer();
	
	public PaymentEntity addPayment(PaymentEntity entity);
	public  Optional<PaymentEntity> findCustomerPayment(Long id);
	public List<PaymentEntity> findPayment();
}
