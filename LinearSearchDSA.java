package linearsearchdsa;
import java.util.Scanner;
import java.util.Random;


public class LinearSearchDSA {

  
    public static void main(String[] args) {
        int x, size, search, array[];
        
        Scanner input = new Scanner(System.in);
        Random leng = new Random();
        
        System.out.print("Enter array size: ");
        size = input.nextInt();
        array = new int [size];
        
        System.out.print("Enter " + size + " integers:");
 
        for (x = 0; x < size; x++)
        array[x] = input.nextInt();
        
        System.out.print("Enter number to find: ");
        search = input.nextInt();
        for (x = 0; x<size; x++){
            
            if (array[x] == search){
                System.out.print("Found: " +search+ " is at location "  + (x + 1) + ".");
                 System.out.println();
                
                break;
            
        }
        if (x==size){
            System.out.print("Not found: " +search+ " is not in the array.");
        
    }
}
    }}
