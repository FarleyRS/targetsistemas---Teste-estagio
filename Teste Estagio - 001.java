import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int number = sc.nextInt();
        
        if(fibonacci(number + 1) == number)
            System.out.print("Pertence!");
        else
            System.out.print("Nao Pertence!");
        sc.close();
    }
    
    public static int fibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
