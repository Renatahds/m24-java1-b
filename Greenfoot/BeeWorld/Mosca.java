import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Mosca destinada a fazer parte do jogo BeeWorld!
 * 
 * @author (Renata hds) 
 * @version (2024-04-20)
 */
public class Mosca extends Actor
{
    /**
     * Método Act é executado sempre que apertamos o botão Act ou 
     * ficará em execução quando apertamos o botão Run.
     */
    public void act()
    {
        // Add your action code here.
        move(1); 
        if (isAtEdge()){
        turn(180);
        }
        
        
    
    }
}