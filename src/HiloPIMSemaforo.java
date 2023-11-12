public class HiloPIMSemaforo extends Thread {
    final private ImpresoraSemaforo impresoraSemaforo;

    // Constructor que recibe una instancia de ImpresoraSemaforo como parámetro
    public HiloPIMSemaforo(ImpresoraSemaforo impresoraSemaforo) {
        this.impresoraSemaforo = impresoraSemaforo;
    }

    // Método que se ejecuta cuando se inicia el hilo
    @Override
    public void run() {
        // Ciclo que realiza 5 iteraciones
        for (int i = 0; i < 5; i++) {
            // Llama al método imprimirPim de la instancia de ImpresoraSemaforo
            impresoraSemaforo.imprimirPim();
        }
    }
}
