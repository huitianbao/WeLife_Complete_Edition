package edu.jlxy.Module.table.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.jlxy.Module.entity.DeliverEntity;
import edu.jlxy.Module.entity.NoteEntity;
import edu.jlxy.Module.table.Deliver;

public class DeliverImpl implements Deliver {
	
	NoteImpl noteImpl=new NoteImpl();
	//插入操作与NoteImpl相同
	@Override
	public void insert(Connection connection, DeliverEntity deliverEntity, NoteEntity noteEntity) throws SQLException {

		
		try {
			noteImpl.insert(connection, noteEntity, deliverEntity);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	//一般不需要更新
	@Override
	public void update(Connection connection, DeliverEntity deliverEntity, NoteEntity noteEntity) throws SQLException {
	
	}
	//插入操作与NoteImpl相同
	@Override
	public void delete(Connection connection, DeliverEntity deliverEntity, NoteEntity noteEntity) throws SQLException {
		// TODO 自动生成的方法存根
		noteImpl.delete(connection, noteEntity, deliverEntity);
	}

	@Override
	public ResultSet query(Connection con, DeliverEntity deliverEntity, NoteEntity noteEntity) throws SQLException {
		PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM deliver ");
		ResultSet resultSet = preparedStatement.executeQuery();
		return resultSet;
	}

	
}
