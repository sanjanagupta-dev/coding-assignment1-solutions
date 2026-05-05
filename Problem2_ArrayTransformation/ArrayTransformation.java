import java.util.*;

public class ArrayTransformation {

    public static int minOperations(int[] arr, int k) {
        Arrays.sort(arr);
        int target = arr[arr.length / 2];

        int operations = 0;

        for (int num : arr) {
            int diff = Math.abs(num - target);

            if (diff % k != 0) return -1;

            operations += diff / k;
        }

        return operations;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(minOperations(arr, k));
    }
}
