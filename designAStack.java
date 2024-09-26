import java.util.*;
class stack{
  private int[] arr=new int[10];
  private int top=-1;
  public void push(int data){
    if(top==9) throw new stackException("Stack Overflow");
      top++;
      arr[top]=data;
     return true;
    
  }
  public boolean isEmpty(){
    return top == -1;
  }
  public boolean isFull(){
    return top == 9;
  }
  public int pop(){
    if(top!=-1){
    int data=arr[top];
    top--;
    return data;}
    return -1;
  }
  public int peek(){
    return arr[top];
  }
}

public class Main {
    public static void main(String[] args) throws Exception{
      stack s=new stack();
      s.push(10);
      s.push(20);
      System.out.println(s.pop());
      System.out.println(s.peek());
      System.out.println(s.isEmpty());
  }
}
