import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	static int opsi = 0;
	static ArrayList<Gadai> gad = new ArrayList();

	public static void main(String[] args) {
		
		do {
			System.out.println("PEGADAIAN SYSTEM");
			System.out.println("===================");
			System.out.println("1. Gadai");
			System.out.println("2. Tebus");
			System.out.println("3. Tampilkan Inventory");
			System.out.println("4. Exit");

			// opsi:{
			Scanner input = new Scanner(System.in);
			System.out.print("Masukkan pilihan: ");
			String nama = "";
			String category = "";
			String description = "";

			int price = 0;
			try {
				opsi = input.nextInt();
				int i = 1;

				// System.out.println("=============================================");

				if (opsi == 1) {
					boolean valid;

					System.out.println("Detail Information");
					System.out.println("=============================================");

					boolean valid1 = false;
					
					do {
						input.nextLine();
						System.out.print("Nama :");
						nama = input.nextLine();
						
						if (nama.length() >= 3 && nama.length() <= 15) {
							//gad.setNama(nama);
							valid1 = true;
						}
					} while (!valid1);
					
					do {
						//input.nextLine();
						valid1 = false;
						System.out.print("Category :");
						category = input.nextLine();
						
						if (category.equalsIgnoreCase("motor") || category.equalsIgnoreCase("emas")
								|| category.equalsIgnoreCase("laptop")) {
							valid1 = true;
							
						}
						else {
							System.out.println("Category Not found!");
						}
							
					} while (!valid1);
					
					do {
						//input.nextLine();
						valid1 = false;
						System.out.print("Deskripsi :");
						description = input.nextLine();
						
						boolean isTwo = cekWords(description);

						if (isTwo == false) {
							System.out.println("Description should have at least two words!");
							valid1 = false;
							// System.out.println("Description: ");
							// description= input.nextLine();
						} else
							valid1 = true;
							
					} while (!valid1);
					
					do {
						//input.nextLine();
						System.out.print("Price :");
						price = input.nextInt();
						if (price % 10000 == 0) {
							//stopContinue = true;
							gad.add(new Gadai(i, nama, category, description, price));
							i++;
						} else {
							System.out.println("Harga harus kelipatan 10.000!");
						}
					} while (price % 10000 > 0);



				} else if (opsi == 2) {
					//Scanner input = new Scanner(System.in); 
					System.out.println(" Masukkan ID Barang yang ingin ditebus : ");
				    int id= input.nextInt();
				       
				    System.out.print("Masukan Biaya yang ingin ditebus : ");
				    int hargaBayar = input.nextInt();
				    ArrayList<Gadai> objGadai = new ArrayList<>();
				    for (Gadai gad:objGadai){
		            	if(gad.getId()==id){
		            		gad.setUtang(gad.getUtang() - hargaBayar);
		            		if (gad.getUtang() == 0){
		            			gad.setStatus("Lunas");
		            		} else if (gad.getUtang() <0){
		            				gad.setStatus("Lunas");
		            			}	
		            		else{
		            			gad.setStatus("Gadai")	;
		            		} 
		            	}
		            }
				    
				    System.out.println("=============================================");
					System.out.println("Id \t| Product \t| Price \t| Status \t| Utang");
					System.out.println("=============================================");
					//ArrayList<Gadai> objGadai = new ArrayList<>();
					//objInventory.add(new Inventory (objInventory.getNama())));
					
					for(Gadai gad:objGadai){
						System.out.println(gad.getId() + " \t|" + gad.getCategory()+ " \t|" + gad.getPrice()+ "\t|" + gad.getStatus()+ " \t|" + gad.getUtang()+ " \t|");
						
					}
					
					

				} else if (opsi == 3) {
					//tampilkan inventory
					System.out.println("Id \t| Nama \t| Product \t| Description \t| Price\t|");
					System.out.println("=============================================");
					//ArrayList<Inventory> objInventory = new ArrayList<>();
					ArrayList<Gadai> objGadai = new ArrayList<>();
					//objInventory.add(new Inventory (objInventory.getNama())));
					
					for(Gadai gad:objGadai){
						if(gad.getStatus().equals("Gadai")){
							System.out.println(gad.getId() + " \t|" + gad.getNama()+ " \t|" + gad.getCategory()+ " \t|" + gad.getDescription()+ " \t|" + gad.getPrice()+ "\t|");
						}
					}
					

				} else if (opsi == 4) {
					System.out.println("EXIT");
					System.out.println("=============================================");

				} else {
					System.out.println("Your Number was incorrect!!");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.print("Your input Should be Numeric!!\n");
				input.nextLine();
			}

		} while (opsi >= 0 && opsi <=3);
	}

	private static void gadai() {
		// TODO Auto-generated method stub

	}

	private static boolean cekWords(String description) {
		// TODO Auto-generated method stub
		int count = 0;
		while (count < 2) {
			String[] arrPhrase = description.split(" ");
			for (int i = 0; i < arrPhrase.length; i++) {
				if (arrPhrase[i].equals(" ")) {
				} else {
					count++;

				}
			}
		}
		if (count >= 2) {
			return true;
		}
		return false;
	}
}
