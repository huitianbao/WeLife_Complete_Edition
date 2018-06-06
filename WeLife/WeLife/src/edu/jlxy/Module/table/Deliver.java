package edu.jlxy.Module.table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.jlxy.Module.entity.DeliverEntity;
import edu.jlxy.Module.entity.NoteEntity;


public interface Deliver {
	public void insert(Connection connection, DeliverEntity deliverEntity, NoteEntity noteEntity) throws SQLException;

	public void update(Connection connection, DeliverEntity deliverEntity, NoteEntity noteEntity) throws SQLException;

	public void delete(Connection connection, DeliverEntity deliverEntity, NoteEntity noteEntity) throws SQLException;

	public ResultSet query(Connection con, DeliverEntity deliverEntity, NoteEntity noteEntity) throws SQLException;
}
