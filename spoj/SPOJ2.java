/*Peter wants to generate some prime numbers for his cryptosystem. Help him! Your task is to generate all prime numbers between two given numbers!

Input
The input begins with the number t of test cases in a single line (t<=10). In each of the next t lines there are two numbers m and n (1 <= m <= n <= 1000000000, n-m<=100000) separated by a space.

Output
For every test case print all prime numbers p such that m <= p <= n, one number per line, test cases separated by an empty line.*/



import java.util.Scanner;
class SPOJ2{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int takeNumber = sc.nextInt();
        int numberPrime = 0;
        if(takeNumber == 0)
        {
            System.out.println("Entered number Incorrect");
          
        }
        else if (takeNumber ==1 ){
            System.out.println(takeNumber+" Is Prime Number");
        }else {
            for (int i =2;i<=(takeNumber - 1);i++){

                   if (takeNumber%i == 0)
                   {
                    System.out.println(takeNumber+" Is not Prime Number");
                    System.exit(0);
                   }
                   else{
                    numberPrime = takeNumber;
                   }
            }
          if (numberPrime !=0)
          {
            System.out.println(numberPrime+" Is Prime Number");
                   
          }
             
        }
        

    }
}