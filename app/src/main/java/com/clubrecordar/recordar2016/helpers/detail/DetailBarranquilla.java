package com.clubrecordar.recordar2016.helpers.detail;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by willians on 31/7/16.
 */
public class DetailBarranquilla {

    public static JSONObject mainContentBarranquilla =  new JSONObject();
    public static JSONObject contentBarranquilla1 =  new JSONObject();
    public static JSONObject contentBarranquilla2 =  new JSONObject();
    public static JSONObject contentBarranquilla3 =  new JSONObject();
    public static JSONObject contentBarranquilla4 =  new JSONObject();
    public static JSONObject contentBarranquilla5 =  new JSONObject();
    public static JSONObject contentBarranquilla6 =  new JSONObject();
    public static JSONObject contentBarranquilla7 =  new JSONObject();
    public static JSONObject contentBarranquilla8 =  new JSONObject();
    public static JSONObject contentBarranquilla9 =  new JSONObject();
    public static JSONObject contentBarranquilla10 =  new JSONObject();
    public static JSONObject contentBarranquilla11 =  new JSONObject();
    public static JSONObject contentBarranquilla12 =  new JSONObject();
    public static JSONObject contentBarranquilla13 =  new JSONObject();
    public static JSONObject contentBarranquilla14 =  new JSONObject();
    public static JSONObject contentBarranquilla15 =  new JSONObject();

    /* DATA */

    public static String title1 = "titulo1";
    public static String description1 = "description1";
    public static String phone1 = "12344567";
    public static String email1 = "some@gmail.com";
    public static String coords1 = "37.7749,-122.4194";

    public static String title2 = "titulo2";
    public static String description2 = "description2";
    public static String phone2 = "22344567";
    public static String email2 = "some@gmail.com";
    public static String coords2 = "37.7749,-122.4194";

    public static String title3 = "titulo3";
    public static String description3 = "description3";
    public static String phone3 = "3344567";
    public static String email3 = "some@gmail.com";
    public static String coords3 = "37.7749,-122.4194";

    public static String title4 = "titulo4";
    public static String description4 = "description4";
    public static String phone4 = "444567";
    public static String email4 = "some@gmail.com";
    public static String coords4 = "37.7749,-122.4194";

    public static String title5 = "titulo5";
    public static String description5 = "description5";
    public static String phone5 = "544567";
    public static String email5 = "some@gmail.com";
    public static String coords5 = "37.7749,-122.4194";

    public static String title6 = "titulo6";
    public static String description6 = "description6";
    public static String phone6 = "644567";
    public static String email6 = "some@gmail.com";
    public static String coords6 = "37.7749,-122.4194";

    public static String title7 = "titulo7";
    public static String description7 = "description7";
    public static String phone7 = "744567";
    public static String email7 = "some@gmail.com";
    public static String coords7 = "37.7749,-122.4194";

    public static String title8 = "titulo8";
    public static String description8 = "description8";
    public static String phone8 = "844567";
    public static String email8 = "some@gmail.com";
    public static String coords8 = "37.7749,-122.4194";

    public static String title9 = "titulo9";
    public static String description9 = "description9";
    public static String phone9 = "944567";
    public static String email9 = "some@gmail.com";
    public static String coords9 = "37.7749,-122.4194";

    public static String title10 = "titulo10";
    public static String description10 = "description10";
    public static String phone10 = "1044567";
    public static String email10 = "some@gmail.com";
    public static String coords10 = "37.7749,-122.4194";

    public static String title11 = "titulo11";
    public static String description11 = "description11";
    public static String phone11 = "1144567";
    public static String email11 = "some@gmail.com";
    public static String coords11 = "37.7749,-122.4194";

    public static String title12 = "titulo12";
    public static String description12 = "description12";
    public static String phone12 = "1244567";
    public static String email12 = "some@gmail.com";
    public static String coords12 = "37.7749,-122.4194";

    public static String title13 = "titulo13";
    public static String description13 = "description13";
    public static String phone13 = "1344567";
    public static String email13 = "some@gmail.com";
    public static String coords13 = "37.7749,-122.4194";

    public static String title14 = "titulo14";
    public static String description14 = "description14";
    public static String phone14 = "1444567";
    public static String email14 = "some@gmail.com";
    public static String coords14 = "37.7749,-122.4194";

    public static String title15 = "titulo15";
    public static String description15 = "description15";
    public static String phone15 = "1544567";
    public static String email15 = "some@gmail.com";
    public static String coords15 = "37.7749,-122.4194";


