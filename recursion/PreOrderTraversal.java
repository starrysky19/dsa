//Time O(n) Space O(n)
//where n is the number of nodes
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
public class PreOrderTraversal {
    public static List<Integer> preorder(Node root){
        List<Integer> res= new ArrayList<>();
        if(root==null)return res;
        res.add(root.val);
        res.addAll(preorder(root.left));
        res.addAll(preorder(root.right));
        return res;
    }
    public static void main(String[] args) {
        Node node= new Node(1);
        node.left=new Node(2);
        node.right= new Node(3);
        node.left.left=new Node(4);
        node.left.right= new Node(5);
        System.out.println(preorder(node));
    }
    
}
