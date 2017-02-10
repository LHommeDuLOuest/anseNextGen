package donneePersistante.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
	private static String  driver = "oracle.jdbc.driver.OracleDriver" ;
    private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	
	private static String user = "SYSTEM";
	
	private static String passwd = "LYES";
	
	private static Connection connect;
	
	
	
	public static Connection getInstance(){
		if(connect == null){
			try {
				Class.forName(driver);
				connect =  DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		System.out.println("l'objet connection a ete creer");
		return connect;	
	}	
}







