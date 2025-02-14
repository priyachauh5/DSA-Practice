public class NextPermutation {
    public static void nextPermutation(int nums[]) {
        int n = nums.length;
        
        // Step 1: Find the pivot where nums[i] < nums[i+1]
        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If the entire array is in descending order (pivot not found)
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the next greater element after the pivot
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                // Swap the pivot with the next greater element
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        // Step 4: Reverse the subarray after pivot
        reverse(nums, pivot + 1, n - 1);
        
        // Print the result
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    // Helper function to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        nextPermutation(nums); // This should print the next permutation
    }
}
