import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class ferrari here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hoja extends Actor
{
    /**
     * Act - do whatever the hoja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
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
        
        Actor granjero=getOneObjectAtOffset(0,0,granjero.class);
        if(granjero!=null){
           granja gran=(granja)getWorld();
           GameOver gameover = new GameOver();
           gran.addObject(gameover, gran.getWidth()/2, gran.getHeight()/2);
           getWorld().removeObject(granjero);
           getWorld().removeObject(this);
           Greenfoot.playSound("bomba.mp3");
        }
    }    
}
