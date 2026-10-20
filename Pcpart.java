import java.util.Scanner;

public class Pcbuild_v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-------Hello user----");
        System.out.println("Please enter your overall Budget");
        int budget = sc.nextInt();

        System.out.println("Enter CPU price");
        int cpuPrice = sc.nextInt();

        System.out.println("Enter GPU price");
        int gpuPrice = sc.nextInt();

        System.out.println("Enter Ram price");
        int ramPrice = sc.nextInt();

        System.out.println("Enter Motherboard price");
        int mboardPrice = sc.nextInt();

        System.out.println("Enter SSD price");
        int ssdPrice = sc.nextInt();

        System.out.println("Enter PSU price");
        int psuPrice = sc.nextInt();

        int totalCost = cpuPrice + gpuPrice + ramPrice + mboardPrice + ssdPrice + psuPrice;
        
        System.out.println("\n---PC Build Summary---");
        System.out.println("CPU: " + cpuPrice);
        System.out.println("GPU: " + gpuPrice);
        System.out.println("RAM: " + ramPrice);
        System.out.println("Motherboard: " + mboardPrice);
        System.out.println("SSD: " + ssdPrice);
        System.out.println("PSU: " + psuPrice);
        System.out.println("----------------------");
        System.out.println("Your total cost is: " + totalCost);
        System.out.println("Your budget is: " + budget);

        if (totalCost <= budget) {
            System.out.println("Yes we can build PC in this budget");
            System.out.println("Money left: " + (budget - totalCost));
        } else {
            System.out.println("Sorry not possible");
            System.out.println("Extra needed: " + (totalCost - budget));
        }
        
        sc.close();
    }
}