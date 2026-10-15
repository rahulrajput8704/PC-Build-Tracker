public class PcPart{
	
	public static void main(String[]args){
	
	System.out.println("------YOUR PC BUILD-----");	
	 String cpuName= "Ryzen 5 5600";
	 double cpuPrice= 13500.50;
	 System.out.println("CpuName: " +cpuName+ "- Rs " + cpuPrice);
	
   String gpuName="RTX 3060";
   double gpuPrice= 25000.00;
   System.out.println("GpuName :"+ gpuName+" -Rs "+ gpuPrice);

         String ramName= "Corsair vengenance LPx 16GB (2*8GB) DDR4 3200 MHz";
         double ramPrice= 4500.00;
         System.out.println("RamName: "+ ramName+"  -Rs"+ ramPrice);
         
         String motherBoard= "MSI B550 M Pro-VDH WIFI";
         double motherboardPrice= 9500.00;
         System.out.println("MotherboardName: "+motherBoard+"  -Rs "+ motherboardPrice);
         
         String SSDname= "Crucial P3 500 GB Nvme";
         double SSDprice= 3500.00;
         System.out.println("SSDname: "+SSDname+"    -Rs "+SSDprice);
         
         String PSUname="Corsair CV550 550 W";
         double PSUprice=4000.00;
         System.out.println("PSUname: "+PSUname+"   -Rs "+ PSUprice);
         
double totalBudget= cpuPrice+gpuPrice+motherboardPrice+SSDprice+PSUprice+ramPrice;
   
   System.out.println("totalbudget: "+totalBudget);
    if (totalBudget<=60000){
    	System.out.println("your budget is under limitation: "+ totalBudget);
    }else{
    	System.out.println("Budget is above: "+
    	(totalBudget-60000)+ " by this amount");
    }
   
    }
}