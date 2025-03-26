import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Convert the position to 0-based by subtracting 1 from i
        int position = i - 1;
        // 1. Get the ith bit
        int getBit = (num >> position) & 1;
        
        // 2. Set the ith bit
        int setBit = num | (1 << position);
        
        // 3. Clear the ith bit
        int clearBit = num & ~(1 << position);
        
        // Output the result in the specified format (space separated)
        System.out.print(getBit + " " + setBit + " " + clearBit);
    }
}
