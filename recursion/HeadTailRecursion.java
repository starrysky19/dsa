//Time O(n) Space O(n)

package recursion;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    public Node(int data, Node next){
        this.data=data;
        this.next= next;
    }
}
public class HeadTailRecursion {

    public void headRecursion(Node head){
        if(head==null)return;
        headRecursion(head.next);
        System.out.println(head.data);
    }
    public void tailRecursion(Node head){
        if(head==null)return;
        System.out.println(head.data);
        tailRecursion(head.next);
    }
    public static void main(String[] args) {
        HeadTailRecursion headTailRecursion= new HeadTailRecursion();
        Node head = new Node(4);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        System.out.println("Head Recursion");
        headTailRecursion.headRecursion(head);
        System.out.println("Tail Recursion");
        headTailRecursion.tailRecursion(head);
    }
    
}
