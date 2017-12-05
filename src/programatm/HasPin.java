/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programatm;

/**
 *
 * @author ASUS
 */
public class HasPin implements ATMState {
    ATMMachine atmMachine;
    public HasPin(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }
    public void masukkanKartu() {
        System.out.println("Anda telah memasukkan kartu");
    }
    public void keluarkanKartu() {
        System.out.println("Kartu Anda dikeluarkan");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }
    public void requestCash(int cashToWithdraw) {
        if(cashToWithdraw > atmMachine.cashInMachine){
            System.out.println("You don't have that much cash available");
            System.out.println("Kartu Anda dikeluarkan");
            atmMachine.setATMState(atmMachine.getNoCardState());
        } else {
            System.out.println(cashToWithdraw + " is provided by the machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
            System.out.println("Kartu Anda dikeluarkan");
            atmMachine.setATMState(atmMachine.getNoCardState());
            if(atmMachine.cashInMachine <= 0){
                atmMachine.setATMState(atmMachine.getNoCashState());
            }
        }
    }
    public void masukkanPin(int pinEntered) {
        System.out.println("Anda sudah memasukkan pin");
    } 
}
