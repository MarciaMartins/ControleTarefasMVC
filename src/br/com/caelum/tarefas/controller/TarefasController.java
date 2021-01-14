package br.com.caelum.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.tarefas.dao.JdbcTarefaDao;
import br.com.caelum.tarefas.modelo.Tarefa;

@Controller
public class TarefasController {

	@RequestMapping("adicionaTarefa")
	public String adiciona(Tarefa tarefa) {
		JdbcTarefaDao dao = new JdbcTarefaDao();
		dao.adiciona(tarefa);
		System.out.println(tarefa.getDescricao());
		System.out.println("Adiciona tarefa.");
		return "tarefa/tarefa-adicionada";
	}
	
	@RequestMapping("novaTarefa")
	public String form() {
		System.out.println("Chamando formulário");
		return "tarefa/formulario";
	}
}
