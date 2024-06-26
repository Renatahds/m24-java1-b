import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (Renata hds) 
 * @version (2024-05-11)
 */
public class Alien extends Actor
{
    public int pX = 1;
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(pX);
        if (isAtEdge()){
            pX *= -1; // pX = pX * -1;
            setLocation(getX(), getY()+30);
        }
        // se tocar na nave game over
        if (isTouching(Nave.class)){
            getWorld().showText("GAME OVER", 400,300);
            Greenfoot.stop();
        }
    }
}
