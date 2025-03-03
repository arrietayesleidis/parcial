/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import Clases.Automovil;

/**
 *
 * @author Carlitos
 */
public class Principal {

    
    public static void main(String[] args) {
        Automovil miAuto = new Automovil(
            "2024-03-14",
            "ABC123456789",
            "MOT987654321",
            "Toyota",
            "Corolla",
            25000.00
        );
        
        miAuto.mostrarDatos();
    
    }
    
}
