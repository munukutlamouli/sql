package com.ts.us.dao;

import java.sql.*;


import com.ts.us.dto.User;
import com.ts.us.utility.DAOUtility;

public class UserDAO {

	public User insert(User user) {
		
		
			//User user=new User();
		
			Connection con=DAOUtility.getConn();
			String query="insert into user(name,gender,email,password,mobile_number,dob) values(?,?,?,?,?,?)";
			System.out.println("query is:" + query);
			try {
			java.sql.PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getGender());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getPassword());
			pstmt.setLong(5, user.getMobile_number());
			//java.sql.Date d=java.sql.Date.valueOf(dob);
			pstmt.setDate(6, user.getDate());
			int no = pstmt.executeUpdate();
			System.out.println(no+":Record is inserted..");
			//Get max id of User
			String query1="select max(id) from user";
			System.out.println("query1:"+query1);
			Statement stmt=con.createStatement();
			ResultSet res=stmt.executeQuery(query1);
			if(res.next()){
					int id=res.getInt(1);
					user.setId(id);
			}else{
				System.out.println("No Record is available");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;
	}
	public void update() {
		
	}
	public void retrieve() {
		
	}
	public void delete() {
		
	}
}



