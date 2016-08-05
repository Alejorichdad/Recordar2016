package com.clubrecordar.recordar2016.helpers.detail;

import com.clubrecordar.recordar2016.R;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by willians on 31/7/16.
 */
public class DetailPasto {
    public static JSONObject mainContentPasto =  new JSONObject();
    public static JSONObject contentPasto1 =  new JSONObject();
    public static JSONObject contentPasto2 =  new JSONObject();
    public static JSONObject contentPasto3 =  new JSONObject();
    public static JSONObject contentPasto4 =  new JSONObject();
    public static JSONObject contentPasto5 =  new JSONObject();
    public static JSONObject contentPasto6 =  new JSONObject();
    public static JSONObject contentPasto7 =  new JSONObject();
    public static JSONObject contentPasto8 =  new JSONObject();
    public static JSONObject contentPasto9 =  new JSONObject();
    public static JSONObject contentPasto10 =  new JSONObject();
    public static JSONObject contentPasto11 =  new JSONObject();
    public static JSONObject contentPasto12 =  new JSONObject();
    public static JSONObject contentPasto13 =  new JSONObject();
    public static JSONObject contentPasto14 =  new JSONObject();
    public static JSONObject contentPasto15 =  new JSONObject();

    /* DATA */

    public static String title1 = "titulo1";
    public static String description1 = "description1";
    public static String phone1 = "12344567";
    public static String email1 = "some@gmail.com";
    public static int imageFile1 = R.drawable.tienda;
    public static String coords1 = "37.7749,-122.4194";

    public static String title2 = "titulo2";
    public static String description2 = "description2";
    public static String phone2 = "22344567";
    public static String email2 = "some@gmail.com";
    public static int imageFile2 = R.drawable.tienda;
    public static String coords2 = "37.7749,-122.4194";

    public static String title3 = "titulo3";
    public static String description3 = "description3";
    public static String phone3 = "3344567";
    public static String email3 = "some@gmail.com";
    public static int imageFile3 = R.drawable.tienda;
    public static String coords3 = "37.7749,-122.4194";

    public static String title4 = "titulo4";
    public static String description4 = "description4";
    public static String phone4 = "444567";
    public static String email4 = "some@gmail.com";
    public static int imageFile4 = R.drawable.tienda;
    public static String coords4 = "37.7749,-122.4194";

    public static String title5 = "titulo5";
    public static String description5 = "description5";
    public static String phone5 = "544567";
    public static String email5 = "some@gmail.com";
    public static int imageFile5 = R.drawable.tienda;
    public static String coords5 = "37.7749,-122.4194";

    public static String title6 = "titulo6";
    public static String description6 = "description6";
    public static String phone6 = "644567";
    public static String email6 = "some@gmail.com";
    public static int imageFile6 = R.drawable.tienda;
    public static String coords6 = "37.7749,-122.4194";

    public static String title7 = "titulo7";
    public static String description7 = "description7";
    public static String phone7 = "744567";
    public static String email7 = "some@gmail.com";
    public static int imageFile7 = R.drawable.tienda;
    public static String coords7 = "37.7749,-122.4194";

    public static String title8 = "titulo8";
    public static String description8 = "description8";
    public static String phone8 = "844567";
    public static String email8 = "some@gmail.com";
    public static int imageFile8 = R.drawable.tienda;
    public static String coords8 = "37.7749,-122.4194";

    public static String title9 = "titulo9";
    public static String description9 = "description9";
    public static String phone9 = "944567";
    public static String email9 = "some@gmail.com";
    public static int imageFile9 = R.drawable.tienda;
    public static String coords9 = "37.7749,-122.4194";

    public static String title10 = "titulo10";
    public static String description10 = "description10";
    public static String phone10 = "1044567";
    public static String email10 = "some@gmail.com";
    public static int imageFile10 = R.drawable.tienda;
    public static String coords10 = "37.7749,-122.4194";

    public static String title11 = "titulo11";
    public static String description11 = "description11";
    public static String phone11 = "1144567";
    public static String email11 = "some@gmail.com";
    public static int imageFile11 = R.drawable.tienda;
    public static String coords11 = "37.7749,-122.4194";

    public static String title12 = "titulo12";
    public static String description12 = "description12";
    public static String phone12 = "1244567";
    public static String email12 = "some@gmail.com";
    public static int imageFile12 = R.drawable.tienda;
    public static String coords12 = "37.7749,-122.4194";

    public static String title13 = "titulo13";
    public static String description13 = "description13";
    public static String phone13 = "1344567";
    public static String email13 = "some@gmail.com";
    public static int imageFile13 = R.drawable.tienda;
    public static String coords13 = "37.7749,-122.4194";

    public static String title14 = "titulo14";
    public static String description14 = "description14";
    public static String phone14 = "1444567";
    public static String email14 = "some@gmail.com";
    public static int imageFile14 = R.drawable.tienda;
    public static String coords14 = "37.7749,-122.4194";

    public static String title15 = "titulo15";
    public static String description15 = "description15";
    public static String phone15 = "1544567";
    public static String email15 = "some@gmail.com";
    public static int imageFile15 = R.drawable.tienda;
    public static String coords15 = "37.7749,-122.4194";


