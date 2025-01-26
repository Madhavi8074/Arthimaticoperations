import java.util.Scanner;

public class Arthimaticoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float num1=sc.nextFloat();
        System.out.println("Enter the second number: ");
        float num2=sc.nextFloat();
        float addition=num1+num2;
        float subtraction=num1-num2;
        float multiplication=num1*num2;
        if(num2!=0){
            float division=num1/num2;
            System.out.println("Division: "+division);
        }else{
            System.out.println("Division: cannot divide by zero.");
        }
        System.out.println("Addition: "+addition);
        System.out.println("Subrraction: "+subtraction);
        System.out.println("Multiplication: "+multiplication);
        
         sc.close();
    }}

