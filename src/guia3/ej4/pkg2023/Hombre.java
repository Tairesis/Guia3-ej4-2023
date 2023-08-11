/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.ej4.pkg2023;


public class Hombre {
    //Robot robot = new Robot();
    
    public void jugarConRobot(Robot robot){
        robot.avanzar(500);
        robot.retrocer(20);
        robot.dormido(true);
        robot.despertar(false);
    }
}