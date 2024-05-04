import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe BeeWorld que representa o mundo da Abelha no jogo
 * 
 * @author (Renata hds) 
 * @version (2024-04-20)
 */
public class BeeWorld extends World
{
// Campos e Fields
private Abelha abelha = null;

    /**
     * Constructor da Classe BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        abelha = new Abelha();
        addObject(abelha,48,62);
        
        Aranha aranha = new Aranha();
        addObject(aranha,507,96);
        //utilizando o for para criar as moscas
        for(int i=0;i<20;i++){ 
        int pX=Greenfoot.getRandomNumber(getWidth());
        int pY=Greenfoot.getRandomNumber(getHeight());
        int vel = Greenfoot.getRandomNumber(5)+1;
        int ang= Greenfoot.getRandomNumber (360);
        //Adicionando no mundo e criando mais moscas.
        addObject(new Mosca (vel,ang), pX,pY);
        }
        
    }
    /**
    * getter par obter a instância da abelha criada no mundo.
    **/
    public Abelha getAbelha(){
        return abelha;
    }
    
}
