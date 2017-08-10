/**
 * Organisation: Hochschule Muenchen, Fakultaet 07
 * Project: Praktikum Softwareentwicklung 1 Frau Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, bauman21@hm.edu
 * Study group: IF3A
 * Date: 15. November 2016
 * Purpose: Loesung Praktikumseinheit 04: ChocolateBox-Main-Klasse zum testen
 * Software: Oracle Java SE JDK 1.8.0_101, Windows 10 x86_64
 * Hardware: Intel Core i5-6300 @ 2.40 GHz 2.50 GHz, 2 Cores, 4096 MB RAM
 */

public class ChocolateMain {

    public static void main(String[] args) {

        ChocolateBox myBox1 = new ChocolateBox(true);
        System.out.println(myBox1.toString());           // (CCCCCCCSSSSSSSWWWWWWW)
        ChocolateBox myBox = new ChocolateBox(false);
        System.out.println(myBox.toString());           // ()
        myBox.add('C', 5);
        System.out.println(myBox.toString());           // (CCCCC)
        myBox.add('S', 20);
        System.out.println(myBox.toString());           // (CCCCCSSSSSSSSSSSSSSSS)
        myBox.add('W', 1);
        System.out.println(myBox.toString());           // (CCCCCSSSSSSSSSSSSSSSS)
        myBox.remove('C', 5);
        System.out.println(myBox.toString());           // (SSSSSSSSSSSSSSSS)
        myBox.add('W', 5);
        System.out.println(myBox.toString());           // (SSSSSSSSSSSSSSSSWWWWW)
        myBox.remove('S', 3);
        System.out.println(myBox.toString());           // (SSSSSSSSSSSSSWWWWW)
        myBox.add('C', 5);
        System.out.println(myBox.toString());           // (CCCSSSSSSSSSSSSSWWWWW)
        myBox.remove('C', 3);
        myBox.remove('S', 13);
        myBox.remove('W', 5);
        System.out.println(myBox.toString());           // ()
    }

}
