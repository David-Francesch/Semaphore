import java.util.Iterator;
import java.util.concurrent.Semaphore;

public class Visitantes extends Thread {

    Semaphore entrada = null;
    Semaphore salida = null;
    Semaphore aforo = null;
    Semaphore autobus = null;

    public Visitantes(Semaphore entrada, Semaphore salida, Semaphore aforo, Semaphore autobus) {
        super();
        this.entrada = entrada;
        this.salida = salida;
        this.aforo = aforo;
        this.autobus = autobus;

    }

    public void run() {
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

            System.out.println(getId() + "Entro en el bus");
            autobus.acquire();
            // autobus.wait();
            // autobus.notify();
            autobus.release();
            
        } catch (Exception e) {

        }

    }

}
