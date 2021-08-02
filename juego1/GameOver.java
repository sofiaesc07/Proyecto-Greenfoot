import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;
    String mensaje;
    
    public GameOver()
    {
        setImage(new GreenfootImage("Juego Terminado", 48, Color.WHITE, Color.RED));
    
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
