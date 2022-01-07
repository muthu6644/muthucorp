package com.org.muthucorp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("Users")
@Data
public class User {
    
	@Id
	String Id;
    int user_id;
    String user_name;
    String first_name;
    String last_name;    
    String user_desg;
    int mobile;
    String email;
    String created_date;
    String created_by;
    String updated_date;
    String updated_by;
    String status;
    String role;
    String address_line1;
    String address_line2;    
 
}
