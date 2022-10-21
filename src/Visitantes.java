import java.util.Iterator;
import java.util.concurrent.Semaphore;

public class Visitantes extends Thread {

    Semaphore entrada = null;
    Semaphore salida = null;

    public Visitantes(Semaphore entrada, Semaphore salida) {
        super();
        this.entrada = entrada;
        this.salida = salida;

    }

    public void run() {
        // entra al museo
        // ve los cuadros Sleep(random 1-5)
        // sale del museo
        try {
            entrada.acquire();
            entrada.release();
            Thread.sleep((long) (Math.random() * 7000));
            System.out.println("Que cuadros tan bonitos");
            salida.acquire();
            salida.release();
        } catch (Exception e) {

        }

    }

}
