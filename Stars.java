class Stars
{
public static void main(String args[])
{
 int numberOfStars ;
for(int row=1;row<=15;row++)  //right to left for(int row=15;row>=1;i--)
{
for(numberOfStars=1; numberOfStars<=row; numberOfStars++)   // (ns=0;nm<15-i;nm++)
{
System.out.print("*");
}
System.out.println("");
}
}
}