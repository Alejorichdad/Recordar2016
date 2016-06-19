package com.clubrecordar.recordar2016;

/**
 * GRUPO 2
 * Esta es la fuente de datos de la Activity dos, AlianzasNacionales
 * Created by A on 31/05/2016.
 */
public class DatosAlianzasNacionales {

    private int idImagen;
    private String titulo_imagen;
    private  String beneficio;

    public DatosAlianzasNacionales(int idImagen, String titulo_imagen, String beneficio){


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

