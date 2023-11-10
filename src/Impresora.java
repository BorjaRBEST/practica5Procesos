public class Impresora {
    private boolean imprimirPim = true;

    public void imprimirPim() {
        try {
            while (!imprimirPim) {
                // Espera activa
                Thread.sleep(10);
            }
            System.out.println("PIM");
            Thread.sleep(1000);
            imprimirPim = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void imprimirPam() {
        try {
            while (imprimirPim) {
                // Espera activa
                Thread.sleep(10);
            }
            System.out.println("PAM");
            Thread.sleep(1000);
            imprimirPim = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
