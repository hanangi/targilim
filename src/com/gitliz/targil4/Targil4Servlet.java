package com.gitliz.targil4;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Targil4Servlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setContentType("text/html");
		
		Calendar cal = Calendar.getInstance();
		cal.set(2015, 5, 15, 21, 0, 0);
		Date date = cal.getTime();
		
		cal.set(1981, 1, 1, 0, 0);
		Date date2 = cal.getTime();
		
		Band band = new Band("U2");
		band.setCreationDate(date2);
		
		Gig gig1 = new Gig("U2 in Nokia", date, band, "Tel Aviv - Nokia");
		Gig gig2 = new Gig("U2 in Bloomfield", date, band, "Tel Aviv - Jaffa");
		
		resp.getWriter().println(gig1.getHtmlDescription());
		resp.getWriter().println("<br>");
		resp.getWriter().println(gig2.getHtmlDescription());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Date date1 = new Date();
		date1.setYear(2015 - 1900);
		date1.setMonth(5);
		date1.setDate(15);*/
		
		/*Calendar cal = Calendar.getInstance();
		cal.set(2015, 5, 15, 18 , 0, 0);
		java.util.Date date1 = cal.getTime();
		
		cal.set(1960, 0, 1, 0 ,0);
		Date date2 = cal.getTime();
		
		cal.set(1977, 4, 1, 0 ,0);
		Date date3 = cal.getTime();
		
		Band beatles = new Band();
		beatles.setName("Beatles");
		String[] members = new String[4];
		members[0] = "John";
		members[1] = "Paul";
		members[2] = "Ringo";
		members[3] = "George";
		beatles.setMembers(members);
		beatles.setCreationDate(date2);
		
		Gig gig1 = new Gig("Sholom in Casiria", date1, beatles);
		Gig gig2 = new Gig("Beatles in Casiria", date3, beatles);
		
		resp.getWriter().println(gig1.getHtmlDescription());
		resp.getWriter().println("<p>");
		resp.getWriter().println(gig2.getHtmlDescription());*/
		
	}
}
