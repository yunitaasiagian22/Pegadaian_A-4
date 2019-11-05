
public class Tebus {
	
	private int ID;
	private String Product;
	private int Price;
	private String Status;
	private int Utang;
	private int HargaBayar;
	
	public String getTebusInfo1(){
		return "ID:  " + id + "\nProduct:  " + Product + "\nPrice:  " + price + "\nStatus: "+ status+"\nUtang: "+ utang+"\nHarga Bayar: "+ Bayar+"\n";
	}
	public String getTebusInfo(){
		return "ID:  " + id + "\nProduct:  " + Product + "\nPrice:  " + price + "\nStatus: "+ status+"\nUtang: "+ utang+"\nHarga Bayar: "+ Bayar+"\n";
	}
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public String Product() {
		return Product;
	}
	public void setProduct(String Product) {
		this.Product = Product;
	}
	public  int Price() {
		return Price;
	}
	public void setPrice( int Price) {
		this.Price = Price;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String Status) {
		this.Status = Status;
	}
	public  int Utang() {
		return Utang;
	}
	public void setUtang( int Utang) {
		this.Utang = Utang;
	}
	public  int HargaBayar() {
		return HargaBayar;
	}
	public void setBayar( int Bayar) {
		this.Bayar = Bayar;
	
}
