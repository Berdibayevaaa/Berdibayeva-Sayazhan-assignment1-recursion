import java.util.Scanner;

public class task2 {

    public static void engizu(int[] arr, int i, Scanner sc) {
        if (i == arr.length) return;
        arr[i] = sc.nextInt();
        engizu(arr, i + 1, sc);
    }
    public static int kosyndy(int[] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i] + kosyndy(arr, i + 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        engizu(arr, 0, sc);
        int sum = kosyndy(arr, 0);
        double avg = (double) sum / n;
        System.out.println(avg);
    }
}
