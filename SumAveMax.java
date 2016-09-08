package sumavemax;
import java.util.Scanner;
import java.util.Random;

public class SumAveMax {
      int sum=0;
      int max=0;      
      int [] array;
       
      public void show(){
          int x=0;
          
           for(int i=0; i<array.length;i++){
              System.out.print(array[i] + "\t");
              x+=1;
              if (x == 10){
              System.out.println();
              x=0;
              }
            } System.out.println();
      }
     public void getsum(){
         System.out.print("The sum of the numbers is ");
          for (int i = 0; i<array.length; i++){
         sum +=array[i];
     
     }
          System.out.print(sum); 
          System.out.println();
     }
          public void getave(){
          double average = sum / array.length;  
           System.out.print("the average of the numbers is " +average);
           System.out.println();
          }
          public void getmax(){
                  System.out.print("The maximum number is ");

         max = array [0];
         for (int i=1; i<array.length; i++){
         if (array[i]>max) max=array[i]; 
         
}
         System.out.print(max);
          }
          
          public static void main(String[]args){
          Random rand = new Random();
         Scanner input = new Scanner (System.in);
          
           int size;
         SumAveMax leng = new SumAveMax();
         
         System.out.print("How many numbers do you want? ");
         size= input.nextInt();
         leng.array = new int[size];
         
         for (int i=0;i<size;i++){
         leng.array[i] = rand.nextInt(1000);
         } System.out.println();
        
         leng.show();
         leng.getsum();
         leng.getave();
         leng.getmax();
}}
