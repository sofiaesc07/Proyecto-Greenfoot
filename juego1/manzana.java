import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class manzana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class manzana extends Actor
{
    /**
     * Act - do whatever the hoja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        World m=getWorld();
        if(getX()>=m.getWidth()-5||getX()<=5){
            turn(90);
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        if(getY()>=m.getHeight()-5||getY()<=5){
            turn(90);
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
    }    
}