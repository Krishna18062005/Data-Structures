import java.util.*;

class stack {
    private int[] arr = new int[10];
    private int top = -1;

    public void push(int data) {
        top++;
        arr[top] = data;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == 9;
    }

    public int pop() {
        if (top != -1) {
            int data = arr[top];
            top--;
            return data;
        }
        return -1;
    }

    public int peek() {
        return arr[top];
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        int num = new Scanner(System.in).nextInt();
        stack s = new stack();
        s.push(0);

        while (num > 0) {
            int data = s.pop();
            s.push(num % 10);
            data = data * 10 + s.pop();
            s.push(data);
            num /= 10;
        }

        System.out.println(s.pop());

    }
}
