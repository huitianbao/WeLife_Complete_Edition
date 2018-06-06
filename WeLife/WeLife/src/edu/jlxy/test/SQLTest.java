package edu.jlxy.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.List;

import edu.jlxy.Module.entity.DeliverEntity;
import edu.jlxy.Module.entity.DynamicEntity;
import edu.jlxy.Module.entity.FriendEntity;
import edu.jlxy.Module.entity.NoteEntity;
import edu.jlxy.Module.entity.ShareEntity;
import edu.jlxy.Module.entity.UserEntity;
import edu.jlxy.Module.table.impl.DynamicImpl;
import edu.jlxy.Module.table.impl.FriendImpl;
import edu.jlxy.Module.table.impl.NoteImpl;
import edu.jlxy.Module.table.impl.UserImpl;
import edu.jlxy.util.ConnectionFactory;
import edu.jlxy.util.ResultSetUtil;

public class SQLTest {

		
	
	
	 
	

	public static void main(String[] args) {
		ResultSetUtil resultSetUtil=ResultSetUtil.getInstance();
		Connection connection = null;
		connection = ConnectionFactory.getInstance().makeConnection();	
		
		try {			
			connection.setAutoCommit(false);
			ResultSet rset;
			
			///////////////////////////////////
			
			FriendEntity friendEntity=new FriendEntity();//此处不需要getInstance（）方法，因为我不需要全局对象的数据。
			FriendImpl friendImpl=new FriendImpl();
			friendEntity.setuid("1");
			friendEntity.setfid("10");
			friendImpl.insert(connection, friendEntity);
			
			////////////////////////////////////
			connection.commit();
			
		} catch (Exception e) {
			try {
				e.printStackTrace();
				connection.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally {
			try {if (connection!=null) {
				connection.close();
				System.out.println("=======连接关闭！=======");
			}
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		}

	}
}
