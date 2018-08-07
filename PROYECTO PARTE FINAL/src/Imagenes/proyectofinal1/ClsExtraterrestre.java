/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1;

/**
 *
 * @author ADMIN-MINEDUC
 */
public class ClsExtraterrestre implements Calculos {

    public static double vida = 1000;
    public static double estamina = 500;
    public static double ataque = 80;
    public static double ataqueFinal = 200;

    ClsExtraterrestre(double ataque) {
        this.ataque = ataque;
    }

    public static double getVida() {
        return vida;
    }

    public static void setVida(double vida) {
        ClsExtraterrestre.vida = vida;
    }

    public static double getEstamina() {
        return estamina;
    }

    public static void setEstamina(double estamina) {
        ClsExtraterrestre.estamina = estamina;
    }

    public static double getAtaque() {
        return ataque;
    }

    public static void setAtaque(double ataque) {
        ClsExtraterrestre.ataque = ataque;
    }

    public static double getAtaqueFinal() {
        return ataqueFinal;
    }

    public static void setAtaqueFinal(double ataqueFinal) {
        ClsExtraterrestre.ataqueFinal = ataqueFinal;
    }

    @Override
    public double CalcularAtaque() {
        return estamina - (0.05 * estamina);
    }

    @Override
    public double CalcularDefensa() {
        return estamina - (estamina * 0.25);
    }

    @Override
    public double CalcularAtaqueFinal() {
        return estamina - (0.5 * estamina);
    }

    @Override
    public double CalcularCurar() {
        return vida + (vida * 0.20);
    }

    @Override
    public double CalcularAtaqueReducir() {
        return vida - ataque;
    }

}
