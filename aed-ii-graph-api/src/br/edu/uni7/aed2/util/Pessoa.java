package br.edu.uni7.aed2.util;

public class Pessoa {
	public static final int BLOQUEADO = 0;
	public static final int ATIVO = 1;
	public static final int REMOVIDO = 2;

	public static enum StatusType {
		Bloqueado, Ativo, Removido, Quarentena
	}

	private Integer id;
	private String nome;
	private StatusType status;

	public Pessoa() {
	}

	public Pessoa(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public StatusType getStatus() {
		return status;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}
}
