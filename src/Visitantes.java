import java.util.Iterator;
import java.util.concurrent.Semaphore;

public class Visitantes extends Thread {

    Semaphore entrada = null;
    Semaphore salida = null;
    Semaphore aforo = null;

    public Visitantes(Semaphore entrada, Semaphore salida, Semaphore aforo) {
        super();
        this.entrada = entrada;
        this.salida = salida;
        this.aforo = aforo;

    }

    public void run() {
        // entra al museo
        // ve los cuadros Sleep(random 1-5)
        // sale del museo
        try {
            System.out.println(Thread.currentThread() + "Quiero entrar");
            entrada.acquire();
            entrada.release();
            aforo.acquire();
            Thread.sleep((long) (Math.random() * 7000));
            System.out.println("Hola, soy "+getId()+ " Que cuadros tan bonitos");
            aforo.release();
            System.out.println(Thread.currentThread() + "Quiero salir");
            salida.acquire();
            salida.release();
        } catch (Exception e) {

        }

    }

}
