package com.airtel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Ques1 {

    public static void main(String[] args) throws ParseException {

        String R = "23:05:38";

        String[] p =  {"23:05:38", "23:05:02", "20:04:38"};

        System.out.println();
        String[] presp =  getDiffs(R,1, p);
        for (String s : presp) {
            System.out.println(s);
        }


    }

    public static String[] getDiffs(String R, int N, String[] P ) throws ParseException {

        List<String> response = new ArrayList<>();

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date now = format.parse(R);
        String resp = "";

        for (String s : P) {

            Date date = format.parse(s);

            long difference = now.getTime() - date.getTime();
            int intDiff = (int) ((difference / 1000) % 60);
            int minutes = (int) ((difference / 1000) / 60);
            int hours = (int) ((difference / 1000) / 60 / 60);
            if (difference == 0 ) {
                response.add("now");
            } else if (intDiff > 0 && intDiff < 60) {
                resp = Math.abs(intDiff) + " seconds ago";
                response.add(resp);
            } else if (minutes >= 1  &&  minutes < 60) {
                resp = Math.abs(minutes) + " minutes ago";
                response.add(resp);
            } else {
                resp = Math.abs(hours) + " hours ago";
                response.add(resp);
            }

        }
        return response.stream().toArray(String[] ::new);
    }

    /*public static String diff(long difference) {
        String resp = "";

        int sec = (int) ((difference / 1000) % 60);
        if (Math.abs(sec) < 59) {
            if (sec < 0)  {
                resp = Math.abs(sec) + " seconds ago";
                return resp;
            } else {
                resp = Math.abs(sec) + " seconds ago";
                return resp;
            }
        }

    }*/
}
