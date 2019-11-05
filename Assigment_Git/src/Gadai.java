

public class Gadai {
	private int id;
	private String nama;
	private String category;
	private String description;
	private int price;
	private String status;
	private int utang;
	private int hargaBayar;
	
	Gadai(int id, String nama, String category, String description, int price, String status, int utang, int hargaBayar){
		this.id = id;
		this.nama=nama;
		this.category=category;
		this.description=description;
		this.price=price;
		this.status=status;
		this.utang=utang;
		this.hargaBayar=hargaBayar;
	}
	
	
	public void setId (int id){
		this.id=id;		
	}
	
	public void setNama (String nama) {
		this.nama=nama;
	}
	
	public void setCategory (String category){
		this.category=category;
	}
	
	public void setDescription (String description) {
		this.description=description;
	}
	
	public void setPrice (int price){
		this.price=price;
	}
	
	public void setStatus (String status) {
		this.status=status;
	}
	
	public void setUtang (int utang){
		this.utang=utang;
	}

	public void setHargaBayar (int hargaBayar){
		this.hargaBayar=hargaBayar;
	}
	
	public int getId (){
		return id;
	}
	
	public String getNama (){
		return nama;
	}
	
	public String getCategory (){
		return category;
	}
	
	public String getDescription (){
		return description;
	}
	
	public int getPrice (){
		return price;
	}
	
	public String getStatus(){
		return status;
	}
	
	public int getUtang(){
		return utang;
	}
	
	public int getHargaBayar(){
		return hargaBayar;
	}

}
