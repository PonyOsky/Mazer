import greenfoot.*;
public class StBut extends Actor
{
    public StBut()
    {
        this.getImage().scale(80, 30);
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }    
}
