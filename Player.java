import greenfoot.*;
public class Player extends Actor
{
    private int speed;
    private int keys;
    private int counter;
    private Player player;
    private GreenfootImage stopMove = new GreenfootImage("images/stop.png");
    private GreenfootImage upMove = new GreenfootImage("images/up.png");
    private GreenfootImage downMove = new GreenfootImage("images/down.png");
    private GreenfootImage leftMove = new GreenfootImage("images/left.png");
    private GreenfootImage rightMove = new GreenfootImage("images/right.png");
    private final int StepVol = 100;
    private final int GOVol = 100;
    private final int TKVol = 50;
    public Player(int keys)
    {
        this.speed = 5;
        this.counter = 0;
        this.getImage().scale(50, 60);
        this.stopMove.scale(50, 60);
        this.leftMove.scale(50, 60);
        this.rightMove.scale(50, 60);
        this.upMove.scale(50, 60);
        this.downMove.scale(50, 60);
    }
    public void control()
    {
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-speed,getY());
            GreenfootSound gs = new GreenfootSound("step.wav");
            gs.setVolume(StepVol);
            gs.play();
            this.setImage(leftMove);
        }
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+speed,getY());
            GreenfootSound gs = new GreenfootSound("step.wav");
            gs.setVolume(StepVol);
            gs.play();
            this.setImage(rightMove);
        }
        if (Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-speed);
            GreenfootSound gs = new GreenfootSound("step.wav");
            gs.setVolume(StepVol);
            gs.play();
            this.setImage(upMove);
        }
        if (Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+speed);
            GreenfootSound gs = new GreenfootSound("step.wav");
            gs.setVolume(StepVol);
            gs.play();
            this.setImage(downMove);
        }
    }
    public boolean touching()
    {
        if(isTouching(Block.class))
        {
            if(Greenfoot.isKeyDown("right"))
            {
                this.setLocation(this.getX()-speed,this.getY());
            }
            if(Greenfoot.isKeyDown("left"))
            {
                this.setLocation(this.getX()+speed,this.getY());
            }
            if(Greenfoot.isKeyDown("down"))
            {
                this.setLocation(this.getX(),this.getY()-speed);
            }
            if(Greenfoot.isKeyDown("up"))
            {
                this.setLocation(this.getX(),this.getY()+speed);
            }
            return true;
        } else {
            return false;
        }
    }
    public boolean getKey()
    {
        if(this.isTouching(Key.class))
        {
            Key key = (Key)this.getOneIntersectingObject(Key.class);
            this.getWorld().removeObject(key);
            GreenfootSound gs = new GreenfootSound("TK.wav");
            gs.setVolume(TKVol);
            gs.play();
            this.keys ++;
            return true;
        }else{return false;}
    }
    public int getKeys()
    {
        return this.keys;
    }
    public void nextL()
    {
        if(this.isTouching(Gate.class) && keys==3)
        {
            Greenfoot.setWorld(new NextL2());
        }
    }
    public void nextLTwo()
    {
        if(this.isTouching(GateTwo.class) && keys==3)
        {
            Greenfoot.setWorld(new NextL3());
        }
    }
    public void win()
    {
        if(this.isTouching(GateThree.class) && keys==3)
        {
            Greenfoot.setWorld(new WinW());
        }
    }
    public void foxTouch()
    {
        if(this.isTouching(Fox.class))
        {
            Greenfoot.setWorld(new GOWorld());
            GreenfootSound gs = new GreenfootSound("GO.wav");
            gs.setVolume(GOVol);
            gs.play();
        }
    }
    public void act() 
    {
        this.control();
        this.touching();
        this.getKey();
        this.nextL();
        this.nextLTwo();
        this.foxTouch();
        this.win();
    }    
}
