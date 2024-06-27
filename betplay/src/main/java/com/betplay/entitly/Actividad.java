package com.betplay.entitly;

import java.util.Date;
import java.util.List;

public class Entrenamiento {
    private int id;
    private Equipo equipo;
    private Date fecha;
    private String hora;
    private String lugar;
    private List<Jugador> jugadoresConvocados;
    private List<Actividad> actividades;
    
}

public class Actividad {
    private int id;
    private String descripcion;
    private int duracion;

    public Actividad(int id, String descripcion, int duracion) {
        this.id = id;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }
}