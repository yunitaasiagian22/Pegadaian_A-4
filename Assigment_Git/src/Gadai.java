
public class Gadai {
	private int id;
	private String nama;
	private String category;
	private String description;
	private int price;
	
	Gadai(int id, String nama, String category, String description, int price){
		this.id = id;
		this.nama=nama;
		this.category=category;
		this.description=description;
		this.price=price;
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
	
	
	
	
	
	
	
	
	

}
