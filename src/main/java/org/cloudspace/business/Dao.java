package org.cloudspace.business;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class Dao {
	Connection connection=new Connection() {
		
		public <T> T unwrap(Class<T> arg0) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public boolean isWrapperFor(Class<?> arg0) throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}
		
		public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		public void setTransactionIsolation(int level) throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		public void setSchema(String schema) throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		public Savepoint setSavepoint(String name) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public Savepoint setSavepoint() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public void setReadOnly(boolean readOnly) throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		public void setHoldability(int holdability) throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		public void setClientInfo(String name, String value) throws SQLClientInfoException {
			// TODO Auto-generated method stub
			
		}
		
		public void setClientInfo(Properties properties) throws SQLClientInfoException {
			// TODO Auto-generated method stub
			
		}
		
		public void setCatalog(String catalog) throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		public void setAutoCommit(boolean autoCommit) throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		public void rollback(Savepoint savepoint) throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		public void rollback() throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		public void releaseSavepoint(Savepoint savepoint) throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency,
				int resultSetHoldability) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
				throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public PreparedStatement prepareStatement(String sql) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency,
				int resultSetHoldability) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public CallableStatement prepareCall(String sql) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public String nativeSQL(String sql) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public boolean isValid(int timeout) throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}
		
		public boolean isReadOnly() throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}
		
		public boolean isClosed() throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}
		
		public SQLWarning getWarnings() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public Map<String, Class<?>> getTypeMap() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public int getTransactionIsolation() throws SQLException {
			// TODO Auto-generated method stub
			return 0;
		}
		
		public String getSchema() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public int getNetworkTimeout() throws SQLException {
			// TODO Auto-generated method stub
			return 0;
		}
		
		public DatabaseMetaData getMetaData() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public int getHoldability() throws SQLException {
			// TODO Auto-generated method stub
			return 0;
		}
		
		public String getClientInfo(String name) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public Properties getClientInfo() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public String getCatalog() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public boolean getAutoCommit() throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}
		
		public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability)
				throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public Statement createStatement() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public SQLXML createSQLXML() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public NClob createNClob() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public Clob createClob() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public Blob createBlob() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public void commit() throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		public void close() throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		public void clearWarnings() throws SQLException {
			// TODO Auto-generated method stub
			
		}
		
		public void abort(Executor executor) throws SQLException {
			// TODO Auto-generated method stub
			
		}
	};

}
