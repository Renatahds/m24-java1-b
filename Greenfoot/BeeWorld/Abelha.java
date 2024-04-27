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
        // Add your action code here
        move(1);
        // se teclar para esquerda , gira -10º
        if (Greenfoot.isKeyDown("left")){
            turn (-10);

        }
        // se teclar para direita , gira 10º
        if (Greenfoot.isKeyDown("right")){
            turn(10);
        }
        //Verificando se está nos cantos
        verificarPosicao();
        //Verifica se toca em uma mosca
        capturaMosca();
    }

    /**
     * Método que verifica se está na direita do mundo
     */
    public boolean isNaDireita(){ 
        if (getX() > getWorld().getWidth()-10){
            return true;  
        }
        return false;
    }

    /**
     * Método que verifica se está na esquerda do mundo
     */

    public boolean isNaEsquerda(){
        return (getX()<10 );
    }

    /**
     * Método que verifica se está na base do mundo
     */
    public boolean isNaBase(){
        return (getY() > getWorld().getHeight()-10 );
    }

    /**
     * Método que verifica se está no topo do mundo
     */
    public boolean isNoTopo(){
        return (getY() <10);
    }

    /**
     * Método que verifica se a abelha está nos cantos e reposiciona ela
     */
    public void verificarPosicao(){
        //verificando se está na direita
        if (isNaDireita()   ){
            setLocation(10, getY());

        }
        //verifica se está na esquerda
        if (isNaEsquerda()){
            setLocation(getWorld().getWidth()-10, getY());
        }
        //Verifica se está no topo do mundo
        if (isNoTopo()){
            setLocation(getX(), getWorld().getHeight()-10);
        }
        //Verifica se está na base do mundo
        if (isNaBase()){
            setLocation(getX(), 10);
        }
    }

    /** 
     *Método que captura a mosca
     */
    public void capturaMosca(){ 
        //verificando se tocou em uma mosca
        if( isTouching(Mosca.class ) ) { 
            //Remove a mosca tocada.
            removeTouching(Mosca.class);
            //Adicionando uma nova mosca no mundo
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca(), pX,pY);
        }
    }
} 

 