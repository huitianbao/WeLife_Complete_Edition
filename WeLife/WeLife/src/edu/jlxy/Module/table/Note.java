package edu.jlxy.Module.table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.jlxy.Module.entity.DeliverEntity;
import edu.jlxy.Module.entity.NoteEntity;

public interface Note {
	public void insert(Connection connection, NoteEntity noteEntity,DeliverEntity deliverEntity) throws SQLException, Exception;

	public void update(Connection connection, NoteEntity noteEntity,DeliverEntity deliverEntity) throws SQLException;

	public void delete(Connection connection, NoteEntity noteEntity,DeliverEntity deliverEntity) throws SQLException;

	public ResultSet queryAll(Connection con, NoteEntity noteEntity,DeliverEntity deliverEntity) throws SQLException;
	
	public ResultSet queryOneRow(Connection con, NoteEntity noteEntity,DeliverEntity deliverEntity) throws SQLException;

	public ResultSet queryAllContent(Connection con, NoteEntity noteEntity,DeliverEntity deliverEntity) throws SQLException;
	
	public ResultSet queryNId(Connection con, NoteEntity noteEntity,DeliverEntity deliverEntity) throws SQLException;

}
