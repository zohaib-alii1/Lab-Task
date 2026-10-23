public class Delivery{
	private String deskname;
	Order[] orders=new Order[3];
	Rider[] riders=new Rider[2];
	int count=0;

	Delivery(String deskname){
		this.deskname=deskname;
		
	}
	public void addorder(Order order){
		
		for(int i=0;i<orders.length;i++){
			orders[i]=order;
	}
	}	
	public void addrider(Rider rider){
		for(int i=0;i<riders.length;i++){
			riders[i]=rider;
	}
}

	public void displaydesk(){
		for(int i=0;i<orders.length;i++){	
			orders[i].display();
			}


		for(int i=0;i<riders.length;i++){	
			riders[i].displayinfo();
			}

}

}
