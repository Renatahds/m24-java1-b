package exemplo04;

public class TesteZoo {

	public static void main(String[] args) {
		Mamifero mam = new Cachorro ();
		mam.setCor("Caramelo");
		mam.setNome("Toto");
		mam.setIdade(3);
		if (mam instanceof Cachorro) {
			((Cachorro mam).setQuadrupede(true);
		}
		((Cachorro) mam).setQuadrupede(true);
		mam.falar();
		System.out.println(mam.toString());

	}

}
