/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteInicial;

/**
 *
 * @author anna
 */
public class FacadeEstudiants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HomeCinemaFacade cine = new HomeCinemaFacade();
        cine.veurePelicula("Star Wars");
        cine.acabarPelicula();
        cine.escoltarCD("ABBA");
        cine.acabarCD();
        cine.escoltarRadio(92.5);
        cine.acabarRadio();
    }
    
}
