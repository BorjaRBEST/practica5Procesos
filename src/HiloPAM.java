public class HiloPAM extends Thread {
   final private Impresora impresora;

    // Constructor que recibe una instancia de Impresora como parámetro
    public HiloPAM(Impresora impresora) {
        this.impresora = impresora;
    }

    // Método que se ejecuta cuando se inicia el hilo
    @Override
    public void run() {
        // Ciclo que realiza 5 iteraciones
        for (int i = 0; i < 5; i++) {
            // Llama al método imprimirPam de la instancia de Impresora
            impresora.imprimirPam();
        }
    }
}