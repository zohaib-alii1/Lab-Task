public class Customer extends Person{
	private String address;

	Customer(String personID,String name,String address){
		super(personID,name);
		this.address=address;
		
		}

	public void displayinfo(){
		super.displayinfo();
		System.out.println(address);
		
	}

	



}