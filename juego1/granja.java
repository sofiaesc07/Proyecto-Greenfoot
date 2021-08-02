import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class granja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class granja extends World
{
    Tablero tablero = new Tablero();
    public granja()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        setPaintOrder(Tablero.class,hoja.class,granjero.class);
        granjero n1=new granjero();
        addObject(n1,50,300);
        crearhojas(2);
        crearmanzana(8);
        prepare();
    }
    
    public Tablero getTablero()
    {
        return tablero; 
    }
    
    public void crearhojas(int numero){
        for(int i=0;i<numero;i++){
            hoja h=new hoja();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(h,x,y);
        }
    }
    
    public void crearmanzana(int numero){
        for(int i=0;i<numero;i++){
            manzana m=new manzana();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(m,x,y);
        }
    }
   
    private void prepare()
    {
        addObject(tablero, 150, 40);
    }
}


