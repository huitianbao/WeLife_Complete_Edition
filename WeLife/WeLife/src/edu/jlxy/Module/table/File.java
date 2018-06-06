/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.Module.table;

import edu.jlxy.Module.entity.FileEntity;
import edu.jlxy.Module.entity.SendDynamicEntity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 16221
 */
public interface File {
    /**
	 * 保存文件信息的方法
	 */
	public void saveFile(FileEntity fileEntity,String photo,SendDynamicEntity sendDynamicEntity);
	
	/**
	 * 根据id查询文件
	 */
	public File findById(int id,Connection connection);
	
	/**
	 * 查询所有文件
	 * @param args
	 */
	public List<File> findAll();
        
        
        //public ResultSet getAll();
        
      public ResultSet getAll_resulSet();
      
      public ArrayList<FileEntity> getList(); 
    
}
