package com.xmh.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.xmh.entity.Admin;
import com.xmh.entity.User;
import com.xmh.service.UserService;
import com.xmh.service.impl.UserServiceImpl;

public class UserToAdmin implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String username =  (String) session.getAttribute("loginName");
		if (StringUtils.isNotBlank(username)) {
			System.out.println(username + "µÇÂ¼£¡");
			return true;
		}
		response.sendRedirect("adminlogin.jsp");
		return false;
		 
		
		
	}

}
