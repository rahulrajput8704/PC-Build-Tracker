public class PcPart{
	
	public static void main(String[]args){
		
	 String cpuName= "Ryzen 5 5600";
	 double cpuPrice= 13500.50;
	 boolean isPurchased= false;
	 System.out.println(cpuName);
	 System.out.println(cpuPrice);
	 System.out.println(isPurchased);
   String gpuName="RTX 3060";
   double gpuPrice= 25000.00;

         String ramName= "Corsair vengenance LPx 16GB (2*8GB) DDR4 3200 MHz";
         double ramPrice= 4500.00;
         String motherBoard= "MSI B550 M Pro-VDH WIFI";
         double motherboardPrice= 9500.00;
         String SSDname= "Crucial P3 500 GB Nvme";
         double SSDprice= 3500.00;
         String PSUname="Corsair CV550 550 W";
         double PSUprice=4000.00;
double totalBudget= cpuPrice+gpuPrice+motherboardPrice+SSDprice+PSUprice+ramPrice;
   
   System.out.println(totalBudget);
   boolean isBudget= totalBudget< 60000;
   System.out.println(isBudget);
    }  
}