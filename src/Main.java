public class Main {
    public static void main(String[] args) {
        /*
        // Crear una instancia de Impresora
        Impresora impresora = new Impresora();

        // Crear hilos para imprimir "PIM" y "PAM" usando la instancia de Impresora
        HiloPIM hiloPIM = new HiloPIM(impresora);
        HiloPAM hiloPAM = new HiloPAM(impresora);

        // Iniciar los hilos
        hiloPIM.start();
        hiloPAM.start();
        */

        /*
        // Crear una instancia de ImpresoraMonitor
        ImpresoraMonitor impresoraMonitor = new ImpresoraMonitor();

        // Crear hilos para imprimir "PIM" y "PAM" usando la instancia de ImpresoraMonitor
        HiloPIMMonitor hiloPIMMonitor = new HiloPIMMonitor(impresoraMonitor);
        HiloPAMMonitor hiloPAMMonitor = new HiloPAMMonitor(impresoraMonitor);

        // Iniciar los hilos
        hiloPIMMonitor.start();
        hiloPAMMonitor.start();
        */

        // Crear una instancia de ImpresoraSemaforo
        ImpresoraSemaforo impresoraSemaforo = new ImpresoraSemaforo();

        // Crear hilos para imprimir "PIM" y "PAM" usando la instancia de ImpresoraSemaforo
        HiloPIMSemaforo hiloPIMSemaforo = new HiloPIMSemaforo(impresoraSemaforo);
        HiloPAMSemaforo hiloPAMSemaforo = new HiloPAMSemaforo(impresoraSemaforo);

        // Iniciar los hilos
        hiloPIMSemaforo.start();
        hiloPAMSemaforo.start();
    }
}
