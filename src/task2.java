public class task2 {
}
import java.util.Scanner;
public class Task2 {
    public static void engizu(int[] arr, int x, Scanner sc) {
        if (x == arr.length) return;
        arr[x] = sc.nextInt();
        engizu(arr, x + 1, sc);
    }
    public static int kosyndy(int[]arr, int x) {
        if (x == arr.length) return 0;
        return arr[x]+kosyndy(arr,x + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int[] arr = new int[y];
        engizu(arr, 0, sc);
        int sum = kosyndy(arr, 0);
        double avg = (double) sum / y;
        System.out.println(avg);
    }
}
