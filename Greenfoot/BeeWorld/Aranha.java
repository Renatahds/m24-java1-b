import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aranha here.
 * 
 * @author (Renata hds) 
 * @version (04-05-2024)
 */
<<<<<<< HEAD
public class Aranha extends inseto
=======
public class Aranha extends Inseto
>>>>>>> 493d8642ab6bd61150893b116c77b79dc579aa0b
{
    /**
     * Act - do whatever the Aranha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        //verifica se o número aleatório de 1 a 100 está menor 
        if (Greenfoot.getRandomNumber(100)+1 <= 10){
            //Adiciona aleatóriamente de -45º a 45º para rotacionar
            turn(Greenfoot.getRandomNumber(91)-45);
            }
        verificarCanto();
        acelerarAranha ();
        //Captura a mosca se tiver no alcance.
        capturaMosca();
        //Interceptando a abelha
        interceptarAbelha();
    }
    /**
     * Método que irá acelerar aranha em determinada área do tabuleiro
     */
    public void acelerarAranha(){
        if ( getX()>=200 && getX()<=600 &&
            getY()>=100 && getY()<=500) {
            move (2);
        }

   
    }
    /**
     * Método que captura a mosca pela Aranha
     */
    public void capturaMosca(){
      if (isTouching(Mosca.class)){
          //Remove a mosca tocada.
            removeTouching(Mosca.class);
            //adicionando uma nova mosca no mundo
            int pX=Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY=Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca(), pX, pY);
        }  
    }
    public void interceptarAbelha(){
        // Cast de BeeWorld => Força o mundo a ser do tipo BeeWorld.
        Abelha ab = ((BeeWorld) getWorld()).getAbelha();
        if (ab!=null){
            turnTowards(ab.getX(), ab.getY());
        }
        verificarCerto();
    }
}
