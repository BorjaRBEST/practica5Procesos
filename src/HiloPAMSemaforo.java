public class HiloPAMSemaforo extends Thread {
    private ImpresoraSemaforo impresoraSemaforo;

    public HiloPAMSemaforo(ImpresoraSemaforo impresoraSemaforo) {
        this.impresoraSemaforo = impresoraSemaforo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            impresoraSemaforo.imprimirPam();
        }
    }
}
