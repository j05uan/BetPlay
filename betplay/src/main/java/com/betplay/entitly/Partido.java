package com.betplay.entitly;

import java.sql.Date;
import java.util.List;



public class Partido {
    private int id;
    private String equipoLoca;
    private String equipoVisitante;
    private Date fecha;
    private List<Gol> listGoles;
    private List<Tarjeta> listTarjetas;
    private List<Incidente> listIncidentes;
    private Resultado resultado;



}
