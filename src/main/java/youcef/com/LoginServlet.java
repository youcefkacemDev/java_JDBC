package youcef.com;

import java.io.IOException;
import java.io.PrintWriter;

import dao.InterectManipulate;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import owner.Client;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		PrintWriter write = response.getWriter();
//		write.println("<h1>your email is : " + email);
//		write.println("<br>your password is : " + password + "</h1>");
		
		InterectManipulate im = new InterectManipulate();
		Client client = im.check(password, email);
		
		if((client)== null){
			response.sendRedirect("login.jsp");
		}else {
			write.println("<h1>");
			write.println("<p>welcome client to our space </p>");
			write.println("<br>your name is :" + client.getFirstname() + " " + client.getLastname());
			write.println("<br>your adress is : " + client.getAddress());
			write.println("<br>you live in : " + client.getCountry());
			write.println("<br>your gender is : " + client.getGender());
			write.println("<br>your skills is : " + client.getSkills());
			write.println("<br>your E-mail is : " + client.getEmail());
			write.println("<br>your password is : " + client.getPassword());
			write.println("</h1>");
		}
		
		
	}
}
