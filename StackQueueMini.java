import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


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

  while (!myStack.isEmpty()) {
    System.out.println("Here is what is in the stack:" + myStack.pop());
  }

    } //end main
  } //end class
  