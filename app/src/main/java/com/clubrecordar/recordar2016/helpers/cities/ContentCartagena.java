package com.clubrecordar.recordar2016.helpers.cities;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.CartagenaModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willians on 30/7/16.
 */
public class ContentCartagena {

    public static List<CartagenaModel> contentCartagena =  new ArrayList<>();

    public static String titulo1 = "item title cartagena 1";
    public static int imageFile1 = R.drawable.tienda;
    public static String description1 = "item description cartagena 1";

    public static String titulo2 = "item title cartagena 2";
    public static int imageFile2 = R.drawable.tienda;
    public static String description2 = "item description cartagena 2";

    public static String titulo3 = "item title cartagena 3";
    public static int imageFile3 = R.drawable.tienda;
    public static String description3 = "item description cartagena 3";

    public static String titulo4 = "item title cartagena 4";
    public static int imageFile4 = R.drawable.tienda;
    public static String description4 = "item description cartagena 4";

    public static String titulo5 = "item title cartagena 5";
    public static int imageFile5 = R.drawable.tienda;
    public static String description5 = "item description cartagena 5";

    public static String titulo6 = "item title cartagena 6";
    public static int imageFile6 = R.drawable.tienda;
    public static String description6 = "item description cartagena 6";

    public static String titulo7 = "item title cartagena 7";
    public static int imageFile7 = R.drawable.tienda;
    public static String description7 = "item description cartagena 7";

    public static String titulo8 = "item title cartagena 8";
    public static int imageFile8 = R.drawable.tienda;
    public static String description8 = "item description cartagena 8";

    public static String titulo9 = "item title cartagena 9";
    public static int imageFile9 = R.drawable.tienda;
    public static String description9 = "item description cartagena 9";

    public static String titulo10 = "item title cartagena 10";
    public static int imageFile10 = R.drawable.tienda;
    public static String description10 = "item description cartagena 10";

    public static String titulo11 = "item title cartagena 11";
    public static int imageFile11 = R.drawable.tienda;
    public static String description11 = "item description cartagena 11";

    public static String titulo12 = "item title cartagena 12";
    public static int imageFile12 = R.drawable.tienda;
    public static String description12 = "item description cartagena 12";

    public static String titulo13 = "item title cartagena 13";
    public static int imageFile13 = R.drawable.tienda;
    public static String description13 = "item description cartagena 13";

    public static String titulo14 = "item title cartagena 14";
    public static int imageFile14 = R.drawable.tienda;
    public static String description14 = "item description cartagena 14";

    public static String titulo15 = "item title cartagena 15";
    public static int imageFile15 = R.drawable.tienda;
    public static String description15 = "item description cartagena 15";

    public static void addContentCartagena(){
        contentCartagena.add(new CartagenaModel(imageFile1, titulo1, description1));
        contentCartagena.add(new CartagenaModel(imageFile2, titulo2, description2));
        contentCartagena.add(new CartagenaModel(imageFile3, titulo3, description3));
        contentCartagena.add(new CartagenaModel(imageFile4, titulo4, description4));
        contentCartagena.add(new CartagenaModel(imageFile5, titulo5, description5));
        contentCartagena.add(new CartagenaModel(imageFile6, titulo6, description6));
        contentCartagena.add(new CartagenaModel(imageFile7, titulo7, description7));
        contentCartagena.add(new CartagenaModel(imageFile8, titulo8, description8));
        contentCartagena.add(new CartagenaModel(imageFile9, titulo9, description9));
        contentCartagena.add(new CartagenaModel(imageFile10, titulo10, description10));
        contentCartagena.add(new CartagenaModel(imageFile11, titulo11, description11));
        contentCartagena.add(new CartagenaModel(imageFile12, titulo12, description12));
        contentCartagena.add(new CartagenaModel(imageFile13, titulo13, description13));
        contentCartagena.add(new CartagenaModel(imageFile14, titulo14, description14));
        contentCartagena.add(new CartagenaModel(imageFile15, titulo15, description15));
    }

    public static List<CartagenaModel> getContentCartagena(){

        addContentCartagena();
        return contentCartagena;
    }
}
