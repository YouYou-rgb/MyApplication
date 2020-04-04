package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView text = findViewById(R.id.text1);//根据id获取文本控件

        Intent intent = getIntent();
        String who = intent.getStringExtra("who");//根据传递的数据类型来定
        Person person = (Person) intent.getExtras().getSerializable("person");
        text.setTextColor(0xffff3030);//设置字体颜色
        text.setText("who:" + who + ",\nperson:" + person);//设置文字内容
    }
}
