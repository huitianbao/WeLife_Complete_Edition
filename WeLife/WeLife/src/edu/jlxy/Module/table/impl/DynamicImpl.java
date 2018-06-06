package edu.jlxy.Module.table.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import edu.jlxy.Module.entity.DynamicEntity;
import edu.jlxy.Module.entity.ShareEntity;
import edu.jlxy.Module.table.Dynamic;



public class DynamicImpl implements Dynamic{


	@Override
	public void insert(Connection connection, DynamicEntity dynamicEntity,ShareEntity shareEntity) throws Exception {
		//向动态表中插入数据
		PreparedStatement pStatement = connection
				.prepareCall("INSERT INTO welife.dynamictable" + "(title,content,photo) VALUES(?,?,?)");
		
		pStatement.setString(1, dynamicEntity.getTitle());
		pStatement.setString(2, dynamicEntity.getContent());
		pStatement.setString(3, dynamicEntity.getPhotoURL());
		pStatement.execute();
		
		//查询刚刚插入的动态信息的did
		ResultSet resultSet=queryAllDId(connection, dynamicEntity, shareEntity);
		resultSet.last();
		String did=resultSet.getString("did");
		System.out.println(did);
		
		//向share表中插入did等信息
		 pStatement = connection
				.prepareCall("INSERT INTO welife.share" + "(uid,did,date) VALUES(?,?,?)");
		 	pStatement.setString(1, shareEntity.getUid());
			pStatement.setString(2, did);
			pStatement.setDate(3,shareEntity.getDate());
			pStatement.execute();
//			connection.commit();
		
	}

	// @Override
	// public void update(Connection connection, DynamicEntity dynamicEntity)
	// throws SQLException {
	// String updateSqlString = "UPDATE dynamictable SET
	// title=?,content=?,permission=?,date=? WHERE userId=?";
	// PreparedStatement pStatement =
	// connection.prepareStatement(updateSqlString);
	// pStatement.setString(5, dynamicEntity.getUserId());
	// pStatement.setString(1, dynamicEntity.getTitle());
	// pStatement.setString(2, dynamicEntity.getContent());
	// pStatement.setString(3, dynamicEntity.getPermission());
	// pStatement.setString(4, dynamicEntity.getDate());
	// pStatement.execute();
	//
	// }

	@Override
	public void delete(Connection connection, DynamicEntity dynamicEntity, ShareEntity shareEntity)
			throws SQLException {
		//根据网页中获取的did删除share表中数据
		PreparedStatement pStatement = connection.prepareStatement("DELETE FROM " + "share WHERE did=? ");
		pStatement.setString(1, shareEntity.getDid());
		 pStatement.execute();
		 
		//根据网页中获取的did删除dynamictable表中数据		
		pStatement = connection.prepareStatement("DELETE FROM " + "dynamictable WHERE did=?");
		pStatement.setString(1, shareEntity.getDid());
		 pStatement.execute();
//		connection.commit();

	}

	

	@Override
	public ResultSet queryOneRow(Connection connection, DynamicEntity dynamicEntity,ShareEntity shareEntity) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM dynamictable WHERE did=?");
		preparedStatement.setString(1, dynamicEntity.getdid());
	 ResultSet resultSet=preparedStatement.executeQuery();
			return resultSet;
	}

	@Override
	public ResultSet queryDId(Connection connection, DynamicEntity dynamicEntity,ShareEntity shareEntity) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT dynamictable.did from welife.dynamictable , welife.share where dynamictable.did=share.did AND share.date=?");
		preparedStatement.setDate(1,shareEntity.getDate());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	@Override
	public ResultSet queryTitleByUIdAndDate(Connection connection, DynamicEntity dynamicEntity,ShareEntity shareEntity) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT title from dynamictable , share where dynamictable.did=share.did AND share.uid=?");
		preparedStatement.setString(1, shareEntity.getUid());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	@Override
	public ResultSet queryContentByUIdAndDate(Connection connection, DynamicEntity dynamicEntity,ShareEntity shareEntity) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT content from dynamictable , share where dynamictable.did=share.did AND share.uid=?");
		preparedStatement.setString(1, shareEntity.getUid());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}
	//根据时间和did找到图片
	@Override
	public ResultSet queryPhotoByUIdAndDate(Connection connection, DynamicEntity dynamicEntity,ShareEntity shareEntity) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT photo from dynamictable , share where dynamictable.did=share.did AND share.uid=? AND share.date=?");
		preparedStatement.setString(1, shareEntity.getDid());
		preparedStatement.setDate(2, shareEntity.getDate());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}
	//查询某个用户发过的所有动态
	@Override
	public ResultSet queryDIdByUId(Connection connection, DynamicEntity dynamicEntity, ShareEntity shareEntity)
			throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT share.did from dynamictable , share where dynamictable.did=share.did AND share.uid=?");
		preparedStatement.setString(1,shareEntity.getUid());
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	//返回所有的动态号
	@Override
	public ResultSet queryAllDId(Connection con, DynamicEntity dynamicEntity, ShareEntity shareEntity)
			throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT did FROM dynamictable ");
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	@Override
	public ResultSet queryAll(Connection con, DynamicEntity dynamicEntity, ShareEntity shareEntity)
			throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM dynamictable ");
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	

}
