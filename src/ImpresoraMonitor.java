public class ImpresoraMonitor {
    private boolean turnoPim = true;

    public synchronized void imprimirPim() {
        try {
            while (!turnoPim) {
                wait();
            }
            System.out.println("PIM");
            Thread.sleep(1000);
            turnoPim = false;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void imprimirPam() {
        try {
            while (turnoPim) {
                wait();
            }
            System.out.println("PAM");
            Thread.sleep(1000);
            turnoPim = true;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

