import java.util.Scanner;
public class Pcbuild {
    public void cpu(String name,int price1){
        System.out.println("CPU name: "+name+" -"+price1);
    }
    public void gpu(String name,int price2){
        System.out.println("Gpu name: "+ name+" -"+price2);
    }
    

 
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter CPU price");
    int price1=sc.nextInt();
    System.out.println("Enter GPU price");
    int price2=sc.nextInt();
    Pcbuild pc= new Pcbuild();
    pc.cpu("Ryzen 5 5600",price1);
    pc.gpu("RTX 3060", price2);
}
}