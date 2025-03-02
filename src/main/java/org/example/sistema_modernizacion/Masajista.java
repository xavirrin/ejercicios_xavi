package org.example.sistema_modernizacion;

public class Masajista extends RealSociedad{

    private String titulacion;
    private int anyosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anyosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anyosExperiencia = anyosExperiencia;
    }

    public Masajista(String nombre, int edad) {
        super(nombre, edad);
    }

    public void darMasaje(Jugador jugador){
        System.out.println("Relájate " + jugador.getNombre() + ". Vas a notar un poco de dolor... KRAKKKKKK");
    }

    @Override
    public void concentrarse() {
        System.out.println("Masajista " +getNombre() + " concentrándose para el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Sí masajistas! Nos vamos a " + ciudad + "!");
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOOOOL!!!!!! GORA ERREALA AHIIIIIIIIIIÍ");
    }


    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }


    @Override
    public String toString() {
        return "Masajista{" +
                "nombre=" + super.getNombre() +
                ", edad=" + super.getEdad() +
                ", titulacion='" + titulacion + '\'' +
                ", anyosExperiencia=" + anyosExperiencia +
                '}';
    }

}
