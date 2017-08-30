import java.util.Scanner;
public class Payroll
{
public static void main (String[] args)
  {
Scanner keyboard = new Scanner(System.in);
System.out.print("What is your name? ");
	String Name = keyboard.nextLine();
System.out.print("How many hours did you work this week? ");
int h = keyboard.nextInt();;
System.out. print("What is your hourly pay rate? ");
double pay_rate, grossPay;
   pay_rate = keyboard.nextDouble();
grossPay=h*pay_rate;
final double bonus = 500; grossPay=grossPay+bonus;
System.out.println("Hello " + Name);
System.out.println("Your gross pay is $" + grossPay);
}}