import java.util.Scanner;

// the name of our class its public
public class SqureDigit {
//void main
public static void main (String[] args)
{
//declare int
int no,m,s;

//Declare input as scanner
Scanner input = new Scanner(System.in);

//Take input
System.out.println("Enter Number :");
no = input.nextInt();

//add while loop
while(no>0)
{
m=no%10;
s = m*m;
System.out.println("Square of "+m+" is "+s);
no=no/10;
}
}
}