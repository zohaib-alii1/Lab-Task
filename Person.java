public class Person{
	private String personID;
	private String name;

	public String getpersonID(){
		return personID;
		}
	public String getname(){
		return name;
		}

	public Person(String personID,String name){
		this.personID=personID;
		this.name=name;

		}
	
	





	public void displayinfo(){
		System.out.println(personID);
		System.out.println(name);


		}






}