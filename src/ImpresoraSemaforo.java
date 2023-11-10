import java.util.concurrent.Semaphore;

public class ImpresoraSemaforo {
    private Semaphore semaforoPim = new Semaphore(1);
    private Semaphore semaforoPam = new Semaphore(0);

    public void imprimirPim() {
        try {
            semaforoPim.acquire();
            System.out.println("PIM");
            Thread.sleep(1000);
            semaforoPam.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void imprimirPam() {
        try {
            semaforoPam.acquire();
            System.out.println("PAM");
            Thread.sleep(1000);
            semaforoPim.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

