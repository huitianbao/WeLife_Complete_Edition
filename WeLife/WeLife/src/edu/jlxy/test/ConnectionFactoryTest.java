package edu.jlxy.test;

import java.sql.Connection;
import java.sql.SQLException;

import edu.jlxy.util.ConnectionFactory;

public class ConnectionFactoryTest {
	public static void main(String[] args) throws SQLException{
		
		ConnectionFactory cf = ConnectionFactory.getInstance();
		Connection connection = cf.makeConnection();
		System.out.println(connection.getAutoCommit());
	}

}
