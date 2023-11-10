import java.util.concurrent.Semaphore;

public class ImpresoraSemaforo {
    private Semaphore semaforoPim = new Semaphore(1); // Semáforo para controlar la impresión de "PIM"
    private Semaphore semaforoPam = new Semaphore(0); // Semáforo para controlar la impresión de "PAM"

    // Método para imprimir "PIM"
    public void imprimirPim() {
        try {
            semaforoPim.acquire(); // Adquiere el permiso del semáforo para imprimir "PIM"
            System.out.println("SEMAFORO PIM");
            Thread.sleep(1000); // Simula el proceso de impresión
            semaforoPam.release(); // Libera el permiso del semáforo para indicar que ahora se puede imprimir "PAM"
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Método para imprimir "PAM"
    public void imprimirPam() {
        try {
            semaforoPam.acquire(); // Adquiere el permiso del semáforo para imprimir "PAM"
            System.out.println("SEMAFORO PAM");
            Thread.sleep(1000); // Simula el proceso de impresión
            semaforoPim.release(); // Libera el permiso del semáforo para indicar que ahora se puede imprimir "PIM"
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
