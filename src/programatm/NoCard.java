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
public class NoCard implements ATMState {
    ATMMachine atmMachine;
    public NoCard(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }
    public void masukkanKartu() {
        System.out.println("Masukkan pin Anda ");
        atmMachine.setATMState(atmMachine.getYesCardState());
    }
    public void keluarkanKartu() {
        System.out.println("Anda tidak memasukkan kartu");
    }
    public void requestCash(int cashToWithdraw) {
        System.out.println("Anda belum memasukkan kartu");
    }
    public void masukkanPin(int pinEntered) {
        System.out.println("Anda belum memasukkan kartu");
    }
}