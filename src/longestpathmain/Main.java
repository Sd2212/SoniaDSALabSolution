package longestpathmain;
import java.util.ArrayList;

import static longestpathservice.longestpath.*;


public class Main
{
    public static void main(String[] arg)
    {
        Node root= newNode(105);
        root.leftNode=newNode(20);
        root.rightNode=newNode(130);
        root.leftNode.leftNode=newNode(30);
        root.leftNode.rightNode=newNode(40);
        root.rightNode.leftNode=newNode(110);
        root.rightNode.rightNode=newNode(140);
        root.leftNode.leftNode.leftNode=newNode(5);

        ArrayList<Integer>output=longestPath(root);
        int size=output.size();
        System.out.print(output.get(size-1));
        for (int i=size-2;i>=0;i--)
        {
            System.out.print("->"+output.get(i));
        }
    }
}
