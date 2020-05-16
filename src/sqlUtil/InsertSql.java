package sqlUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;


public class InsertSql {

	public static int insertSqlFunc(int id,String inPrice,String salePrice,String mark) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	 	System.out.println("Success loading Mysql Driver!");
	 	Connection connect = DriverManager.getConnection(
				 "jdbc:mysql://localhost:3306/mysql","root","nbcb,111");
	 	PreparedStatement statement = null;
		String sql = "insert into productinfo(id,inPrice,salePrice,mark) values(?,?,?,?)";
		statement = connect.prepareStatement(sql);
		statement.setInt(1, id);
		statement.setString(2, inPrice);
		statement.setString(3, salePrice);
		statement.setString(4, mark);
		int result =0;
		try {
			result = statement.executeUpdate();
			
		}catch(SQLIntegrityConstraintViolationException e) {
			System.out.println("error! Duplicate insert!");
		}
        System.out.println("insert result = "+result);
        return result;
	}
		
	}
	
	
