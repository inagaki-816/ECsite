package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite2.dto.UserInfoDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class UserListDAO {
	public ArrayList<UserInfoDTO> getUserList() throws SQLException{

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<UserInfoDTO> userInfoDTOList = new ArrayList<UserInfoDTO>();

		String sql ="select * from login_user_transaction";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				UserInfoDTO dto = new UserInfoDTO();
				dto.setId(rs.getString("login_id"));
				dto.setUserPassword(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
				dto.setInsert_date(rs.getString("insert_date"));
				userInfoDTOList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return userInfoDTOList;

	}

}
