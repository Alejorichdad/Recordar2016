package com.clubrecordar.recordar2016.helpers.detail;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by willians on 29/7/16.
 */
public class DetailNational {
    public static JSONObject mainContentNational =  new JSONObject();
    public static JSONObject contentNational1 =  new JSONObject();
    public static JSONObject contentNational2 =  new JSONObject();
    public static JSONObject contentNational3 =  new JSONObject();
    public static JSONObject contentNational4 =  new JSONObject();
    public static JSONObject contentNational5 =  new JSONObject();
    public static JSONObject contentNational6 =  new JSONObject();
    public static JSONObject contentNational7 =  new JSONObject();
    public static JSONObject contentNational8 =  new JSONObject();
    public static JSONObject contentNational9 =  new JSONObject();
    public static JSONObject contentNational10 =  new JSONObject();
    public static JSONObject contentNational11 =  new JSONObject();
    public static JSONObject contentNational12 =  new JSONObject();
    public static JSONObject contentNational13 =  new JSONObject();
    public static JSONObject contentNational14 =  new JSONObject();
    public static JSONObject contentNational15 =  new JSONObject();

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


    public static void addObjectsNational(){
        try {

            mainContentNational.put("item1", getFirstItemData());
            mainContentNational.put("item2", getSecItemData());
            mainContentNational.put("item3", getThirdItemData());
            mainContentNational.put("item4", getFourItemData());
            mainContentNational.put("item5", getFifthItemData());
            mainContentNational.put("item6", getSixthItemData());
            mainContentNational.put("item7", getSevenththItemData());
            mainContentNational.put("item8", getEighthItemData());
            mainContentNational.put("item9", getNinthItemData());
            mainContentNational.put("item10", getTenthItemData());
            mainContentNational.put("item11", getEleventhItemData());
            mainContentNational.put("item12", getTwelvethItemData());
            mainContentNational.put("item13", getThirdteenthItemData());
            mainContentNational.put("item14", getFourteenthItemData());
            mainContentNational.put("item15", getFifteenthItemData());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getDetailNational(){
        addObjectsNational();
        return mainContentNational;
    }

    public static JSONObject getFirstItemData() throws JSONException {

        contentNational1.put("title", title1);
        contentNational1.put("description", description1);
        contentNational1.put("phone", phone1);
        contentNational1.put("email", email1);
        contentNational1.put("coords", coords1);

        return contentNational1;
    }

    public static JSONObject getSecItemData() throws JSONException {

        contentNational2.put("title", title2);
        contentNational2.put("description", description2);
        contentNational2.put("phone", phone2);
        contentNational2.put("email", email2);
        contentNational2.put("coords", coords2);

        return contentNational2;
    }

    public static JSONObject getThirdItemData() throws JSONException {

        contentNational3.put("title", title3);
        contentNational3.put("description", description3);
        contentNational3.put("phone", phone3);
        contentNational3.put("email", email3);
        contentNational3.put("coords", coords3);

        return contentNational3;
    }

    public static JSONObject getFourItemData() throws JSONException {

        contentNational4.put("title", title4);
        contentNational4.put("description", description4);
        contentNational4.put("phone", phone4);
        contentNational4.put("email", email4);
        contentNational4.put("coords", coords4);

        return contentNational4;
    }

    public static JSONObject getFifthItemData() throws JSONException {

        contentNational5.put("title", title5);
        contentNational5.put("description", description5);
        contentNational5.put("phone", phone5);
        contentNational5.put("email", email5);
        contentNational5.put("coords", coords5);

        return contentNational5;
    }

    public static JSONObject getSixthItemData() throws JSONException {

        contentNational6.put("title", title6);
        contentNational6.put("description", description6);
        contentNational6.put("phone", phone6);
        contentNational6.put("email", email6);
        contentNational6.put("coords", coords6);

        return contentNational6;
    }

    public static JSONObject getSevenththItemData() throws JSONException {

        contentNational7.put("title", title7);
        contentNational7.put("description", description7);
        contentNational7.put("phone", phone7);
        contentNational7.put("email", email7);
        contentNational7.put("coords", coords7);

        return contentNational7;
    }

    public static JSONObject getEighthItemData() throws JSONException {

        contentNational8.put("title", title8);
        contentNational8.put("description", description8);
        contentNational8.put("phone", phone8);
        contentNational8.put("email", email8);
        contentNational8.put("coords", coords8);

        return contentNational8;
    }

    public static JSONObject getNinthItemData() throws JSONException {

        contentNational9.put("title", title9);
        contentNational9.put("description", description9);
        contentNational9.put("phone", phone9);
        contentNational9.put("email", email9);
        contentNational9.put("coords", coords9);

        return contentNational9;
    }

    public static JSONObject getTenthItemData() throws JSONException {

        contentNational10.put("title", title10);
        contentNational10.put("description", description10);
        contentNational10.put("phone", phone10);
        contentNational10.put("email", email10);
        contentNational10.put("coords", coords10);

        return contentNational10;
    }

    public static JSONObject getEleventhItemData() throws JSONException {

        contentNational11.put("title", title11);
        contentNational11.put("description", description11);
        contentNational11.put("phone", phone11);
        contentNational11.put("email", email11);
        contentNational11.put("coords", coords11);

        return contentNational11;
    }

    public static JSONObject getTwelvethItemData() throws JSONException {

        contentNational12.put("title", title12);
        contentNational12.put("description", description12);
        contentNational12.put("phone", phone12);
        contentNational12.put("email", email12);
        contentNational12.put("coords", coords12);

        return contentNational12;
    }

    public static JSONObject getThirdteenthItemData() throws JSONException {

        contentNational13.put("title", title13);
        contentNational13.put("description", description13);
        contentNational13.put("phone", phone13);
        contentNational13.put("email", email13);
        contentNational13.put("coords", coords13);

        return contentNational13;
    }

    public static JSONObject getFourteenthItemData() throws JSONException {

        contentNational14.put("title", title14);
        contentNational14.put("description", description14);
        contentNational14.put("phone", phone14);
        contentNational14.put("email", email14);
        contentNational14.put("coords", coords14);

        return contentNational14;
    }

    public static JSONObject getFifteenthItemData() throws JSONException {

        contentNational15.put("title", title15);
        contentNational15.put("description", description15);
        contentNational15.put("phone", phone15);
        contentNational15.put("email", email15);
        contentNational15.put("coords", coords15);

        return contentNational15;
    }

}
