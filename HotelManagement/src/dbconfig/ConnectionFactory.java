package dbconfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//Single call

public class ConnectionFactory {


	private ConnectionFactory() {
		// TODO Auto-generated constructor stub
		System.out.println("connection factory is created");
	}

	private static ConnectionFactory factory = new ConnectionFactory();
	public static ConnectionFactory getConnectionFactory() {

		return factory;
	}

	public Connection getConnection() throws ClassNotFoundException, SQLException, IOException {


		FileInputStream fin = new FileInputStream("config/dbconfig.properties");
		Properties dbprops= new Properties();
		dbprops.load(fin);

		String driverClassName=dbprops.getProperty("driver");
		String driverUrl=dbprops.getProperty("url");
		String driverUser=dbprops.getProperty("user");
		String driverPassword=dbprops.getProperty("password");

		//load jdbc driver

		Class.forName(driverClassName);
		System.out.println("jdbc driver loaded");


		Connection con= DriverManager.getConnection(driverUrl,driverUser ,driverPassword );
		System.out.println("Db connection is established");

		return con;

	}

}

