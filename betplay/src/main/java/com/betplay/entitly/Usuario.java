package com.betplay.entitly;

import java.util.List;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String contraseña;
    private Rol rol;

}

public class Rol {
    private int id;
    private String nombre;
    private List<Permiso> permisos;

    public Rol(int id, String nombre, List<Permiso> permisos) {
        this.id = id;
        this.nombre = nombre;
        this.permisos = permisos;
    }


}