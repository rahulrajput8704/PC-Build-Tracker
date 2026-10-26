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
        
        int budget;
        Scanner sc=new Scanner(System.in);
        System.out.println("-------Welcome User!-------");
        System.out.println();
        System.out.println("Enter your budget");
        budget=sc.nextInt();
        
        String[] parts={"cpu: ryzen 5 5600","Gpu: Rtx 3060",
            "ram:Corsoir 16GB","Motherboard:MSI B550M",
            "SSD:Crucial P3","PSU:Corsoir CV550"};
        
        
        Pcbuild[] build = new Pcbuild[6];
int total = 0;
for(int i=0; i<build.length; i++){
    System.out.print("Enter price for "+parts[i]+" Rs- ");
    int p = sc.nextInt(); 
    build[i] = new Pcbuild(parts[i], p); 
    total += build[i].getprice();
}
            
        
        System.out.println("Total budget is: "+total);
        
        if(total<=budget){
            System.out.println("yes you can build pc in this budget");
        }else{
            System.out.println("your budget is exceeding by:"+(total-budget));
        }
        
    }
}