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
public class ProgramAtm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        ATMMachine atmMachine = new ATMMachine();
        atmMachine.masukkanKartu();
        atmMachine.keluarkanKartu();
        atmMachine.masukkanKartu();
        atmMachine.masukkanPin(1234);
        atmMachine.requestCash(2000);
        atmMachine.masukkanKartu();
        atmMachine.masukkanPin(1234);
    }  
}