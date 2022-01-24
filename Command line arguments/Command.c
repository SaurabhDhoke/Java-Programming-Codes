 // Addition of 2 numbers by command line arguments.
 
 #include<stdio.h>
 #include<stdlib.h>   // atoi function

 int main(int argc,char *argv[])
  { 
    int no1 = 0 , no2 = 0 , ans = 0;
    printf("Total Number of command line Arguments are : %d \n",argc);
    
    if(argc == 3)
     {
       no1 = atoi(argv[1]);   // atoi = ASCII to Integer conversion
       no2 = atoi(argv[2]);
       ans = no1 + no2;
       printf("Addition is : %d \n",ans);
     }
     
    return 0;
  }
 
 // gcc Command.c -o Myexe
 // ./Myexe 11 21
 // Addition is : 32
