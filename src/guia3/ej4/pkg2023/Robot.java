/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.ej4.pkg2023;

/**
 *
 * @author Renzo
 */
public class Robot {

    private Bateria bateria;
    private boolean dormido;

    public Robot() {
        this.bateria = new Bateria(1000);
        this.dormido = false;
    }

    public void avanzar(int pasos) {
        int energiaPerdida = (pasos / 100) * 10;
        if (!dormido) {
            if (bateria.getCarga() >= energiaPerdida) {
                bateria.setCarga(bateria.getCarga() - energiaPerdida);
                System.out.println("Se ha avanzado pasos: " + pasos);
            } else {
                System.out.println("No se puede avanzar. Unidades de bateria: " + bateria.getCarga());
            }
        } else {
            System.out.println("El robot está dormido");
        }
    }

    public void retrocer(int pasos) {
        int energiaPerdida = (pasos / 100) * 10;
        if (!dormido) {
            if (bateria.getCarga() >= energiaPerdida) {
                bateria.setCarga(bateria.getCarga() - energiaPerdida);
                System.out.println("Se ha retrocedido pasos: " + pasos);
            } else {
                System.out.println("No se puede avanzar. Unidades de bateria: " + bateria.getCarga());
            }
        } else {
            System.out.println("El robot está dormido");
        }
    }

    public boolean dormido(boolean dormido) {
        return dormido;
    }

    public boolean despertar(boolean despertar) {
        return dormido;
    }

    public int informeDeBateria() {
        return bateria.getCarga();
    }
}
