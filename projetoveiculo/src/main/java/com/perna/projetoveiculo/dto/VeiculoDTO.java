package com.perna.projetoveiculo.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.perna.projetoveiculo.domain.Veiculo;

public class VeiculoDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 3, max = 80, message = "O tamanho deve ser entre 3 e 80 caracteres.")
	private String veiculo;
	
	private String marca;
	private Integer ano;
	private String descricao;
	private Boolean vendido;
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
	private Date updated;
	
	public VeiculoDTO() {
	}

	public VeiculoDTO(Veiculo obj) {
		this.id = obj.getId();
		this.veiculo = obj.getVeiculo();
		this.marca = obj.getMarca();
		this.ano = obj.getAno();
		this.descricao = obj.getDescricao();
		this.vendido = obj.getVendido();
		this.updated = obj.getUpdated();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getVendido() {
		return vendido;
	}

	public void setVendido(Boolean vendido) {
		this.vendido = vendido;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
	
}
