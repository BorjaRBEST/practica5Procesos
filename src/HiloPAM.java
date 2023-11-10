public class HiloPAM extends Thread {
    private Impresora impresora;

    public HiloPAM(Impresora impresora) {
        this.impresora = impresora;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            impresora.imprimirPam();
        }
    }
}