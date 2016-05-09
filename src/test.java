import java.awt.Label;

public class test extends java.applet.Applet 
{

	test (){

	}








	public void traitement(int en){
			

		
		for (int i = 0; i < 99 ; i++){
		
		System.out.println(en + i);
		}

	}
	

	public static void main(String[] args)
	{
		// demander un entier
		test test1=new test();
		test1.traitement(2);

	}
}