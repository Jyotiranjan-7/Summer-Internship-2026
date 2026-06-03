public class ArrayProg19 
{
    public static void main(String [] arg)
    {
        int [] arr={2,3,4,5};
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]*arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
