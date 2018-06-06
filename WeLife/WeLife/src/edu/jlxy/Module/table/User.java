package edu.jlxy.Module.table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import edu.jlxy.Module.entity.UserEntity;

public interface User {
	public void insert(Connection connection, UserEntity userentity) throws SQLException;
	
	public void updateAll(Connection connection, UserEntity userentity) throws SQLException;

	public void updateUid(Connection connection, UserEntity userentity) throws SQLException;
	
	public void updatePwd(Connection connection, UserEntity userentity) throws SQLException;
	
	public void updateName(Connection connection, UserEntity userentity) throws SQLException;
	
	public void updateAge(Connection connection, UserEntity userentity) throws SQLException;
	
	public void updateJob(Connection connection, UserEntity userentity) throws SQLException;

	public void delete(Connection connection, UserEntity userentity) throws SQLException;

	public ResultSet queryAll(Connection con) throws SQLException;

	public ResultSet queryOneRow(Connection con, UserEntity userentity) throws SQLException;

	public ResultSet queryUId(Connection con, UserEntity userentity) throws SQLException;
	
	public ResultSet queryAllUId(Connection con) throws SQLException;

	public ResultSet queryPwd(Connection con, UserEntity userentity) throws SQLException;

	public ResultSet queryName(Connection con, UserEntity userentity) throws SQLException;

	public ResultSet queryJob(Connection con, UserEntity userentity) throws SQLException;

}
