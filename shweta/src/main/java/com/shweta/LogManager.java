package com.shweta;

import android.util.Log;

/**
 * Created by pcube105 on 5/18/2017.
 */

public class LogManager {

    public static String TAG = "LogManager";

    public static void debug(String message){

        Log.d(TAG, message);
    }
}
