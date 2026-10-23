public class Rider extends Person{
	private String vehiclenumber;	

	public String getvehiclenumber(){
		return vehiclenumber;
		}

	Rider(String personID,String name,String vehiclenumber){
	
		super(personID,name);
		this.vehiclenumber=vehiclenumber;

}
	public void displayinfo(){
		super.displayinfo();
		System.out.println(vehiclenumber);

	}





}