    public static void addObjectsPasto(){
        try {

            mainContentPasto.put("item1", getFirstItemData());
            mainContentPasto.put("item2", getSecItemData());
            mainContentPasto.put("item3", getThirdItemData());
            mainContentPasto.put("item4", getFourItemData());
            mainContentPasto.put("item5", getFifthItemData());
            mainContentPasto.put("item6", getSixthItemData());
            mainContentPasto.put("item7", getSevenththItemData());
            mainContentPasto.put("item8", getEighthItemData());
            mainContentPasto.put("item9", getNinthItemData());
            mainContentPasto.put("item10", getTenthItemData());
            mainContentPasto.put("item11", getEleventhItemData());
            mainContentPasto.put("item12", getTwelvethItemData());
            mainContentPasto.put("item13", getThirdteenthItemData());
            mainContentPasto.put("item14", getFourteenthItemData());
            mainContentPasto.put("item15", getFifteenthItemData());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getDetailPasto(){
        addObjectsPasto();
        return mainContentPasto;
    }

    public static JSONObject getFirstItemData() throws JSONException {

        contentPasto1.put("title", title1);
        contentPasto1.put("description", description1);
        contentPasto1.put("phone", phone1);
        contentPasto1.put("email", email1);
        contentPasto1.put("image", imageFile1);
        contentPasto1.put("coords", coords1);

        return contentPasto1;
    }

    public static JSONObject getSecItemData() throws JSONException {

        contentPasto2.put("title", title2);
        contentPasto2.put("description", description2);
        contentPasto2.put("phone", phone2);
        contentPasto2.put("email", email2);
        contentPasto2.put("image", imageFile2);
        contentPasto2.put("coords", coords2);

        return contentPasto2;
    }

    public static JSONObject getThirdItemData() throws JSONException {

        contentPasto3.put("title", title3);
        contentPasto3.put("description", description3);
        contentPasto3.put("phone", phone3);
        contentPasto3.put("email", email3);
        contentPasto3.put("image", imageFile3);
        contentPasto3.put("coords", coords3);

        return contentPasto3;
    }

    public static JSONObject getFourItemData() throws JSONException {

        contentPasto4.put("title", title4);
        contentPasto4.put("description", description4);
        contentPasto4.put("phone", phone4);
        contentPasto4.put("email", email4);
        contentPasto4.put("image", imageFile4);
        contentPasto4.put("coords", coords4);

        return contentPasto4;
    }

    public static JSONObject getFifthItemData() throws JSONException {

        contentPasto5.put("title", title5);
        contentPasto5.put("description", description5);
        contentPasto5.put("phone", phone5);
        contentPasto5.put("email", email5);
        contentPasto5.put("image", imageFile5);
        contentPasto5.put("coords", coords5);

        return contentPasto5;
    }

    public static JSONObject getSixthItemData() throws JSONException {

        contentPasto6.put("title", title6);
        contentPasto6.put("description", description6);
        contentPasto6.put("phone", phone6);
        contentPasto6.put("email", email6);
        contentPasto6.put("image", imageFile6);
        contentPasto6.put("coords", coords6);

        return contentPasto6;
    }

    public static JSONObject getSevenththItemData() throws JSONException {

        contentPasto7.put("title", title7);
        contentPasto7.put("description", description7);
        contentPasto7.put("phone", phone7);
        contentPasto7.put("email", email7);
        contentPasto7.put("image", imageFile7);
        contentPasto7.put("coords", coords7);

        return contentPasto7;
    }

    public static JSONObject getEighthItemData() throws JSONException {

        contentPasto8.put("title", title8);
        contentPasto8.put("description", description8);
        contentPasto8.put("phone", phone8);
        contentPasto8.put("email", email8);
        contentPasto8.put("image", imageFile8);
        contentPasto8.put("coords", coords8);

        return contentPasto8;
    }

    public static JSONObject getNinthItemData() throws JSONException {

        contentPasto9.put("title", title9);
        contentPasto9.put("description", description9);
        contentPasto9.put("phone", phone9);
        contentPasto9.put("email", email9);
        contentPasto9.put("image", imageFile9);
        contentPasto9.put("coords", coords9);

        return contentPasto9;
    }

    public static JSONObject getTenthItemData() throws JSONException {

        contentPasto10.put("title", title10);
        contentPasto10.put("description", description10);
        contentPasto10.put("phone", phone10);
        contentPasto10.put("email", email10);
        contentPasto10.put("image", imageFile10);
        contentPasto10.put("coords", coords10);

        return contentPasto10;
    }

    public static JSONObject getEleventhItemData() throws JSONException {

        contentPasto11.put("title", title11);
        contentPasto11.put("description", description11);
        contentPasto11.put("phone", phone11);
        contentPasto11.put("email", email11);
        contentPasto11.put("image", imageFile11);
        contentPasto11.put("coords", coords11);

        return contentPasto11;
    }

    public static JSONObject getTwelvethItemData() throws JSONException {

        contentPasto12.put("title", title12);
        contentPasto12.put("description", description12);
        contentPasto12.put("phone", phone12);
        contentPasto12.put("email", email12);
        contentPasto12.put("image", imageFile12);
        contentPasto12.put("coords", coords12);

        return contentPasto12;
    }

    public static JSONObject getThirdteenthItemData() throws JSONException {

        contentPasto13.put("title", title13);
        contentPasto13.put("description", description13);
        contentPasto13.put("phone", phone13);
        contentPasto13.put("email", email13);
        contentPasto13.put("image", imageFile13);
        contentPasto13.put("coords", coords13);

        return contentPasto13;
    }

    public static JSONObject getFourteenthItemData() throws JSONException {

        contentPasto14.put("title", title14);
        contentPasto14.put("description", description14);
        contentPasto14.put("phone", phone14);
        contentPasto14.put("email", email14);
        contentPasto14.put("image", imageFile14);
        contentPasto14.put("coords", coords14);

        return contentPasto14;
    }

    public static JSONObject getFifteenthItemData() throws JSONException {

        contentPasto15.put("title", title15);
        contentPasto15.put("description", description15);
        contentPasto15.put("phone", phone15);
        contentPasto15.put("email", email15);
        contentPasto15.put("image", imageFile15);
        contentPasto15.put("coords", coords15);

        return contentPasto15;
    }
}
