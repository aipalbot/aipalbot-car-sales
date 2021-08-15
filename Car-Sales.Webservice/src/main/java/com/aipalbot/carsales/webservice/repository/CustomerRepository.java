package com.aipalbot.carsales.webservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aipalbot.carsales.webservice.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

	List<CustomerEntity> findAll();
	
	CustomerEntity findByCustomerEmail(String email);
	
	CustomerEntity findByPhoneNumber(String phone);
	
//	  @Repository
//	  public interface CustomerRepository extends JpaRepository<Customer , Long> {
//
//	     @Query("update Customer c set c.name = :name WHERE c.id = :customerId")
//	     void setCustomerName(@Param("customerId") Long id, @Param("name") String name);
//
//	  }
}
