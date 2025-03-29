import java.util.*;

public class Node {
    int data;
    Node next;

    // Constructor to initialize the Node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Spiral_Matrix_IV {
    public int[][] spiralMatrix(int m, int n, Node head) {
        int matrix[][] = new int[m][n];
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        
        Node curr = head;

        // Initialize the matrix with a default value (optional), such as -1 for any unfilled spots
        for (int i = 0; i < m; i++) {
            Arrays.fill(matrix[i], -1);
        }

        // Fill the matrix in a spiral order
        while (curr != null && top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = curr.data;
                curr = curr.next;
                if (curr == null) return matrix;  // Return early if list ends
            }
            top++;  // Move the top boundary down

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = curr.data;
                curr = curr.next;
                if (curr == null) return matrix;  // Return early if list ends
            }
            right--;  // Move the right boundary left

            // Traverse from right to left along the bottom row
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = curr.data;
                curr = curr.next;
                if (curr == null) return matrix;  // Return early if list ends
            }
            bottom--;  // Move the bottom boundary up

            // Traverse from bottom to top along the left column
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = curr.data;
                curr = curr.next;
                if (curr == null) return matrix;  // Return early if list ends
            }
            left++;  // Move the left boundary right
        }

        return matrix;
    }

    public static void main(String args[]) {
        // Creating the linked list
        Node head = new Node(1);
        Node current = head;
        current.next = new Node(2);
        current = current.next;
        current.next = new Node(3);
        current = current.next;
        current.next = new Node(4);
        current = current.next;
        current.next = new Node(5);
        current = current.next;
        current.next = new Node(6);
        current = current.next;
        current.next = new Node(7);
        current = current.next;
        current.next = new Node(8);
        current = current.next;
        current.next = new Node(9);

        // Create an instance of Spiral_Matrix_IV and call spiralMatrix
        Spiral_Matrix_IV spiral = new Spiral_Matrix_IV();
        int[][] result = spiral.spiralMatrix(3, 3, head);

        // Print the result
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
