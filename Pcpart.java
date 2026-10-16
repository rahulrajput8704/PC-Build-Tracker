
import java.util.Scanner;

public class PcPart{
	
	public static void main(String[]args){
	
	System.out.println("------YOUR PC BUILD-----");
	System.out.println("Hi user! Tell me your budget");
	Scanner sc=new Scanner(System.in);
	float budget= sc.nextFloat();
	System.out.println();
	
	 String cpuName= "Ryzen 5 5600";
	 System.out.println("CpuName: " +cpuName);
	 System.out.println("Enter CPU budget");
	 double cpuBudget=sc.nextDouble();
	 System.out.println();
	
   String gpuName="RTX 3060";
   System.out.println("GpuName :"+ gpuName);   System.out.println("Enter Gpu budget");
   double gpuBudget=sc.nextDouble();
  System.out.println();
  
         String ramName= "Corsair vengenance LPx 16GB (2*8GB) DDR4 3200 MHz";
         System.out.println("RamName: "+ ramName);
         System.out.println("Enter your ram budget");
         double ramBudget=sc.nextDouble();
         System.out.println();
         
         
         String motherBoard= "MSI B550 M Pro-VDH WIFI";
         System.out.println("MotherboardName: "+motherBoard);
         System.out.println("Enter your motherboard budget");
         double motherboardBudget=sc.nextDouble();
         System.out.println();
         
         
         String SSDname= "Crucial P3 500 GB Nvme";
         System.out.println("SSDname: "+SSDname);
         System.out.println("Enter SSD budget");
         double SSDbudget=sc.nextDouble();
         System.out.println();
         
         String PSUname="Corsair CV550 550 W";
         System.out.println("PSUname: "+PSUname);
         System.out.println("Enter your psu budget");
         double PSUbudget=sc.nextDouble();
         System.out.println();
         
         double totalBudget=ramBudget+PSUbudget+SSDbudget+motherboardBudget+gpuBudget+cpuBudget;
         System.out.println("your total budget for pc build is: "+totalBudget);
         System.out.println();
         
         if(totalBudget<=budget){
         System.out.println("Yes you can build this project in this budget");
	}else{
	        System.out.print("your budget is above the recommendation by :  "+(totalBudget-budget));
	}
         
   
    }
}