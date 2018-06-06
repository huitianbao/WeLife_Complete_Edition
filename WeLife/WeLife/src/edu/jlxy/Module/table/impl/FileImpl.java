package edu.jlxy.Module.table.impl;

import edu.jlxy.Module.entity.FileEntity;
import edu.jlxy.Module.entity.SendDynamicEntity;
import edu.jlxy.Module.table.File;
import edu.jlxy.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 16221
 */
public class FileImpl implements File {

    @Override
    public void saveFile(FileEntity fileEntity, String photo, SendDynamicEntity sendDynamicEntity) {
        //1 连接数据库
        ConnectionFactory cf = ConnectionFactory.getInstance();
        Connection connection = cf.makeConnection();

        try {
            System.out.println(connection.getAutoCommit());
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

        // 数据库操作
        PreparedStatement pstmt = null;
        int count = 0;
        String sql = "insert into file(name,size,type,addtime,file_path,info) values(?,?,?,?,?,?)";
        String sql2 = "update senddynamic set photo = ? where uid = ? and did=?";

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, fileEntity.getName());
            pstmt.setString(2, fileEntity.getSize());
            pstmt.setString(3, fileEntity.getType());
            pstmt.setString(4, fileEntity.getAddTime());
            pstmt.setString(5, fileEntity.getFile_path());
            pstmt.setString(6, fileEntity.getInfo());

            count = pstmt.executeUpdate();
            System.out.println(count);

            pstmt = connection.prepareStatement(sql2);
            System.out.println(fileEntity.getFile_path());
            System.out.println(fileEntity.getName());

            pstmt.setString(1, fileEntity.getFile_path());
            pstmt.setString(2, sendDynamicEntity.getUid());
            pstmt.setString(3, sendDynamicEntity.getDid());

            count = pstmt.executeUpdate();
            System.out.println(count);

            pstmt.close();
            connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(FileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public File findById(int id, Connection connection) {
        return null;

    }

    @Override
    public List<File> findAll() {
        return null;

    }

    @Override
    public ResultSet getAll_resulSet() {

        //1 连接数据库
        ConnectionFactory cf = ConnectionFactory.getInstance();
        Connection connection = cf.makeConnection();

        try {
            System.out.println(connection.getAutoCommit());
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

        try {

            // 数据库操作
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String sqlString = "select * from file";
            pstmt = connection.prepareStatement(sqlString);
            rs = pstmt.executeQuery();
            
            
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(FileImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public ArrayList<FileEntity> getList() {
        try {
            ArrayList<FileEntity> al = new ArrayList<>();
            ConnectionFactory cf = ConnectionFactory.getInstance();
            
            
            
            FileImpl fileImpl=new FileImpl();
            ResultSet resultSet = fileImpl.getAll_resulSet();
            while (resultSet.next()) {
                FileEntity fileEntity=new FileEntity();
                fileEntity.setName(resultSet.getString("name"));
                fileEntity.setSize(resultSet.getString("size"));
                fileEntity.setInfo(resultSet.getString("info"));
                fileEntity.setType(resultSet.getString("type"));
                fileEntity.setAddTime(resultSet.getString("addTime"));
                fileEntity.setFile_path(resultSet.getString("file_path"));
                
                al.add(fileEntity);
                
            }
            
            return al;
        } catch (SQLException ex) {
            Logger.getLogger(FileImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
