package com.clubrecordar.recordar2016.helpers.cities;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.BarranquillaModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willians on 30/7/16.
 */
public class ContentBarranquilla {

    public static List<BarranquillaModel> contentBarranquilla =  new ArrayList<>();

    public static String titulo1 = "item title barranquilla 1";
    public static int imageFile1 = R.drawable.tienda;
    public static String description1 = "item description barranquilla 1";

    public static String titulo2 = "item title barranquilla 2";
    public static int imageFile2 = R.drawable.tienda;
    public static String description2 = "item description barranquilla 2";

    public static String titulo3 = "item title barranquilla 3";
    public static int imageFile3 = R.drawable.tienda;
    public static String description3 = "item description barranquilla 3";

    public static String titulo4 = "item title barranquilla 4";
    public static int imageFile4 = R.drawable.tienda;
    public static String description4 = "item description barranquilla 4";

    public static String titulo5 = "item title barranquilla 5";
    public static int imageFile5 = R.drawable.tienda;
    public static String description5 = "item description barranquilla 5";

    public static String titulo6 = "item title barranquilla 6";
    public static int imageFile6 = R.drawable.tienda;
    public static String description6 = "item description barranquilla 6";

    public static String titulo7 = "item title barranquilla 7";
    public static int imageFile7 = R.drawable.tienda;
    public static String description7 = "item description barranquilla 7";

    public static String titulo8 = "item title barranquilla 8";
    public static int imageFile8 = R.drawable.tienda;
    public static String description8 = "item description barranquilla 8";

    public static String titulo9 = "item title barranquilla 9";
    public static int imageFile9 = R.drawable.tienda;
    public static String description9 = "item description barranquilla 9";

    public static String titulo10 = "item title barranquilla 10";
    public static int imageFile10 = R.drawable.tienda;
    public static String description10 = "item description barranquilla 10";

    public static String titulo11 = "item title barranquilla 11";
    public static int imageFile11 = R.drawable.tienda;
    public static String description11 = "item description barranquilla 11";

    public static String titulo12 = "item title barranquilla 12";
    public static int imageFile12 = R.drawable.tienda;
    public static String description12 = "item description barranquilla 12";

    public static String titulo13 = "item title barranquilla 13";
    public static int imageFile13 = R.drawable.tienda;
    public static String description13 = "item description barranquilla 13";

    public static String titulo14 = "item title barranquilla 14";
    public static int imageFile14 = R.drawable.tienda;
    public static String description14 = "item description barranquilla 14";

    public static String titulo15 = "item title barranquilla 15";
    public static int imageFile15 = R.drawable.tienda;
    public static String description15 = "item description barranquilla 15";

    public static void addContentBarranquilla(){
        contentBarranquilla.add(new BarranquillaModel(imageFile1, titulo1, description1));
        contentBarranquilla.add(new BarranquillaModel(imageFile2, titulo2, description2));
        contentBarranquilla.add(new BarranquillaModel(imageFile3, titulo3, description3));
        contentBarranquilla.add(new BarranquillaModel(imageFile4, titulo4, description4));
        contentBarranquilla.add(new BarranquillaModel(imageFile5, titulo5, description5));
        contentBarranquilla.add(new BarranquillaModel(imageFile6, titulo6, description6));
        contentBarranquilla.add(new BarranquillaModel(imageFile7, titulo7, description7));
        contentBarranquilla.add(new BarranquillaModel(imageFile8, titulo8, description8));
        contentBarranquilla.add(new BarranquillaModel(imageFile9, titulo9, description9));
        contentBarranquilla.add(new BarranquillaModel(imageFile10, titulo10, description10));
        contentBarranquilla.add(new BarranquillaModel(imageFile11, titulo11, description11));
        contentBarranquilla.add(new BarranquillaModel(imageFile12, titulo12, description12));
        contentBarranquilla.add(new BarranquillaModel(imageFile13, titulo13, description13));
        contentBarranquilla.add(new BarranquillaModel(imageFile14, titulo14, description14));
        contentBarranquilla.add(new BarranquillaModel(imageFile15, titulo15, description15));
    }

    public static List<BarranquillaModel> getContentBarranquilla(){

        addContentBarranquilla();
        return contentBarranquilla;
    }
}
