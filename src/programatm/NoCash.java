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
public class NoCash implements ATMState {
    ATMMachine atmMachine;
    public NoCash(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }
    public void masukkanKartu() {
        System.out.println("Saldo Habis");
        System.out.println("Kartu Anda telah dikeluarkan");
    }
    public void keluarkanKartu() {
        System.out.println("Saldo Habis");
        System.out.println("Kartu Anda telah dikeluarkan");
    }
    public void requestCash(int cashToWithdraw) {
        System.out.println("Saldo Habis");
    }
    public void masukkanPin(int pinEntered) {
        System.out.println("Saldo Habis");
    }
}
