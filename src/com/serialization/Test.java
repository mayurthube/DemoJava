package com.serialization;

import java.io.Serializable;
import java.util.Date;

public class Test implements Serializable {

	// Making password transient for security
    public transient String password;
  
    // Making age transient as age is auto-
    // computable from DOB and current date.
    transient int age;
  
    // serialize other fields
    String username, email;
    Date dob;
}
