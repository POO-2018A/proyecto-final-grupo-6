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
public class ClsSayayin implements Calculos {

    public static double vida = 1500;
    public static double estamina = 700;
    public static double ataque = 100;
    public static double ataqueFinal = 300;

    /**
     * @return the vida
     */
    public static double getVida() {
        return vida;
    }

    /**
     * @param aVida the vida to set
     */
    public static void setVida(double aVida) {
        vida = aVida;
    }

    /**
     * @return the estamina
     */
    public static double getEstamina() {
        return estamina;
    }

    /**
     * @param aEstamina the estamina to set
     */
    public static void setEstamina(double aEstamina) {
        estamina = aEstamina;
    }

    /**
     * @return the ataque
     */
    public static double getAtaque() {
        return ataque;
    }

    /**
     * @param aAtaque the ataque to set
     */
    public static void setAtaque(double aAtaque) {
        ataque = aAtaque;
    }

    /**
     * @return the ataqueFinal
     */
    public static double getAtaqueFinal() {
        return ataqueFinal;
    }

    /**
     * @param aAtaqueFinal the ataqueFinal to set
     */
    public static void setAtaqueFinal(double aAtaqueFinal) {
        ataqueFinal = aAtaqueFinal;
    }

    ClsSayayin(double ataque) {

        this.ataque = ataque;

    }

    @Override
    public double CalcularAtaque() {

        return getEstamina() - (0.05 * getEstamina());
    }

    @Override
    public double CalcularDefensa() {
        return getEstamina() - (getEstamina() * 0.25);
    }

    @Override
    public double CalcularAtaqueFinal() {
        return getEstamina() - (0.5 * getEstamina());
    }

    @Override
    public double CalcularCurar() {
        return getVida() + (getVida() * 0.20);
    }

    @Override
    public double CalcularAtaqueReducir() {
        return getVida() - getAtaque();
    }

}
