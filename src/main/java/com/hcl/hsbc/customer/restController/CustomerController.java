package com.hcl.hsbc.customer.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hcl.hsbc.customer.entity.CustomerEntity;
import com.hcl.hsbc.customer.paymentEntity.PaymentEntity;
import com.hcl.hsbc.customer.service.CustomerServiceI;

@RestController
@RequestMapping("/add")
public class CustomerController {
	
	@Autowired
 private CustomerServiceI customerServiceI;
	 
	 @PostMapping("/customers")
	    public ResponseEntity<CustomerEntity> addCustomer(@RequestBody CustomerEntity customer) {
	        CustomerEntity savedCustomer = customerServiceI.addCustomer(customer);
	        return ResponseEntity.ok(savedCustomer);
}
	 
	 @GetMapping("/customers/{id}")
	    public Optional<CustomerEntity> findCustomerById(@PathVariable Long id) {
		 Optional<CustomerEntity> customerEntitybyid= customerServiceI.findCustomerById(id);
			return customerEntitybyid;
	       
	        
	 }
	 @GetMapping("/customer")
	 public ResponseEntity< List<CustomerEntity>> findCustomers() {
		 List<CustomerEntity> customerEntity= customerServiceI.findCustomer();	
		 return ResponseEntity.ok(customerEntity);
		 
		 }
	 @PostMapping("/payment")
	 public ResponseEntity<PaymentEntity> addPayment(@RequestBody PaymentEntity entity){
		 PaymentEntity addPayment= customerServiceI.addPayment(entity);
		return ResponseEntity.ok(addPayment);
		 
	 }
	 @GetMapping("/payment/{id}")
	 public  Optional<PaymentEntity> findCustomerPayment(@PathVariable Long id){
		 Optional<PaymentEntity> findCustomerPaymentByid= customerServiceI.findCustomerPayment(id);
		return findCustomerPaymentByid;
		 
	 }
	 @GetMapping("/payment")
	 public ResponseEntity<List<PaymentEntity>> findPayment(){
		 List<PaymentEntity> findPayment  =customerServiceI.findPayment();
		return ResponseEntity.ok(findPayment);
		 
		 
	 }
}
