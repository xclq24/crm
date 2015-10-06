package com.tarena.crm.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tarena.crm.entity.Care;
import com.tarena.crm.entity.Customer;
import com.tarena.crm.entity.Notice;
import com.tarena.crm.entity.Record;
import com.tarena.crm.service.impl.CareServiceImpl;
import com.tarena.crm.service.impl.CustomerServiceImpl;
import com.tarena.crm.service.impl.NoticeServiceImpl;
import com.tarena.crm.service.impl.RecordServiceImpl;
import com.tarena.minispringmvc.servlet.Action;
import com.tarena.minispringmvc.servlet.RequestPath;

@Action
public class BaseAction {
	@RequestPath(path = "/login.do")
	public String toLogin(HttpServletRequest request,
			HttpServletResponse response) {
		return "/page/login.jsp";
	}

	@RequestPath(path = "/main.do")
	public String toMain(HttpServletRequest request,
			HttpServletResponse response) {
		String datetime = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date());
		request.setAttribute("datetime", datetime);
		
		try {
			List<Care> futureCareList = new CareServiceImpl().futureCareList();
			if(futureCareList.size()>0){
				request.setAttribute("futureCareList", futureCareList);
			}
			
			List<Record> futureRecordList = new RecordServiceImpl().futureRecordList();
			if(futureRecordList.size()>0){				
				request.setAttribute("futureRecordList", futureRecordList);
			}
			
			List<Notice> validNoticeList = new NoticeServiceImpl().findAllValidate();
			if(validNoticeList.size()>0){
				request.setAttribute("validNoticeList", validNoticeList);
			}
			
			List<Customer> birthdayCustomerList = new CustomerServiceImpl().getBirthdayCustomers();
			if(birthdayCustomerList.size()>0){
				request.setAttribute("birthdayCustomerList", birthdayCustomerList);
			}
			
			return "/page/main.jsp";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}
