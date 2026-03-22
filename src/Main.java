import java.util.Scanner;
public class Main {
    public static void printsandar(int N) {
        if(N==0)return;
        printsandar(N/10);
        System.out.println(N%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        printsandar(N);
    }
}