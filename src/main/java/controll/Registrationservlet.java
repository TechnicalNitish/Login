package controll;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		User user=new User();
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String userid=request.getParameter("username");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String password=request.getParameter("password");
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class);
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		Transaction tc=session.beginTransaction();
		 
		user.setUserid(userid);
		user.setFname(fname);
		user.setLname(lname);
		user.setEmail(email);
		user.setMobile(mobile);
		user.setPassword(password);
		
		//Getter
		user.getEmail();
		user.getFname();
		user.getLname();
		user.getUserid();
		user.getMobile();
		user.getPassword();
		session.save(user);
		tc.commit();
		session.close();
		
	}

}
