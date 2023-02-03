package br.com.dio.desafio.test;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Teste {
	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("Java");
		curso.setDescricao("Descrição curso java");
		curso.setCargaHoraria(8);
		System.out.println(curso);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("Descrição curso javascript");
		curso2.setCargaHoraria(4);
		System.out.println(curso2);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria do Bootcamp na Dio");
		mentoria.setDescricao("Descrição da mentoria");
		mentoria.setData(LocalDate.now());
		System.out.println(mentoria);
	}
}
