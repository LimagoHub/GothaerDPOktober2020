package de.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Table implements AutoCloseable{
	private static final String CONNECTION_STRING="jdbc:mysql://localhost:3306/gothaer?useSSL=false&serverTimezone=UTC";
	private final String selectString ;
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	private ResultSetMetaData resultSetMetaData = null;
	private Map<String, String> zeile = null;
	private int columnCount = -1;

	public Table(final String selectString) {
		this.selectString = selectString;
	}
	
	public int getColumnCount() throws Exception {
		if(columnCount < 0)
			columnCount = getResultSetMetaData().getColumnCount();
		return columnCount;
	}
	
	
	public String getValue(final int column) throws Exception {
		return getValue(getColumnName(column));
	}
	
	public String getValue(final String columnName) throws Exception {
		return getZeile().get(columnName);
	}
	
	
	public String getColumnName(final int column) throws Exception {
		return getResultSetMetaData().getColumnName(column + 1);
	}
	
	public boolean next() throws Exception {
		if (getResultSet().next()) {
			excangeData();
			return true;
		}
		return false;
	}

	private void excangeData() throws Exception{
		for( int column = 0; column < getColumnCount(); column++) {
			getZeile().put(getColumnName(column), getResultSet().getNString(getColumnName(column)));
		}
		
	}

	@Override
	public void close() throws Exception {
		if(resultSet != null) resultSet.close();
		if(statement != null) statement.close();
		if(connection != null) connection.close();
		
	}

	private String getSelectString() {
		return selectString;
	}

	private Connection getConnection() throws Exception{
		if(connection == null) {
			connection = DriverManager.getConnection(CONNECTION_STRING,"root","yop49JZ");
		}
		return connection;
	}

	private Statement getStatement() throws Exception{
		if(statement == null) {
			statement = getConnection().createStatement();
		}
		return statement;
	}

	private ResultSet getResultSet() throws Exception{
		if(resultSet == null) {
			resultSet = getStatement().executeQuery(getSelectString());
		}
		return resultSet;
	}

	private ResultSetMetaData getResultSetMetaData() throws Exception{
		if(resultSetMetaData == null) {
			resultSetMetaData = getResultSet().getMetaData();
		}
		return resultSetMetaData;
	}

	private Map<String, String> getZeile() throws Exception{
		if(zeile == null) {
			zeile = new HashMap<>();
			for(int column = 0; column < getColumnCount(); column ++) {
				zeile.put(getColumnName(column), "<leer>");
			}
		}
		return zeile;
	}
	
	

}
