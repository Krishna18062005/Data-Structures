import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
    this.next=null;
  }
}

public class Main {
    public static void main(String[] args) {
      Node ls=new Node(4);
      Node head=ls;
      ls.next=new Node(5);
      ls=ls.next;
      ls.next=new Node(6);
      while(head!=null){
        System.out.print(head.data+" ");
        head=head.next;
      }
      
  }
}
