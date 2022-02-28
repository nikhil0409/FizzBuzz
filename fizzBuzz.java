import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1; i<=n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
