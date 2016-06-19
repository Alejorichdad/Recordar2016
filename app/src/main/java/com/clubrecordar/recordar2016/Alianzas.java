package com.clubrecordar.recordar2016;

/**
 * Created by A on 17/05/2016.
 */
public class Alianzas {

    /*
    GRUPO1
    Este es el set de datos  o implementacion de la fuente de datos para recyclerView de main Activity grupo1
     */

    private int idImagen;
    private String titulo_imagen;
    private  String beneficio;

    public Alianzas(int idImagen, String titulo_imagen, String beneficio){


        this.idImagen = idImagen;
        this.titulo_imagen = titulo_imagen;
        this.beneficio = beneficio;


       }


    public int getIdImagen(){
        return idImagen;
    }

    public String getTitulo_imagen(){
        return titulo_imagen;
    }
    public String getBeneficio(){
        return beneficio;
    }
    }

