
import java.util.*;
import java.lang.*;
import java.io.*;

class ideone
{

 public static void main (String[] args) throws java.lang.Exception
 {
  int i[]={7,9,8,6,1,4,7,6};
   int k=3;
               int j=0,sum1=0,sum2=0;
   for(int h=0;h<=(8-j+1);h++){
                       sum1=0;
     j=0;
     try{
     while(j<k){
       sum1=sum1*10+i[h+j];
     
       j++;
     }
     }
     catch(Exception e){
     break;
     }

     if(sum2==0){
       sum2=sum1;
     }
     if(sum1<sum2){
       sum2=sum1;
     }
   
   }

   System.out.printf(""+sum2);
 }
}
