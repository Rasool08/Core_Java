import java.util.*;

class StackEg {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of the stack:");
		int n = in.nextInt();
		
		int Stack[] = new int[n]; // Create an integer array to represent the stack
		int top = -1; // Initialize the top pointer to -1, indicating an empty stack

		while (true) {
			System.out.println("1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit");
			int k = in.nextInt(); // Read the user's choice

			switch (k) {
				case 1: {
					if (top < n - 1) {
						System.out.println("Enter your element:");
						int v = in.nextInt();
						top++;
						Stack[top] = v; // Push an element onto the stack
					} else {
						System.out.println("Stack is already full");
					}
					break;
				}
				case 2: {
					if (top == -1) {
						System.out.println("We can't perform the pop operation because the stack is empty");
					} else {
						System.out.println("Deleted element is: " + Stack[top]);
						top--;
					}
					break;
				}
				case 3: {
					if (top == -1) {
						System.out.println("Stack is empty");
					} else {
						System.out.println("Top element is: " + Stack[top]);
					}
					break;
				}
				case 4: {
					if (top == -1) {
						System.out.println("Stack is empty");
					} else {
						System.out.println("Stack elements:");
						for (int i = top; i >= 0; i--) {
							System.out.println(Stack[i]);
						}
					}
					break;
				}
				case 5: {
					System.exit(1); // Exit the program
				}
				default: {
					System.out.println("Please select options 1-5 only");
				}
			}
		}
	}
}
