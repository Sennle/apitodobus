package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Mysqldb {
	
	public static Connection getConexion() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://servidorbdapi.mysql.database.azure.com:3306/bd_todobus?useSSL=true&requireSSL=false";
			String usr = "admi@servidorbdapi";
			String psw = "2003400jamdrL";
			con = DriverManager.getConnection(url, usr, psw);
		} catch (ClassNotFoundException ex) {
			System.out.println("Error >> Driver no Instalado!!");
		} catch (SQLException ex) {
			System.out.println("Error >> de conexión con la BD");
		}
		return con;
	}
	
	// String url ="jdbc:mysql://servidorbdapi.mysql.database.azure.com:3306/{your_database}?useSSL=true&requireSSL=false"; 
 
}
