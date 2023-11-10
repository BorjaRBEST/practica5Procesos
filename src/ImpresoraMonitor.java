public class ImpresoraMonitor {
    private boolean turnoPim = true; // Bandera para controlar el turno de impresión

    // Método sincronizado para imprimir "PIM"
    public synchronized void imprimirPim() {
        try {
            // Mientras no sea el turno de imprimir "PIM", espera
            while (!turnoPim) {
                wait();
            }
            System.out.println("MONITOR PIM");
            Thread.sleep(1000); // Simula el proceso de impresión
            turnoPim = false; // Cambia el turno para indicar que ahora es el turno de imprimir "PAM"
            notify(); // Notifica a los hilos en espera que el turno ha cambiado
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Método sincronizado para imprimir "PAM"
    public synchronized void imprimirPam() {
        try {
            // Mientras sea el turno de imprimir "PIM", espera
            while (turnoPim) {
                wait();
            }
            System.out.println("MONITOR PAM");
            Thread.sleep(1000); // Simula el proceso de impresión
            turnoPim = true; // Cambia el turno para indicar que ahora es el turno de imprimir "PIM"
            notify(); // Notifica a los hilos en espera que el turno ha cambiado
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
