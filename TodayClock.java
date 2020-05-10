package aboutme;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayClock
 */
@WebServlet("/today")
public class TodayClock extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayClock() {
        super();
        // TODO Auto-generated constructor stu
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h3><a href=\"http://localhost:8080/aboutme/index.html\">메인화면</a></h3>");
		
		String year   = new java.text.SimpleDateFormat("yyyy").format(new java.util.Date());
		String month = new java.text.SimpleDateFormat("MM").format(new java.util.Date());
		String day = new java.text.SimpleDateFormat("dd").format(new java.util.Date());
		String hour   = new java.text.SimpleDateFormat("HH").format(new java.util.Date());
		String minute   = new java.text.SimpleDateFormat("mm").format(new java.util.Date());
		
		out.print("<h1 style=\"font-size:50px; text-align:center; margin-top:250px;\">현재시간 : "+year+ "/"+month+"/"+day+"  "+hour+":"+minute+"</h1>");

	}

}
