
public class Tebus {
	private int ID;
	private String Product;
	private int Price;
	private String Status;
	private int Utang;
	private int HargaBayar;
	
	
	Tebus (int ID;
	String Product;
	int Price;
	String Status;
	int Utang;
	int HargaBayar;
	Tebus (int ID,
	String Product,
	int Price,
	String Status,
	int Utang,
	int HargaBayar) {
		super();
			this.ID=ID;
			this.Product=Product;
			this.Price=Price;
			this.Status=status;
			this.Utang=Utang;
			this.HargaBayar=HargaBayar;
			}
			
	public String getTebusInfo1(){
		return "ID:  " + id + "\nProduct:  " + Product + "\nPrice:  " + price + "\nStatus: "+ status+"\nUtang: "+ utang+"\nHarga Bayar: "+ Bayar+"\n";
			}
	public String getTebusInfo(){
		return "ID:  " + id + "\nProduct:  " + Product + "\nPrice:  " + price + "\nStatus: "+ status+"\nUtang: "+ utang+"\nHarga Bayar: "+ Bayar+"\n";
		public int getID() {
			return id;
		}
		
	public void setID(int id) {
		this.id = id;
			
	public String Product() {
	return Product;
	public void setProduct(String Product) {
		this.Product = Product;
				
	public  int Price() {
	return Price;
	public void setPrice( int Price) {
		this.Price = Price;
	public String getStatus() {
	return Status;
	public void setStatus(String Status) {
	this.Status = Status;
	public  int Utang() {
	return Utang;
	public void setUtang( int Utang) {
	this.Utang = Utang;
	public  int HargaBayar() {
	return HargaBayar;
	public void setBayar( int Bayar) {
	this.Bayar = Bayar;
	}
	
	Scanner input = new Scanner(System.in); //input
	System.out.println("Masukkan ID barang yang ingin di tebus: ");
	int ID = input.nextInt() ;
	System.out.println("Masukkan biaya yang ingin di bayarkan: ");
	int HargaBayar = input.nextInt() ;
	
	