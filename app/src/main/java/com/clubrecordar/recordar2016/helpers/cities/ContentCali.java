package com.clubrecordar.recordar2016.helpers.cities;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.CaliModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willians on 30/7/16.
 */
public class ContentCali {
    public static List<CaliModel> contentCali =  new ArrayList<>();

    public static String titulo1 = "item title cali 1";
    public static int imageFile1 = R.drawable.tienda;
    public static String description1 = "item description cali 1";

    public static String titulo2 = "item title cali 2";
    public static int imageFile2 = R.drawable.tienda;
    public static String description2 = "item description cali 2";

    public static String titulo3 = "item title cali 3";
    public static int imageFile3 = R.drawable.tienda;
    public static String description3 = "item description cali 3";

    public static String titulo4 = "item title cali 4";
    public static int imageFile4 = R.drawable.tienda;
    public static String description4 = "item description cali 4";

    public static String titulo5 = "item title cali 5";
    public static int imageFile5 = R.drawable.tienda;
    public static String description5 = "item description cali 5";

    public static String titulo6 = "item title cali 6";
    public static int imageFile6 = R.drawable.tienda;
    public static String description6 = "item description cali 6";

    public static String titulo7 = "item title cali 7";
    public static int imageFile7 = R.drawable.tienda;
    public static String description7 = "item description cali 7";

    public static String titulo8 = "item title cali 8";
    public static int imageFile8 = R.drawable.tienda;
    public static String description8 = "item description cali 8";

    public static String titulo9 = "item title cali 9";
    public static int imageFile9 = R.drawable.tienda;
    public static String description9 = "item description cali 9";

    public static String titulo10 = "item title cali 10";
    public static int imageFile10 = R.drawable.tienda;
    public static String description10 = "item description cali 10";

    public static String titulo11 = "item title cali 11";
    public static int imageFile11 = R.drawable.tienda;
    public static String description11 = "item description cali 11";

    public static String titulo12 = "item title cali 12";
    public static int imageFile12 = R.drawable.tienda;
    public static String description12 = "item description cali 12";

    public static String titulo13 = "item title cali 13";
    public static int imageFile13 = R.drawable.tienda;
    public static String description13 = "item description cali 13";

    public static String titulo14 = "item title cali 14";
    public static int imageFile14 = R.drawable.tienda;
    public static String description14 = "item description cali 14";

    public static String titulo15 = "item title cali 15";
    public static int imageFile15 = R.drawable.tienda;
    public static String description15 = "item description cali 15";

    public static void addContentCali(){
        contentCali.add(new CaliModel(imageFile1, titulo1, description1));
        contentCali.add(new CaliModel(imageFile2, titulo2, description2));
        contentCali.add(new CaliModel(imageFile3, titulo3, description3));
        contentCali.add(new CaliModel(imageFile4, titulo4, description4));
        contentCali.add(new CaliModel(imageFile5, titulo5, description5));
        contentCali.add(new CaliModel(imageFile6, titulo6, description6));
        contentCali.add(new CaliModel(imageFile7, titulo7, description7));
        contentCali.add(new CaliModel(imageFile8, titulo8, description8));
        contentCali.add(new CaliModel(imageFile9, titulo9, description9));
        contentCali.add(new CaliModel(imageFile10, titulo10, description10));
        contentCali.add(new CaliModel(imageFile11, titulo11, description11));
        contentCali.add(new CaliModel(imageFile12, titulo12, description12));
        contentCali.add(new CaliModel(imageFile13, titulo13, description13));
        contentCali.add(new CaliModel(imageFile14, titulo14, description14));
        contentCali.add(new CaliModel(imageFile15, titulo15, description15));
    }

    public static List<CaliModel> getContentCali(){

        addContentCali();
        return contentCali;
    }
}
