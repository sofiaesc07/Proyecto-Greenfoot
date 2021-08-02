import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class granjero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class granjero extends Actor
{
    private int manzanaEaten;    
    public granjero()
    {
        manzanaEaten = 0;
    }

    /**
     * Do whatever the wombat likes to to just now.
     */
    public void act()
    {
        if(foundmanzana()) {
            eatmanzana();
        }
        if (Greenfoot.isKeyDown("left")){
            move(-5);
        }
        if (Greenfoot.isKeyDown("right")){
            move(5);
        }
    }

    /**
     * Check whether there is a leaf in the same cell as we are.
     */
    public boolean foundmanzana()
    {
        Actor manzana = getOneObjectAtOffset(0, 0, manzana.class);
        if(manzana != null) {
            World world;
            world = getWorld();
            granja granja = (granja)world;
            Tablero tablero = granja.getTablero();
            tablero.addpuntaje();
            world.removeObject(manzana);
            Greenfoot.playSound("manzana.mp3");
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * recoger la manzana.
     */
    public void eatmanzana()
    {
        Actor manzana = getOneObjectAtOffset(0, 0, manzana.class);
        if(manzana != null) {
            // eat the leaf...
            getWorld().removeObject(manzana);
            manzanaEaten = manzanaEaten + 1;
        }
    }
    
    /**
     * Tell how many leaves we have eaten.
     */
    public int getmanzanaEaten()
    {
        return manzanaEaten;
    }
}