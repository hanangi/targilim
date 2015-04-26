package com.gitliz.targil5.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gitliz.targil5.model.Mall;
import com.gitliz.targil5.service.MallManager;

@SuppressWarnings("serial")
public class MallServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setContentType("text/html");
		
		MallManager mallManager = new MallManager();
		Mall mall = mallManager.getMall();
		resp.getWriter().println(mall.getHtmlString());
	}
}
