
public class Inventory {
	private String nama, product, description;
	private int id, price;
	public Inventory (String nama, String product, String description, int id, int price) {
			super ();
			this.nama = nama;
			this.product = product;
			this.description = description;
			this.id = id;
			this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getProduct() {
		return product;
	
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	System.out.println("3. Tampilkan Inventory");
}
