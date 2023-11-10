public class Main {
    public static void main(String[] args) {
        Impresora impresora = new Impresora();
        HiloPIM hiloPIM = new HiloPIM(impresora);
        HiloPAM hiloPAM = new HiloPAM(impresora);

        hiloPIM.start();
        hiloPAM.start();

        /* ImpresoraMonitor impresoraMonitor = new ImpresoraMonitor();
        HiloPIMMonitor hiloPIMMonitor = new HiloPIMMonitor(impresoraMonitor);
        HiloPAMMonitor hiloPAMMonitor = new HiloPAMMonitor(impresoraMonitor);

        hiloPIMMonitor.start();
        hiloPAMMonitor.start();
        */
    }
}
