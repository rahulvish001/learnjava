public class EvenOdd{
    public static  void main(String []args)
    {
        int i,j;
        for(i=2;i<=15;i++)
        {
            if(i%2==0)
            {
                for(j=1;j<=10;j++)
                {
                    System.out.println(i*j);
                    System.out.println("");
                }

            }
            //if(i%2!= 0)
            //{
              //  for(j=1;j<=10;j++)
                //{
                  //  System.out.println(i*j);
                //}

            //}
        }
    }
}