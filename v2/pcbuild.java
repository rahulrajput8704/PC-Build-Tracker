import java.util.Scanner;

class Pcbuild {
    private String name;
    private double price;

    public Pcbuild(String name, double price) {
        this.name = name;
        setprice(price);
    }

    public String getname() { return name; }
    public double getprice() { return price; }

    public void setprice(double price) {
        if (price > 0) this.price = price;
        else this.price = 0;
    }

   
    
    
    public static int calculateTotal(Pcbuild[] build) {
        int total = 0;
        for (Pcbuild pc : build) {
            total += pc.getprice();
        }
        return total;
    }

    
    public static void checkBudget(int total, int budget) {
        System.out.println("\nTotal budget is: " + total);
        if (total <= budget) {
            System.out.println("yes you can build pc in this budget");
        } else {
            System.out.println("your budget is exceeding by: " + (total - budget));
        }
    }
    
    
    public static void displayBuild(Pcbuild[] build) {
        System.out.println("\n------ Your Build ------");
        for (Pcbuild pc : build) {
            System.out.println(pc.getname() + " - Rs " + pc.getprice());
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------Welcome User------");
        System.out.println("Enter your budget");
        int budget = sc.nextInt();

        String[] parts = {"Cpu: ryzen 5 5600", "Gpu: Rtx 3060", "Ram:Corsair 16GB",
                          "Motherboard:MSI B550M", "SSD:Crucial P3", "PSU:Corsair CV550"};

        Pcbuild[] build = new Pcbuild[6];

        for (int i = 0; i < build.length; i++) {
            System.out.print("Enter price for " + parts[i] + " Rs - ");
            int p = sc.nextInt();
            build[i] = new Pcbuild(parts[i], p);
        }
        
        displayBuild(build);
        int total = calculateTotal(build);
        checkBudget(total, budget);
        
        sc.close();
    }
}