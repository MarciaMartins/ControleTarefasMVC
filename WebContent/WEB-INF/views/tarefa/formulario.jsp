<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adicionar Tarefa</title>
</head>
<body>
	<h3>Adicionar Tarefa</h3>
	<form action="adicionaTarefa" method="post">
		Descrição: <br/>
		<textarea rows="5" cols="100" name="descricao"></textarea><br/>
		
		<input type="submit" value="Adicionar">
	</form>
</body>
</html>