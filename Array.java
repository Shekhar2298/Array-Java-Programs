import java.util.Scanner;

/*import java.util.Scanner;

class Array{
   
    public static void main(String args[]) {
          Scanner sc= new Scanner(System.in) ;
            System.out.println("Enter size of an array:");
            int size =sc.nextInt();
            int arr []=new int[size];

            for(int i=0;i<size;i++){
                System.out.println("Enter the element:");
                arr[i]=sc.nextInt();
            }
            
           
            for(int i=0;i<size;i++){
                System.out.println("print list:"+arr[i] +" ");
            }
      
        }
       
    }*/
class Array{
    public static void main(String arg[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int a []=new int[size];
        
        for(int i=0;i<size;i++)
        {
        System.out.println("Enter the element ");
        a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println("list:"+a[i]);
        }
    }
}