package org.example.sistema_modernizacion;

public class Entrenador extends RealSociedad implements AccionesDeportivas{

    private Equipos equipo;
    private String formacionPreferida; //ej: 4-3-3

    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) throws ExcepcionesPersonalizadas.AlineacionInvalida {
        super(nombre, edad);
        this.equipo = equipo;
        if (validarFormacion(formacionPreferida)) {
            this.formacionPreferida = formacionPreferida;
        } else {
            throw new ExcepcionesPersonalizadas.AlineacionInvalida("Alineación incorrecta. Debe ser N-N-N.");
        }
    }

    public void planificarEntrenamiento(){
        System.out.println("Planificando entrenamiento... Como se entrena se juega!");
    }

    public void hacerCambios(){
        System.out.println("Mbappé nos está haciendo demasiado daño, hay que hacer cambios.");
    }

    @Override
    public void concentrarse() {
        System.out.println("Entrenador " + getNombre() + " concentrándose para el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Sí entrenador! Nos vamos a " + ciudad + "!");
    }

    @Override
    public void celebrarGol() {
        System.out.println("Golazo!!! No os confiéis chavales! A seguir!");

    }

    @Override
    public void entrenar() {
        System.out.println("A entrenar todo el mundo!");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Haced lo que sabéis chavales! Reventad al " + rival);
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) throws ExcepcionesPersonalizadas.AlineacionInvalida {
        if (validarFormacion(formacionPreferida)) {
            this.formacionPreferida = formacionPreferida;
        } else {
            throw new ExcepcionesPersonalizadas.AlineacionInvalida("Alineación incorrecta. Debe ser N-N-N.");
        }
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    private boolean validarFormacion(String formacion) {
        String[] partes = formacion.split("-");
        if (partes.length != 3) {
            return false;
        }

        try {
            int num1 = Integer.parseInt(partes[0]);
            int num2 = Integer.parseInt(partes[1]);
            int num3 = Integer.parseInt(partes[2]);

            return (num1 + num2 + num3) == 10;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "nombre=" + super.getNombre() +
                ", edad=" + super.getEdad() +
                ", equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }

}
