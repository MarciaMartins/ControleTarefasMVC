package br.com.caelum.tarefas.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("listaTarefas")
	public String list(Model model) {
		JdbcTarefaDao dao = new JdbcTarefaDao();
		List<Tarefa> tarefas = dao.lista();
		System.out.println("Recuperando a lista de tarefas");
		
		model.addAttribute("tarefas", tarefas);
		return "tarefa/lista";
	}
	
	@RequestMapping("removerTarefa")
	public String remove(Tarefa tarefa) {
		JdbcTarefaDao dao = new JdbcTarefaDao();
		dao.remove(tarefa);
		System.out.println("Remoção de tarefa");
		return "forward:listaTarefas";
	}
	
}
