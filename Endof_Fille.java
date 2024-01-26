import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 1; sc.hasNext(); i++){
            String str = sc.nextLine();
            System.out.println(i + " " + str);
             if(!sc.hasNext()) {
                break;
            }
        }
        sc.close();
    }
}
