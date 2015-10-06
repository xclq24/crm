package com.tarena.crm.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tarena.crm.entity.Email;
import com.tarena.crm.entity.User;
import com.tarena.crm.service.impl.EmailServiceImpl;
import com.tarena.minispringmvc.servlet.Action;
import com.tarena.minispringmvc.servlet.RequestPath;

@Action
public class EmailAction {
	@RequestPath(path="/page/email/inBox.do")
	public void inBox(HttpServletRequest request,HttpServletResponse response){
		try {
			User loginUser = (User)request.getSession().getAttribute("loginUser");
			List<Email> emailList = new EmailServiceImpl().inBox(loginUser.getName());
			request.setAttribute("emailList", emailList);
			request.getRequestDispatcher("/page/email/inBox.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestPath(path="/page/email/outBox.do")
	public void outBox(HttpServletRequest request,HttpServletResponse response){
		
		try {
			User loginUser = (User)request.getSession().getAttribute("loginUser");
			List<Email> emailList = new EmailServiceImpl().outBox(loginUser.getName());
			
			request.setAttribute("emailList", emailList);
			request.getRequestDispatcher("/page/email/outBox.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestPath(path="/page/email/draftBox.do")
	public void draftBox(HttpServletRequest request,HttpServletResponse response){
		try {
			User loginUser = (User)request.getSession().getAttribute("loginUser");
			List<Email> emailList = new EmailServiceImpl().draftBox(loginUser.getName());
			
			request.setAttribute("emailList", emailList);
			request.getRequestDispatcher("/page/email/draftBox.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestPath(path="/page/email/writeEmail.do")
	public void writeEmail(HttpServletRequest request,HttpServletResponse response){
		try {
			List<User> userList = new EmailServiceImpl().writeEmail();
    		request.setAttribute("userList", userList);
			
			request.getRequestDispatcher("/page/email/writeEmail.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestPath(path="/page/email/readEmail.do")
	public void readEmail(HttpServletRequest request,HttpServletResponse response){
		try {
    		String idStr = request.getParameter("id");
    		int id = Integer.parseInt(idStr==null?"0":idStr);
			request.setAttribute("id", id);
			
			Email email = new EmailServiceImpl().readEmail(id);
			request.setAttribute("email", email);
			
			request.getRequestDispatcher("/page/email/writeEmail.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestPath(path="/page/email/sendEmail.do")
	public void sendEmail(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			Email email = new Email();
			email.setMessage(request.getParameter("message"));
			email.setReceiver(request.getParameter("receiver"));
			email.setSender(((User)request.getSession().getAttribute("loginUser")).getName());
			email.setTheme(request.getParameter("theme"));
			email.setTime(new Date());
			new EmailServiceImpl().sendEmail(email);
			
			
			//response.sendRedirect("/crm/page/main.jsp");
			response.sendRedirect("/crm/main.do");
			//request.getRequestDispatcher("/main.do").forward(request, response);
			//request.getRequestDispatcher("/page/main.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestPath(path="/page/email/saveDraft.do")
	public void saveDraft(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			Email email = new Email();
			email.setMessage(request.getParameter("message"));
			email.setReceiver(request.getParameter("receiver"));
			email.setSender(((User)request.getSession().getAttribute("loginUser")).getName());
			email.setTheme(request.getParameter("theme"));
			new EmailServiceImpl().sendEmail(email);
			
			response.sendRedirect("/crm/main.do");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestPath(path="/page/email/sendDraft.do")
	public void sendDraft(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			int id = Integer.parseInt(request.getParameter("id"));
			new EmailServiceImpl().sendDraft(id);
			
			response.sendRedirect("/crm/page/email/draftBox.do");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestPath(path="/page/email/deleteEmail.do")
	public void deleteEmail(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
			int id = Integer.parseInt(request.getParameter("id"));
			new EmailServiceImpl().deleteEmail(id);
			
			request.getRequestDispatcher("/page/email/draftBox.do").forward(request, response);
			return;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestPath(path="/page/email/queryInBox.do")
	public void queryInBox(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
			String classify = request.getParameter("classify");
			String keyword = request.getParameter("keyword");
			String receiver = ((User)request.getSession().getAttribute("loginUser")).getName();
			
			List<Email> emailList = new EmailServiceImpl().queryInBox(classify, keyword, receiver);
			request.setAttribute("emailList", emailList);
			
			request.getRequestDispatcher("/page/email/inBox.jsp").forward(request, response);
			return;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestPath(path="/page/email/queryOutBox.do")
	public void queryOutBox(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
			String classify = request.getParameter("classify");
			String keyword = request.getParameter("keyword");
			String sender = ((User)request.getSession().getAttribute("loginUser")).getName();
			
			List<Email> emailList = new EmailServiceImpl().queryOutBox(classify, keyword, sender);
			request.setAttribute("emailList", emailList);
			
			request.getRequestDispatcher("/page/email/outBox.jsp").forward(request, response);
			return;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestPath(path="/page/email/queryDraftBox.do")
	public void queryDraftBox(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
			String classify = request.getParameter("classify");
			String keyword = request.getParameter("keyword");
			String sender = ((User)request.getSession().getAttribute("loginUser")).getName();
			
			List<Email> emailList = new EmailServiceImpl().queryDraftBox(classify, keyword, sender);
			request.setAttribute("emailList", emailList);
			
			request.getRequestDispatcher("/page/email/draftBox.jsp").forward(request, response);
			return;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
