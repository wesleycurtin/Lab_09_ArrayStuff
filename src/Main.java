import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];
        Random gen = new Random();
        Scanner in = new Scanner(System.in);
        int userNum = 0;
        int userNum2 = 0;
        boolean found = false;
        int numCount = 0;

        for(int l = 0; l < dataPoints.length; l++)
            dataPoints[l] = gen.nextInt(100) + 1;

        for(int l = 0; l < dataPoints.length; l++)
            System.out.print( dataPoints[l] + " | ");

        int sum = 0;
        for(int l = 0; l < dataPoints.length; l++)
            sum += dataPoints[l];

        int ave = sum / 100;

        System.out.println("\n The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + ave);

        userNum = SafeInput.getRangedInt(in, "Enter the number you want to find:", 1, 100);

        for (int t = 0; t <dataPoints.length; t++){
            if (dataPoints[t] == userNum) {
                numCount++;
            }
        }
        System.out.println("The system found " + numCount + " occurences of " + userNum);

        userNum2 = SafeInput.getRangedInt(in, "Enter the number you want to find:", 1, 100);

        for (int t = 0; t < dataPoints.length; t++){
            if (dataPoints[t] == userNum2) {
                System.out.println("The value " + userNum2 + " was found at array index position " + t);
                found = true;
                break;
            }
        }
        System.out.println("Finished the search!");
        if (!found)
            System.out.println("Did not find the value of " + userNum2);

        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int l = 0; l < dataPoints.length; l++) {
            if (dataPoints[l] < min)
                min = dataPoints[l];
            if (dataPoints[l] > max)
                max = dataPoints[l];
        }
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));









    }
    public static double getAverage(int values[])
    {
        int sum = 0;
        double total = 0;
        for (int l = 0; l < values.length; l++)
            sum += values[l];
        total = sum / values.length;
        return total;

    }
}