package com.org.muthucorp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("Customers")
@Data
public class Customer {
    
	@Id
	String id;
    int customer_id;
    String customer_name;
    String first_name;
    String last_name;
    int mobile;
    String email;
    String created_date;
    String created_by;
    String updated_date;
    String updated_by;
    String status;
    String customer_type;
    String address_line1;
    String address_line2;
  
}
