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
public class HasCard implements ATMState {
    ATMMachine atmMachine;
    public HasCard(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }
    public void masukkanKartu() {

        System.out.println("Anda hanya dapat memasukkan satu kartu");
    }
    public void keluarkanKartu() {
        System.out.println("Kartu Anda dikeluarkan");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }
    public void requestCash(int cashToWithdraw) {
        System.out.println("Anda belum memasukkan PIN");
    }
    public void masukkanPin(int pinEntered) {
        if(pinEntered == 1234){
            System.out.println("PIN yang Anda masukkan benar");
            atmMachine.correctPinEntered = true;
            atmMachine.setATMState(atmMachine.getHasPin());
        } else {
            System.out.println("PIN yang Anda masukkan salah");
            atmMachine.correctPinEntered = false;
            System.out.println("Kartu Anda dikeluarkan");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }  
    }
}