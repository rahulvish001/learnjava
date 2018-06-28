public class TestArray{
    public static void main(String args[])
    {
         double[] arrayList={1.9,1.2,1.6,1.8};
    //print all array element
    for(int i=0; i<arrayList.length; i++)
    {
        System.out.println(arrayList[i] + " ");
    } 
//sum of all element
       double total=0;
       for(int i=0; i<arrayList.length;i++)
       {
           total += arrayList[i];
       }
       System.out.println("total sum is "+total);
    }
}