package com.tarena.crm.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tarena.crm.dao.impl.HouseDaoImpl;
import com.tarena.crm.entity.House;
import com.tarena.crm.entity.HouseType;
import com.tarena.crm.entity.User;
import com.tarena.crm.service.impl.HouseServiceImpl;
import com.tarena.minispringmvc.servlet.Action;
import com.tarena.minispringmvc.servlet.RequestPath;

@Action
public class HouseAction {
	@RequestPath(path="/page/basis/houseList.do")
	public void houseList(HttpServletRequest request,HttpServletResponse response){
		try {
			List<House> houseList = new HouseServiceImpl().houseList();
			request.setAttribute("houseList", houseList);
			request.getRequestDispatcher("/page/basis/houseList.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@RequestPath(path="/page/basis/deleteHouse.do")
	public void deleteHouse(HttpServletRequest request,HttpServletResponse response){
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			new HouseServiceImpl().deleteHouse(id);
			request.getRequestDispatcher("/page/basis/houseList.do").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@RequestPath(path="/page/basis/loadAddHouse.do")
	public void loadAddHouse(HttpServletRequest request,HttpServletResponse response){
		try {
			List<HouseType> houseTypeList = new ArrayList<HouseType>();
			List<User> userList = new ArrayList<User>();
			new HouseServiceImpl().loadAddHouse(houseTypeList, userList);
			
			request.setAttribute("houseTypeList", houseTypeList);
			request.setAttribute("userList", userList);
			request.getRequestDispatcher("/page/basis/houseAdd.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@RequestPath(path="/page/basis/addHouse.do")
	public void addHouse(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
			
			House house = new House();
			house.setType(request.getParameter("houseType"));
			house.setManager(request.getParameter("manager"));
			house.setAddress(request.getParameter("address"));
			house.setPrice(Double.parseDouble(request.getParameter("price")));
			house.setEnvironment(request.getParameter("environment"));
			
			new HouseServiceImpl().addHouse(house);
			
			request.getRequestDispatcher("/page/basis/houseList.do").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@RequestPath(path="/page/basis/houseEdit.do")
	public void houseEdit(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
			
			int id = Integer.parseInt(request.getParameter("id"));
			House house = new HouseServiceImpl().findById(id);
			request.setAttribute("house", house);
			
			List<HouseType> houseTypeList = new ArrayList<HouseType>();
			List<User> userList = new ArrayList<User>();
			new HouseServiceImpl().loadAddHouse(houseTypeList, userList);
			
			request.setAttribute("houseTypeList", houseTypeList);
			request.setAttribute("userList", userList);
			
			request.getRequestDispatcher("/page/basis/houseEdit.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestPath(path="/page/basis/updateHouse.do")
	public void updateHouse(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
			
			House house = new House();
			house.setId(Integer.parseInt(request.getParameter("id")));
			house.setType(request.getParameter("houseType"));
			house.setManager(request.getParameter("manager"));
			house.setAddress(request.getParameter("address"));
			house.setPrice(Double.parseDouble(request.getParameter("price")));
			house.setEnvironment(request.getParameter("environment"));
			
			new HouseServiceImpl().update(house);
			
			request.getRequestDispatcher("/page/basis/houseList.do").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestPath(path="/page/basis/queryHouseList.do")
	public void queryHouseList(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
			
			String classify = request.getParameter("classify");
			String keyword = request.getParameter("keyword");
			
			List<House> houseList = new HouseServiceImpl().query(classify, keyword);
			request.setAttribute("houseList", houseList);
			
			request.getRequestDispatcher("/page/basis/houseList.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
