import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParam1 extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		out.println("<h1>Init Parameters Names are:");;
		Enumeration enumeration =getServletContext().getInitParameterNames();
		while(enumeration.hasMoreElements())
		{
			out.println(enumeration.nextElement()+" ");
		}
		ServletContext con1=getServletContext();
		out.println("<h1>Company:"+con1.getInitParameter("Company"));
		out.println("<h1>Venue:"+con1.getInitParameter("Venue"));
		out.println("<h1>Training:"+con1.getInitParameter("Training"));
		
		out.println("<h1>Company:"+getServletContext().getInitParameter("Company"));
		out.println("<h1>Venue:"+getServletContext().getInitParameter("Venue"));
		out.println("<h1>Training:"+getServletContext().getInitParameter("Training"));
		try
		{
			String url=getServletContext().getInitParameter("url");
			String usr=getServletContext().getInitParameter("user");
			String pass=getServletContext().getInitParameter("password");
			
			Class.forName(getServletContext().getInitParameter("driver"));
			Connection con=DriverManager.getConnection("url","usr","pass");
			System.out.println("Connecting");
		}
		catch(ClassNotFoundException |SQLException cf)
		{
			System.out.println(cf);
		}

	}

}
