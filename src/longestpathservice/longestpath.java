package longestpathservice;

import org.w3c.dom.Node;

import java.util.ArrayList;

public class longestpath
{
    public static class Node {
        public Node leftNode;
        public Node rightNode;
        int nodeData;
    }

    public static Node newNode(int nodeData)
    {
        Node temp=new Node();
        temp.nodeData=nodeData;
        temp.leftNode=null;
        temp.rightNode=null;

        return temp;
    }

    public static ArrayList<Integer> longestPath(Node root)
    {
        if (root==null)
        {
            ArrayList<Integer> out=new ArrayList<>();
            return out;
        }
        ArrayList<Integer> rightNode=longestPath(root.rightNode);
        ArrayList<Integer> leftNode=longestPath(root.leftNode);

        if (rightNode.size()<leftNode.size())
        {
            leftNode.add(root.nodeData);
        }
        else
        {
            rightNode.add(root.nodeData);
        }
        return (leftNode.size()>rightNode.size()?leftNode:rightNode);
    }
}
