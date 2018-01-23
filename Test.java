package com.ts.us.test;

import java.util.Date;

import com.ts.us.dao.UserDAO;
import com.ts.us.dto.User;

public class Test {

	public static void main(String[] args) {
		UserDAO d=new UserDAO();
		String name="naveen";
		String gender="male";
		String email="naveen@gmail.com";
		String password="naveen123";
		long mobile_number=8912541235l;
		String dob="1994-10-04";
		User user=new User();
		user.setName(name);
		user.setGender(gender);
		user.setEmail(email);
		user.setPassword(password);
		user.setMobile_number(mobile_number);
		user.setDate(java.sql.Date.valueOf(dob));
		
		User u=d.insert(user);
		System.out.println("u r id is "+u.getId());
	}

}
