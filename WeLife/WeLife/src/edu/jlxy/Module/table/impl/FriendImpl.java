package edu.jlxy.Module.table.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.jlxy.Module.entity.FriendEntity;
import edu.jlxy.Module.table.Friend;
import edu.jlxy.util.ResultSetUtil;


public class FriendImpl implements Friend {
	private ResultSetUtil resultSetUtil=ResultSetUtil.getInstance();

	@Override
	public void insert(Connection connection, FriendEntity friendEntity) throws SQLException {

		
		PreparedStatement pStatement = connection.prepareCall("INSERT INTO friendtable"
				+ "(uid,fid,l1,l2,l3,l4,l5) VALUES(?,?,?,?,?,?,?)");
		pStatement.setString(1, friendEntity.getuid());
		pStatement.setString(2, friendEntity.getfid());
		pStatement.setString(3, friendEntity.getl1());
		pStatement.setString(4, friendEntity.getl2());
		pStatement.setString(5, friendEntity.getl3());
		pStatement.setString(6, friendEntity.getl4());
		pStatement.setString(7, friendEntity.getl5());
		
		 pStatement.execute();
		

		pStatement = connection.prepareCall("INSERT INTO friendtable"
				+ "(uid,fid,l1,l2,l3,l4,l5) VALUES(?,?,?,?,?,?,?)");
		pStatement.setString(2, friendEntity.getuid());
		pStatement.setString(1, friendEntity.getfid());
		pStatement.setString(3, null);
		pStatement.setString(4, null);
		pStatement.setString(5, null);
		pStatement.setString(6, null);
		pStatement.setString(7, null);
		 pStatement.execute();
		
	}

	@Override
	public void update(Connection connection, FriendEntity friendEntity) throws SQLException {
		PreparedStatement pStatement = connection.prepareCall(
				"UPDATE friendtable SET l1=?,l2=?,l3=?,l4=?,l5=? WHERE fid=? AND uid=?");
		
		pStatement.setString(1, friendEntity.getl1());
		pStatement.setString(2, friendEntity.getl2());
		pStatement.setString(3, friendEntity.getl3());
		pStatement.setString(4, friendEntity.getl4());
		pStatement.setString(5, friendEntity.getl5());
		pStatement.setString(6, friendEntity.getfid());
		pStatement.setString(7, friendEntity.getuid());
		
	 pStatement.execute();
		

	}

	@Override
	public void delete(Connection connection, FriendEntity friendEntity) throws SQLException {
		
		PreparedStatement pStatement = connection.prepareStatement("DELETE FROM " + "friendtable WHERE fid=? AND uid=?");
		pStatement.setString(1, friendEntity.getfid());
		pStatement.setString(2,friendEntity.getuid());
		
		 pStatement.execute();
		
		pStatement = connection.prepareStatement("DELETE FROM " + "friendtable WHERE fid=? AND uid=?");
		pStatement.setString(2, friendEntity.getfid());
		pStatement.setString(1,friendEntity.getuid());
		pStatement.execute();
		

	}

