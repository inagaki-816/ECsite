package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{

	private String newItemName;
	private String newItemPrice;
	private String newItemStock;
	private Map<String, Object> session;
	private ItemCreateCompleteDAO ItemCreateCompleteDAO = new ItemCreateCompleteDAO();

	public String execute() throws SQLException{
		ItemCreateCompleteDAO.createItem(session.get("newItemName").toString(),
				session.get("newItemPrice").toString(),
				session.get("newItemStock").toString());

		String result = SUCCESS;

		return result;

	}

	public String getNewItemName(){
		return newItemName;
	}
	public void setNewItemName(String newItemName){
		this.newItemName = newItemName;
	}

	public String getNewItemPrice(){
		return newItemPrice;
	}
	public void setNewItemPrice(String newItemPrice){
		this.newItemPrice = newItemPrice;
	}

	public String getNewItemStock(){
		return newItemStock;
	}
	public void setNewItemStock(String newItemStock){
		this.newItemStock = newItemStock;
	}

	public Map<String, Object> getSession(){
		return this.session;
	}
	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
