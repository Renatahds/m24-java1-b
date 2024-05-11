import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa o Inseto que será utilizado no jogo.
 * 
 * @author (Renata Helena ) 
 * @version (2024-04-27)
 */
public class Inseto extends Actor
{
    /**
     * Act - do whatever the Inseto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    /**
    * Metodo que irá verificar se o objeto está no canto do mundo.
    */
    
    public void verificarCerto(){
        if (isAtEdge()){
            turn(180);
        
    }
}
}
