/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.ej4.pkg2023;

/**
 *
 * @author Marco
 */
public class Guia3Ej42023 {  

    public static void main(String[] args) {
        Hombre hombre = new Hombre();
        Hombre hombre2= new Hombre();
        
        //comentario para chequear el push de github desktop
        Robot robot=new Robot();
        System.out.println("Bateria Robot: "+robot.informeDeBateria());
        
        hombre.jugarConRobot(robot);
        System.out.println("Bateria Robot: "+robot.informeDeBateria());
        hombre2.jugarConRobot(robot);
        
    }
    
}
