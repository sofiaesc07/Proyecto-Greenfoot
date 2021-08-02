import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tablero extends Actor
{
    int puntaje = 0;
    
    public void act()
    {
        setImage(new GreenfootImage("Manzanas recogidas : " + puntaje, 24, Color.BLACK, Color.WHITE));
    }
   public void addpuntaje()
    {
        puntaje++;
    }    
}

