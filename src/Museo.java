import java.util.concurrent.Semaphore;

public class Museo {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello, World!");

		Semaphore entrada = new Semaphore(2);
		Semaphore salida = new Semaphore(3);
		Semaphore aforo = new Semaphore(7);

		Visitantes[] vst = new Visitantes[10];

		for (int i = 0; i < vst.length; i++) {
			vst[i] = new Visitantes(entrada, salida, aforo);
		}

		for (int i = 0; i < vst.length; i++) {
			vst[i].start();
		}
		// Visitantes h1 = new Visitantes(entrada, salida, aforo);
		// Visitantes h2 = new Visitantes(entrada, salida, aforo);
		// Visitantes h3 = new Visitantes(entrada, salida, aforo);
		// Visitantes h4 = new Visitantes(entrada, salida, aforo);
		// Visitantes h5 = new Visitantes(entrada, salida, aforo);
		// Visitantes h6 = new Visitantes(entrada, salida, aforo);
		// Visitantes h7 = new Visitantes(entrada, salida, aforo);
		// Visitantes h8 = new Visitantes(entrada, salida, aforo);
		// Visitantes h9 = new Visitantes(entrada, salida, aforo);
		// Visitantes h10 = new Visitantes(entrada, salida, aforo);

		// h1.start();
		// h2.start();
		// h3.start();
		// h4.start();
		// h5.start();
		// h6.start();
		// h7.start();
		// h8.start();
		// h9.start();
		// h10.start();

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
	}
}
