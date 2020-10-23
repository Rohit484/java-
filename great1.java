import java.util.scanner;
public class great1
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int num1,num2;
num1 = sc.nextInt();
num2 = sc.nextInt();
if(num1 > num2)
System.out.print(num1 + ” is greater”);
else
System.out.print(num2 + ” is greater”);
}
}