package com.example.scorpio.killthead;

import android.app.ActivityManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private ActivityManager am;//相当于进程管理器
    private EditText et_packname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        am = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
        et_packname = (EditText) findViewById(R.id.et_packname);
        
    }

    public void click(View view) {
        String packname = et_packname.getText().toString().trim();
        am.killBackgroundProcesses(packname);
        //杀死空进程和后台进程
    }
}
