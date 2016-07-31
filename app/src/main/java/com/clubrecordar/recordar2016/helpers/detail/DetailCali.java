package com.clubrecordar.recordar2016.helpers.detail;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by willians on 31/7/16.
 */
public class DetailCali {

    public static JSONObject mainContentCali =  new JSONObject();
    public static JSONObject contentCali1 =  new JSONObject();
    public static JSONObject contentCali2 =  new JSONObject();
    public static JSONObject contentCali3 =  new JSONObject();
    public static JSONObject contentCali4 =  new JSONObject();
    public static JSONObject contentCali5 =  new JSONObject();
    public static JSONObject contentCali6 =  new JSONObject();
    public static JSONObject contentCali7 =  new JSONObject();
    public static JSONObject contentCali8 =  new JSONObject();
    public static JSONObject contentCali9 =  new JSONObject();
    public static JSONObject contentCali10 =  new JSONObject();
    public static JSONObject contentCali11 =  new JSONObject();
    public static JSONObject contentCali12 =  new JSONObject();
    public static JSONObject contentCali13 =  new JSONObject();
    public static JSONObject contentCali14 =  new JSONObject();
    public static JSONObject contentCali15 =  new JSONObject();

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


    public static void addObjectsCali(){
        try {

            mainContentCali.put("item1", getFirstItemData());
            mainContentCali.put("item2", getSecItemData());
            mainContentCali.put("item3", getThirdItemData());
            mainContentCali.put("item4", getFourItemData());
            mainContentCali.put("item5", getFifthItemData());
            mainContentCali.put("item6", getSixthItemData());
            mainContentCali.put("item7", getSevenththItemData());
            mainContentCali.put("item8", getEighthItemData());
            mainContentCali.put("item9", getNinthItemData());
            mainContentCali.put("item10", getTenthItemData());
            mainContentCali.put("item11", getEleventhItemData());
            mainContentCali.put("item12", getTwelvethItemData());
            mainContentCali.put("item13", getThirdteenthItemData());
            mainContentCali.put("item14", getFourteenthItemData());
            mainContentCali.put("item15", getFifteenthItemData());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getDetailCali(){
        addObjectsCali();
        return mainContentCali;
    }

    public static JSONObject getFirstItemData() throws JSONException {

        contentCali1.put("title", title1);
        contentCali1.put("description", description1);
        contentCali1.put("phone", phone1);
        contentCali1.put("email", email1);
        contentCali1.put("coords", coords1);

        return contentCali1;
    }

    public static JSONObject getSecItemData() throws JSONException {

        contentCali2.put("title", title2);
        contentCali2.put("description", description2);
        contentCali2.put("phone", phone2);
        contentCali2.put("email", email2);
        contentCali2.put("coords", coords2);

        return contentCali2;
    }

    public static JSONObject getThirdItemData() throws JSONException {

        contentCali3.put("title", title3);
        contentCali3.put("description", description3);
        contentCali3.put("phone", phone3);
        contentCali3.put("email", email3);
        contentCali3.put("coords", coords3);

        return contentCali3;
    }

    public static JSONObject getFourItemData() throws JSONException {

        contentCali4.put("title", title4);
        contentCali4.put("description", description4);
        contentCali4.put("phone", phone4);
        contentCali4.put("email", email4);
        contentCali4.put("coords", coords4);

        return contentCali4;
    }

    public static JSONObject getFifthItemData() throws JSONException {

        contentCali5.put("title", title5);
        contentCali5.put("description", description5);
        contentCali5.put("phone", phone5);
        contentCali5.put("email", email5);
        contentCali5.put("coords", coords5);

        return contentCali5;
    }

    public static JSONObject getSixthItemData() throws JSONException {

        contentCali6.put("title", title6);
        contentCali6.put("description", description6);
        contentCali6.put("phone", phone6);
        contentCali6.put("email", email6);
        contentCali6.put("coords", coords6);

        return contentCali6;
    }

    public static JSONObject getSevenththItemData() throws JSONException {

        contentCali7.put("title", title7);
        contentCali7.put("description", description7);
        contentCali7.put("phone", phone7);
        contentCali7.put("email", email7);
        contentCali7.put("coords", coords7);

        return contentCali7;
    }

    public static JSONObject getEighthItemData() throws JSONException {

        contentCali8.put("title", title8);
        contentCali8.put("description", description8);
        contentCali8.put("phone", phone8);
        contentCali8.put("email", email8);
        contentCali8.put("coords", coords8);

        return contentCali8;
    }

    public static JSONObject getNinthItemData() throws JSONException {

        contentCali9.put("title", title9);
        contentCali9.put("description", description9);
        contentCali9.put("phone", phone9);
        contentCali9.put("email", email9);
        contentCali9.put("coords", coords9);

        return contentCali9;
    }

    public static JSONObject getTenthItemData() throws JSONException {

        contentCali10.put("title", title10);
        contentCali10.put("description", description10);
        contentCali10.put("phone", phone10);
        contentCali10.put("email", email10);
        contentCali10.put("coords", coords10);

        return contentCali10;
    }

    public static JSONObject getEleventhItemData() throws JSONException {

        contentCali11.put("title", title11);
        contentCali11.put("description", description11);
        contentCali11.put("phone", phone11);
        contentCali11.put("email", email11);
        contentCali11.put("coords", coords11);

        return contentCali11;
    }

    public static JSONObject getTwelvethItemData() throws JSONException {

        contentCali12.put("title", title12);
        contentCali12.put("description", description12);
        contentCali12.put("phone", phone12);
        contentCali12.put("email", email12);
        contentCali12.put("coords", coords12);

        return contentCali12;
    }

    public static JSONObject getThirdteenthItemData() throws JSONException {

        contentCali13.put("title", title13);
        contentCali13.put("description", description13);
        contentCali13.put("phone", phone13);
        contentCali13.put("email", email13);
        contentCali13.put("coords", coords13);

        return contentCali13;
    }

    public static JSONObject getFourteenthItemData() throws JSONException {

        contentCali14.put("title", title14);
        contentCali14.put("description", description14);
        contentCali14.put("phone", phone14);
        contentCali14.put("email", email14);
        contentCali14.put("coords", coords14);

        return contentCali14;
    }

    public static JSONObject getFifteenthItemData() throws JSONException {

        contentCali15.put("title", title15);
        contentCali15.put("description", description15);
        contentCali15.put("phone", phone15);
        contentCali15.put("email", email15);
        contentCali15.put("coords", coords15);

        return contentCali15;
    }

}
