 // Addition of 2 numbers by command line arguments.
 
 #include<stdio.h>
 #include<stdlib.h>

 int main(int argc,char *argv[])
  { 
    int no1 = 0 , no2 = 0;
    
    scanf("%d",&no1);
    scanf("%d",&no2);
    
    printf("Addition is : %d ",no1+no2);
    return 0;
  }
