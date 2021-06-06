/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex23.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Is the car silent when you turn the key? ");
        String top = in.nextLine();
        if(top.equals("yes")) { // y
            System.out.print("Are the battery terminals corroded? ");
            String y = in.nextLine();
            if(y.equals("yes")) { // yy
                System.out.print("Clean terminals and try starting again.");
            } else if (y.equals("no")) { // yn
                System.out.print("Replace cables and try again.");
            } else
                System.out.println("INVALID INPUT");
        } else if (top.equals("no")) { // n
            System.out.print("Does the car make a slicking noise? ");
            String n = in.nextLine();
            if(n.equals("yes")) { // ny
                System.out.print("Replace the battery.");
            } else if(n.equals("no")) { // nn
                System.out.print("Does the car crank up but fail to start? ");
                String nn = in.nextLine();
                if(nn.equals("yes")) { // nny
                    System.out.print("Check spark plug connections.");
                } else if(nn.equals("no")) { // nnn
                    System.out.print("Does the engine start and then die? ");
                    String nnn = in.nextLine();
                    if(nnn.equals("yes")) { // nnny
                        System.out.print("Does you car have fuel injection? ");
                        String nnny = in.nextLine();
                        if(nnny.equals("yes")) { // nnnyy
                            System.out.print("Get it in for service.");
                        } else if(nnny.equals("no")) { //nnnyn
                            System.out.print("Check to ensure the choke is opening and closing.");
                        } else
                            System.out.println("INVALID INPUT");
                    } else if(nnn.equals("no")) { // nnnn
                        System.out.print("This should not be possible.");
                    } else
                        System.out.println("INVALID INPUT");
                } else
                    System.out.println("INVALID INPUT");
            } else
                System.out.println("INVALID INPUT");
        } else
            System.out.println("INVALID INPUT");
    }
}
