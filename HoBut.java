import greenfoot.*;
public class HoBut extends Actor
{
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new StartW());
        }
    }    
}
