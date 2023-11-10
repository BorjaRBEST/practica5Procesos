public class HiloPAMMonitor extends Thread {
    private ImpresoraMonitor impresoraMonitor;

    // Constructor que recibe una instancia de ImpresoraMonitor como parámetro
    public HiloPAMMonitor(ImpresoraMonitor impresoraMonitor) {
        this.impresoraMonitor = impresoraMonitor;
    }

    // Método que se ejecuta cuando se inicia el hilo
    @Override
    public void run() {
        // Ciclo que realiza 5 iteraciones
        for (int i = 0; i < 5; i++) {
            // Llama al método imprimirPam de la instancia de ImpresoraMonitor
            impresoraMonitor.imprimirPam();
        }
    }
}
