package org.example.sistema_modernizacion;

import java.util.ArrayList;

public class Jugador extends RealSociedad implements AccionesDeportivas{

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    private static ArrayList<Jugador> jugadores = new ArrayList<>();

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) throws ExcepcionesPersonalizadas.DorsalDuplicado {
        super(nombre, edad);
        this.categoria = categoria;
        this.dorsal = dorsal;
        verificarDorsal(categoria, dorsal);
        this.posicion = posicion;
        jugadores.add(this);
    }

    public void calentar(Jugador jugador){
        System.out.println(jugador.getNombre() + " calentando para el partido...");
    }

    public void descansar(Jugador jugador){
        System.out.println(jugador.getNombre() + " se va a descansar.");
    }

    public void marcarGol(){
        System.out.println("SIIIIIIIIIIIUUUUUUUUUUUUUUUUU!!! YO! AQUÍ! -->" + getDorsal() + "<--" );
    }

    @Override
    public void concentrarse() {
        System.out.println("Jugador " + getNombre() + " concentrándose para el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Sí jugadores! Nos vamos a " + ciudad + "!");
    }

    @Override
    public void celebrarGol() {
        System.out.println("VAMOOOOOSSSSSSSSS GORA ERREALA AHÍ!!!");
    }

    @Override
    public void entrenar() {
        System.out.println("Jugadores a entrenar! Que el partido no se gana solo!");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Vamos a jugar chavales! El " + rival + " está muerto!!!");
    }

    private void verificarDorsal(Equipos categoria, int dorsal) throws ExcepcionesPersonalizadas.DorsalDuplicado {
        for (Jugador j : jugadores) {
            if (j.categoria == categoria && j.dorsal == dorsal) {
                throw new ExcepcionesPersonalizadas.DorsalDuplicado("El dorsal " + dorsal + " ya está ocupado en el equipo " + categoria);
            }
        }
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(Equipos categoria, int nuevoDorsal) {
        try {
            verificarDorsal(categoria, nuevoDorsal);
            this.dorsal = nuevoDorsal;
            System.out.println("Dorsal cambiado con éxito.");
        } catch (ExcepcionesPersonalizadas.DorsalDuplicado e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre=" + super.getNombre() +
                ", edad=" + super.getEdad() +
                ", categoria=" + categoria +
                ", dorsal=" + dorsal +
                ", posicion=" + posicion +
                '}';
    }

}
