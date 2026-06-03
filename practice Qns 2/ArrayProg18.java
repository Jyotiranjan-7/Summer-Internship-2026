import java.util.Scanner;
public class ArrayProg18
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
        int mincount=size+1;
        int minelement=0;
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
            if(count<mincount)
            {
                mincount=count;
                minelement=arr[i];
            }
        }
        System.out.println(minelement+" comes "+mincount+" times");
        sc.close();
    }
}
