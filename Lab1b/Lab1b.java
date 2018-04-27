//Lab1b.java
//This is a practice lab to output a few verses of "99 bottles of beer on
//the wall"
//Authors: Carol Zander,Clark,Olson, you
public class Lab1b {
    public static void main (String[] args) {
        int numBottles;
        // number of bottles currently on the wall
        // display first verse
        numBottles = 5;
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer(); takeOneDown();
        numBottles = 4;
        System.out.print(numBottles);
        onWall();
        System.out.println();
        // display blank line between verses
        // display second verse
        // [this is where you take over]
        
        numBottles = 4;
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer(); takeOneDown();
        numBottles = 3;
        System.out.print(numBottles);
        onWall();
        System.out.println();
        
        numBottles = 3;
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer(); takeOneDown();
        numBottles = 2;
        System.out.print(numBottles);
        onWall();
        System.out.println();
        
        numBottles = 2;
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer(); ifOneShould();
        numBottles = 1;
        System.out.print(numBottles);
        onWall();
        System.out.println();
        
        numBottles = 1;
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer(); takeOneDown();
        
        String Wall= ( "No more bottles of beer" );
        String Bottles= ( "on the wall" );
        String NoMore= Wall + " " + Bottles;
        System.out.println(NoMore);
    }
       
        

    public static void onWall() {
        System.out.println(" bottles of beer on the wall");
    }
    public static void botBeer() {
        System.out.println(" bottles of beer");
    }
    public static void takeOneDown() {
        System.out.println("Take one down and pass it around");
    }
     public static void ifOneShould() {
        System.out.println("If one of those bottles should happen to fall");
    }
}