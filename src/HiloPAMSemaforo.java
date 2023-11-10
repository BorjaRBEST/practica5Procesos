
public class HiloPAMSemaforo extends Thread {
    private ImpresoraSemaforo impresoraSemaforo;

    // Constructor que recibe una instancia de ImpresoraSemaforo como parámetro
    public HiloPAMSemaforo(ImpresoraSemaforo impresoraSemaforo) {
        this.impresoraSemaforo = impresoraSemaforo;
    }

    // Método que se ejecuta cuando se inicia el hilo
    @Override
    public void run() {
        // Ciclo que realiza 5 iteraciones
        for (int i = 0; i < 5; i++) {
            // Llama al método imprimirPam de la instancia de ImpresoraSemaforo
            impresoraSemaforo.imprimirPam();
        }
    }
}
