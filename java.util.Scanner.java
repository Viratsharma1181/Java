import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        long factorial = calculateFactorial(number);
        
        System.out.println("Factorial of " + number + " = " + factorial);
        
        sc.close();
    }
    
    public static long calculateFactorial(int number) {
        long factorial = 1;
        
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
}
