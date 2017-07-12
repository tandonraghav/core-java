
public class PrintNumbersDiffThreads {

	//private boolean toProceeed=false;
	
	public static void main(String[] args) {
		Print p=new Print();
		p.printing();
	}
}


class Print{
	
	private boolean toProceed=true;
	private int i=0;
	public void printing(){
		
		while(i<10){
			toProceed=false;
			Thread t=new Thread(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(i);
					i++;
					toProceed=true;
				}
			});
			t.start();
		}
	}
}
