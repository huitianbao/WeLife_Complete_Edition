
package edu.jlxy.Module.table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.jlxy.Module.entity.SendDynamicEntity;


public interface SendDynamic {

    public void inseret(Connection connection, SendDynamicEntity sendDynamicEntity);

    public void delete(Connection connection, SendDynamicEntity sendDynamicEntity);

    public void quarrayAll(Connection connection);

    public ResultSet quarrayAll_ResultSet(Connection connection);

    public ResultSet getCurrentUserDynamic(Connection connection, String uid);

    public ResultSet getOneRowByUidAndDid(Connection connection, String uid, String did);
    
    public ArrayList<SendDynamicEntity> getList();

  
    
    
    

}
