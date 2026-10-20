import java.util.Scanner;
public class Pcbuild {
    public void cpu(String name,int price1){
        System.out.println("CPU name: "+name+" -"+price1);
    }
    public void gpu(String name,int price2){
        System.out.println("Gpu name: "+ name+" -"+price2);
    }
    public void ram(String name,int price3){
        System.out.println("ram name: "+ name+"- "+price3);
    }
    public void mboard(String name,int price4){
        System.out.println("motherBoard name: "+name+" -"+price4);
    }
    public void ssd(String name,int price5){
        System.out.println("SSD name: "+name+" -"+price5);
    }
    public void psu(String name,int price6){
        System.out.println("psu name: "+name+" -"+price6);
    }

 
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("-------Hello user----");
    System.out.println("Please enter your overall Budget");
    int budget=sc.nextInt();
    System.out.println("Enter CPU price");
    int price1=sc.nextInt();
    System.out.println();
    System.out.println("Enter GPU price");
    int price2=sc.nextInt();
    System.out.println();
    System.out.println("Enter ram price");
    int price3=sc.nextInt();
    System.out.println();
    System.out.println("Enter mboard price");
    int price4=sc.nextInt();
    System.out.println();
    System.out.println("Enter SSD price");
    int price5=sc.nextInt();
    System.out.println();
    System.out.println("Enter psu price");
    int price6=sc.nextInt();
    System.out.println();
    Pcbuild pc= new Pcbuild();
    pc.cpu("Ryzen 5 5600",price1);
    pc.gpu("RTX 3060", price2);
    pc.ram("Corsair veng", price3);
    pc.mboard("MSI B550 M pro-VDH Wifi",price4);
    pc.ssd("Crucial p3 500 GB Name",price5);
    pc.psu("Corsair CV550 550 W",price6);
    
    double totalBudget=price1+price2+price3+price4+price5+price6;
    System.out.println("Your total budget is: "+totalBudget);
    if(totalBudget<budget){
        System.out.println("Yes we can build Pc in this budget");
    }else{
        System.out.println("Sorry not possibe");
    }
}
}