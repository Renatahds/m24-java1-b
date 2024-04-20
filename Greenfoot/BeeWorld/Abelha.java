import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Abelha para ser utilizada no jogo BeeWordl.
 * 
 * @author (Renata hds) 
 * @version (2024-04-20)
 */
public class Abelha extends Actor
{
    /**
     * Método que será executando quando aprtado o botão Act ou RUN
     * 
     */
    public void act()
    {
        // Add your action code 
        move(1);
        // se teclar para esquerda , gira -10º
        if (Greenfoot.isKeyDown("left")){
            turn (-10);
            
        }
        // se teclar para direita , gira -10º
        if (Greenfoot.isKeyDown("right")){
            turn(10);
        }
    }
}
