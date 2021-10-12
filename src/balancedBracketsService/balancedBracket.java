package balancedBracketsService;
import java.util.Scanner;
import java.util.Stack;

public class balancedBracket {

    public static void isBalanced(String s)
    {
        Stack st= new Stack();

        for (int i = 0; i <s.length();i++)
        {
            if (!st.isEmpty() && s.charAt(i)=='}' && st.peek().equals('('))
            {
                st.pop();
            }
            else if (!st.isEmpty() && s.charAt(i)==')' && st.peek().equals('(')) {
                st.pop();
            }

            else if (!st.isEmpty() && s.charAt(i)=='}' && st.peek().equals('{'))
            {
                st.pop();
            }
            else if (!st.isEmpty() && s.charAt(i)==']' && st.peek().equals('['))
            {
                st.pop();
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
        if (st.empty()){
            System.out.println("valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}


