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
  }

  Queue <Integer> storage = new LinkedList<>();
  while (!myStack.isEmpty()) {
    storage.add(myStack.pop());
  }
    
  while (!storage.isEmpty()){
    int val = storage.poll();
     myStack.push(val);
    }
  
  System.out.println("Here is what is in the stack from bottom to top:");

  List <Integer> myArrayList = new ArrayList<>();
  while (!myStack.isEmpty()) {
    System.out.println(myStack.pop());
  }

  Collections.reverse(myArrayList);

  for (int num : myArrayList) {
    System.out.println(num + "");
  }
  System.out.println();

    } //end method
  }  //end class