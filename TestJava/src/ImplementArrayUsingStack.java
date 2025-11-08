import java.util.Stack;

public class ImplementArrayUsingStack {

    public static void main(String [] args)
    {
        StackImpl stack = new StackImpl();
        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println("Top of the stack before deleting any element " + stack.top());
        System.out.println("Size of the stack before deleting any element " + stack.size());
        System.out.println("The element deleted is " + stack.pop());
        System.out.println("Size of the stack after deleting an element " + stack.size());
        System.out.println("Top of the stack after deleting an element " + stack.top());



    }
}

 class StackImpl
 {
     int MAX_SIZE = 1000;
     int [] array = new int[MAX_SIZE];
     int top = -1;

     void push(int x)
     {
       top ++;
       array[top] = x;
     }

     int pop()
     {
         int x = array[top];
         top --;
         return  x;
     }

     int top()
     {
          return array[top];
     }

     int size()
     {
         return top+1;
     }
 }
