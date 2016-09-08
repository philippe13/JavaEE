package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

//@WebServlet(urlPatterns="/busca")
public class BuscaEmpresa implements Tarefa {

	
	public BuscaEmpresa(){
		System.out.println("Construindo uma Servlet do tipo BuscaEmpresa" +this);
	}
	
	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		//PrintWriter writer = resp.getWriter();
				//writer.println("<html><body>");
				//writer.println("Resultado da busca:</br>");
				
				String filtro = req.getParameter("filtro");
				/*try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
				
				Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filtro);
				req.setAttribute("empresas", empresas);
				return "/WEB-INF/Paginas/buscaEmpresa.jsp";
				//RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/Paginas/buscaEmpresa.jsp");
				//dispatcher.forward(req, resp);
				
				
				/*writer.println("<ul>");
				for (Empresa empresa : empresas) {
					writer.println("<li>" + empresa.getId() + ": " + empresa.getNome() + "</li>");
				}
				writer.println("</ul>");
				
				writer.println("</body></html>");*/
		
		
	}
}
