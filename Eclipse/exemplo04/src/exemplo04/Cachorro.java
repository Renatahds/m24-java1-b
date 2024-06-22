package exemplo04;

public class Cachorro extends Mamifero{
	
	private boolean quadrupe;

	public boolean isQuadrupe() {
		return quadrupe;
	}

	public void setQuadrupe(boolean quadrupe) {
		this.quadrupe = quadrupe;
	}
	// Métodos
	public void falar() {
		System.out.println("AU AU AU!");
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
	"Quadrupede:" + quadrupede+ "\n";
	
}
}
