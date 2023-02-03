package br.com.dio.desafio.test;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		// EXEMPLO DE POLIMORFISMO
//		Conteudo conteudo = new Curso();
//		Conteudo conteudo2 = new Mentoria();

		// EXEMPLO DE HERANÇA(UTILIZANDO ATRIBUTOS DA CLASSE MAE)
		Curso curso = new Curso();
		curso.setTitulo("Java");
		curso.setDescricao("Descrição curso java");
		curso.setCargaHoraria(8);
		System.out.println(curso);

		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("Descrição curso javascript");
		curso2.setCargaHoraria(4);
		System.out.println(curso2+"\n");

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria do Bootcamp na Dio");
		mentoria.setDescricao("Descrição da mentoriad");
		mentoria.setData(LocalDate.now());
		System.out.println(mentoria+"\n");

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev dev = new Dev();
		dev.setNome("Luís Pedro");
		dev.inscreverBootcamp(bootcamp);
		dev.progredir();
		System.out.println("Conteúdos Inscritos por Luís: " + dev.getConteudosInscritos()+"\n");
		System.out.println("Conteúdos Concluidos por Luís: " + dev.getConteudosConcluidos()+"\n");
		System.out.println("XP : "+dev.calcularXp());
		
		System.out.println("==============================================="+"\n");
		
		Dev dev2 = new Dev();
		dev2.setNome("Hélio");
		dev2.inscreverBootcamp(bootcamp);
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("Conteúdos Inscritos por Hélio: " + dev2.getConteudosInscritos()+"\n");
		System.out.println("Conteúdos Concluidos por Hélio: " + dev2.getConteudosConcluidos()+"\n");
		System.out.println("XP : "+dev2.calcularXp());
	}
}
