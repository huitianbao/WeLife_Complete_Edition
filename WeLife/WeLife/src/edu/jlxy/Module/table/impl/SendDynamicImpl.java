/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.Module.table.impl;

import edu.jlxy.Module.entity.SendDynamicEntity;
import edu.jlxy.Module.table.SendDynamic;
import edu.jlxy.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SendDynamicImpl implements SendDynamic {

    @Override
    public void inseret(Connection connection, SendDynamicEntity sendDynamicEntity) {
        try {
            PreparedStatement ps;
            String sqlString = "insert into senddynamic (uid,did,title,content,photo,date) values(?,?,?,?,?,?)";
            ps = connection.prepareStatement(sqlString);
            ps.setString(1, sendDynamicEntity.getUid());
            ps.setString(2, sendDynamicEntity.getDid());
            ps.setString(3, sendDynamicEntity.getTitle());
            ps.setString(4, sendDynamicEntity.getContent());
            ps.setString(5, sendDynamicEntity.getPhoto());
            ps.setString(6, sendDynamicEntity.getDate());

            ps.executeUpdate();

            ps.close();
            // connection.commit();
            // connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SendDynamicImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inseret_withoutdid(Connection connection, SendDynamicEntity sendDynamicEntity) {
        try {
            PreparedStatement ps;
            String sqlString = "insert into senddynamic (uid,title,content,photo,date) values(?,?,?,?,?)";
            ps = connection.prepareStatement(sqlString);
            ps.setString(1, sendDynamicEntity.getUid());
            //ps.setString(2, sendDynamicEntity.getDid());
            ps.setString(2, sendDynamicEntity.getTitle());
            ps.setString(3, sendDynamicEntity.getContent());
            ps.setString(4, sendDynamicEntity.getPhoto());
            ps.setString(5, sendDynamicEntity.getDate());

            ps.executeUpdate();

            ps.close();
            // connection.commit();
            // connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SendDynamicImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Connection connection, SendDynamicEntity sendDynamicEntity) {

        try {
            //这里的 实体只需 set uid  和did
            String sql = "delete from senddynamic where did='" + sendDynamicEntity.getDid() + "'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();

            ps.close();
            //  connection.commit();
            // connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(SendDynamicImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void quarrayAll(Connection connection) {
        try {
            String sqlString = "select * from senddynamic";
            PreparedStatement ps = connection.prepareStatement(sqlString);

            ResultSet resultSet = ps.executeQuery();
            System.out.println("===========================");

            int col = resultSet.getMetaData().getColumnCount();
            System.out.println("col= " + col);
            while (resultSet.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(resultSet.getString(i) + "   ");

                }
                System.out.println("");

            }
            System.out.println("==========================");

        } catch (SQLException ex) {
            Logger.getLogger(SendDynamicImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public ResultSet quarrayAll_ResultSet(Connection connection) {
        try {
            String sqlString = "select * from senddynamic";
            PreparedStatement ps = connection.prepareStatement(sqlString);

            ResultSet resultSet = ps.executeQuery();
            return resultSet;

        } catch (SQLException ex) {
            Logger.getLogger(SendDynamicImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    @Override
    public ResultSet getCurrentUserDynamic(Connection connection, String uid) {
        try {
            String sqlString = "select * from senddynamic where uid='" + uid + "'";
            PreparedStatement ps = connection.prepareStatement(sqlString);

            ResultSet resultSet = ps.executeQuery();
            return resultSet;

        } catch (SQLException ex) {
            Logger.getLogger(SendDynamicImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public ResultSet getOneRowByUidAndDid(Connection connection, String uid, String did) {
        try {
            String sqlString = "select * from senddynamic where uid='" + uid + "' and did='" + did + "'";
            PreparedStatement ps = connection.prepareStatement(sqlString);

            ResultSet resultSet = ps.executeQuery();
            return resultSet;

        } catch (SQLException ex) {
            Logger.getLogger(SendDynamicImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<SendDynamicEntity> getList() {
        try {
            ArrayList<SendDynamicEntity> al = new ArrayList<>();
            ConnectionFactory cf = ConnectionFactory.getInstance();
            Connection connection = cf.makeConnection();
            
            
            SendDynamicImpl sendDynamicImpl = new SendDynamicImpl();
            
            ResultSet resultSet = sendDynamicImpl.quarrayAll_ResultSet(connection);
            while(resultSet.next()){
                SendDynamicEntity sendDynamicEntity = new SendDynamicEntity();
                sendDynamicEntity.setUid(resultSet.getString("uid"));
                sendDynamicEntity.setDid(resultSet.getString("did"));
                sendDynamicEntity.setContent(resultSet.getString("content"));
                sendDynamicEntity.setTitle(resultSet.getString("title"));
                sendDynamicEntity.setPhoto(resultSet.getString("photo"));
                sendDynamicEntity.setDate(resultSet.getString("date"));
                
                al.add(sendDynamicEntity);
                
            }
            
            return al;
        } catch (SQLException ex) {
            Logger.getLogger(SendDynamicImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }

}
