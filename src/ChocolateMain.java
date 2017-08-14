/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 19. November 2016
 * Purpose: solution to lab ChocolateBox
 */
public class ChocolateMain {

    /**
     * Main method to test class ChocolateBox.
     * @param args - a variable number of values from the terminal.
     */
    public static void main(String[] args) {

        ChocolateBox myBox1 = new ChocolateBox(true);
        System.out.println("Should be (CCCCCCCSSSSSSSWWWWWWW). Is: " + myBox1.toString());
        ChocolateBox myBox = new ChocolateBox(false);
        System.out.println("Should be (). Is: " + myBox.toString());
        myBox.add('C', 5);
        System.out.println("Should be (CCCCC). Is: " + myBox.toString());
        myBox.add('S', 20);
        System.out.println("Should be (CCCCCSSSSSSSSSSSSSSSS). Is: " + myBox.toString());
        myBox.add('W', 1);
        System.out.println("Should be (CCCCCSSSSSSSSSSSSSSSS). Is: " + myBox.toString());
        myBox.remove('C', 5);
        System.out.println("Should be (SSSSSSSSSSSSSSSS). Is: " + myBox.toString());
        myBox.add('W', 5);
        System.out.println("Should be (SSSSSSSSSSSSSSSSWWWWW). Is: " + myBox.toString());
        myBox.remove('S', 3);
        System.out.println("Should be (SSSSSSSSSSSSSWWWWW). Is: " + myBox.toString());
        myBox.add('C', 5);
        System.out.println("Should be (CCCSSSSSSSSSSSSSWWWWW). Is: " + myBox.toString());
        myBox.remove('C', 3);
        myBox.remove('S', 13);
        myBox.remove('W', 5);
        System.out.println("Should be (). Is: " + myBox.toString());
    }

}
