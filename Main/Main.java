package Main;
import AbstractPump.*;
import GasPump.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select GP-1 or GP-2: ");
        System.out.println("1. GP-1");
        System.out.println("2. GP-2");
        System.out.print("Select GP: ");

        int pump_type;
        String input = "initial";
        try {
            pump_type = Integer.parseInt(sc.readLine());
            switch (pump_type) {
                case 1: {
                    ConcretePump1 cf1 = new ConcretePump1();
                    GasPump1 gp1 = new GasPump1(cf1);
                    System.out.println("GasPump1 selected. Please enter 0 to activate the system.");
                    while (!input.equals("q")) {
                        gp1.printOperations();
                        input = sc.readLine();
                        switch (input) {
                            case "0": {
                                System.out.println("Operation: Activate(float a, float b)");
                                float a, b;
                                System.out.println("Enter the value of price a: ");
                                try {
                                    a = Float.parseFloat(sc.readLine());
                                    System.out.println("Enter the value of price b: ");
                                    b = Float.parseFloat(sc.readLine());
                                    gp1.Activate(a, b);
                                    System.out.println("Select 1 to start.");
                                } 
                                catch (NumberFormatException e) {
                                    System.out.println("ERROR. Price type must be float.");
                                }
                                break;
                            }
                            case "1": {
                                System.out.println("Operation: Start()");
                                gp1.Start();
                                break;
                            }
                            case "2": {
                                System.out.println("Operation: PayCredit()");
                                gp1.PayCredit();
                                break;
                            }
                            case "3": {
                                System.out.println("Operation: Approve()");
                                gp1.Approve();
                                break;
                            }
                            case "4": {
                                System.out.println("Operation: Reject()");
                                gp1.Reject();
                                break;
                            }
                            case "5": {
                                System.out.println("Operation: RegularGas()");
                                gp1.Regular();
                                break;
                            }
                            case "6": {
                                System.out.println("Operation: SuperGas()");
                                gp1.Super();
                                break;
                            }
                            case "7": {
                                System.out.println("Operation: Cancel()");
                                gp1.Cancel();
                                break;
                            }
                            case "8": {
                                System.out.println("Operation: StartPump()");
                                gp1.StartPump();
                                break;
                            }
                            case "9": {
                                System.out.println("Operation: PumpGallon()");
                                gp1.PumpGallon();
                                break;
                            }
                            case "s": {
                                System.out.println("Operation: StopPump()");
                                gp1.StopPump();
                                break;
                            }
                            case "q": {
                                break;
                            }
                            default: {
                                System.out.println("ERROR, no such operation: '" + input + "'");
                                System.out.println("Please select an operation again");
                                break;
                            }
                        }
                    } 
                    System.out.println("System quit");
                    break;
                } 
                case 2: {
                    ConcretePump2 cf2 = new ConcretePump2();
                    GasPump2 gp2 = new GasPump2(cf2);
                    System.out.println("GasPump2 selected. Please enter 0 to activate the system.");
                    while (!input.equals("q")) {
                        gp2.printOperations();
                        input = sc.readLine();
                        switch (input) {
                            case "0": {
                                System.out.println("Operation: Activate(int a, int b, int c)");
                                int a, b, c;
                                System.out.println("Enter the value of price a: ");
                                try {
                                    a = Integer.parseInt(sc.readLine());
                                    System.out.println("Enter the value of price b: ");
                                    b = Integer.parseInt(sc.readLine());
                                    System.out.println("Enter the value of price c: ");
                                    c = Integer.parseInt(sc.readLine());
                                    gp2.Activate(a, b, c);
                                    System.out.println("Enter 1 to Start");
                                } catch (NumberFormatException e) {
                                    System.out.println("ERROR. Price type must be integer.");
                                }
                                break;
                            }
                            case "1": {
                                System.out.println("Operation: Start()");
                                gp2.Start();
                                break;
                            }
                            case "2": {
                                System.out.println("Operation: Pay Cash()");
                                System.out.println("please insert cash : ");
                                try {
                                    float cash = Float.parseFloat(sc.readLine());
                                    gp2.PayCash(cash);
                                } catch (NumberFormatException e) {
                                    System.out.println("ERROR. Invalid amount");
                                }
                                break;
                            }
                            case "3": {
                                System.out.println("Operation: RegularGas()");
                                gp2.Regular();
                                break;
                            }
                            case "4": {
                                System.out.println("Operation: SuperGas()");
                                gp2.Super();
                                break;
                            }
                            case "5": {
                                System.out.println("Operation: PremiumGas()");
                                gp2.Premium();
                                break;
                            }
                            case "6": {
                                System.out.println("Operation: Cancel()");
                                gp2.Cancel();
                                break;
                            }
                            case "7": {
                                System.out.println("Operation: StartPump()");
                                gp2.StartPump();
                                break;
                            }
                            case "8": {
                                System.out.println("Operation: PumpLiter()");
                                gp2.PumpLiter();
                                break;
                            }
                            case "s": {
                                System.out.println("Operation: StopPump()");
                                gp2.Stop();
                                break;
                            }
                            case "p": {
                                System.out.println("Operation: PrintReceipt()");
                                gp2.Receipt();
                                break;
                            }
                            case "n": {
                                System.out.println("Operation: NoReceipt()");
                                gp2.NoReceipt();
                                break;
                            }
                            case "q": {
                                break;
                            }
                            default: {
                                System.out.println("ERROR, no such operation: '" + input + "'");
                                System.out.println("Please enter an operation again");
                                break;
                            }
                        }
                    } 
                    System.out.println("System quit");
                    break;
                } 
                default: {
                    System.out.println("Invalid input, please try again");
                    System.exit(1);
                }

            }
        } catch (IOException ioe) {
            System.out.println("IO Error. System quit");
            System.exit(1);
        }
    }
}