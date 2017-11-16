package GasPump;

import AbstractPump.AbstractPump;
import InputProcessor.IPGasPump1;

public class GasPump1 extends GasPump {
    public GasPump1(AbstractPump af) {
        super(af);
    }

    @Override
    public void printOperations() {
    	System.out.println("---------------------------------------");
    	System.out.println("Select number:");
        System.out.println("0. Activate(float a, float b) ");
        System.out.println("1. Start ");
        System.out.println("2. PayCredit ");
        System.out.println("3. Approve ");
        System.out.println("4. Reject");
        System.out.println("5. RegularGas ");
        System.out.println("6. SuperGas ");
        System.out.println("7. Cancel ");
        System.out.println("8. StartPump ");
        System.out.println("9. PumpGallon ");
        System.out.println("s. StopPump ");
        System.out.println("q. Quit");
        System.out.println("----------------------------------------");
    }

    public void Activate(Float a, Float b) {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.Activate(a, b);
    }

    public void Start() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.Start();
    }

    public void PayCredit() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.PayCredit();
    }

    public void Approve() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.Approve();
    }

    public void Reject() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.Reject();
    }

    public void Regular() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.Regular();
    }

    public void Super() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.Super();
    }

    public void Cancel() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.Cancel();
    }

    public void StartPump() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.StartPump();
    }

    public void PumpGallon() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.PumpGallon();
    }

    public void StopPump() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.StopPump();
    }
}
