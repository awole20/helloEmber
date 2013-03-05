package com.awole20.example.ember;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Servlet implementation class TestJSON
 */
@WebServlet("/TestJSON")
public class TestJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestJSON() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<TestJsonObject> list = new ArrayList<TestJsonObject>();
		TestJsonObject o1 = new TestJsonObject();
		o1.title = "Son of the Morning";
		o1.artist = "Oh, Sleeper";
		o1.genre = "Screamo";
		list.add(o1);
		
		TestJsonObject o2 = new TestJsonObject();
		o2.title = "Cave";
		o2.artist = "Muse";
		o2.genre = "Awesome";
		list.add(o2);
		
		Gson gson = new GsonBuilder().create();
		
		response.getWriter().println(gson.toJson(list));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
