package edu.jlxy.Module.table.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.jlxy.Module.entity.DynamicEntity;
import edu.jlxy.Module.entity.ShareEntity;
import edu.jlxy.Module.table.Share;

public class ShareImpl implements Share {
	
	DynamicImpl dynamicLmpl=new DynamicImpl();
	
	@Override
	public void insert(Connection connection, ShareEntity shareEntity, DynamicEntity dynamicEntity) throws SQLException {
		
		try {
			dynamicLmpl.insert(connection, dynamicEntity, shareEntity);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
	//一般不需要更新
	@Override
	public void update(Connection connection, ShareEntity shareEntity, DynamicEntity dynamicEntity)
			throws SQLException {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void delete(Connection connection, ShareEntity shareEntity, DynamicEntity dynamicEntity)
			throws SQLException {
		dynamicLmpl.delete(connection, dynamicEntity, shareEntity);
		
	}

	@Override
	public ResultSet queryAll(Connection con, ShareEntity shareEntity, DynamicEntity dynamicEntity)
			throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM share ");
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	@Override
	public ResultSet queryOneRow(Connection con, ShareEntity shareEntity, DynamicEntity dynamicEntity)
			throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM share where did=? ");
		preparedStatement.setString(1, dynamicEntity.getdid());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	@Override
	public ResultSet queryUId(Connection con, ShareEntity shareEntity, DynamicEntity dynamicEntity)
			throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT uid FROM share where did=? ");
		preparedStatement.setString(1, dynamicEntity.getdid());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}
	

	@Override
	public ResultSet queryDId(Connection con, ShareEntity shareEntity, DynamicEntity dynamicEntity)
			throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT did FROM share where did=? ");
		preparedStatement.setString(1, dynamicEntity.getdid());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	
	}

	@Override
	public ResultSet queryDate(Connection con, ShareEntity shareEntity, DynamicEntity dynamicEntity)
			throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT date FROM share where did=? ");
		preparedStatement.setString(1, dynamicEntity.getdid());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	
	

}
