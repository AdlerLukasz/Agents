package pl.aplication.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.aplication.dao.AgentDao;
 

 
@WebServlet("/delete")
public class AgentDelete extends HttpServlet {
    private static final long serialVersionUID = 1L;
     
    @Inject
    private AgentDao agent;
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("agentCode"));
        agent.remove(id);
        response.sendRedirect(request.getContextPath());
    }
}