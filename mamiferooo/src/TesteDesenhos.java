
public class TesteDesenhos {

	//Criando janela 
	JOptionPane janela = new JOptionPane();
	JDialog dlg = janela.createDialog("Desenhos");
	dlg.setSize(800,600);
	DesenhoSwing desenho = new DesenhoSwing();
	dlg.setContentPane(desenho);
	dlg.setVisible (true);
	
	
	
}
