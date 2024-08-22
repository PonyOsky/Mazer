import greenfoot.*;
public class WinW extends World
{
    public WinW()
    {    
        super(600, 600, 1); 
        prepare();
    }

    private void prepare()
    {
        ResBut resBut = new ResBut();
        addObject(resBut,285,546);
        resBut.setLocation(251,554);
        HoBut hoBut = new HoBut();
        addObject(hoBut,363,552);
        hoBut.setLocation(364,551);
    }
}
