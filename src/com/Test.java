package com;

import java.util.HashMap;

import sqlUtil.querySql;

public class Test {

	public static void main(String[] args) {
			HashMap<String,String> map = new HashMap<String,String>();
		     	map = querySql.queryUtil(1002+"");
		     	String  id = map.get("id").toString();
		     	String  inPrice = map.get("inPrice").toString();
		     	String  salePrice = map.get("salePrice").toString();
		     	String  mark = map.get("mark").toString();
		     	System.out.println(
						"id:"+id+
						" inPrice:"+inPrice+
						" salePrice:"+salePrice+
						" mark:"+mark
		     			);	
	}
	/*
	public static HashMap<String,String> queryUtil(String queryId) {
		ResultSet rs ;
		HashMap<String,String> hashMap =new HashMap<String,String>();
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 	System.out.println("Success loading Mysql Driver!");
		}
		 catch (Exception e) {
			 System.out.print("Error loading Mysql Driver!");
			 e.printStackTrace();
			  }
		 try {
			Connection connect = DriverManager.getConnection(
			 "jdbc:mysql://localhost:3306/mysql","root","nbcb,111");
			//java这个空填写的是你自己设的密码
			 
			System.out.println("Success connect Mysql server!");
			 PreparedStatement pstmt = null;
			 	String sql = "select * from productinfo where id = ?";
				pstmt = connect.prepareStatement(sql);
				pstmt.setString(1, queryId);
			
				rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				String idout = rs.getString("id");
				String inPriceout = rs.getString("inPrice");
				String salePriceout = rs.getString("salePrice");
				String markout = rs.getString("mark");
				hashMap.put("id", idout);
				hashMap.put("inPrice", inPriceout);
				hashMap.put("salePrice", salePriceout);
				hashMap.put("mark", markout);
				
			}
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		
		return hashMap;
	}*/
}
		

