package com.betplay.entitly;

import java.util.Date;

public class Permiso {
    private int id;
    private String descripcion;

    public Permiso(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
}



public class Patrocinador {
    private int id;
    private String nombre;
    private String tipo;
    private double monto;
    private Date fechaInicio;
    private Date fechaFin;

    public Patrocinador(int id, String nombre, String tipo, double monto, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.monto = monto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
}
    