package com.example.android.notepad.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class MyDBHelper extends SQLiteOpenHelper {
    private static final String NAME_DB = "note_pad.db";
    private static MyDBHelper mHelper = null;
    private SQLiteDatabase rDB;

    private MyDBHelper(Context context) {
        super(context, NAME_DB, null, 2);
    }
    public static MyDBHelper getInstance(Context context){
        if (mHelper == null){
             mHelper = new MyDBHelper(context);
        }
        return mHelper;
    }

    public SQLiteDatabase getrDB() {
        if (rDB == null || !rDB.isOpen()){
        rDB = mHelper.getReadableDatabase();
        }
        return rDB;
    }
    public void close(){
        if(rDB != null && rDB.isOpen()){
            rDB.close();
            rDB = null;
        }
    }
//    public SQLiteDatabase getWritableDatabase() {
//        if (wDB == null || !wDB.isOpen()){
//            wDB = mHelper.getWritableDatabase();
//        }
//        return wDB;
//    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
