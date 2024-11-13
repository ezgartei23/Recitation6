import java.util.Calendar;

/**
 * Write a description of class StopWatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StopWatch
{
    private boolean isInReset;
    private long initialTime;
    private long currentTime;

    public StopWatch()
    {
        reset();
    }

    public void reset()
    {
        isInReset = true;
        initialTime = 0;
        currentTime = 0;
    }

    public void set(long seconds){
	currentTime = Calendar.getInstance().getTimeInMillis();
        initialTime = currentTime - (seconds*1000);
    }
    
    public void startStop()
    {
        currentTime = Calendar.getInstance().getTimeInMillis();
        if (isInReset){
            initialTime = currentTime;
            isInReset = false;
        }
    }

    public long elapsedTime()
    {
        return currentTime-initialTime;
    }

    public String toString()
    {
        return "I need to implement";
    }
}
