import java.util.concurrent.Semaphore;

public class Museo {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello, World!");

		Semaphore entrada = new Semaphore(2);
		Semaphore salida = new Semaphore(3);

		Visitantes h1 = new Visitantes(entrada, salida);
		Visitantes h2 = new Visitantes(entrada, salida);
		Visitantes h3 = new Visitantes(entrada, salida);
		Visitantes h4 = new Visitantes(entrada, salida);
		Visitantes h5 = new Visitantes(entrada, salida);
		Visitantes h6 = new Visitantes(entrada, salida);
		Visitantes h7 = new Visitantes(entrada, salida);

		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
		h6.start();
		h7.start();

		// try {
		// 	// h1.join();
		// 	// h2.join();
		// 	// h3.join();
		// 	// h4.join();
		// 	// h5.join();
		// 	// h6.join();
		// 	// h7.join();
		// } catch (InterruptedException e) {
		// 	// TODO Auto-generated catch block
		// 	e.printStackTrace();
		// }
		System.out.println("Fin de programa");
	}
}
