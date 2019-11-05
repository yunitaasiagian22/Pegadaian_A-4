

public class Tebus {
	private int ID;
	private String Product;
	private int Price;
	private String Status;
	private int Utang;
	private int HargaBayar;
	private String Category;
	
	
	Tebus (int ID, String Product, int Price, String Status, int Utang, int HargaBayar) {
		super();
			this.ID=ID;
			this.Product=Product;
			this.Price=Price;
			this.Status=Status;
			this.Utang=Utang;
			this.HargaBayar=HargaBayar;
			}
			
	public int getHargabayar() {
		return HargaBayar;
	}

	public void setHargabayar(int hargaBayar) {
		HargaBayar = hargaBayar;
	}

	

	public int getHargaBayar() {
		return HargaBayar;
	}

	public void setHargaBayar(int hargaBayar) {
		HargaBayar = hargaBayar;
	}

	public String getcategory() {
		return Category;
	}

	public void setCategory(String category) {
		category = Category;
	}

	public String getProduct() {
		return Product;
	}

	public int getPrice() {
		return Price;
	}

	public int getUtang() {
		return Utang;
	}
	
}

	
	

	
	