package com.hcl.hsbc.customer.paymentEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="paymentEntity_entity")
public class PaymentEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="payment_id")
    private Long paymentId;

    @Column(name="customer_id")
    private Long customerId;

    @Column(name="amount")
    private Double amount;

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public PaymentEntity(Long paymentId, Long customerId, Double amount) {
		super();
		this.paymentId = paymentId;
		this.customerId = customerId;
		this.amount = amount;
	}
	public PaymentEntity() {
		
	}

	@Override
	public String toString() {
		return "PaymentEntity [paymentId=" + paymentId + ", customerId=" + customerId + ", amount=" + amount
				+ ", getPaymentId()=" + getPaymentId() + ", getCustomerId()=" + getCustomerId() + ", getAmount()="
				+ getAmount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
