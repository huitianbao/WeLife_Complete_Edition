package edu.jlxy.Module.table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.jlxy.Module.entity.DynamicEntity;
import edu.jlxy.Module.entity.ShareEntity;

public interface Share {
	public void insert(Connection connection, ShareEntity shareEntity, DynamicEntity dynamicEntity) throws SQLException;

	public void update(Connection connection, ShareEntity shareEntity, DynamicEntity dynamicEntity) throws SQLException;

	public void delete(Connection connection, ShareEntity shareEntity, DynamicEntity dynamicEntity) throws SQLException;

	public ResultSet queryAll(Connection con, ShareEntity shareEntity, DynamicEntity dynamicEntity) throws SQLException;

	public ResultSet queryOneRow(Connection con, ShareEntity shareEntity, DynamicEntity dynamicEntity) throws SQLException;

	public ResultSet queryUId(Connection con, ShareEntity shareEntity, DynamicEntity dynamicEntity) throws SQLException;

	public ResultSet queryDId(Connection con, ShareEntity shareEntity, DynamicEntity dynamicEntity) throws SQLException;
	
	public ResultSet queryDate(Connection con, ShareEntity shareEntity, DynamicEntity dynamicEntity) throws SQLException;
}
