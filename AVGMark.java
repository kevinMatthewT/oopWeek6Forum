import java.util.Scanner;

public class AVGMark{
    public static void main(String[] args) {

        Scanner read =new Scanner(System.in);

        System.out.println("Enter the number of items:");
        int NUM_STUD_CLASS = read.nextInt();
        if (NUM_STUD_CLASS<0){
            while(NUM_STUD_CLASS<0){
                System.out.println("number of students cannot be negative");
                NUM_STUD_CLASS = read.nextInt();
            }
        }
        int[] Scores=new int[NUM_STUD_CLASS];
        for (int i=0;i<NUM_STUD_CLASS;i++){
            System.out.print("Enter the grade for student "+(i+1)+":");
            Scores[i]=read.nextInt();
            System.out.println();
        }

        for (int x=0;x<NUM_STUD_CLASS;x++){
           int Total;
           Total= Total+ Scores[x];
        }
        return Total;

        System.out.println("The average is:"+ Total/NUM_STUD_CLASS);

    

        
        read.close();
    }
}
