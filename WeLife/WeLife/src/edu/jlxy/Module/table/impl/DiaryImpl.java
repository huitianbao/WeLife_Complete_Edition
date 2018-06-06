/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.Module.table.impl;

import edu.jlxy.Module.entity.DiaryEntity;
import edu.jlxy.Module.table.Diary;
import edu.jlxy.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 16221
 */
public class DiaryImpl implements Diary {

    @Override
    public void insert(Connection connection, DiaryEntity diaryEntity) throws SQLException {
        PreparedStatement ps;
        String sqlString = "insert into diary(diaId,userId,title,content,date,permission) values(?,?,?,?,?,?)";
        ps = connection.prepareStatement(sqlString);
        ps.setString(1, diaryEntity.getDiaId());
        ps.setString(2, diaryEntity.getUserId());
        ps.setString(3, diaryEntity.getTitle());
        ps.setString(4, diaryEntity.getContent());
        ps.setString(5, diaryEntity.getDate());
        ps.setString(6, diaryEntity.getPermission());
        ps.executeUpdate();

        ps.close();
    }

    @Override
    public void update(Connection connection, DiaryEntity diaryEntity) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Connection connection, DiaryEntity diaryEntity) throws SQLException {
        // delete  需要 userId  title
        String sql = "delete from diary where userId='" + diaryEntity.getUserId() + "' and title='" + diaryEntity.getTitle() + "'";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.executeUpdate();

        ps.close();
    }

    @Override
    public ResultSet query_all(Connection connection) throws SQLException {
        String sql = "select * from diary";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet resultSet = ps.executeQuery();
        //ps.close();

        return resultSet;

    }
    @Override
    public ResultSet queryByUid(Connection connection,DiaryEntity diaryEntity) throws SQLException {
    	PreparedStatement pStatement = connection
				.prepareCall("SELECT * FROM diary WHERE userId=?");
    	pStatement.setString(1, diaryEntity.getUserId());
    	ResultSet resultSet=pStatement.executeQuery();
		return resultSet;

    }

    @Override
    public void insert_without_diaId_and_permission(Connection connection, DiaryEntity diaryEntity) {
        try {
            PreparedStatement ps;
            String sqlString = "insert into diary(userId,title,content,date) values(?,?,?,?)";
            ps = connection.prepareStatement(sqlString);

            ps.setString(1, diaryEntity.getUserId());
            ps.setString(2, diaryEntity.getTitle());
            ps.setString(3, diaryEntity.getContent());
            ps.setString(4, diaryEntity.getDate());

            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DiaryImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<DiaryEntity> getList(DiaryEntity diaryEntity) {
        try {
            ArrayList<DiaryEntity> al = new ArrayList<>();
            ConnectionFactory cf = ConnectionFactory.getInstance();
            Connection connection = cf.makeConnection();
            DiaryImpl di = new DiaryImpl();
            
            
            ResultSet resultSet = di.queryByUid(connection, diaryEntity);
            
            while (resultSet.next()) {
            	DiaryEntity de1=new DiaryEntity();
                de1.setDiaId(resultSet.getString("diaId"));
                de1.setUserId(resultSet.getString("userId"));
                de1.setTitle(resultSet.getString("title"));
                de1.setContent(resultSet.getString("content"));
                de1.setPermission(resultSet.getString("permission"));
                de1.setDate(resultSet.getString("date"));

                al.add(de1);
            }

            return al;
        } catch (SQLException ex) {
            Logger.getLogger(DiaryImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

	

}
