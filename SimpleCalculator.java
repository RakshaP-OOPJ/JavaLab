import java.util.Scanner;
 public class SimpleCalculator {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter num 1 : ");
         int num1=scanner.nextInt();
         System.out.print("Enter num 2: ");
         int num2=scanner.nextInt ();
         System.out.print("Enter an operator(+,-,*,/): ");
         char operator =scanner.next().charAt(0);
         int result;
         switch(operator) {
            case '+':
                 result=num1+num2;
                 System.out.println("Result:"+ result);
                 break;
            case '-':
                 result=num1-num2;
                 System.out.println("Result:"+ result);
                 break;
            case '*':
                 result=num1*num2;
                 System.out.println("Result:"+ result);
                 break;
            case'/':
                if(num2!=0) {
                    result=num1/num2;
                    System.out.println("Result:"+ result);
                    }
                else {
                    System.out.println("Error:Division by zero is not allowed.");
                    
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
            
         }
         scanner.close();
     }
     
 }
