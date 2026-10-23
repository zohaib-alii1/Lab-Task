public class Order{
	private String orderID;
	Customer customer;
	Bill bill;

	Order(String orderID,Customer customer,String billNumber,double total){
		this.orderID=orderID;
		this.customer=customer;
		this.bill=new Bill(billNumber,total);

}


	public void display(){
		System.out.println(orderID);
		System.out.println(customer);
		System.out.println(bill.getbillNumber());
		System.out.println(bill.gettotal());


		}



}
