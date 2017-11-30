package pl.aplication.servlet;

import pl.aplication.dao.AgentDao;
import pl.aplication.model.Agent;

import java.io.IOException;
import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddAgent
 */
@WebServlet("/AddAgent")
public class AddAgent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAgent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	public AgentDao agentDao;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long agentCode = Long.parseLong(request.getParameter("agentCode"));
		String agentName = request.getParameter("agentName");
		BigDecimal commission = BigDecimal.valueOf(Long.parseLong(request.getParameter("commission")));
		String country = request.getParameter("country");
		String phoneNo = request.getParameter("phoneNo");
		String workingArea = request.getParameter("workingArea");
		Agent agent = new Agent(agentCode, agentName, commission, country, phoneNo, workingArea);
		agentDao.addAgent(agent);
		response.sendRedirect(request.getContextPath());




	}





}
