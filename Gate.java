import greenfoot.*;
public class Gate extends Actor
{
    private Player player;
    private final int Volume = 100;
    private GreenfootImage open = new GreenfootImage("images/GateOp.png");
    private GreenfootImage closed = new GreenfootImage("images/GateCl.png");
    public Gate()
    {
        this.getImage().scale(70, 80);
        this.open.scale(70, 80);
    }
    public void openGate()
    {
        if(((MyWorld)this.getWorld()).getPlayer().getKeys() == 3)
        {
            GreenfootSound gs = new GreenfootSound("OpG.mp3");
            gs.setVolume(Volume);
            gs.play();
            gs.stop();
            this.setImage(open);
        }
    }
    public void act() 
    {
        this.openGate();
    }    
}
