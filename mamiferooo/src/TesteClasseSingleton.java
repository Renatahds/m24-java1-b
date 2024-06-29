
public class TesteClasseSingleton {

	
	ClasseSingleton obj01 = new ClasseSingleton.getInstancia();
	ClasseSingleton obj02 = new ClasseSingleton.getInstancia();
	
	System.out.println (obj01);
	System.out.println (obj02);
	
	obj01.setNome ("Roberval");
	System.out.println(obj02.getNome());
}
