package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	protected final Double XP_PADRAO = 10D;
	private String titulo;
	private String descricao;

	public abstract Double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getXP_PADRAO() {
		return XP_PADRAO;
	}

}
