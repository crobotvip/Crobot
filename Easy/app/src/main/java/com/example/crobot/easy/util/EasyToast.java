package com.example.crobot.easy.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by crobot on 2016/6/1.
 */
public class EasyToast {

    public static void showLongToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void showShortToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
