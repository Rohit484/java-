import java.util.*;

class s1{
public static void main(String[] args){

  int sum = 0, i, n;
  Scanner s = new Scanner(System.in);

  for(i = 0; i<5; i++){
    System.out.println("Enter number");
    n = s.nextInt();

    sum = sum + n;
  }

  System.out.println("Sum is "+sum);

}
}