import java.util.Scanner;

public class Pcbuild {
    String name;
    double price;

    public Pcbuild(String name, double price){
        this.name = name;
        this.price = price;
        System.out.println("Component: " + name + ", rs" + price);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your overall budget");
        double budget = sc.nextDouble();
        System.out.println();

        System.out.println("Enter Cpu price");
        double a = sc.nextDouble();
        Pcbuild cpu = new Pcbuild("CPU-Ryzen 5 5600", a);
        System.out.println();

        System.out.println("Enter Gpu price");
        double b = sc.nextDouble();
        Pcbuild gpu = new Pcbuild("GPU-RTX 3060", b);
        System.out.println();

        System.out.println("Enter ram price");
        double c = sc.nextDouble();
        Pcbuild ram = new Pcbuild("Ram-Corsair veng", c);
        System.out.println();

        System.out.println("Enter m.board price");
        double d = sc.nextDouble();
        Pcbuild mboard = new Pcbuild("Motherboard-MSI B550 M pro-VDH wifi", d);
        System.out.println();

        System.out.println("Enter SSD price");
        double e = sc.nextDouble();
        Pcbuild ssd = new Pcbuild("SSD-Crucial P3 500 Gb", e);
        System.out.println();

        System.out.println("Enter PSU price");
        double f = sc.nextDouble();
        Pcbuild psu = new Pcbuild("PSU-Corsair CV550 550 W", f);
        System.out.println();

        double totalBudget = a + b + c + d + e + f;
        System.out.println("Total Cost: rs" + totalBudget);

        if(budget >= totalBudget){
            System.out.println("yes, you can build in this budget");
            System.out.println("Bacha hua: rs" + (budget - totalBudget));
        }
        else{
            System.out.println("Budget exceed by: rs" + (totalBudget - budget));
        }
        
        sc.close();
    }
}