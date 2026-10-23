public class Main{
	public static void main(String args[]){
	
	Customer c1=new Customer("101","Zohaib","Umer Khichi");

	Rider r1=new Rider("105","Hashir","Mailsi");
	
	Rider r2=new Rider("107","Hasnain","Multan");

	Order o1=new Order("100",c1,"5",1000);
	Order o2=new Order("102",c1,"7",10000);

	Delivery d1=new Delivery("UBH");
	
	d1.addorder(o1);
	d1.addorder(o2);
	
	d1.addrider(r1);
	d1.addrider(r2);
	
	d1.displaydesk();
}
}
