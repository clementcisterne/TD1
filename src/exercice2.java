public class exercice2 extends Thread {

	public int loop;
	public String name;
	public String jdid;
	
	exercice2(String name){
		this.loop=30;
		this.name=name;

		this.jdid="salut";
	}

	public void run(){
		for (; this.loop > 0; this.loop--){
			System.out.println(this.name); // Action 
		}
		
	}


	public static void main(String[] Args){	
		
	// Instansiation / Exécution
		exercice2 test1 = new exercice2("------------------------------------------------------------------------------------------------------------------------");
		exercice2 test2 = new exercice2("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		exercice2 test3 = new exercice2("########################################################################################################################");
		test1.start();
		test2.start();
		test3.start();
	}
}
