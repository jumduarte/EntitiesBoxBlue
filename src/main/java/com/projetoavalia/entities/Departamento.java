package com.projetoavalia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity
	@Table(name = "Departamento")
	public class Departamento {
		
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		@Column (name = "id", nullable = false)
		private Long id;
		
		@Column(name = "cidade", nullable = false)
		private String cidade;
		
		@Column(name = "email", nullable = false)
		private String email;
		
		@Column(name = "nome", nullable = false)
		private String nome;
		
		@Column(name = "qtdepessoas", nullable = false)
		private int qtdepessoas;
		
		@Column(name = "telefone", nullable = false)
		private String telefone;

	}

