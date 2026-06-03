import java.util.*;
public class ArrayProg17 
{
    public static void main(String [] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int [size];
        System.out.println("Enter the element to the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int maxcount=0;
        int maxelement=0;
        for(int i=0;i<size;i++)
        {
            int count=0;
            for(int j=0;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>maxcount)
            {
                maxcount=count;
                maxelement=arr[i];
            }
        }
        System.out.println(maxelement+" comes "+maxcount+" times");
        sc.close();
    }
}
