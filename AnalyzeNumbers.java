

//Write a program that computes the average of of 10 numbers and returns all
//numbers that are greater than the average
import java.util.Scanner;
public class AnalyzeNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 0;
        double sum = 0;
        double finAv = 0;
        double greater = 0;
        
        System.out.println("Enter the size of the array: ");
        size = input.nextInt();
        double avg[] = new double[size];
        System.out.println("Enter the array elemets: ");
        for(int i = 0; i < avg.length; i++) {
            avg[i] = input.nextDouble();
        }
        for(int i = 0; i < avg.length; i++) {
            sum += avg[i];
        }
        finAv = sum/avg.length;
        System.out.println("The avg is =" + finAv);
        for(int i = 0; i < avg.length; i++) {
            if(avg[i] > finAv) {
                greater = avg[i];
                System.out.println(greater + " ");
            }
        }
        
    }
}