    public static void addObjectsBarranquilla(){
        try {

            mainContentBarranquilla.put("item1", getFirstItemData());
            mainContentBarranquilla.put("item2", getSecItemData());
            mainContentBarranquilla.put("item3", getThirdItemData());
            mainContentBarranquilla.put("item4", getFourItemData());
            mainContentBarranquilla.put("item5", getFifthItemData());
            mainContentBarranquilla.put("item6", getSixthItemData());
            mainContentBarranquilla.put("item7", getSevenththItemData());
            mainContentBarranquilla.put("item8", getEighthItemData());
            mainContentBarranquilla.put("item9", getNinthItemData());
            mainContentBarranquilla.put("item10", getTenthItemData());
            mainContentBarranquilla.put("item11", getEleventhItemData());
            mainContentBarranquilla.put("item12", getTwelvethItemData());
            mainContentBarranquilla.put("item13", getThirdteenthItemData());
            mainContentBarranquilla.put("item14", getFourteenthItemData());
            mainContentBarranquilla.put("item15", getFifteenthItemData());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getDetailBarranquilla(){
        addObjectsBarranquilla();
        return mainContentBarranquilla;
    }

    public static JSONObject getFirstItemData() throws JSONException {

        contentBarranquilla1.put("title", title1);
        contentBarranquilla1.put("description", description1);
        contentBarranquilla1.put("phone", phone1);
        contentBarranquilla1.put("email", email1);
        contentBarranquilla1.put("coords", coords1);

        return contentBarranquilla1;
    }

    public static JSONObject getSecItemData() throws JSONException {

        contentBarranquilla2.put("title", title2);
        contentBarranquilla2.put("description", description2);
        contentBarranquilla2.put("phone", phone2);
        contentBarranquilla2.put("email", email2);
        contentBarranquilla2.put("coords", coords2);

        return contentBarranquilla2;
    }

    public static JSONObject getThirdItemData() throws JSONException {

        contentBarranquilla3.put("title", title3);
        contentBarranquilla3.put("description", description3);
        contentBarranquilla3.put("phone", phone3);
        contentBarranquilla3.put("email", email3);
        contentBarranquilla3.put("coords", coords3);

        return contentBarranquilla3;
    }

    public static JSONObject getFourItemData() throws JSONException {

        contentBarranquilla4.put("title", title4);
        contentBarranquilla4.put("description", description4);
        contentBarranquilla4.put("phone", phone4);
        contentBarranquilla4.put("email", email4);
        contentBarranquilla4.put("coords", coords4);

        return contentBarranquilla4;
    }

    public static JSONObject getFifthItemData() throws JSONException {

        contentBarranquilla5.put("title", title5);
        contentBarranquilla5.put("description", description5);
        contentBarranquilla5.put("phone", phone5);
        contentBarranquilla5.put("email", email5);
        contentBarranquilla5.put("coords", coords5);

        return contentBarranquilla5;
    }

    public static JSONObject getSixthItemData() throws JSONException {

        contentBarranquilla6.put("title", title6);
        contentBarranquilla6.put("description", description6);
        contentBarranquilla6.put("phone", phone6);
        contentBarranquilla6.put("email", email6);
        contentBarranquilla6.put("coords", coords6);

        return contentBarranquilla6;
    }

    public static JSONObject getSevenththItemData() throws JSONException {

        contentBarranquilla7.put("title", title7);
        contentBarranquilla7.put("description", description7);
        contentBarranquilla7.put("phone", phone7);
        contentBarranquilla7.put("email", email7);
        contentBarranquilla7.put("coords", coords7);

        return contentBarranquilla7;
    }

    public static JSONObject getEighthItemData() throws JSONException {

        contentBarranquilla8.put("title", title8);
        contentBarranquilla8.put("description", description8);
        contentBarranquilla8.put("phone", phone8);
        contentBarranquilla8.put("email", email8);
        contentBarranquilla8.put("coords", coords8);

        return contentBarranquilla8;
    }

    public static JSONObject getNinthItemData() throws JSONException {

        contentBarranquilla9.put("title", title9);
        contentBarranquilla9.put("description", description9);
        contentBarranquilla9.put("phone", phone9);
        contentBarranquilla9.put("email", email9);
        contentBarranquilla9.put("coords", coords9);

        return contentBarranquilla9;
    }

    public static JSONObject getTenthItemData() throws JSONException {

        contentBarranquilla10.put("title", title10);
        contentBarranquilla10.put("description", description10);
        contentBarranquilla10.put("phone", phone10);
        contentBarranquilla10.put("email", email10);
        contentBarranquilla10.put("coords", coords10);

        return contentBarranquilla10;
    }

    public static JSONObject getEleventhItemData() throws JSONException {

        contentBarranquilla11.put("title", title11);
        contentBarranquilla11.put("description", description11);
        contentBarranquilla11.put("phone", phone11);
        contentBarranquilla11.put("email", email11);
        contentBarranquilla11.put("coords", coords11);

        return contentBarranquilla11;
    }

    public static JSONObject getTwelvethItemData() throws JSONException {

        contentBarranquilla12.put("title", title12);
        contentBarranquilla12.put("description", description12);
        contentBarranquilla12.put("phone", phone12);
        contentBarranquilla12.put("email", email12);
        contentBarranquilla12.put("coords", coords12);

        return contentBarranquilla12;
    }

    public static JSONObject getThirdteenthItemData() throws JSONException {

        contentBarranquilla13.put("title", title13);
        contentBarranquilla13.put("description", description13);
        contentBarranquilla13.put("phone", phone13);
        contentBarranquilla13.put("email", email13);
        contentBarranquilla13.put("coords", coords13);

        return contentBarranquilla13;
    }

    public static JSONObject getFourteenthItemData() throws JSONException {

        contentBarranquilla14.put("title", title14);
        contentBarranquilla14.put("description", description14);
        contentBarranquilla14.put("phone", phone14);
        contentBarranquilla14.put("email", email14);
        contentBarranquilla14.put("coords", coords14);

        return contentBarranquilla14;
    }

    public static JSONObject getFifteenthItemData() throws JSONException {

        contentBarranquilla15.put("title", title15);
        contentBarranquilla15.put("description", description15);
        contentBarranquilla15.put("phone", phone15);
        contentBarranquilla15.put("email", email15);
        contentBarranquilla15.put("coords", coords15);

        return contentBarranquilla15;
    }
}
