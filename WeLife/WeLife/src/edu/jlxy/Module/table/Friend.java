package edu.jlxy.Module.table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import edu.jlxy.Module.entity.FriendEntity;



public interface Friend {
	public void insert(Connection connection, FriendEntity friendEntity) throws SQLException;

	public void update(Connection connection, FriendEntity friendEntity) throws SQLException;

	public void delete(Connection connection, FriendEntity friendEntity) throws SQLException;

	public ResultSet queryAll(Connection con) throws SQLException;
	
	public ResultSet queryMyFriend(Connection con, FriendEntity friendEntity) throws SQLException;

	public ResultSet queryOneRow(Connection con, FriendEntity friendEntity) throws SQLException;

	public ResultSet queryUId(Connection con,FriendEntity friendEntity) throws SQLException;

	public ResultSet queryFId(Connection con, FriendEntity friendEntity) throws SQLException;

	public ResultSet queryl1(Connection con, FriendEntity friendEntity) throws SQLException;
	
	public ResultSet queryl2(Connection con, FriendEntity friendEntity) throws SQLException;
	
	public ResultSet queryl3(Connection con, FriendEntity friendEntity) throws SQLException;
	
	public ResultSet queryl4(Connection con, FriendEntity friendEntity) throws SQLException;
	
	public ResultSet queryl5(Connection con, FriendEntity friendEntity) throws SQLException;
	
	public ResultSet queryAllLabel(Connection con, FriendEntity friendEntity) throws SQLException;
	
	public ResultSet queryMyFriendFid(Connection con, FriendEntity friendEntity) throws SQLException;

}
