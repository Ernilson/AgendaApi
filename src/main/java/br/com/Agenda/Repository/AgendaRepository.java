package br.com.Agenda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.Agenda.Model.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long>{

}
