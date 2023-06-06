// 12S22012 - Reinhard Batubara
// 12S22039 - Meilyna S.A. Hutajulu

import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] buddies = new String[4];
        
        func_default(buddies);
        roombuddies(buddies);
    }
    
    public static void func_default(String[] buddies) {
        int value;
        
        for (value = 0; value <= 3; value++) {
            buddies[value] = "";
        }
    }
    
    public static void output(int i, String[] buddies) {
        int j;
        
        for (j = 0; j <= i - 1; j++) {
            System.out.println(buddies[j]);
        }
    }
    
    public static void roombuddies(String[] buddies) {
        boolean y;
        int i;
        
        i = 0;
        y = true;
        while (y == true && i < 4) {
            buddies[i] = input.nextLine();
            if (!buddies[i].equals("---")) {
                i = i + 1;
            } else {
                y = false;
            }
        }
        output(i, buddies);
    }
}
