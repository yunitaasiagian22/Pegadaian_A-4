import java.util.Scanner;

public class Main {
	static int opsi = 0;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan pilihan: ");
		
		do{
			try {			
				opsi = input.nextInt();
				int i =1;
				
				System.out.println("=============================================");
				
				if(opsi==1) {
					/*
					 * System.out.println("Id \t| Product\t| Price \t| Status \t| Telp");
					 * System.out.println("=============================================");
					 */
					
					
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
