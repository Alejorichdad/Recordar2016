package com.clubrecordar.recordar2016.helpers.cities;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.ValleModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willians on 30/7/16.
 */
public class ContentValle {
    public static List<ValleModel> contentValle =  new ArrayList<>();

    public static String titulo1 = "item title valle 1";
    public static String description1 = "item description valle 1";

    public static String titulo2 = "item title valle 2";
    public static String description2 = "item description valle 2";

    public static String titulo3 = "item title valle 3";
    public static String description3 = "item description valle 3";

    public static String titulo4 = "item title valle 4";
    public static String description4 = "item description valle 4";

    public static String titulo5 = "item title valle 5";
    public static String description5 = "item description valle 5";

    public static String titulo6 = "item title valle 6";
    public static String description6 = "item description valle 6";

    public static String titulo7 = "item title valle 7";
    public static String description7 = "item description valle 7";

    public static String titulo8 = "item title valle 8";
    public static String description8 = "item description valle 8";

    public static String titulo9 = "item title valle 9";
    public static String description9 = "item description valle 9";

    public static String titulo10 = "item title valle 10";
    public static String description10 = "item description valle 10";

    public static String titulo11 = "item title valle 11";
    public static String description11 = "item description valle 11";

    public static String titulo12 = "item title valle 12";
    public static String description12 = "item description valle 12";

    public static String titulo13 = "item title valle 13";
    public static String description13 = "item description valle 13";

    public static String titulo14 = "item title valle 14";
    public static String description14 = "item description valle 14";

    public static String titulo15 = "item title valle 15";
    public static String description15 = "item description valle 15";

    public static void addContentValle(){
        contentValle.add(new ValleModel(R.drawable.a_nacional, titulo1, description1));
        contentValle.add(new ValleModel(R.drawable.ingles, titulo2, description2));
        contentValle.add(new ValleModel(R.drawable.tienda, titulo3, description3));
        contentValle.add(new ValleModel(R.drawable.a_nacional, titulo4, description4));
        contentValle.add(new ValleModel(R.drawable.ingles, titulo5, description5));
        contentValle.add(new ValleModel(R.drawable.tienda, titulo6, description6));
        contentValle.add(new ValleModel(R.drawable.a_nacional, titulo7, description7));
        contentValle.add(new ValleModel(R.drawable.a_nacional, titulo8, description8));
        contentValle.add(new ValleModel(R.drawable.a_nacional, titulo9, description9));
        contentValle.add(new ValleModel(R.drawable.a_nacional, titulo10, description10));
        contentValle.add(new ValleModel(R.drawable.a_nacional, titulo11, description11));
        contentValle.add(new ValleModel(R.drawable.a_nacional, titulo12, description12));
        contentValle.add(new ValleModel(R.drawable.a_nacional, titulo13, description13));
        contentValle.add(new ValleModel(R.drawable.a_nacional, titulo14, description14));
        contentValle.add(new ValleModel(R.drawable.a_nacional, titulo15, description15));
    }

    public static List<ValleModel> getContentValle(){

        addContentValle();
        return contentValle;
    }
}
