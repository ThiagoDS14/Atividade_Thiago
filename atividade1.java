import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {  
      int n1;
      int n2;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Digite o primeiro número: ");
      n1 = sc.nextInt();
      
      System.out.println("Digite o segundo número: ");
      n2 = sc.nextInt();
      
      int Prod = n1 * n2;
      
      System.out.println("PROD = " + Prod );
    }
}
