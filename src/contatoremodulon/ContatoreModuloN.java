/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contatoremodulon;

/**
 *
 * @author moham
 */
public class ContatoreModuloN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
public class ContatoreModuloN {
    private int valore;
    private int modulo;

    public ContatoreModuloN(int modulo) {
        this.valore = 0;
        this.modulo = modulo;
    }

    public void incrementa() {
        valore = (valore + 1) % modulo;
    }

    public int getValore() {
        return valore;
    }
}

