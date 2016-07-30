package com.clubrecordar.recordar2016.helpers.cities;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.BogotaModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willians on 30/7/16.
 */
public class ContentBogota {

    public static List<BogotaModel> contentBogota =  new ArrayList<>();

    public static String titulo1 = "item title bogota 1";
    public static String description1 = "item description bogota 1";

    public static String titulo2 = "item title bogota 2";
    public static String description2 = "item description bogota 2";

    public static String titulo3 = "item title bogota 3";
    public static String description3 = "item description bogota 3";

    public static String titulo4 = "item title bogota 4";
    public static String description4 = "item description bogota 4";

    public static String titulo5 = "item title bogota 5";
    public static String description5 = "item description bogota 5";

    public static String titulo6 = "item title bogota 6";
    public static String description6 = "item description bogota 6";

    public static String titulo7 = "item title bogota 7";
    public static String description7 = "item description bogota 7";

    public static String titulo8 = "item title bogota 8";
    public static String description8 = "item description bogota 8";

    public static String titulo9 = "item title bogota 9";
    public static String description9 = "item description bogota 9";

    public static String titulo10 = "item title bogota 10";
    public static String description10 = "item description bogota 10";

    public static String titulo11 = "item title bogota 11";
    public static String description11 = "item description bogota 11";

    public static String titulo12 = "item title bogota 12";
    public static String description12 = "item description bogota 12";

    public static String titulo13 = "item title bogota 13";
    public static String description13 = "item description bogota 13";

    public static String titulo14 = "item title bogota 14";
    public static String description14 = "item description bogota 14";

    public static String titulo15 = "item title bogota 15";
    public static String description15 = "item description bogota 15";

    public static void addContentBogota(){
        contentBogota.add(new BogotaModel(R.drawable.a_nacional, titulo1, description1));
        contentBogota.add(new BogotaModel(R.drawable.ingles, titulo2, description2));
        contentBogota.add(new BogotaModel(R.drawable.tienda, titulo3, description3));
        contentBogota.add(new BogotaModel(R.drawable.a_nacional, titulo4, description4));
        contentBogota.add(new BogotaModel(R.drawable.ingles, titulo5, description5));
        contentBogota.add(new BogotaModel(R.drawable.tienda, titulo6, description6));
        contentBogota.add(new BogotaModel(R.drawable.a_nacional, titulo7, description7));
        contentBogota.add(new BogotaModel(R.drawable.a_nacional, titulo8, description8));
        contentBogota.add(new BogotaModel(R.drawable.a_nacional, titulo9, description9));
        contentBogota.add(new BogotaModel(R.drawable.a_nacional, titulo10, description10));
        contentBogota.add(new BogotaModel(R.drawable.a_nacional, titulo11, description11));
        contentBogota.add(new BogotaModel(R.drawable.a_nacional, titulo12, description12));
        contentBogota.add(new BogotaModel(R.drawable.a_nacional, titulo13, description13));
        contentBogota.add(new BogotaModel(R.drawable.a_nacional, titulo14, description14));
        contentBogota.add(new BogotaModel(R.drawable.a_nacional, titulo15, description15));
    }

    public static List<BogotaModel> getContentBogota(){

        addContentBogota();
        return contentBogota;
    }
}
