
public class CompConfig {
public static void main (String args[]){
	
String CPU = "CPU: AMD FX-6300 3.5GHz 6-Core Processor----- $119.99\n";
String Mobo = "Mobo: Gigabyte Ga-970A-D3p ATX--------------- $94.58 \n";
String RAM = "G.Skill Sniper Series (2x4GB) DDR3-1866------ $74.99\n";
String HDD = "Seagate Barracude 1TB 7200 RPM HDD----------- $58.35\n";
String Case = "BitFenix Neos ATX Mid Tower Case------------- $28.86\n";
String PSU = "Corsair Builder 430W 80+ Bronze ATX PSU------ $32.99\n";
String total = "                                        TOTAL:$539.75";
System.out.println("Old PC Parts:\n"
		+ CPU
		+ Mobo
		+ RAM
		+ HDD
		+ Case
		+ PSU
		+ total);	
System.out.println("Budget build with space for upgrades. CPU is solid enough to do mid-heavy cpu intensive work (autocad) with 1tb memory and plenty of ram for light work.");
	
String newCPU = "CPU: Intel Core i7-4790K 4.0GHz Quad-Core Processor----- $325.99\n";
String newMobo = "MSI Z87-G45 Gaming ATX LGA1150 Motherboard-------------- $159.99 \n";
String newRAM = "Corsair Vengeance 8GB (2 x 4GB) DDR3-1866 Memory-------- $67.99\n";
String newSSD = "Samsung 850 Pro Series 256GB 2.5------------------------ $142.99\n";
String newCase = "Fractal Design Define R4 w/Window----------------------- $112.99\n";
String newPSU = "Corsair Professional 850W 80+ Gold ATX PSU-------------- $102.99\n";
String newtotal = "                                                   TOTAL:$912.94";
System.out.println("\nNEW PC Parts:\n"
		+ newCPU
		+ newMobo
		+ newRAM
		+ newSSD
		+ newCase
		+ newPSU
		+ newtotal);
System.out.println("High end PC with plenty of room for upgrading. High tier CPU can handle intensive work along with onboard graphics capability.\nSSD for faster read"
		+ " and write speeds. Enough RAM and space in case for multiple graphic cards.");

}
}

