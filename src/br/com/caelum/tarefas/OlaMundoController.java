package br.com.caelum.tarefas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {

	@RequestMapping("/ola")
	public	String	execute() {
		System.out.println("Executando a l�gica com Spring MVC");
		return "ok";
	}

}
