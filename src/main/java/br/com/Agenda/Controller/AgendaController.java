package br.com.Agenda.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.Agenda.Model.Agenda;
import br.com.Agenda.Service.AgendaService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AgendaController {

	@Autowired
	private AgendaService as;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Agenda save(@RequestBody Agenda ag) {

		return as.salvar(ag);
	}

	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void apagar(@PathVariable Long id) {
		as.apagar(id);
	}

	@GetMapping
	public List<Agenda> listAll() {

		return as.getAll();
	}
	
	@PatchMapping("{id}/favorito")
	public void favorito(@PathVariable Long id, @RequestBody Boolean favorito) {
		Optional<Agenda> agenda =  as.buscaPorId(id);
		agenda.ifPresent(a ->{
			a.setFavoritos(favorito);
			as.salvar(a);
		});
	}

}