	@Override
	public ResultSet queryAll(Connection con) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM friendtable");
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====̫结果集为空!=====");
			return null;
		}else {
			System.out.println("=====查询成功!！=====");
			return resultSet;
		}
		
	}

	@Override
	public ResultSet queryOneRow(Connection con, FriendEntity friendEntity) throws SQLException {
		PreparedStatement pStatement = con.prepareStatement("SELECT * FROM friendtable WHERE uid=? AND fid=?");
		pStatement.setString(2, friendEntity.getfid());
		pStatement.setString(1,friendEntity.getuid());
		ResultSet resultSet = pStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====̫结果集为空!=====");
			return null;
		}else {
			System.out.println("=====查询成功!=====");
			return resultSet;
		}
		
	}

	@Override
	public ResultSet queryUId(Connection con, FriendEntity friendEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT distinct uid FROM friendtable WHERE fid=? ");
		preparedStatement.setString(1, friendEntity.getfid());
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====̫结果集为空!=====");
			return null;
		}else {
			System.out.println("=====查询成功!=====");
			return resultSet;
		}
		
	}

	@Override
	public ResultSet queryFId(Connection con, FriendEntity friendEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT  fid FROM friendtable WHERE uid=?");
		preparedStatement.setString(1, friendEntity.getfid());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====̫结果集为空!=====");
			return null;
		}else {
			System.out.println("=====查询成功!=====");
			return resultSet;
		}
	}

	@Override
	public ResultSet queryl1(Connection con, FriendEntity friendEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT l1 FROM friendtable WHERE fid=? AND uid=?");
		preparedStatement.setString(1, friendEntity.getfid());
		preparedStatement.setString(2, friendEntity.getuid());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====̫结果集为空!=====");
			return null;
		}else {
			System.out.println("=====查询成功!=====");
			return resultSet;
		}
	}

	@Override
	public ResultSet queryl2(Connection con, FriendEntity friendEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT l2 FROM friendtable WHERE fid=? AND uid=?");
		preparedStatement.setString(1, friendEntity.getfid());
		preparedStatement.setString(2, friendEntity.getuid());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====̫结果集为空!=====");
			return null;
		}else {
			System.out.println("=====查询成功!=====");
			return resultSet;
		}
	}

	@Override
	public ResultSet queryl3(Connection con, FriendEntity friendEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT l3 FROM friendtable WHERE fid=? AND uid=?");
		preparedStatement.setString(1, friendEntity.getfid());
		preparedStatement.setString(2, friendEntity.getuid());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====̫结果集为空!=====");
			return null;
		}else {
			System.out.println("=====查询成功!=====");
			return resultSet;
		}
	}

	@Override
	public ResultSet queryl4(Connection con, FriendEntity friendEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT l4 FROM friendtable WHERE fid=? AND uid=?");
		preparedStatement.setString(1, friendEntity.getfid());
		preparedStatement.setString(2, friendEntity.getuid());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====̫结果集为空!=====");
			return null;
		}else {
			System.out.println("=====查询成功!=====");
			return resultSet;
		}
	}

	@Override
	public ResultSet queryl5(Connection con, FriendEntity friendEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT l5 FROM friendtable WHERE fid=? AND uid=?");
		preparedStatement.setString(1, friendEntity.getfid());
		preparedStatement.setString(2, friendEntity.getuid());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====̫结果集为空!=====");
			return null;
		}else {
			System.out.println("=====查询成功!=====");
			return resultSet;
		}
	}

	@Override
	public ResultSet queryAllLabel(Connection con, FriendEntity friendEntity) throws SQLException {
		
		ResultSet resultSet=queryOneRow(con, friendEntity);
		if(resultSet==null){
			System.out.println("=====̫结果集为空!=====");
			return null;
		}else {
			System.out.println("=====查询成功!=====");
			resultSetUtil.showResultSet(resultSet, 3);
			return resultSet;
		}
	}
	//查询某个用户的所有好友
	@Override
	public ResultSet queryMyFriend(Connection con, FriendEntity friendEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM friendtable where uid=?");
		preparedStatement.setString(1, friendEntity.getuid());
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet==null){
			System.out.println("=====̫结果集为空!=====");
			return null;
		}else {
			System.out.println("=====查询成功!！=====");
			return resultSet;
		}
	}
	//查询某个用户的所有好友
		@Override
		public ResultSet queryMyFriendFid(Connection con, FriendEntity friendEntity) throws SQLException {
			PreparedStatement preparedStatement = con.prepareStatement("SELECT fid FROM friendtable where uid=?");
			preparedStatement.setString(1, friendEntity.getuid());
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet==null){
				System.out.println("=====̫结果集为空!=====");
				return null;
			}else {
				System.out.println("=====查询成功!！=====");
				return resultSet;
			}
		}

}
