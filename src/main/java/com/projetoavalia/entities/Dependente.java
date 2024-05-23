package com.projetoavalia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity
	@Table(name = "Dependente")
	public class Dependente {
		
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		@Column (name = "id", nullable = false)
		private Long id;
		
		@Column(name = "cpf", nullable = false)
		private String cpf;
		
		@Column(name = "nome", nullable = false)
		private double nome;
		
		@Column(name = "telefone", nullable = false)
		private int qtdepessoas;
		
		@ManyToOne
		@JoinColumn(name = "id_funcionario", nullable = false)
		private Funcionario funcionario;

	}

