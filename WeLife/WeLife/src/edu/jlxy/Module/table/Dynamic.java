package edu.jlxy.Module.table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.jlxy.Module.entity.DynamicEntity;
import edu.jlxy.Module.entity.ShareEntity;

public interface Dynamic {

	public void insert(Connection connection, DynamicEntity dynamicEntity ,ShareEntity shareEntity) throws SQLException, Exception;

//	public void update(Connection connection, DynamicEntity dynamicEntity) throws SQLException;

	public void delete(Connection connection, DynamicEntity dynamicEntity ,ShareEntity shareEntity) throws SQLException;
	
	public ResultSet queryAll(Connection con, DynamicEntity dynamicEntity,ShareEntity shareEntity) throws SQLException;

	public ResultSet queryOneRow(Connection con, DynamicEntity dynamicEntity,ShareEntity shareEntity) throws SQLException;

	public ResultSet queryDId(Connection con, DynamicEntity dynamicEntity,ShareEntity shareEntity) throws SQLException;

	public ResultSet queryTitleByUIdAndDate(Connection con, DynamicEntity dynamicEntity,ShareEntity shareEntity) throws SQLException;

	public ResultSet queryContentByUIdAndDate(Connection con, DynamicEntity dynamicEntity,ShareEntity shareEntity) throws SQLException;

	public ResultSet queryPhotoByUIdAndDate(Connection con, DynamicEntity dynamicEntity,ShareEntity shareEntity) throws SQLException;
	
	public ResultSet queryDIdByUId(Connection con, DynamicEntity dynamicEntity,ShareEntity shareEntity) throws SQLException;
	
	public ResultSet queryAllDId(Connection con, DynamicEntity dynamicEntity,ShareEntity shareEntity) throws SQLException;
	
	
	
}
