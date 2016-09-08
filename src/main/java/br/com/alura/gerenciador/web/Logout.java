package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Usuario;

//@WebServlet(urlPatterns = "/logout")
public class Logout implements Tarefa {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		req.getSession().removeAttribute("usuarioLogado");
		return "/WEB-INF/Paginas/logout.html";
	}
	
	
	//@Override
	/*protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getSession().removeAttribute("usuarioLogado");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/Paginas/logout.html");
		dispatcher.forward(req, resp);
		
		
		
		
		//req.getSession().invalidate();
		//req.getSession().setMaxInactiveInterval(200);
				
		//Usuario usuario = Login.USUARIOS_LOGADOS.get(cookie.getValue());
		
		//PrintWriter writer = resp.getWriter();
		/*if(cookie == null){
			writer.println("<html><body>Usuario nao esta logado</body></html>");
			return;
		}
		cookie.setMaxAge(0);
		resp.addCookie(cookie);*/
		//writer.println("<html><body>Deslogado com sucesso!</body></html>");*/
		
	}



