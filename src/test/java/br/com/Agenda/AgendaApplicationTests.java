package br.com.Agenda;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.Agenda.Model.Agenda;
import br.com.Agenda.Service.AgendaService;

@SpringBootTest
class AgendaApplicationTests {

	@Autowired
	private AgendaService as;
	
	@Test
	void contextLoads() {
		var ag = new Agenda();
		
		//ag.setId_ag(3L);
		ag.setNome("teste4");
		ag.setFone("98765");
		ag.setEmail("teste@teste4");
		ag.setFavoritos(true);
		
		as.salvar(ag);
	}

}
