package youcef.com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dao.InterectManipulate;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import owner.Client;

public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// get the information from the form of sign up
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String address = request.getParameter("address");
		String country = request.getParameter("country");
		String gender = request.getParameter("gender");
		List<String> skills = new ArrayList<>();
		skills.add(request.getParameter("html"));
		skills.add(request.getParameter("css"));
		skills.add(request.getParameter("javaScript"));
		skills.add(request.getParameter("java"));
		skills.add(request.getParameter("kotlin"));
		skills.add(request.getParameter("php"));
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//sanitize the skills to drop the null values 
		skills.removeIf(element -> element == null);
		String sks = "";
		
		// store all the skills into one variable type of strng
		for (String string : skills) {
			sks = sks + string;
			sks = sks + " ";
		}
		
		InterectManipulate im = new InterectManipulate();
		im.add(new Client(firstname, lastname, address, country, gender, sks, email, password));
		response.sendRedirect("login.jsp");
	}
}
