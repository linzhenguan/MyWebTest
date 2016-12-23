package myPackage.myDemo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyClass2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public MyClass2() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("GETbbb");
		response.setContentType("text/html;charset=gbk");
		request.setCharacterEncoding("GBK");
		String name = request.getParameter("name2");
		System.out.println("get111==========");
		String sanwei = "bbmmmm";
		//String sanwei =  new String(request.getParameter("sanwei2").getBytes("iso-8859-1"), "gbk");
		System.out.println("get222==========");
		System.out.println(sanwei);
		request.setAttribute("name",name+"的三围：");
		request.setAttribute("sanwei",sanwei);
		request.getRequestDispatcher("/ShowSanWei.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("post============");
		response.setContentType("text/html;charset=GBK");
		request.setCharacterEncoding("GBK");
		String name = request.getParameter("name");
		String sanwei = request.getParameter("sanwei");
		System.out.println(sanwei);
		request.setAttribute("name",name+"的三围：");
		request.setAttribute("sanwei",sanwei);
		request.getRequestDispatcher("/ShowSanWei.jsp").forward(request, response);
	}

}
