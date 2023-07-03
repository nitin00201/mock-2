import java.util.ArrayList;
import java.util.Scanner;

public class averageNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int a = sc.nextInt();
        ArrayList <Integer>arr = new ArrayList<>();
        
        do {
            arr.add(sc.nextInt());         

            
        } while (arr.size()<a);
        int sum =0;
        for (int x : arr) {
            sum = sum +x;
            
        }
        int avg = sum/arr.size();
        System.out.println("The average is "+ avg);
    }
    
}
