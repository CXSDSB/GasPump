package GasPump;

import AbstractPump.AbstractPump;
import InputProcessor.IPGasPump2;

public class GasPump2 extends GasPump {
    public GasPump2(AbstractPump af) {
        super(af);
    }

    @Override
    public void printOperations() {
        System.out.println("---------------------------------------");
        System.out.println("Select number:");
        System.out.println("0. Activate(int a, int b, int c)");
        System.out.println("1. Start ");
        System.out.println("2. PayCash ");
        System.out.println("3. RegularGas ");
        System.out.println("4. SuperGas ");
        System.out.println("5. PremiumGas ");
        System.out.println("6. Cancel ");
        System.out.println("7. StartPump ");
        System.out.println("8. PumpLiter ");
        System.out.println("s. StopPump ");
        System.out.println("p. PrintReceipt ");
        System.out.println("n. NoReceipt ");
        System.out.println("q. Quit");
        System.out.println("---------------------------------------");
    }

    public void Activate(Integer a, Integer b, Integer c) {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Activate(a, b, c);
    }

    public void Start() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Start();
    }

    public void PayCash(Float cash) {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.PayCash(cash);
    }

    public void Cancel() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Cancel();
    }

    public void Regular() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Regular();
    }

    public void Super() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Super();
    }

    public void Premium() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Premium();
    }

    public void StartPump() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.StartPump();
    }

    public void PumpLiter() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.PumpLiter();
    }

    public void Stop() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Stop();
    }

    public void Receipt() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Receipt();
    }

    public void NoReceipt() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.NoReceipt();
    }
}
