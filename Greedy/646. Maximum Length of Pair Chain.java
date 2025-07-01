import java.util.*;

public class Activity_Selection_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the number of activities
        int n = sc.nextInt();
        int[][] arr = new int[n][2]; // Each row stores [start, end] time

        // Step 2: Read start and end times for each activity
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); // Start time
            arr[i][1] = sc.nextInt(); // End time
        }

        // Step 3: Sort the activities by their end times (greedy approach)
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);

        // Debug print: To check the sorted activities (Optional)
        System.out.println("Sorted Activities by End Time:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

        // Step 4: Initialize count with 1 (always select the first activity)
        int count = 1;
        int end = arr[0][1]; // End time of the last selected activity

        // Step 5: Iterate through remaining activities
        for (int i = 1; i < n; i++) {
            // If the current activity starts after or when the last selected one ends
            if (arr[i][0] >= end) {
                count++;            // Select the activity
                end = arr[i][1];    // Update the end time
            }
        }

        // Step 6: Output the maximum number of non-overlapping activities
        System.out.println("Maximum number of non-overlapping activities: " + count);
    }
}
