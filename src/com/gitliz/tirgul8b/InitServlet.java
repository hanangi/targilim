package com.gitliz.tirgul8b;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.algo.service.ServiceManager;

public class InitServlet extends HttpServlet {

	
	@Override
	public void init() throws ServletException {
		PortfolioMananger pm = new PortfolioMananger();
		ServiceManager.setPortfolioManager(pm);
	}
}
