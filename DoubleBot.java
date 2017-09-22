


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (Milan Oppermann) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    
    {
        //
         while (frontIsClear() && !nextToABeeper()) {
        move();
   
    }
}

    public void faceNorth() 
    {
    
     while(!faceNorth){
        turnLeft();
    }
}



}
 
    
    


