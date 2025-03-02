package org.example.sistema_modernizacion;

import java.util.ArrayList;

public class AppRealSociedad {

    public static void main(String[] args) throws ExcepcionesPersonalizadas.AlineacionInvalida, ExcepcionesPersonalizadas.DorsalDuplicado {

// crear varios jugadores para el equipo SENIOR
        Jugador jugadorZubimendi = new Jugador("Zubimendi", 24, Equipos.SENIOR, 4, Posiciones.CENTROCAMPISTA);
        Jugador jugadorKubo = new Jugador("Take Kubo", 25, Equipos.SENIOR, 14, Posiciones.DELANTERO);
        Jugador jugadorZubeldia = new Jugador("Zubeldia", 27, Equipos.SENIOR, 2, Posiciones.DEFENSA);
        Jugador jugadorRemiro = new Jugador("Remiro", 24, Equipos.SENIOR, 1, Posiciones.PORTERO);
        Jugador jugadorOyarzabal = new Jugador("Oyarzabal", 26, Equipos.SENIOR, 10, Posiciones.DELANTERO);

        //No dejará cambiar el dorsal por la excepcion DorsalDuplicado
        jugadorRemiro.setDorsal(Equipos.SENIOR, 4);

        ArrayList<RealSociedad> equipoSenior = new ArrayList<>();
        equipoSenior.add(jugadorOyarzabal);
        equipoSenior.add(jugadorRemiro);
        equipoSenior.add(jugadorKubo);
        equipoSenior.add(jugadorZubeldia);
        equipoSenior.add(jugadorZubimendi);

// crear al entrenador del equipo SENIOR
        Entrenador imanolAlguacil = new Entrenador("Imanol", 52, Equipos.SENIOR, "4-5-1");
        equipoSenior.add(imanolAlguacil);

        imanolAlguacil.setFormacionPreferida("3-3-3"); //Esto nos lanzará excepcion personalizada AlineacionInvalida

// crear a los masajistas del club
        Masajista masajistaPepe = new Masajista("Pepe", 43, "Carrera de Fisioterapia", 14);
        Masajista masajistaYolanda = new Masajista("Yolanda", 26, "Grado en Fisioterapia deportiva", 2);
        equipoSenior.add(masajistaYolanda);
        equipoSenior.add(masajistaPepe);

// crear a algún acompañante para un par de jugadores
        Acompanyante acompAntxon = new Acompanyante("Antxón", 26, jugadorOyarzabal, "amigo");
        Acompanyante acompPatxi = new Acompanyante("Patxi", 26, jugadorOyarzabal, "hermano");
        Acompanyante acompFuji = new Acompanyante("Shizuka", 51, jugadorKubo, "madre");
        equipoSenior.add(acompFuji);
        equipoSenior.add(acompAntxon);
        equipoSenior.add(acompPatxi);

        System.out.println("-----------------");
        System.out.println("\tPRESENTANDO AL EQUIPO SENIOR DE LA REAL SOCIEDAD");
        System.out.println("-----------------");

        for (RealSociedad real : equipoSenior) {
            System.out.println(real);
        }

        System.out.println("-----------------");
        System.out.println("\tEQUIPO CONCENTRÁNDOSE");
        System.out.println("-----------------");

// concentrarse()
        for (RealSociedad real : equipoSenior) {
            real.concentrarse();
        }

        System.out.println("-----------------");
        System.out.println("\tEQUIPO ENTRENANDO");
        System.out.println("-----------------");

// entrenar()
        for (RealSociedad real : equipoSenior) {
            if (real instanceof Jugador || real instanceof Entrenador){
                ((AccionesDeportivas) real).entrenar();
            }
        }

        System.out.println("-----------------");
        System.out.println("\tDANDO MASAJE A ALGÚN JUGADOR");
        System.out.println("-----------------");

// darMasaje() a algún jugador
        masajistaYolanda.darMasaje(jugadorZubimendi);

        System.out.println("-----------------");
        System.out.println("\tVIAJANDO A MADRID");
        System.out.println("-----------------");

// viajar() a Madrid
        for (RealSociedad real : equipoSenior) {
            real.viajar("Madrid");
        }

        System.out.println("-----------------");
        System.out.println("\tPLANIFICANDO ENTRENAMIENTO");
        System.out.println("-----------------");

// planificarEntrenamiento()
        for (RealSociedad real : equipoSenior) {
            if (real instanceof Entrenador){
                ((Entrenador) real).planificarEntrenamiento();
            }
        }

        System.out.println("-----------------");
        System.out.println("\tENTRENANDO");
        System.out.println("-----------------");

// entrenar()
        for (RealSociedad real : equipoSenior) {
            if (real instanceof Jugador || real instanceof Entrenador){
                ((AccionesDeportivas) real).entrenar();
            }
        }

        System.out.println("-----------------");
        System.out.println("\tDESCANSADO");
        System.out.println("-----------------");

// descansar()
        for (RealSociedad real : equipoSenior) {
            if (real instanceof Jugador) {
                ((Jugador) real).descansar((Jugador) real);
            }
        }

        System.out.println("-----------------");
        System.out.println("\tCALENTANDO");
        System.out.println("-----------------");

// calentar()
        for (RealSociedad real : equipoSenior) {
            if (real instanceof Jugador) {
                ((Jugador) real).calentar((Jugador) real);
            }
        }

        System.out.println("-----------------");
        System.out.println("\tJUGANDO PARTIDO");
        System.out.println("-----------------");
// jugarPartido()
        for (RealSociedad real : equipoSenior) {
            if (real instanceof Jugador || real instanceof Entrenador){
                ((AccionesDeportivas) real).jugarPartido("Madriz");
            }
        }

        System.out.println("-----------------");
        System.out.println("\tANIMANDO EQUIPO");
        System.out.println("-----------------");

// animarEquipo()
        for (RealSociedad real : equipoSenior) {
            if (real instanceof Acompanyante) {
                ((Acompanyante) real).animarEquipo();
            }
        }

        System.out.println("-----------------");
        System.out.println("\tHACIENDO CAMBIOS");
        System.out.println("-----------------");

// hacerCambios()
        for (RealSociedad real : equipoSenior) {
            if (real instanceof Entrenador) {
                ((Entrenador) real).hacerCambios();
            }
        }

        System.out.println("-----------------");
        System.out.println("\tMARCANDO GOL");
        System.out.println("-----------------");

// marcarGol()
        for (RealSociedad real : equipoSenior) {
            if (real instanceof Jugador) {
                ((Jugador) real).marcarGol();
            }
        }

        System.out.println("-----------------");
        System.out.println("\tCELEBRANDO GOL");
        System.out.println("-----------------");

// celebrarGol()
        for (RealSociedad real : equipoSenior) {
            real.celebrarGol();
        }

        System.out.println("-----------------");
        System.out.println("\tDANDO MASAJE A VARIOS JUGADORES");
        System.out.println("-----------------");

// darMasaje() a varios jugadores
        for (RealSociedad real : equipoSenior) {
            if (real instanceof Masajista) {
                for (RealSociedad jugador : equipoSenior) {
                    if (jugador instanceof Jugador) {
                        ((Masajista) real).darMasaje((Jugador) jugador);
                    }
                }
            }
        }

        System.out.println("-----------------");
        System.out.println("\tVOLVIENDO A DONOSTI");
        System.out.println("-----------------");

// viajar() a Donosti
        for (RealSociedad real : equipoSenior) {
            real.viajar("Donosti");
        }

        System.out.println("-----------------");
        System.out.println("\tA DESCANSAR!");
        System.out.println("-----------------");
// descansar()
        for (RealSociedad real : equipoSenior) {
            if (real instanceof Jugador) {
                ((Jugador) real).descansar((Jugador) real);
            }
        }

        System.out.println("-----------------");
        }
    }
