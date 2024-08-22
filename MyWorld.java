import greenfoot.*;
public class MyWorld extends World
{
    private Player player;
    public MyWorld()
    {    
        super(600, 600, 1); 
        prepare();
    }
    public Player getPlayer()
    {
        return this.player;
    }
    
    private void prepare()
    {
        player = new Player(0);
        addObject(player,197,61);
        setPaintOrder(Player.class, Key.class, Gate.class, Block.class);
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
        for(int citac = 0; citac <= 4; citac++)
        {
            Block block = new Block();
            addObject(block, 271, 1+30*citac);
        }
        for(int citac = 0; citac <= 6; citac++)
        {
            Block block = new Block();
            addObject(block, 391+30*citac, 151);
        }
        for(int citac = 0; citac <= 5; citac++)
        {
            Block block = new Block();
            addObject(block, 1+30*citac, 151);
        }
        for(int citac = 0; citac <= 8; citac++)
        {
            Block block = new Block();
            addObject(block, 271, 241+30*citac);
        }
        for(int citac = 0; citac <= 11; citac++)
        {
            Block block = new Block();
            addObject(block, 121+30*citac, 481);
        }
        for(int citac = 0; citac <= 11; citac++)
        {
            Block block = new Block();
            addObject(block, 121+30*citac, 241);
        }
        for(int citac = 0; citac <= 5; citac++)
        {
            Block block = new Block();
            addObject(block, 1+30*citac, 361);
        }
        for(int citac = 0; citac <= 6; citac++)
        {
            Block block = new Block();
            addObject(block, 391+30*citac, 361);
        }
        Key key = new Key();
        addObject(key,82,533);
        key.setLocation(68,537);
        Key key2 = new Key();
        addObject(key2,549,537);
        key2.setLocation(540,545);
        Key key3 = new Key();
        addObject(key3,306,345);
        key3.setLocation(268,202);
        Gate gate = new Gate();
        addObject(gate,514,74);
    }
}
