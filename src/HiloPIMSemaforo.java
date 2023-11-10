public class HiloPIMSemaforo extends Thread {
    private ImpresoraSemaforo impresoraSemaforo;

    public HiloPIMSemaforo(ImpresoraSemaforo impresoraSemaforo) {
        this.impresoraSemaforo = impresoraSemaforo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            impresoraSemaforo.imprimirPim();
        }
    }
}
