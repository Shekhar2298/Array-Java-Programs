

import java.util.Scanner;

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
       
    }
