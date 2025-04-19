package com.hcl.hsbc.customer.paymentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.hsbc.customer.paymentEntity.PaymentEntity;

public interface PaymentRepo extends JpaRepository<PaymentEntity, Long>{

}
