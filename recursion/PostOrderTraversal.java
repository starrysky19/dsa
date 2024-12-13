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
public class PostOrderTraversal {
    public static List<Integer> postorder(Node root){
        List<Integer> res= new ArrayList<>();
        if(root==null) return res;
        res.addAll(postorder(root.left));
        res.addAll(postorder(root.right));
        res.add(root.val);
        return res;
    }
    public static void main(String[] args) {
        Node node= new Node(1);
        node.left=new Node(2);
        node.right= new Node(3);
        node.left.left=new Node(4);
        node.left.right= new Node(5);
        System.out.println(postorder(node));
    }
}
