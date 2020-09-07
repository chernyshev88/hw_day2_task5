import java.util.Arrays;
import java.util.Scanner;

public class Hw_day2_task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};
        Arrays.sort(a);
        System.out.println(a[0]);
    }
}
