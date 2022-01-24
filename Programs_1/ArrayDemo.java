 
 import java.lang.*;
 
 class ArrayDemo 
  {
     public static void main(String Arg[])
      {
        int arr[] = new int [5];    // 1st  way 
        arr[0] = 11 ;
        arr[1] = 21 ;
        arr[2] = 51 ;
        arr[3] = 101;
        arr[4] = 111;
        
        System.out.println("Lenght of array is "+arr.length);      
        
        int brr[] = {11,21,51,101,111};               // 2nd way 
        int crr[] = new int [] {11,21,51,101,111};    // 3rd way 
      }
  }

