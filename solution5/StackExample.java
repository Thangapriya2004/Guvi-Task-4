package solution5;

import java.util.Stack;

class StackExample {
    // Step 1: Create a Stack object to store integers
    Stack<Integer> stack = new Stack<>();

    // Step 2: Method to push element onto stack
    void pushElement(int element) {
        stack.push(element); // adds element to top
        System.out.println("✅ Pushed " + element + " onto the stack.");
    }

    // Step 3: Method to pop element from stack
    void popElement() {
        if (!stack.isEmpty()) {
            int removed = stack.pop(); // removes top element
            System.out.println("🗑️ Popped element: " + removed);
        } else {
            System.out.println("❌ Stack is empty! Cannot pop.");
        }
    }

    // Step 4: Method to check if stack is empty
    void checkEmpty() {
        if (stack.isEmpty()) {
            System.out.println("📭 Stack is empty.");
        } else {
            System.out.println("📦 Stack is not empty. Current Stack: " + stack);
        }
    }
}
