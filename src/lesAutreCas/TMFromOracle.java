package lesAutreCas;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

class TMFromOracle extends AbstractTableModel {

public static SQLExecuteQuery connexion;

public TMFromOracle(String pilote,String host,String login,String pw,String query){
connexion = new SQLExecuteQuery(pilote,host,login,pw);
connexion.setQuery(query);
}

public int getColumnCount(){
int i = 0;
try {
i = connexion.getResultSet().getMetaData().getColumnCount();
}
catch(SQLException e){
System.out.println(e);

}
return i;
}
public int getRowCount(){
	int i = 0;
	try {
	ResultSet rs = connexion.getResultSet();
	rs.last();
	i = rs.getRow();
	}
	catch(SQLException e){
	System.out.println(e);
	}
	return i;
	}

	public String getColumnName(int c){
	String s = "";
	try {
	s = connexion.getResultSet().getMetaData().getColumnName(c + 1);
	}
	catch(SQLException e){
	System.out.println(e);
	}
	return s;
	}

	public Object getValueAt(int row,int column){
	Object o = "";
	try {
	ResultSet rs = connexion.getResultSet();
	rs.absolute(row + 1);
	o = rs.getObject(column + 1);
	}
	catch(SQLException e){
	System.out.println(e);
	}
	return o;
	}

	private static Object[][] data;
	private static Object[] colname;

	}




