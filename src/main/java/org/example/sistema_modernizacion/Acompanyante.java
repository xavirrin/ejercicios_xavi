package org.example.sistema_modernizacion;

public class Acompanyante extends RealSociedad{

    private Jugador integrante;
    private String parentesco;

    public Acompanyante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    public void animarEquipo(){
        System.out.println("BAT BI HIRU LAU BOST SEI ZAZPI, REAL!");
    }

    @Override
    public void concentrarse() {
        System.out.println("Acompañante " + getNombre() + " concentrándose para el partido");    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Sí acompañantes! Nos vamos a " + ciudad + "!");
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOOOOL!!!!!! GORA ERREALA AHIIIIIIIIIIÍ");
    }


    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String toString() {
        return "Acompanyante{" +
                "nombre=" + super.getNombre() +
                ", edad=" + super.getEdad() +
                ", integrante=" + integrante +
                ", parentesco='" + parentesco + '\'' +
                '}';
    }

}
