import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 2; i <= N; i+=2) {
            int power = i*i;
            System.out.println(i+"^2 = "+power);
        }
    }
}