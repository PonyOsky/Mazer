import greenfoot.*;
public class NextL2 extends World
{
    private Player player;
    public NextL2()
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
        player = new Player(0);
        addObject(player,75,67);
        player.setLocation(58,58);
        for(int citac = 0; citac <= 50; citac++)
        {
            Block block = new Block();
            addObject(block,1+30*citac, 0);
        }
        for(int citac = 0; citac <= 50; citac++)
        {
            Block block = new Block();
            addObject(block,1+30*citac, 600);
        }
        for(int citac = 0; citac <= 50; citac++)
        {
            Block block = new Block();
            addObject(block, 0, 1+30*citac);
        }
        for(int citac = 0; citac <= 50; citac++)
        {
            Block block = new Block();
            addObject(block, 600, 1+30*citac);
        }
        for(int citac = 0; citac <= 15; citac++)
        {
            Block block = new Block();
            addObject(block, 121+30*citac, 481);
        }
        for(int citac = 0; citac <= 4; citac++)
        {
            Block block = new Block();
            addObject(block, 121, 0+30*citac);
        }
        for(int citac = 0; citac <= 4; citac++)
        {
            Block block = new Block();
            addObject(block, 121, 241+30*citac);
        }
        for(int citac = 0; citac <= 4; citac++)
        {
            Block block = new Block();
            addObject(block, 0+30*citac, 241);
        }
        for(int citac = 0; citac <= 11; citac++)
        {
            Block block = new Block();
            addObject(block, 241+30*citac, 241);
        }
        for(int citac = 0; citac <= 4; citac++)
        {
            Block block = new Block();
            addObject(block, 241, 241+30*citac);
        }
        for(int citac = 0; citac <= 4; citac++)
        {
            Block block = new Block();
            addObject(block, 361, 361+30*citac);
        }
        for(int citac = 0; citac <= 4; citac++)
        {
            Block block = new Block();
            addObject(block, 481, 241+30*citac);
        }
        for(int citac = 0; citac <= 2; citac++)
        {
            Block block = new Block();
            addObject(block, 241+30*citac, 121);
        }
        for(int citac = 0; citac <= 2; citac++)
        {
            Block block = new Block();
            addObject(block, 421+30*citac, 121);
        }
        for(int citac = 0; citac <= 4; citac++)
        {
            Block block = new Block();
            addObject(block, 301, 0+30*citac);
        }
        for(int citac = 0; citac <= 4; citac++)
        {
            Block block = new Block();
            addObject(block, 421, 121+30*citac);
        }
        setPaintOrder(Player.class, Key.class, Gate.class, Block.class);
        Key key = new Key();
        addObject(key,551,316);
        key.setLocation(541,303);
        GateTwo gateTwo = new GateTwo();
        addObject(gateTwo,539,541);
        gateTwo.setLocation(544,537);
        Key key2 = new Key();
        addObject(key2,455,184);
        key2.setLocation(495,178);
        Key key3 = new Key();
        addObject(key3,49,291);
        key3.setLocation(57,297);
    }
}
