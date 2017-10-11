
import kareltherobot.*; 


/**
 * @author : Milan Oppermann
 */
public class DangerousBot extends Robot
{
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public int beepers;
    
    public void choosePile() {
        evenOrOdd();
        pickUpBeepers();
    }
   
    public void moveEast() {
        faceEast();
        while (frontIsClear()) {
            move();
        }
   }
   public void evenOrOdd() {
       while (nextToABeeper()) {
           pickBeeper();
           beepers++;
        }
       if (beepers % 2 == 0) {
           moveEast();
        }
        else {
            moveWest();
        }
    }
    public void moveWest(){
    faceWest();
    while (frontIsClear()) {
        move();
    }
   }
    public void pickUpBeepers() {
        while (nextToABeeper()) {
            pickBeeper();
        }
    }
   public void faceEast() {
       while (!facingEast()) {
           turnLeft();
        }
    }
    public void faceWest() {
        while (!facingWest()) {
            turnLeft();
        }
    }
   
}

