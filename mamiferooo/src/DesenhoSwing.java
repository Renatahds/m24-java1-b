import javax.swing.JPanel;

public class DesenhoSwing extends JPanel {
	
	/*
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
 public void (Graphics g);
 g.setColor (Color.BLUE);
 g.fillRect(50,50,150,150);
 
 g.setColor (Color.GREEN);
 g.fillOval (300,50,150,150);

 g.setColor (Color.RED);
 int [] xPontos = {600,525,675};
 int [] yPontos = {50,200,200};
 g.fillPolygon(xPontos, yPontos,3);

}
