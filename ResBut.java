import greenfoot.*;
public class ResBut extends Actor
{
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }    
}
