import java.util.Scanner;

public class printArrayInStars{
    public static void main(String[] args) {

        Scanner read =new Scanner(System.in);

        System.out.println("Enter the number of items:");
        int NUM_ITEMS = read.nextInt();
        if (NUM_ITEMS<0){
            while(NUM_ITEMS<0){
                System.out.println("Amount Must be positive");
                NUM_ITEMS = read.nextInt();
            }
        }

        int[] items= new int[NUM_ITEMS];
        System.out.println("Enter the value of all items (separated by space):");
        
        for(int i=0;i<NUM_ITEMS;i++){
            items[i]= read.nextInt();
        }

        for(int i=0;i<NUM_ITEMS;i++){
            System.out.print(i+":");
            int times=items[i];
            for (int x=0;x<times;x++){
            System.out.print("*");
        }
        System.out.println("("+items[i]+")");
        }

        
        read.close();
    }
}
