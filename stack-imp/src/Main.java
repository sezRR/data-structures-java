public class Main {

    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(3);

        customStack.push(1);      // inserting 1 in the customStack
        customStack.push(2);      // inserting 2 in the customStack
        customStack.push(3);      // inserting 3 in the customStack

        customStack.push(4);      // stack is full!

        customStack.pop();       // removing the top element (3)
        customStack.pop();       // removing the top element (2)

        customStack.push(5);      // inserting 5 in the customStack

        System.out.println("The top element is " + customStack.peek());         // the top element is 5
        System.out.println("The customStack size is " + customStack.size());    // the customStack size is 2

        customStack.pop();                                               // removing the top element (5)
        var popped_value = customStack.pop();                       // removing the top element (1)
        System.err.println("Last popped value was: " + popped_value);

        System.out.println("The customStack size is " + customStack.size());    // the customStack size is 0

        // check if the customStack is empty
        if (customStack.isEmpty()) {
            System.out.println("The customStack is empty");
        }
        else {
            System.out.println("The customStack is not empty");
        }
    }
}

class CustomStack {
    private final int[] arr;
    private int length;
    private final int size;

    public CustomStack(int size) {
        this.arr = new int[size];
        this.size = size;
        length = -1;
    }

    public void push(int element){
        if (isFull()) {
            System.out.println("ERR: Stack is full!");
            return;
        }

        arr[++length] = element;
        System.out.println("INFO: Inserting, " + element);
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("ERR: Stack is empty!");
            return -1;
        }

        System.out.println("INFO: Removing, " + peek());
        return arr[length--];
    }

    public boolean isEmpty(){
        return length + 1 == 0;
    }

    public boolean isFull(){
        return size == length + 1;
    }

    public int peek(){
        return isEmpty() ? -1 : arr[length];
    }

    public int size(){
        return length + 1;
    }
}
