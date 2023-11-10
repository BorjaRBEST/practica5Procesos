public class HiloPIM extends Thread {
    private Impresora impresora;

    public HiloPIM(Impresora impresora) {
        this.impresora = impresora;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            impresora.imprimirPim();
        }
    }
}
