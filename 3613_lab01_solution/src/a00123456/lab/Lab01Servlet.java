package a00123456.lab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import a00123456.lab.view.HTMLManager;

/**
 * Servlet implementation class Lab01Servlet
 */

public class Lab01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String studentID;
	private String firstName;
	private String lastName;
	
	public void init(){
		
		ServletConfig config = getServletConfig();
		firstName = config.getInitParameter("firstName");
		lastName = config.getInitParameter("lastName");
		studentID = config.getInitParameter("studentID");
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
				
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		StringBuffer outputResponse = HTMLManager.addPageHeader("COMP 3613 Lab01");
		outputResponse.append(HTMLManager.addDataToOutput(firstName, lastName, studentID));
		outputResponse.append(HTMLManager.addPageFooter());
		
		out.println(outputResponse.toString());
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
