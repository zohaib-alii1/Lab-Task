public class Bill{
	private String billNumber;
	private double total;

	public String getbillNumber(){
		return billNumber;
	}
	public double gettotal(){
		return total;
	}

	public Bill(String billNumber,double total){
		this.billNumber=billNumber;
		this.total=total;
	
		}
	
	public void displaybill(){
		System.out.println(billNumber);
		System.out.println(total);

		}





}