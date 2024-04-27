import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aranha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aranha extends Inseto
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
            //Gira aleatóriamente de -45º a 45º para rotacionar
            turn(Greenfoot.getRandomNumber(91)-45);
            
        }
        verificarCerto();
    }
}
