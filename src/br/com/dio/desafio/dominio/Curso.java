package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

	private Integer cargaHoraria;
	
	

	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public Double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO*cargaHoraria;
	}

}
