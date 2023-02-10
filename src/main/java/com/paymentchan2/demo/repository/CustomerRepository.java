/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.paymentchan2.demo.repository;

import com.paymentchan2.demo.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author enriq
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
    
}
