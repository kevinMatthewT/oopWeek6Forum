import java.util.Scanner;
import java.util.Arrays;

public class PrintArray{
    public static void main(String[] args) {

        Scanner read =new Scanner(System.in);

        System.out.println("Enter the number of items:");
        int NUM_ITEMS = read.nextInt();

        int[] numbers= new int[NUM_ITEMS];
        System.out.println("Enter the value of all items (separated by space):");
        
        for(int i=0;i<NUM_ITEMS;i++){
            numbers[i]= read.nextInt();
        }

        System.out.println("The values are:"+ Arrays.toString(numbers));
        read.close();
    }
}
