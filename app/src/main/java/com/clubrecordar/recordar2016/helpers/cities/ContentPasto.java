package com.clubrecordar.recordar2016.helpers.cities;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.PastoModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willians on 30/7/16.
 */
public class ContentPasto {
    public static List<PastoModel> contentPasto =  new ArrayList<>();

    public static String titulo1 = "item title pasto 1";
    public static String description1 = "item description pasto 1";

    public static String titulo2 = "item title pasto 2";
    public static String description2 = "item description pasto 2";

    public static String titulo3 = "item title pasto 3";
    public static String description3 = "item description pasto 3";

    public static String titulo4 = "item title pasto 4";
    public static String description4 = "item description pasto 4";

    public static String titulo5 = "item title pasto 5";
    public static String description5 = "item description pasto 5";

    public static String titulo6 = "item title pasto 6";
    public static String description6 = "item description pasto 6";

    public static String titulo7 = "item title pasto 7";
    public static String description7 = "item description pasto 7";

    public static String titulo8 = "item title pasto 8";
    public static String description8 = "item description pasto 8";

    public static String titulo9 = "item title pasto 9";
    public static String description9 = "item description pasto 9";

    public static String titulo10 = "item title pasto 10";
    public static String description10 = "item description pasto 10";

    public static String titulo11 = "item title pasto 11";
    public static String description11 = "item description pasto 11";

    public static String titulo12 = "item title pasto 12";
    public static String description12 = "item description pasto 12";

    public static String titulo13 = "item title pasto 13";
    public static String description13 = "item description pasto 13";

    public static String titulo14 = "item title pasto 14";
    public static String description14 = "item description pasto 14";

    public static String titulo15 = "item title pasto 15";
    public static String description15 = "item description pasto 15";

    public static void addContentPasto(){
        contentPasto.add(new PastoModel(R.drawable.a_nacional, titulo1, description1));
        contentPasto.add(new PastoModel(R.drawable.ingles, titulo2, description2));
        contentPasto.add(new PastoModel(R.drawable.tienda, titulo3, description3));
        contentPasto.add(new PastoModel(R.drawable.a_nacional, titulo4, description4));
        contentPasto.add(new PastoModel(R.drawable.ingles, titulo5, description5));
        contentPasto.add(new PastoModel(R.drawable.tienda, titulo6, description6));
        contentPasto.add(new PastoModel(R.drawable.a_nacional, titulo7, description7));
        contentPasto.add(new PastoModel(R.drawable.a_nacional, titulo8, description8));
        contentPasto.add(new PastoModel(R.drawable.a_nacional, titulo9, description9));
        contentPasto.add(new PastoModel(R.drawable.a_nacional, titulo10, description10));
        contentPasto.add(new PastoModel(R.drawable.a_nacional, titulo11, description11));
        contentPasto.add(new PastoModel(R.drawable.a_nacional, titulo12, description12));
        contentPasto.add(new PastoModel(R.drawable.a_nacional, titulo13, description13));
        contentPasto.add(new PastoModel(R.drawable.a_nacional, titulo14, description14));
        contentPasto.add(new PastoModel(R.drawable.a_nacional, titulo15, description15));
    }

    public static List<PastoModel> getContentPasto(){

        addContentPasto();
        return contentPasto;
    }
}
