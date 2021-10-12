package balancedBracketMain;
import balancedBracketsService.balancedBracket;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" enter a string with '(', '{' or'['");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        balancedBracket bb=new balancedBracket();
        bb.isBalanced(s);
    }
}
