import greenfoot.*;
public class GOWorld extends World
{
    public GOWorld()
    {    
        super(600, 600, 1);
        prepare();
    }
    
    public void prepare()
    {
        HoBut hoBut = new HoBut();
        addObject(hoBut,279,270);
        hoBut.setLocation(307,310);
        hoBut.setLocation(293,549);
        hoBut.setLocation(302,551);
    }
}
