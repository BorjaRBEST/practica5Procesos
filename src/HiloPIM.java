public class HiloPIM extends Thread {
    private Impresora impresora;

    // Constructor que recibe una instancia de Impresora como parámetro
    public HiloPIM(Impresora impresora) {
        this.impresora = impresora;
    }

    // Método que se ejecuta cuando se inicia el hilo
    @Override
    public void run() {
        // Ciclo que realiza 5 iteraciones
        for (int i = 0; i < 5; i++) {
            // Llama al método imprimirPim de la instancia de Impresora
            impresora.imprimirPim();
        }
    }
}
