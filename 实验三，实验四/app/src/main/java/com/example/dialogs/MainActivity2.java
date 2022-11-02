package com.example.dialogs;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private TextView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        test = findViewById(R.id.test);
        registerForContextMenu(test);
    }
        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            MenuInflater menuinflater = getMenuInflater();
            menuinflater.inflate(R.menu.menu_2, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            switch (item.getItemId()) {
                case R.id.menu_size_1:
                    test.setTextSize(11);
                    return true;
                case R.id.menu_size_2:
                    test.setTextSize(16);
                    return true;
                case R.id.menu_size_3:
                    test.setTextSize(21);
                    return true;
                case R.id.menu_common:
                    Toast.makeText(MainActivity2.this, "这是普通菜单项", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.menu_color_red:
                    test.setTextColor(Color.RED);
                    return true;
                case R.id.menu_color_yellow:
                    test.setTextColor(Color.YELLOW);
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }
    }
