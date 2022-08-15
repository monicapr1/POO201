/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Monica Padilla
 */
public class autos {
    public class auto{
        String fabrica= "Chevrolet";
        int n_puertas=5;
        int modelo= 2002;
    }
    public int acelera(){
        System.out.println("run run");
        return 0;
    }
    public static void main(String[] args) {
        autos chevy = new autos();
        System.out.println("Hola");
    }
}
