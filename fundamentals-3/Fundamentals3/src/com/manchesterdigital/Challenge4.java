package com.manchesterdigital;

public class Challenge4 {

    public static void main(String[] args) {

        int style = 9;
        int bribe = 8;

        if(style >=8 && bribe >= 5) {
            System.out.println("You may be seated");
        } else {
            System.out.println("Not allowed in");
        }

    }
}
/*
package com.manchesterdigital;
import java.util.Scanner;
public class ChallengeFour {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter style & bribe!");
       beSeated(in.nextInt(), in.nextInt());
   }

public static void beSeated(int style, int bribe) {
    if (!(style >=8 && bribe >= 5)) {
        System.out.println("Not allowed in");
    }
}
}
 */