import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	static int opsi = 0;
	static ArrayList<Gadai> gad = new ArrayList();
	static int idnum = 1;

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
						else System.out.println("Nama harus 3-15");
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
						//System.out.println(""+isTwo);
						
						if (isTwo == true) {
							valid1 = true;
						} else
							System.out.println("Description should have at least two words!");
							
					} while (!valid1);
					
					do {
						//input.nextLine();
						System.out.print("Price :");
						price = input.nextInt();
						if (price % 10000 == 0) {
							//stopContinue = true;
							gad.add(new Gadai(idnum, nama, category, description, price,"Gadai",price,price));
							//gad.add(new Gadai(setId(), setNama(), setCategory(), setDescription(), setPrice()));
							idnum++;
							cls();

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
				    //ArrayList<Gadai> objGadai = new ArrayList<>();
				    for (Gadai gad1:gad){
		            	if(gad1.getId()==id){
		            		gad1.setUtang(gad1.getUtang() - hargaBayar);
		            		if (gad1.getUtang() == 0){
		            			gad1.setStatus("Lunas");
		            		} else if (gad1.getUtang() <0){
		            				gad1.setStatus("Lunas");
		            			}	
		            		else{
		            			gad1.setStatus("Gadai")	;
		            		} 
		            	}
		            }
				    
				    System.out.println("=======================================================================");
				    System.out.format("|%7s||%12s||%12s||%12s||%12s|\n","ID","Product","Price","Status","Utang");
				    //System.out.println("Id \t| Product \t| Price \t| Status \t| Utang");
					System.out.println("======================================================================");
					//ArrayList<Gadai> objGadai = new ArrayList<>();
					//objInventory.add(new Inventory (objInventory.getNama())));
					
					for(Gadai gad1:gad){

						System.out.format("|%7s||%12s||%12s||%12s||%12s|\n",gad1.getId(),gad1.getCategory(),gad1.getPrice(),gad1.getStatus(),gad1.getUtang());
						//System.out.println(gad1.getId() + " \t|" + gad1.getCategory()+ " \t\t|" + gad1.getPrice()+ "\t|" + gad1.getStatus()+ " \t|" + gad1.getUtang()+ " \t|");
						//System.out.println(gad1.getId() + " \t|" + gad1.getCategory()+ " \t\t\t|" + gad1.getPrice()+ "\t\t|" + gad1.getStatus()+ " \t\t|" + gad1.getUtang()+ " \t\t|");
						cls();
					}
					
					

				} else if (opsi == 3) {
					//tampilkan inventory
					//System.out.println("Id \t| Nama \t| Product \t| Description \t| Price\t|");
					System.out.println("==========================================================================");
					System.out.format("|%7s||%12s||%12s||%12s||%12s|\n","ID","Nama","Product","Description","Price");
					System.out.println("==========================================================================");
					//ArrayList<Inventory> objInventory = new ArrayList<>();
					ArrayList<Gadai> objGadai = new ArrayList<>();
					//objInventory.add(new Inventory (objInventory.getNama())));
					
					for(Gadai gad1:gad){
						if(gad1.getStatus().equals("Gadai")){
							System.out.format("|%7s||%12s||%12s||%12s||%12s|\n",gad1.getId(),gad1.getNama(),gad1.getCategory(),gad1.getDescription(),gad1.getUtang());
							//System.out.println(gad1.getId() + " \t|" + gad1.getNama()+ " \t|" + gad1.getCategory()+ " \t\t|" + gad1.getDescription()+ " \t\t|" + gad1.getUtang()+ "\t|");
							//System.out.println(gad1.getId() + " \t|" + gad1.getNama()+ " \t\t|" + gad1.getCategory()+ " \t\t\t|" + gad1.getDescription()+ " \t\t|" + gad1.getPrice()+ "\t\t|");
							cls();

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
	
	public static void cls(){
		try{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();		
		}catch (Exception E){
			System.out.println(E);
		}
	}

	private static boolean cekWords(String description) {
		// TODO Auto-generated method stub
		 int count = 1;
	        for (int i=0;i<=description.length()-1;i++)
	        {
	            if (description.charAt(i) == ' ' && description.charAt(i+1)!=' ')
	            {
	                count++;
	            }
	        }
	       if (count >=2) {
	    	   return true;
	       }
	       else return false;
	}
}
