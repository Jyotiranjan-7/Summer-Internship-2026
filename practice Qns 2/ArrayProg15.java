import java.util.*;
public class ArrayProg15 
{
    public static void main(String [] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter element to the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the searched element");
        int key=sc.nextInt();
        int count=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==key)
            {
                count=i;
            }
        }
        System.out.println("Last index value of searched element :"+count);
        sc.close();
    }
}
