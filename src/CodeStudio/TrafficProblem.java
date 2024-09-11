package CodeStudio;

import java.util.Scanner;

public class TrafficProblem {

    public static int traffic(int n, int m, int[] vehicle) {
        int index = 0, max = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (vehicle[i] == 0) count++;
            while (count > m) if (vehicle[index++] == 0) count--;
            max = Math.max(max, i - index + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(traffic(n, m, arr));
    }

}
