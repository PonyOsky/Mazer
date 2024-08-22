import greenfoot.*;
public class StartW extends World
{
    public StartW()
    {    
        super(600, 600, 1);
        prepare();
    }
    
    public void prepare()
    {
        StBut stBut = new StBut();
        addObject(stBut,295,236);
        stBut.setLocation(298,261);
        stBut.setLocation(309,275);
    }
}
