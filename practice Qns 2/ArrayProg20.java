public class ArrayProg20
{
    public static void main(String [] arg)
    {
        int[] arr={2,5,8,3,4,1};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
       {
            if(arr[i]>max)
            {
                max=arr[i];
            }
       }
       System.out.println("maximun element is :"+max);
    }
}
