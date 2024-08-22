import greenfoot.*;
public class NextL3 extends World
{
    private Player player;
    public NextL3()
    {    
        super(600, 600, 1);
        prepare();
    }
    public Player getPlayer()
    {
        return this.player;
    }
    
    public void prepare()
    {
        for(int citac = 0; citac <= 20; citac++)
        {
            Block block = new Block();
            addObject(block,1+30*citac, 0);
        }
        for(int citac = 0; citac <= 20; citac++)
        {
            Block block = new Block();
            addObject(block,1+30*citac, 600);
        }
        for(int citac = 0; citac <= 20; citac++)
        {
            Block block = new Block();
            addObject(block, 0, 1+30*citac);
        }
        for(int citac = 0; citac <= 20; citac++)
        {
            Block block = new Block();
            addObject(block, 600, 1+30*citac);
        }
        for(int citac = 0; citac <= 2; citac++)
        {
            Block block = new Block();
            addObject(block, 481, 511+30*citac);
        }
        for(int citac = 0; citac <= 6; citac++)
        {
            Block block = new Block();
            addObject(block, 391+30*citac, 391);
        }
        for(int citac = 0; citac <= 3; citac++)
        {
            Block block = new Block();
            addObject(block, 361, 391+30*citac);
        }
        for(int citac = 0; citac <= 6; citac++)
        {
            Block block = new Block();
            addObject(block, 241, 301+30*citac);
        }
        for(int citac = 0; citac <= 12; citac++)
        {
            Block block = new Block();
            addObject(block, 121, 121+30*citac);
        }
        for(int citac = 0; citac <= 8; citac++)
        {
            Block block = new Block();
            addObject(block, 241+30*citac, 271);
        }
        for(int citac = 0; citac <= 8; citac++)
        {
            Block block = new Block();
            addObject(block, 121+30*citac, 151);
        }
        for(int citac = 0; citac <= 2; citac++)
        {
            Block block = new Block();
            addObject(block, 121, 211+30*citac);
        }
        for(int citac = 0; citac <= 4; citac++)
        {
            Block block = new Block();
            addObject(block, 361, 1+30*citac);
        }
        for(int citac = 0; citac <= 1; citac++)
        {
            Block block = new Block();
            addObject(block, 241, 1+30*citac);
        }
        for(int citac = 0; citac <= 3; citac++)
        {
            Block block = new Block();
            addObject(block, 481, 151+30*citac);
        }
        for(int citac = 0; citac <= 3; citac++)
        {
            Block block = new Block();
            addObject(block, 481+30*citac, 151);
        }
        for(int citac = 0; citac <= 1; citac++)
        {
            Block block = new Block();
            addObject(block, 481, 1+30*citac);
        }
        setPaintOrder(Player.class, Key.class, Gate.class, Block.class);
        GateThree gateThree = new GateThree();
        addObject(gateThree,558,506);
        gateThree.setLocation(543,540);
        player = new Player(0);
        addObject(player,439,543);
        player.setLocation(439,547);
        Key key = new Key();
        addObject(key,298,62);
        key.setLocation(301,70);
        Key key2 = new Key();
        addObject(key2,541,212);
        Key key3 = new Key();
        addObject(key3,500,89);
        key3.setLocation(546,53);
    }
}
