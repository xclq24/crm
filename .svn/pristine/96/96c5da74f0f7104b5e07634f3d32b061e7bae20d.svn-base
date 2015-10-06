package com.tarena.crm.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tarena.crm.entity.HouseType;
import com.tarena.crm.service.impl.HouseTypeServiceImpl;
import com.tarena.minispringmvc.servlet.Action;
import com.tarena.minispringmvc.servlet.RequestPath;

@Action
public class HouseTypeAction {
	@RequestPath(path="/page/basis/houseTypeList.do")
	public void houseTypeList(HttpServletRequest request,HttpServletResponse response){
		try {
			List<HouseType> houseTypeList = new HouseTypeServiceImpl().findAll();
			request.setAttribute("houseTypeList", houseTypeList);
			
			
			request.getRequestDispatcher("/page/basis/houseTypeList.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestPath(path="/page/basis/deleteHouseType.do")
	public void deleteHouseType(HttpServletRequest request,HttpServletResponse response){
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			new HouseTypeServiceImpl().deleteById(id);
			
			request.getRequestDispatcher("/page/basis/houseTypeList.do").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestPath(path="/page/basis/addHouseType.do")
	public void addHouseType(HttpServletRequest request,HttpServletResponse response){
		try {
			String name = request.getParameter("name");
			HouseType houseType = new HouseType();
			houseType.setName(name);
			new HouseTypeServiceImpl().add(houseType);
			
			request.getRequestDispatcher("/page/basis/houseTypeList.do").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
