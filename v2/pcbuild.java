import java.util.Scanner;
public class Pcbuild{
    private String name;
    private double price;
    
    public Pcbuild(String name,double price){
        this.name=name;
        setprice(price);
    }
    public String getname(){
        return name;
    }
    public double getprice(){
        return price;
    }
    public void setprice(double price){
        if(price>0){
            this.price=price;
        }else{
            this.price=0;
        }
    }
    
    public static void main(String[] args) {
        double totalBudget;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("-------Welcome User!-------");
        System.out.println();
        
        System.out.println("Please enter your Budget");
        double Budget=sc.nextDouble();
        System.out.println("your Budget is: "+Budget);
        
        System.out.println("Enter Cpu price");
        double a= sc.nextDouble();
	Pcbuild cpu=new Pcbuild("Cpu:Ryzen 5 5600",a);
        
        System.out.println("Enter Gpu price");
        double b=sc.nextDouble();
        Pcbuild gpu=new Pcbuild("Gpu:RTX 3060",b);
        
        System.out.println("Enter Ram price");
        double c= sc.nextDouble();
        Pcbuild Ram=new Pcbuild("Ram:corsoir 16Gb",c);
        
        System.out.println("Enter motherboard price");
        double d=sc.nextDouble();
        Pcbuild MotherBoard=new Pcbuild("M.board: MSI B550 M",d);
        
        System.out.println("Enter SSD price");
        double e=sc.nextDouble();
        Pcbuild SSD= new Pcbuild("SSD: Crucial p3",e);
        
        System.out.println("Enter PSU price");
        double f=sc.nextDouble();
        Pcbuild PSU= new Pcbuild("PSU:Corsoir Cv550",f);
        
        totalBudget=a+b+c+d+e+f;
        
        if(totalBudget<=Budget){
            System.out.println("yes you can build pc");
        }else{
            System.out.println("Budget is exceeding by: "+(totalBudget-Budget));
            
        }
        
        
        
}
    
}