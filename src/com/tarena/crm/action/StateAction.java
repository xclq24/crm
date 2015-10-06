package com.tarena.crm.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tarena.crm.entity.State;
import com.tarena.crm.service.StateService;
import com.tarena.crm.service.impl.StateServiceImpl;
import com.tarena.minispringmvc.servlet.Action;
import com.tarena.minispringmvc.servlet.EntityUtil;
import com.tarena.minispringmvc.servlet.RequestPath;

@Action
public class StateAction {

	@RequestPath(path = "/page/customer/stateList.do")
	public void list(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		response.setContentType("text/html;charset=utf-8");
		List<State> states = null;
		// 搜索路径转发
		if (request.getAttribute("states") != null) {
			states = (List<State>) request.getAttribute("states");
		} else {

			StateService stateService = new StateServiceImpl();
			states = stateService.stateList();
		}
		request.setAttribute("states", states);
		request.getRequestDispatcher("/page/customer/stateList.jsp").forward(
				request, response);
		return;

	}

	@RequestPath(path = "/page/customer/stateDel.do")
	public void delete(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		response.setContentType("text/html;charset=utf-8");
		String id = request.getParameter("id");
		StateService stateService = new StateServiceImpl();
		stateService.stateDel(id);
		
		request.getRequestDispatcher("/page/customer/stateList.do").forward(
				request, response);
		return;
	}

	@RequestPath(path = "/page/customer/stateAdd.do")
	public void add(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		State state = (State) EntityUtil.getObject(request, State.class, "state");

		StateService stateService = new StateServiceImpl();
		stateService.stateAdd(state);

		response.getWriter().println("/crm/page/customer/stateList.do");
		return;
	}

	@RequestPath(path = "/page/customer/stateSearch.do")
	public void search(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String state = request.getParameter("state");

		StateService stateService = new StateServiceImpl();
		List<State> states = stateService.stateSearch(state);

		request.setAttribute("states", states);
		request.getRequestDispatcher("/page/customer/stateList.do").forward(
				request, response);
		return;

	}
}
