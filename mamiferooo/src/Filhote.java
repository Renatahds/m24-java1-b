
public class Filhote {
/*
 * Utilização de campo estático em uma classe
 */
	private static int nSeq = 0;
	private int id;
	private String nome;
	public Filhote (String nome) {
		id = ++nSeq;
		this.nome = nome;
		
	}
	//Getters e Setters
	public static int getnSeq() {
		return nSeq;
	}
	public static void setnSeq(int nSeq) {
		Filhote.nSeq = nSeq;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
