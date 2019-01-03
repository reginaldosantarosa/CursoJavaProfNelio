package entities;

public class Aluno extends Usuario implements Comparable<Usuario>  {
	
	public Aluno(String nome, Integer codigo) {
		super(nome, codigo);

	}

	
	@Override
	public int compareTo(Usuario o) {
		return nome.compareTo(o.getNome());
	}
	
}