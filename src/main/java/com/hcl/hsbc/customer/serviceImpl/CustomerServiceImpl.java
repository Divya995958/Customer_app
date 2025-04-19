package com.hcl.hsbc.customer.serviceImpl;

import java.util.List;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.hsbc.customer.entity.CustomerEntity;
import com.hcl.hsbc.customer.paymentEntity.PaymentEntity;
import com.hcl.hsbc.customer.paymentRepo.PaymentRepo;
import com.hcl.hsbc.customer.repository.CustomerRepo;
import com.hcl.hsbc.customer.service.CustomerServiceI;
@Service
public class CustomerServiceImpl implements CustomerServiceI {

	 @Autowired
	    private CustomerRepo customerRepo;
	 @Autowired
	 public PaymentRepo paymentRepo;
	 
	@Override
	public CustomerEntity addCustomer(CustomerEntity entity) {
	CustomerEntity costomerE=customerRepo.save(entity);
		return costomerE;
	}

	@Override
	public Optional<CustomerEntity> findCustomerById(Long id) {
		Optional<CustomerEntity> customerEntitybyid =customerRepo.findById(id);
		return customerEntitybyid;
	}

	@Override
	public List<CustomerEntity> findCustomer() {
		List<CustomerEntity> findCustomer=customerRepo.findAll();		
		return findCustomer;
	}

	@Override
	public PaymentEntity addPayment(PaymentEntity entity) {
		PaymentEntity addPayment=paymentRepo.save(entity);		
		return addPayment;
	}

	@Override
	public Optional<PaymentEntity> findCustomerPayment(Long id) {
		 Optional<PaymentEntity>  findCustomerPayment=paymentRepo.findById(id);
		return findCustomerPayment;
	}

	@Override
	public List<PaymentEntity> findPayment() {
		List<PaymentEntity> findPayment=paymentRepo.findAll();		
		return findPayment;
	}

	

}
