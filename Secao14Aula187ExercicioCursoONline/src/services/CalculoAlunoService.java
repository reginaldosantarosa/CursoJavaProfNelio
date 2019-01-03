package services;

import java.util.Set;
import java.util.TreeSet;

import entities.Aluno;
import entities.Curso;
import entities.Instrutor;

public class CalculoAlunoService {

	private int quantidadeAlunos;
	private Instrutor instrutor;

	
	public CalculoAlunoService(Instrutor instrutor) {		
		this.instrutor = instrutor;
	}

	
	//Set<Aluno> setAlunos = new HashSet<>();
	Set<Aluno> setAlunos = new TreeSet<>();

	public void alunosInstrutor() {

		for (Curso c : instrutor.getCursos()) {
			for (Aluno aluno : c.getListAlunos()) {
				setAlunos.add(aluno);
			}
		}
		
		System.out.println("Quantidade Alunos do prof " + instrutor.getNome() + ":" + setAlunos.size());
	}

	public void imprimiAlunosInstrutor() {

		

		for (Aluno a : setAlunos) {
			System.out.println(a.getNome() + " - Matricula: " + a.getCodigo());

		}
	}
}
