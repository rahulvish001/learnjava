class Box
{ double width;
    double height;
    double depth; 
}
class BoxDemo
{
public static void main (String args[])
{
 Box myBox= new Box();
double volume;
// assign values to mybox's instance variables
myBox.width=10;
myBox.height=20;
myBox.depth=30;
  //compute volume
volume=myBox.width*myBox.height*myBox.depth;
System.out.println("volumeis "+ volume);
}
}
class BoxDemo1
{
    
Box myBox1= new Box();
System.out.println(myBox1)
double volume1;
myBox1.height=40;
myBox1.width=50;
myBox1.depth=60;
volume1=myBox1.width*myBox1.height*myBox.depth;
System.out.println("volume is "+ volume1);
}

