package lesAutreCas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLExecuteQuery {

private static Statement stmt;
private static Connection conn;
private static String query;
private static String host;
private static String login;
private static String pw;
private static String pilote;
private static Object a_obj[];
private static Object obj;
private static ResultSet rs;

public SQLExecuteQuery(String pilote,String host,String login,String pw){
this.pilote = pilote;
this.host = host;
this.login = login;
this.pw = pw;
this.query = query;
Connect();
}
private static void Connect(){
	  try
	  {
		  int type = ResultSet.TYPE_SCROLL_INSENSITIVE;
		  int mode = ResultSet.CONCUR_UPDATABLE;
	
	  Class.forName(pilote).newInstance();
	  conn = DriverManager.getConnection(host,login,pw);
	  stmt = conn.createStatement(type,mode);
        }
	  catch ( SQLException E)
	  {
	  System.out.println("SQLException: " + E.getMessage());
        System.out.println("SQLState:     " + E.getSQLState());
        System.out.println("VendorError:  " + E.getErrorCode());
	  }
	  catch ( ClassNotFoundException E)
	  {
	  	E.printStackTrace();
	  }
	  catch ( InstantiationException E)
	  {
	  	System.out.println(E);
	  }
	  catch ( IllegalAccessException E)
	  {
	  	System.out.println(E);
	  }
	  catch ( NullPointerException E)
	  {
	  System.out.println(E);
	  }
}

public static void setQuery(String query){
try {
rs = stmt.executeQuery(query);
}
catch (SQLException E){
System.out.println("SQLException: " + E.getMessage());

System.out.println("SQLState:     " + E.getSQLState());
System.out.println("VendorError:  " + E.getErrorCode());
}
}

public static ResultSet getResultSet(){
return rs;
}

}


