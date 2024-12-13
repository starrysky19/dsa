package recursion;

import java.util.ArrayList;
import java.util.List;

class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val=val;
    }
}
public class InorderTraversal {
    public static List<Integer> inorder(Node root){
        List<Integer> res= new ArrayList<>();
        if(root==null) return res;
        res.addAll(inorder(root.left));
        res.add(root.val);
        res.addAll(inorder(root.right));
        return res;
    }
     public static void main(String[] args) {
        Node node= new Node(1);
        node.left=new Node(2);
        node.right= new Node(3);
        node.left.left=new Node(4);
        node.left.right= new Node(5);
        System.out.println(inorder(node));
    }
}
