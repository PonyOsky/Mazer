import greenfoot.*;
public class GateThree extends Actor
{
    private Player player;
    private final int Volume = 100;
    private final int KnockVol = 100;
    private int counter;
    private GreenfootImage open = new GreenfootImage("images/GateOp.png");
    private GreenfootImage closed = new GreenfootImage("images/GateCl.png");
    public GateThree()
    {
        this.getImage().scale(70, 80);
        this.open.scale(70, 80);
        this.counter=0;
    }
    public void openGate()
    {
        if(((NextL3)this.getWorld()).getPlayer().getKeys() == 3)
        {
            GreenfootSound gs = new GreenfootSound("OpG.mp3");
            gs.setVolume(Volume);
            gs.play();
            gs.stop();
            this.setImage(open);
        }else{
            if(this.isTouching(Player.class)){
            counter++;
            GreenfootSound gs = new GreenfootSound("Knock.wav");
            gs.setVolume(KnockVol);
            gs.play();
            if(counter == 3)
                {
                    this.getWorld().addObject(new Fox(),451, 451);
                }
            }
        }
    }
    public void act() 
    {
        this.openGate();
    }    
}