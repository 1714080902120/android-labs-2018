package com.example.administrator.soft1614080902425;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
public class Soft1614080902425Activity4 extends AppCompatActivity implements View.OnClickListener {
    TextView textview;
    private Button Button;
    Activity now;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soft1614080902425);
        Button = (Button) findViewById(R.id.button);
        Button.setOnClickListener(this);
        now=this;

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                Intent intent=new Intent();
                intent.putExtra("nexttableActivity", "123");
                intent.setClass(now, nexttableActivity.class); //设置跳转的Activity
                now.startActivity(intent);
                break;
            case R.id.button2:
                String str2="2";

                break;

        }
    }
}
