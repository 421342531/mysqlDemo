package sqlUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateSql {

	    //根据id号进行更新出售价
		public static int updateSqlFunc(int updateId,double salePrice) throws ClassNotFoundException, SQLException {
			int result =0;
			Class.forName("com.mysql.cj.jdbc.Driver");
		 	System.out.println("Success loading Mysql Driver!");
		 	Connection connect = DriverManager.getConnection(
					 "jdbc:mysql://localhost:3306/mysql","root","nbcb,111");
			Statement statement =connect.createStatement();
			String sql=
					"UPDATE productinfo set saleprice = "+salePrice+" WHERE id ="+updateId;
			int rr = statement.executeUpdate(sql);// 更新成功条数 1为更新成功，0未更新
			System.out.println("rr= "+rr);
			statement.close();
			
			
			return result;
		}
		
		public static int updateInPriceFunc(int updateId,double inPrice) throws ClassNotFoundException, SQLException {
			int result =0;
			Class.forName("com.mysql.cj.jdbc.Driver");
		 	System.out.println("Success loading Mysql Driver!");
		 	Connection connect = DriverManager.getConnection(
					 "jdbc:mysql://localhost:3306/mysql","root","nbcb,111");
			Statement statement =connect.createStatement();
			String sql=
					"UPDATE productinfo set inPrice = "+inPrice+" WHERE id ="+updateId;
			int rr = statement.executeUpdate(sql);// 更新成功条数 1为更新成功，0未更新
			System.out.println("update result = "+rr);
			statement.close();
			
			
			return result;
		}
	
	
}
