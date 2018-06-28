class RightStar{
public static void main (String args[])
{
for ( int row=15;row<=1;row--)
{
System.out.print(" ");
for(int numberOfRows=0;numberOfRows<15-row;numberOfRows++)
{
System.out.print("*");
System.out.println();
}
}
}
}