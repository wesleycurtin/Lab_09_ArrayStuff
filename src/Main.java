import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];
        Random gen = new Random();

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











    }
}