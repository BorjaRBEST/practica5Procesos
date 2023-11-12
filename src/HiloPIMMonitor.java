public class HiloPIMMonitor extends Thread {
    final private ImpresoraMonitor impresoraMonitor;

    // Constructor que recibe una instancia de ImpresoraMonitor como parámetro
    public HiloPIMMonitor(ImpresoraMonitor impresoraMonitor) {
        this.impresoraMonitor = impresoraMonitor;
    }

    // Método que se ejecuta cuando se inicia el hilo
    @Override
    public void run() {
        // Ciclo que realiza 5 iteraciones
        for (int i = 0; i < 5; i++) {
            // Llama al método imprimirPim de la instancia de ImpresoraMonitor
            impresoraMonitor.imprimirPim();
        }
    }
}
