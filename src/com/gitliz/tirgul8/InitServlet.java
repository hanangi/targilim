package com.gitliz.tirgul8;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.algo.service.ServiceManager;

public class InitServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
	
		PorotfolioManager pm = new PorotfolioManager();
		ServiceManager.setPortfolioManager(pm);
	}
	
}
