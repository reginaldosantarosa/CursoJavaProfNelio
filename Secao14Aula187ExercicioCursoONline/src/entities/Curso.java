package entities;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private String nome;
	
	List<Aluno> listAlunos = new ArrayList<>();

	public Curso(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getListAlunos() {
		return listAlunos;
	}

	public void setAlunos(Aluno alunos) {
		listAlunos.add(alunos);
	}

}
