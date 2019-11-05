import java.util.Scanner;

public class Main {
	static int opsi = 0;
	public static void main(String[] args) {
		System.out.println("PEGADAIAN SYSTEM");
		System.out.println("===================");
		System.out.println("1. Gadai");
		System.out.println("2. Tebus");
		System.out.println("3. Tampilkan Inventory");
		System.out.println("4. Exit");
		
		opsi:{
			Scanner input = new Scanner(System.in);
			System.out.print("Masukkan pilihan: ");
			String nama = "";
			String category = "";
			String description = "";
			int price = 0;
			
			do{
				try {	
					opsi = input.nextInt();
					int i =1;
					
					//System.out.println("=============================================");
					
					if(opsi==1) {
						
						 System.out.println("Detail Information");
						 System.out.println("=============================================");
						 
						 System.out.println("Nama: ");
						 nama = input.next();
						 
						 if (nama.length()<3 || nama.length()>15) {
							 System.out.println("Nama should be 3 until 15!");

						 }
						  
						 System.out.println("Product category: ");
						 category = input.next();
						 
						 System.out.println("Description: ");
						 description = input.next();
						 
						 System.out.println("Price:" );
						 price = input.nextInt();
						 
						
						
					}
					else if(opsi==2) {
						System.out.println("Id \t| Product \t| Price \t| Status \t| Utang");
						System.out.println("=============================================");
						
						
					}
					else if(opsi==3) {
						System.out.println("Id \t| Nama \t| Product \\t| Description \t| Price\t|");
						System.out.println("=============================================");
						
					}
					else if(opsi==4) {
						System.out.println("EXIT");
						System.out.println("=============================================");
						
					}
					else {
						System.out.println("Your Number was incorrect!!");
					}				
				} catch (Exception e) {
				// TODO: handle exception
				System.out.print("Your input Should be Numeric!!\n");
				input.nextLine();
				}
				
			}while (opsi ==0);
		}

	
	}

}
