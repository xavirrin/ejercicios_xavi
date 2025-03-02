package org.example.sistema_modernizacion;

public class ExcepcionesPersonalizadas{

    public static class AlineacionInvalida extends Exception {
        public AlineacionInvalida(String mensaje) {
            super(mensaje);
        }
    }

    public static class DorsalDuplicado extends Exception {
        public DorsalDuplicado(String mensaje) {
            super(mensaje);
        }
    }

}

