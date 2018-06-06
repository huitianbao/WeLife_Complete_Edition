package edu.jlxy.Module.table.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.jlxy.Module.entity.UserEntity;
import edu.jlxy.Module.table.User;

public class UserImpl implements User {

	@Override
	public void insert(Connection connection, UserEntity userentity) throws SQLException {
		PreparedStatement pStatement = connection
				.prepareCall("INSERT INTO welife.usertable" + "(uid,pwd,name,age,job) VALUES(?,?,?,?,?)");
		pStatement.setString(1, userentity.getuid1());
		pStatement.setString(2, userentity.getpwd());
		pStatement.setString(3, userentity.getname());
		pStatement.setInt(4, userentity.getAge());
		pStatement.setString(5, userentity.getjob());
		pStatement.execute();

	}

	@Override
	public void delete(Connection connection, UserEntity userentity) throws SQLException {

		PreparedStatement pStatement = connection.prepareStatement("DELETE FROM " + "welife.usertable WHERE uid=?");
		pStatement.setString(1, userentity.getuid1());
		pStatement.execute();

	}

	@Override
	public ResultSet queryAll(Connection con) throws SQLException {

		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM usertable");
		ResultSet resultSet = preparedStatement.executeQuery();

		return resultSet;
	}

	@Override
	public ResultSet queryOneRow(Connection con, UserEntity userentity) throws SQLException {

		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM usertable WHERE uid=?");
		preparedStatement.setString(1, userentity.getuid1());
		return preparedStatement.executeQuery();
	}

	public ResultSet queryAge(Connection con, UserEntity userentity) throws SQLException {

		PreparedStatement preparedStatement = con.prepareStatement("SELECT age FROM usertable WHERE uid=?");
		preparedStatement.setString(1, userentity.getuid1());

		return preparedStatement.executeQuery();
	}

	@Override
	public ResultSet queryUId(Connection con, UserEntity userentity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT uid FROM usertable WHERE uid=?");
		preparedStatement.setString(1, userentity.getuid1());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	@Override
	public ResultSet queryAllUId(Connection con) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT uid FROM usertable ");
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	@Override
	public ResultSet queryPwd(Connection con, UserEntity userentity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT pwd FROM usertable WHERE uid=?");
		preparedStatement.setString(1, userentity.getuid1());

		return preparedStatement.executeQuery();
	}

	@Override
	public ResultSet queryName(Connection con, UserEntity userentity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT name FROM usertable WHERE uid=?");
		preparedStatement.setString(1, userentity.getuid1());

		return preparedStatement.executeQuery();
	}

	@Override
	public ResultSet queryJob(Connection con, UserEntity userentity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT job FROM usertable WHERE uid=?");
		preparedStatement.setString(1, userentity.getuid1());

		return preparedStatement.executeQuery();
	}

	@Override
	public void updateUid(Connection connection, UserEntity userentity) throws SQLException {
		
		
		PreparedStatement pStatement = connection.prepareCall("UPDATE usertable SET uid=? WHERE  uid=?");

		pStatement.setString(1, userentity.getuid1());
		pStatement.setString(2, userentity.getuid2());
		pStatement.execute();

	}

	@Override
	public void updatePwd(Connection connection, UserEntity userentity) throws SQLException {
		PreparedStatement pStatement = connection.prepareCall("UPDATE usertable SET pwd=? WHERE  uid=?");

		pStatement.setString(1, userentity.getpwd());
		pStatement.setString(2, userentity.getuid2());
		pStatement.execute();
	}

	@Override
	public void updateName(Connection connection, UserEntity userentity) throws SQLException {
		PreparedStatement pStatement = connection.prepareCall("UPDATE usertable SET name=? WHERE  uid=?");

		pStatement.setString(1, userentity.getname());
		pStatement.setString(2, userentity.getuid2());
		pStatement.execute();
	}

	@Override
	public void updateAge(Connection connection, UserEntity userentity) throws SQLException {
		PreparedStatement pStatement = connection.prepareCall("UPDATE usertable SET age=? WHERE  uid=?");

		pStatement.setInt(1, userentity.getAge());
		pStatement.setString(2, userentity.getuid2());
		pStatement.execute();
	}

	@Override
	public void updateJob(Connection connection, UserEntity userentity) throws SQLException {
		PreparedStatement pStatement = connection.prepareCall("UPDATE usertable SET job=? WHERE  uid=?");

		pStatement.setString(1, userentity.getname());
		pStatement.setString(2, userentity.getuid2());
		pStatement.execute();
	}

	@Override
	public void updateAll(Connection connection, UserEntity userentity) throws SQLException {
		PreparedStatement pStatement = connection.prepareCall("UPDATE friendtable SET uid=?,pwd=?,name=?,age=?,job=? WHERE  uid=?");

		pStatement.setString(1, userentity.getuid1());
		pStatement.setString(2, userentity.getpwd());
		pStatement.setString(3, userentity.getname());
		pStatement.setInt(4, userentity.getAge());
		pStatement.setString(5, userentity.getjob());
		pStatement.setString(6, userentity.getuid2());

	}

}
