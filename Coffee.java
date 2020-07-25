import java.util.Scanner;
public class  Coffee {
public static void main(String[]args) {

int n;
Scanner input =new Scanner(System.in);
n=input.nextInt();
switch (n) {
  
case  1:
System.out.println("Preparing cappuccino");
break;
case 2:
System.out.println("Preparing Espresso");
break;
case 3:
System.out.println("Preparing Latte");
break;
case 4:
System.out.println("Preparing Milk");
break;
default:
System.out.println("give the valid value");
}
}
}