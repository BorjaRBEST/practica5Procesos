public class Impresora {
    private boolean imprimirPim = true; // Bandera para controlar la impresión de "PIM"

    // Método para imprimir "PIM"
    public void imprimirPim() {
        try {
            // Espera activa hasta que imprimirPim sea true
            while (!imprimirPim) {
                // Espera activa (interrumpe el hilo por un breve tiempo para liberar recursos)
                Thread.sleep(10);
            }
            System.out.println("PIM");
            Thread.sleep(1000); // Simula el proceso de impresión
            imprimirPim = false; // Cambia la bandera para indicar que ahora se puede imprimir "PAM"
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Método para imprimir "PAM"
    public void imprimirPam() {
        try {
            // Espera activa hasta que imprimirPim sea false
            while (imprimirPim) {
                // Espera activa (interrumpe el hilo por un breve tiempo para liberar recursos)
                Thread.sleep(10);
            }
            System.out.println("PAM");
            Thread.sleep(1000); // Simula el proceso de impresión
            imprimirPim = true; // Cambia la bandera para indicar que ahora se puede imprimir "PIM"
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
