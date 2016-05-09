import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Application {
	public static void main(String [] args)
	{ ExecutorService es;
		ATache th;
		System.out.println(" debut tache principale ");
		es = Executors.newFixedThreadPool(1);
		th = new ATache(1);
	}
}