public class HiloPIMMonitor extends Thread {
    private ImpresoraMonitor impresoraMonitor;

    public HiloPIMMonitor(ImpresoraMonitor impresoraMonitor) {
        this.impresoraMonitor = impresoraMonitor;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            impresoraMonitor.imprimirPim();
        }
    }
}