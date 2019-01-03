package entities;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Usuario {
	
	List<Curso> cursos = new ArrayList<>();
	
	public Instrutor(String nome, Integer codigo) {
		super(nome, codigo);

	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Curso curso) {
		cursos.add(curso);
	}
	

	
	
}