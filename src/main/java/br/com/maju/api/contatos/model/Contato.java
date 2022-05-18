package br.com.maju.api.contatos.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_contatos")
@Data
public class Contato {
	
	private Long id;
	private String name;
	private String telephone;
	

}
