import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int opsi = 0;
	static ArrayList<Gadai> gad = new ArrayList();

	public static void main(String[] args) {
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

		do {
			try {
				opsi = input.nextInt();
				int i = 1;

				// System.out.println("=============================================");

				if (opsi == 1) {
					boolean valid;

					System.out.println("Detail Information");
					System.out.println("=============================================");

					boolean stopContinue = false;
					
					while (stopContinue = true) {
						System.out.println("Nama: ");
						nama = input.next();

						if (nama.length() >= 3 && nama.length() <= 15) {

							System.out.println("Product category: ");
							category = input.next();

							if (category.equalsIgnoreCase("motor") || category.equalsIgnoreCase("emas")
									|| category.equalsIgnoreCase("laptop")) {

								System.out.println("Description: ");
								description = input.next();

								boolean isTwo = cekWords(description);

								if (isTwo == true) {
									
									System.out.print("Price:\n");
									price = input.nextInt();

									if (price % 10000 == 1) {
										System.out.println("Harga harus kelipatan 10.000!");
										
									} else
										//valid = true
									    stopContinue = false;
										gad.add(new Gadai(i, nama, category, description, price));
										i++;
								} else
								    System.out.println("Description should have at least two words");	
							} else
								System.out.println("Category Not found!");
					
						} else {
							valid = true;
							System.out.println("Nama should be 3 until 15!");
						}

					}

					

				} else if (opsi == 2) {
					System.out.println("Id \t| Product \t| Price \t| Status \t| Utang");
					System.out.println("=============================================");

				} else if (opsi == 3) {
					System.out.println("Id \t| Nama \t| Product \\t| Description \t| Price\t|");
					System.out.println("=============================================");

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

		} while (opsi == 0);
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
