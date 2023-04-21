import java.util.Scanner;

/*class ReverseArray
{
    public static void main(String arg[]){
        int arr[]={2,4,6,8,10};
        for (int i=arr.length-1;i>=0;i--)
            System.out.println("Reverse list:"+arr[i]);
        }
    }*/
    class ReverseArray{
        public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int a []=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the value ");
            a[i]=sc.nextInt();
        }
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println("Reverse order: "+ a[i]);
        }
            
        }
    }
