package com.example.android.notepad.util;

import android.content.Context;

public class Toast {
    public static void show(Context context,String cont){
       android.widget.Toast.makeText(context,cont, android.widget.Toast.LENGTH_SHORT);
    }
}
