package exemplo04;

public class Gato extends Mamifero {

	
	private boolean quadrupe;

	public boolean isQuadrupe() {
		return quadrupe;
	}

	public void setQuadrupe(boolean quadrupe) {
		this.quadrupe = quadrupe;
	}
	// Métodos
	public void falar() {
		System.out.println("MIAU MIAU!");
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
	"Quadrupede:" + quadrupede+ "\n";
	
}
}

