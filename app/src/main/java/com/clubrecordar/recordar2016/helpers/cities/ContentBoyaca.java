package com.clubrecordar.recordar2016.helpers.cities;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.BoyacaModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willians on 30/7/16.
 */
public class ContentBoyaca {
    public static List<BoyacaModel> contentBoyaca =  new ArrayList<>();

    public static String titulo1 = "item title boyaca 1";
    public static String description1 = "item description boyaca 1";

    public static String titulo2 = "item title boyaca 2";
    public static String description2 = "item description boyaca 2";

    public static String titulo3 = "item title boyaca 3";
    public static String description3 = "item description boyaca 3";

    public static String titulo4 = "item title boyaca 4";
    public static String description4 = "item description boyaca 4";

    public static String titulo5 = "item title boyaca 5";
    public static String description5 = "item description boyaca 5";

    public static String titulo6 = "item title boyaca 6";
    public static String description6 = "item description boyaca 6";

    public static String titulo7 = "item title boyaca 7";
    public static String description7 = "item description boyaca 7";

    public static String titulo8 = "item title boyaca 8";
    public static String description8 = "item description boyaca 8";

    public static String titulo9 = "item title boyaca 9";
    public static String description9 = "item description boyaca 9";

    public static String titulo10 = "item title boyaca 10";
    public static String description10 = "item description boyaca 10";

    public static String titulo11 = "item title boyaca 11";
    public static String description11 = "item description boyaca 11";

    public static String titulo12 = "item title boyaca 12";
    public static String description12 = "item description boyaca 12";

    public static String titulo13 = "item title boyaca 13";
    public static String description13 = "item description boyaca 13";

    public static String titulo14 = "item title boyaca 14";
    public static String description14 = "item description boyaca 14";

    public static String titulo15 = "item title boyaca 15";
    public static String description15 = "item description boyaca 15";

    public static void addContentBoyaca(){
        contentBoyaca.add(new BoyacaModel(R.drawable.a_nacional, titulo1, description1));
        contentBoyaca.add(new BoyacaModel(R.drawable.ingles, titulo2, description2));
        contentBoyaca.add(new BoyacaModel(R.drawable.tienda, titulo3, description3));
        contentBoyaca.add(new BoyacaModel(R.drawable.a_nacional, titulo4, description4));
        contentBoyaca.add(new BoyacaModel(R.drawable.ingles, titulo5, description5));
        contentBoyaca.add(new BoyacaModel(R.drawable.tienda, titulo6, description6));
        contentBoyaca.add(new BoyacaModel(R.drawable.a_nacional, titulo7, description7));
        contentBoyaca.add(new BoyacaModel(R.drawable.a_nacional, titulo8, description8));
        contentBoyaca.add(new BoyacaModel(R.drawable.a_nacional, titulo9, description9));
        contentBoyaca.add(new BoyacaModel(R.drawable.a_nacional, titulo10, description10));
        contentBoyaca.add(new BoyacaModel(R.drawable.a_nacional, titulo11, description11));
        contentBoyaca.add(new BoyacaModel(R.drawable.a_nacional, titulo12, description12));
        contentBoyaca.add(new BoyacaModel(R.drawable.a_nacional, titulo13, description13));
        contentBoyaca.add(new BoyacaModel(R.drawable.a_nacional, titulo14, description14));
        contentBoyaca.add(new BoyacaModel(R.drawable.a_nacional, titulo15, description15));
    }

    public static List<BoyacaModel> getContentBoyaca(){

        addContentBoyaca();
        return contentBoyaca;
    }
}
