import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AnalogClock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnalogClock extends Actor
{
    private GreenfootImage clockImage;
    
    public AnalogClock(){
        clockImage = new GreenfootImage("ClockFace.png");    
        setImage(clockImage);
    }
    
    /**
     * Act - do whatever the AnalogClock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
