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
public interface ATMState {
    void masukkanKartu();
    void keluarkanKartu();
    void masukkanPin(int pinEntered);
    void requestCash(int cashToWithdraw);    
}