package com.clubrecordar.recordar2016.helpers.detail;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by willians on 31/7/16.
 */
public class DetailValle {
    public static JSONObject mainContentValle =  new JSONObject();
    public static JSONObject contentValle1 =  new JSONObject();
    public static JSONObject contentValle2 =  new JSONObject();
    public static JSONObject contentValle3 =  new JSONObject();
    public static JSONObject contentValle4 =  new JSONObject();
    public static JSONObject contentValle5 =  new JSONObject();
    public static JSONObject contentValle6 =  new JSONObject();
    public static JSONObject contentValle7 =  new JSONObject();
    public static JSONObject contentValle8 =  new JSONObject();
    public static JSONObject contentValle9 =  new JSONObject();
    public static JSONObject contentValle10 =  new JSONObject();
    public static JSONObject contentValle11 =  new JSONObject();
    public static JSONObject contentValle12 =  new JSONObject();
    public static JSONObject contentValle13 =  new JSONObject();
    public static JSONObject contentValle14 =  new JSONObject();
    public static JSONObject contentValle15 =  new JSONObject();

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


    public static void addObjectsValle(){
        try {

            mainContentValle.put("item1", getFirstItemData());
            mainContentValle.put("item2", getSecItemData());
            mainContentValle.put("item3", getThirdItemData());
            mainContentValle.put("item4", getFourItemData());
            mainContentValle.put("item5", getFifthItemData());
            mainContentValle.put("item6", getSixthItemData());
            mainContentValle.put("item7", getSevenththItemData());
            mainContentValle.put("item8", getEighthItemData());
            mainContentValle.put("item9", getNinthItemData());
            mainContentValle.put("item10", getTenthItemData());
            mainContentValle.put("item11", getEleventhItemData());
            mainContentValle.put("item12", getTwelvethItemData());
            mainContentValle.put("item13", getThirdteenthItemData());
            mainContentValle.put("item14", getFourteenthItemData());
            mainContentValle.put("item15", getFifteenthItemData());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getDetailValle(){
        addObjectsValle();
        return mainContentValle;
    }

    public static JSONObject getFirstItemData() throws JSONException {

        contentValle1.put("title", title1);
        contentValle1.put("description", description1);
        contentValle1.put("phone", phone1);
        contentValle1.put("email", email1);
        contentValle1.put("coords", coords1);

        return contentValle1;
    }

    public static JSONObject getSecItemData() throws JSONException {

        contentValle2.put("title", title2);
        contentValle2.put("description", description2);
        contentValle2.put("phone", phone2);
        contentValle2.put("email", email2);
        contentValle2.put("coords", coords2);

        return contentValle2;
    }

    public static JSONObject getThirdItemData() throws JSONException {

        contentValle3.put("title", title3);
        contentValle3.put("description", description3);
        contentValle3.put("phone", phone3);
        contentValle3.put("email", email3);
        contentValle3.put("coords", coords3);

        return contentValle3;
    }

    public static JSONObject getFourItemData() throws JSONException {

        contentValle4.put("title", title4);
        contentValle4.put("description", description4);
        contentValle4.put("phone", phone4);
        contentValle4.put("email", email4);
        contentValle4.put("coords", coords4);

        return contentValle4;
    }

    public static JSONObject getFifthItemData() throws JSONException {

        contentValle5.put("title", title5);
        contentValle5.put("description", description5);
        contentValle5.put("phone", phone5);
        contentValle5.put("email", email5);
        contentValle5.put("coords", coords5);

        return contentValle5;
    }

    public static JSONObject getSixthItemData() throws JSONException {

        contentValle6.put("title", title6);
        contentValle6.put("description", description6);
        contentValle6.put("phone", phone6);
        contentValle6.put("email", email6);
        contentValle6.put("coords", coords6);

        return contentValle6;
    }

    public static JSONObject getSevenththItemData() throws JSONException {

        contentValle7.put("title", title7);
        contentValle7.put("description", description7);
        contentValle7.put("phone", phone7);
        contentValle7.put("email", email7);
        contentValle7.put("coords", coords7);

        return contentValle7;
    }

    public static JSONObject getEighthItemData() throws JSONException {

        contentValle8.put("title", title8);
        contentValle8.put("description", description8);
        contentValle8.put("phone", phone8);
        contentValle8.put("email", email8);
        contentValle8.put("coords", coords8);

        return contentValle8;
    }

    public static JSONObject getNinthItemData() throws JSONException {

        contentValle9.put("title", title9);
        contentValle9.put("description", description9);
        contentValle9.put("phone", phone9);
        contentValle9.put("email", email9);
        contentValle9.put("coords", coords9);

        return contentValle9;
    }

    public static JSONObject getTenthItemData() throws JSONException {

        contentValle10.put("title", title10);
        contentValle10.put("description", description10);
        contentValle10.put("phone", phone10);
        contentValle10.put("email", email10);
        contentValle10.put("coords", coords10);

        return contentValle10;
    }

    public static JSONObject getEleventhItemData() throws JSONException {

        contentValle11.put("title", title11);
        contentValle11.put("description", description11);
        contentValle11.put("phone", phone11);
        contentValle11.put("email", email11);
        contentValle11.put("coords", coords11);

        return contentValle11;
    }

    public static JSONObject getTwelvethItemData() throws JSONException {

        contentValle12.put("title", title12);
        contentValle12.put("description", description12);
        contentValle12.put("phone", phone12);
        contentValle12.put("email", email12);
        contentValle12.put("coords", coords12);

        return contentValle12;
    }

    public static JSONObject getThirdteenthItemData() throws JSONException {

        contentValle13.put("title", title13);
        contentValle13.put("description", description13);
        contentValle13.put("phone", phone13);
        contentValle13.put("email", email13);
        contentValle13.put("coords", coords13);

        return contentValle13;
    }

    public static JSONObject getFourteenthItemData() throws JSONException {

        contentValle14.put("title", title14);
        contentValle14.put("description", description14);
        contentValle14.put("phone", phone14);
        contentValle14.put("email", email14);
        contentValle14.put("coords", coords14);

        return contentValle14;
    }

    public static JSONObject getFifteenthItemData() throws JSONException {

        contentValle15.put("title", title15);
        contentValle15.put("description", description15);
        contentValle15.put("phone", phone15);
        contentValle15.put("email", email15);
        contentValle15.put("coords", coords15);

        return contentValle15;
    }
}
