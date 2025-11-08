import  java.util.*;

public class ImplementQueueUsingArray {




        public static void main(String [] args)
        {
            Queue q = new Queue(6);
            q.push(4);
            q.push(14);
            q.push(24);
            q.push(34);
            System.out.println("The peek of the queue before deleting any element " + q.top());
            System.out.println("The size of the queue before deletion " + q.size());
            System.out.println("The first element to be deleted " + q.pop());
            System.out.println("The peek of the queue after deleting an element " + q.top());
            System.out.println("The size of the queue after deleting an element " + q.size());

        }



    static class Queue{

    int start, end, maxSize, currentSize;
    int [] storeArray = new int[16];
    public Queue(int maxSize)
    {
      this.maxSize = maxSize;
      storeArray = new int[maxSize];
      start = -1;
      end = -1;
    }

    void push(int x)
    {
      if(currentSize==maxSize)
      {
          System.out.println("The capacity of queue is full");
          System.exit(1);
      }

      if(end == -1)
      {
          start = 1;
          end =1;
      }
      else
      {
          end = (end+1) % maxSize;
      }
      storeArray[end] = x;
      currentSize ++ ;
    }

    int pop()
    {
        if(start==-1)
        {
            System.out.println("Queue Empty\nExiting...");
            System.exit(1);
        }

        int popItem = storeArray[start];

        if(currentSize == 1)
        {
            start = -1;
            end = -1;
        }
        else
            start = (start+1)%currentSize;

        currentSize --;
        return popItem;
    }

    int top()
    {
        if (start == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return storeArray[start];
    }

    int size()
    {
        return currentSize ;
    }

}



}
