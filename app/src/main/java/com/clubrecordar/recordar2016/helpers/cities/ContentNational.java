package com.clubrecordar.recordar2016.helpers.cities;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.NationalModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willians on 29/7/16.
 */
public class ContentNational {

    public static List<NationalModel> contentNational =  new ArrayList<>();

    public static String titulo1 = "item title national 1";
    public static int imageFile1 = R.drawable.tienda;
    public static String description1 = "item description national 1";

    public static String titulo2 = "item title national 2";
    public static int imageFile2 = R.drawable.tienda;
    public static String description2 = "item description national 2";

    public static String titulo3 = "item title national 3";
    public static int imageFile3 = R.drawable.tienda;
    public static String description3 = "item description national 3";

    public static String titulo4 = "item title national 4";
    public static int imageFile4 = R.drawable.tienda;
    public static String description4 = "item description national 4";

    public static String titulo5 = "item title national 5";
    public static int imageFile5 = R.drawable.tienda;
    public static String description5 = "item description national 5";

    public static String titulo6 = "item title national 6";
    public static int imageFile6 = R.drawable.tienda;
    public static String description6 = "item description national 6";

    public static String titulo7 = "item title national 7";
    public static int imageFile7 = R.drawable.tienda;
    public static String description7 = "item description national 7";

    public static String titulo8 = "item title national 8";
    public static int imageFile8 = R.drawable.tienda;
    public static String description8 = "item description national 8";

    public static String titulo9 = "item title national 9";
    public static int imageFile9 = R.drawable.tienda;
    public static String description9 = "item description national 9";

    public static String titulo10 = "item title national 10";
    public static int imageFile10 = R.drawable.tienda;
    public static String description10 = "item description national 10";

    public static String titulo11 = "item title national 11";
    public static int imageFile11 = R.drawable.tienda;
    public static String description11 = "item description national 11";

    public static String titulo12 = "item title national 12";
    public static int imageFile12 = R.drawable.tienda;
    public static String description12 = "item description national 12";

    public static String titulo13 = "item title national 13";
    public static int imageFile13 = R.drawable.tienda;
    public static String description13 = "item description national 13";

    public static String titulo14 = "item title national 14";
    public static int imageFile14 = R.drawable.tienda;
    public static String description14 = "item description national 14";

    public static String titulo15 = "item title national 15";
    public static int imageFile15 = R.drawable.tienda;
    public static String description15 = "item description national 15";

    public static void addContentNational(){
        contentNational.add(new NationalModel(imageFile1, titulo1, description1));
        contentNational.add(new NationalModel(imageFile2, titulo2, description2));
        contentNational.add(new NationalModel(imageFile3, titulo3, description3));
        contentNational.add(new NationalModel(imageFile4, titulo4, description4));
        contentNational.add(new NationalModel(imageFile5, titulo5, description5));
        contentNational.add(new NationalModel(imageFile6, titulo6, description6));
        contentNational.add(new NationalModel(imageFile7, titulo7, description7));
        contentNational.add(new NationalModel(imageFile8, titulo8, description8));
        contentNational.add(new NationalModel(imageFile9, titulo9, description9));
        contentNational.add(new NationalModel(imageFile10, titulo10, description10));
        contentNational.add(new NationalModel(imageFile11, titulo11, description11));
        contentNational.add(new NationalModel(imageFile12, titulo12, description12));
        contentNational.add(new NationalModel(imageFile13, titulo13, description13));
        contentNational.add(new NationalModel(imageFile14, titulo14, description14));
        contentNational.add(new NationalModel(imageFile15, titulo15, description15));
    }

    public static List<NationalModel> getContentNational(){

        addContentNational();
        return contentNational;
    }

}
