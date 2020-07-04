package br.com.Agenda.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.Agenda.Model.Agenda;
import br.com.Agenda.Repository.AgendaRepository;

@Service
public class AgendaService {

	@Autowired
	private AgendaRepository arp;
	
	// Metodo para Listar todos os contatos
	public List<Agenda> getAll(){
		
		return arp.findAll();	
	}
	
	//Metodo para buscar por Id
	public Optional<Agenda> buscaPorId(Long id){
		
		return arp.findById(id);
	}
	
	//Metodo para salvar contatos
	public Agenda salvar(Agenda ag) {
		
		return arp.save(ag);
	}
	
	//Metodo para alterar contatos
	public Agenda Aterar (Agenda ag) {
		
		return arp.save(ag);
	}
	
	//Metodo para apagar por Id
	public void apagar(Long id) {
		
		arp.deleteById(id);
	}
}
