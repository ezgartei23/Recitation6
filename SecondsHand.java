import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecondsHand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecondsHand extends Actor
{
    private int count;
    
    public SecondsHand(){
        count = 0;
    }
    
    /**
     * Act - do whatever the SecondsHand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        count = (count+1) % 60;
        setRotation(count*6);
    }
}
