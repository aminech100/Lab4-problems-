package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        System.out.print("Enter the number of salespeople: ");
        int sum;
        int maxSaleIdx = 0;
        int minSaleIdx = 0;
        Scanner scan = new Scanner(System.in);
        int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if (sales[maxSaleIdx] < sales[i])
                maxSaleIdx = i;
            if (sales[minSaleIdx] > sales[i])
                minSaleIdx = i;
        }
        System.out.println("\nTotal sales: " + sum);

        System.out.println("\n Average Sale");
        System.out.println("--------------------");
        double average = (double) sum/sales.length;
        System.out.println(average);

        System.out.println("\n Maximum Sale");
        System.out.println("--------------------");
        System.out.println("Salesperson " + maxSaleIdx + " had the highest sale with $" + sales[maxSaleIdx+1] + "." );

        System.out.println("\n Minimum Sale");
        System.out.println("--------------------");
        System.out.println("Salesperson " + minSaleIdx + " had the lowest sale with $" + sales[minSaleIdx+1] + "." );

        System.out.print("\nEnter a sales amount to compare: ");
        int amount = scan.nextInt();
        int count = 0;

        System.out.println("\nSalespeople exceeding $" + amount);
        System.out.println("--------------------");
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > amount) {
                System.out.println("Salesperson " + (i + 1) + " had sales of $" + sales[i]);
                count++;
            }
        }
        System.out.println("Number of salespeople exceeding $" + amount + ": " + count);

    }
}