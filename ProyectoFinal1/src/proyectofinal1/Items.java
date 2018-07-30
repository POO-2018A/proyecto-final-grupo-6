/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1;

import java.util.Objects;

public class Items {

    private String jugador;
    private String personaje;

    public Items(String jugador, String personaje) {
        this.jugador = jugador;
        this.personaje = personaje;
    }

    public String getJugador1() {
        return jugador;
    }

    public void setJugador1(String jugador1) {
        this.jugador = jugador1;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Items other = (Items) obj;
        if (!Objects.equals(this.jugador, other.jugador)) {
            return false;
        }
        if (!Objects.equals(this.personaje, other.personaje)) {
            return false;
        }
        return true;
    }

}
