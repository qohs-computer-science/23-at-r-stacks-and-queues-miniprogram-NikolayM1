import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class StackQueueMini {
public static void main(String[] args) {
    
  Stack<Integer> myStack = new Stack<>();
    try (Scanner temp = new Scanner(System.in)) {
            
  System.out.println("Please enter your first whole number:");
    int whole1 = temp.nextInt();
      myStack.push(whole1);
        
  System.out.println("Please enter your second whole number:");
    int whole2 = temp.nextInt();
      myStack.push(whole2);
                            
  System.out.println("Please enter your third whole number:");
    int whole3 = temp.nextInt();
      myStack.push(whole3);
                                    
  System.out.println("Please enter your fourth whole number:");
    int whole4 = temp.nextInt();
      myStack.push(whole4);
        
  System.out.println("Please enter your fifth whole number:");
    int whole5 = temp.nextInt();
      myStack.push(whole5);

  List<Integer> arr = new ArrayList<>();
  while (!myStack.isEmpty()) {
    arr.add(myStack.pop());
  }
  Collections.reverse(arr); 

  for (int value : arr) {
    myStack.push(value);
    myStack.push(value);
  }

  System.out.println("Here is what is in the stack:");

  List<Integer> myArrayList = new ArrayList<>();
  while (!myStack.isEmpty()) {
    myArrayList.add(myStack.pop());
  }

  Collections.reverse(myArrayList);

  for (int num : myArrayList) {
    System.out.println(num);
  }
  System.out.println();
    
    Queue<Integer> myQueue = new LinkedList<>();
    
    try (Scanner tamp = new Scanner(System.in)) {
      System.out.println("Please enter your first whole number:");
        int whole11 = tamp.nextInt();
          myQueue.add(whole11);
      
      System.out.println("Please enter your second whole number:");
        int whole12 = tamp.nextInt();
          myQueue.add(whole12);
                            
      System.out.println("Please enter your third whole number:");
        int whole13 = tamp.nextInt();
          myQueue.add(whole13);
                                    
      System.out.println("Please enter your fourth whole number:");
        int whole14 = tamp.nextInt();
          myQueue.add(whole14);
        
      System.out.println("Please enter your fifth whole number:");
        int whole15 = tamp.nextInt();
          myQueue.add(whole15);

      System.out.println("Please enter your sixth whole number:");
        int whole16 = tamp.nextInt();
          myQueue.add(whole16);  
          
      System.out.println("Please enter your seventh whole number:");
        int whole17 = tamp.nextInt();
          myQueue.add(whole17);  

      System.out.println("Please enter your eighth whole number:");
        int whole18 = tamp.nextInt();
          myQueue.add(whole18); 

      System.out.println("Please enter your ninth whole number:");
        int whole19 = tamp.nextInt();
          myQueue.add(whole19);

       System.out.println("Please enter your tenth whole number:");
         int whole20 = tamp.nextInt();
           myQueue.add(whole20);      
    }

    Queue<Integer> aux = new LinkedList<>();
    int initialQueueSize = myQueue.size();
    for (int i = 0; i < initialQueueSize; i++) {
      int v = myQueue.remove();
      if (v % 2 == 0) aux.add(v); 
      else myQueue.add(v); 
    }

    int odds = myQueue.size();
    for (int i = 0; i < odds; i++) aux.add(myQueue.remove());

    Stack<Integer> queueStack = new Stack<>();
    while (!aux.isEmpty()) queueStack.push(aux.remove());

    List<Integer> listFromQueue = new ArrayList<>();
    while (!queueStack.isEmpty()) listFromQueue.add(queueStack.pop());
    Collections.reverse(listFromQueue);

    System.out.println("Here is what is in the queue:");
    for (int num : listFromQueue) System.out.println(num);
  }

  } //end method

} //end class