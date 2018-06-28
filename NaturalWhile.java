import java.util.Scanner;
public class NaturalWhile{
public static void main (String args[]){
int x;
int sum;
int i=1;
Scanner s =new Scanner(System.in);
x =s.nextint();
while(i<=x)
{
sum=sum+i;
i++;
}
 System.out.println("+sum");
}
}