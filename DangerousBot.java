
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
       countBeeper(); 
        
    }
    
    public void countBeeper() {
        int count=0;
        while (nextToABeeper()) 
        karel.pickBeeper();
        count++;// count # of Beepers 
        if (count%2==0)
          { 
            //the count is even
        }
        else
        {
            //the count is odd
        }
    
        for ( int i = 0; i<count;i++) {
            karel.putBeeper();  
    }
}
}


