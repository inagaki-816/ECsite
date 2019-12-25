package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;

public class ItemListDeleteCompleteDAO {

	public int deleteItemList() throws SQLException{

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "DELETE FROM item_info_transaction ";
		int result = 0;
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			result =ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;
	}

}
