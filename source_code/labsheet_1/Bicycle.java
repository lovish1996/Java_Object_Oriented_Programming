package source_code.labsheet_1;

/**
 * Set JDK path using command:
 * $ set path = path_to_jdk/bin
 * <p>
 * To run it from command line:
 * $ javac Bicycle.java     [compiles java code]
 * $ java Bicycle       [executes java code]
 */
public class Bicycle {
    int speed = 100;
    int noOfGears = 5;
    int cadence = 40;

    public void printState() {
        System.out.println("Bicycle [speed = " + speed + ", noOfGears = " + noOfGears + ", cadence = " + cadence + "]");
    }

    public static void main(String[] args) {
        /* Create an instance of Bicycle class. */
        Bicycle bicycle = new Bicycle();

        /* Invoke method printState() of object bicycle. */
        bicycle.printState();
    }
}


