class MinMax{
    public static void main(String arg[])
     {
        int arr[]={25,66,18,10,12};
        int min=arr[0]
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        if(arr[i]>max)
        {
          max=arr[i];
        }
        System.ou.print("Max value "+ max)
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.print("Min value "+min);
        
    }
}