package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;
import com.internousdev.ecsite2.util.DateUtil;

public class ItemCreateCompleteDAO {

	public void createItem(String newItemName, String newItemPrice, String newItemStock) throws
	SQLException{

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		DateUtil dateUtil = new DateUtil();

		String sql = "INSERT INTO item_info_transaction(item_name, item_price, item_stock, insert_date) VALUES(?,?,?,?)";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newItemName);
			ps.setString(2, newItemPrice);
			ps.setString(3, newItemStock);
			ps.setString(4, dateUtil.getDate());
			ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}

	}

}
