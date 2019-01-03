package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
import entities.Curso;
import entities.Instrutor;
import services.CalculoAlunoService;

public class Program {
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Curso cursoA= new Curso("A");
		Curso cursoB= new Curso("B");
		Curso cursoC= new Curso("C");
		
		Instrutor alex = new Instrutor("Alex", 1010);
		
		cursoA.setAlunos(new Aluno("Ana Maria", 1));
		cursoA.setAlunos(new Aluno("Jose", 2));

		cursoB.setAlunos(new Aluno("Ana", 1));
		cursoB.setAlunos(new Aluno("Pedro", 3));
		cursoB.setAlunos(new Aluno("Ana Maria", 4));
		
		cursoC.setAlunos(new Aluno("Joao", 5));
		cursoC.setAlunos(new Aluno("Paulo", 6));
		cursoC.setAlunos(new Aluno("Manoel", 7));
		cursoC.setAlunos(new Aluno("Ana", 1));
		cursoC.setAlunos(new Aluno("Pedro", 3));
		
		
		alex.setCursos(cursoA);
		alex.setCursos(cursoB);
		alex.setCursos(cursoC);
	
		CalculoAlunoService ca = new CalculoAlunoService(alex);
		ca.alunosInstrutor();
		System.out.println("\n");
		ca.imprimiAlunosInstrutor();
				
		sc.close();
		
	}

}
