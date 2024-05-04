import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class inseto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class inseto extends Actor
{
    /**
     * Act - do whatever the inseto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void verificarCanto(){
        if (isAtEdge()){
            turn(180);
        }
    }
}
