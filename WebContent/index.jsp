<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<body>
		Bem vindo ao nosso gerenciador de empresas!<br/>
		
		<c:if test="${not empty usuarioLogado}">
			Logado com ${usuarioLogado.email}<br>
		</c:if>
		
		<form action="executa?tarefa=NovaEmpresa" method="POST">
			Nome: <input type="text" name="nome" />
			<input type="submit" value="Enviar" />
		</form>
	
		<form action="executa?tarefa=BuscaEmpresa" method="POST">
			<input type="submit" name="busca" >
		</form>
		
		<form action="executa?tarefa=login" method="POST">
			Email: <input type="email" name="email" />
			Senha: <input type="password" name="senha" />
			<input type="submit" value="Enviar" />
		</form>
		
		<form action="executa?tarefa=Logout" method="POST">
			<input type="hidden" name="tarefa" value="logout">
			<input type="submit" value="Deslogar">
		</form>
		
	</body>
</html>