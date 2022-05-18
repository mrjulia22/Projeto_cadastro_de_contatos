package br.com.maju.api.contatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.maju.api.contatos.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{
	

}
