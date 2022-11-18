package com.example.android.notepad;

import static java.io.File.separatorChar;

import android.app.Activity;
import android.os.Environment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.notepad.util.Toast;

import java.io.FileWriter;
import java.io.IOException;

public class Storage extends Activity implements View.OnClickListener {

    private EditText et;
    private TextView tx;
    private FileWriter fw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.storage);
        et = findViewById(R.id.s_et);
        tx = findViewById(R.id.s_tx);
        findViewById(R.id.s_bt_cancel).setOnClickListener(this);
        findViewById(R.id.s_bt_confirm).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.s_bt_cancel:
                finish();
                break;
            case R.id.s_bt_confirm:
                String filename = et.getText().toString();
                //拿到文件名
                String content = getIntent().getExtras().getString("Content");
                //拿到文本
                String path = getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).toString() + separatorChar + filename + ".doc";
                //拿到文件存储位置
                Log.d("ning", path+content+filename);
                try {
                    fw = new FileWriter(path);
                    fw.write(content); //写入存储
                } catch (IOException e) {
                    e.printStackTrace();
                }
                finally {
                    if(fw != null){
                        try {
                            fw.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                finish();
        }

    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.show(this, "保存成功");
    }
}