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
   double totalBudget= cpuPrice+gpuPrice;
   System.out.println(totalBudget);
   boolean isBudget= totalBudget< 50000;
   System.out.println(isBudget);
    }  
}