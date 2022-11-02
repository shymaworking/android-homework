package com.example.dialogs;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity3 extends AppCompatActivity {
    private SimpleAdapter mAdapter;
    private String[] texts = new String[]{"One","Two","Three","Four","Five"};
    private int[] icons =  new int[]{R.drawable.icon,R.drawable.icon,R.drawable.icon,R.drawable.icon,R.drawable.icon};

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        List<Map<String, Object>> listitems = new ArrayList<>();
        for (int i = 0; i < texts.length; i++) {
            Map<String, Object> listitem = new HashMap<>();
            listitem.put("icon", icons[i]);
            listitem.put("text", texts[i]);
            listitems.add(listitem);
        }
        mAdapter = new SimpleAdapter(this, listitems, R.layout.simple_4, new String[]{"icon", "text"}, new int[]{R.id.icon, R.id.text});
        ListView list = findViewById(R.id.list_3);
        list.setAdapter(mAdapter);
    }
}