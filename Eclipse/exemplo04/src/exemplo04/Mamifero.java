package exemplo04;

public abstract class Mamifero {
	
	private String nome;
	private String cor;
	private int idade;
	//constructor
	//Getters e setters
	//Métodos
	public void falar() {
		
		System.out.println ("Mamífero falando");
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + "\n"+ "Cor:"+ cor+ "\n"+ "Idade:" + idade + "\n";
		
		
	}
	

}
