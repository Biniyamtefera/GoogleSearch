package com.search.utilities;

public class BrowserUtils {
    /*
    method that will accept int wait
    for given second duration
     */

    public static void sleep(int second) {
        second *= 1000;// second = second* 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
