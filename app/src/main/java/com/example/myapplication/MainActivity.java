package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
//    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //显式跳转
        Button btn = findViewById(R.id.btn);//根据id获取button按钮
        btn.setOnClickListener(new View.OnClickListener() {//对button按钮设置点击监听
            @Override
            public void onClick(View v) {//当点击button按钮时跳转页面
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);//启动Activity
            }
        });

        //隐式跳转
        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("abc");  //匹配action的name
                intent.addCategory("def");//匹配除了默认category以外的category名
                startActivity(intent);
            }
        });

        /**
         * 敲黑板，划重点
         * 根据隐式跳转的优缺点可以看出，隐式跳转一般不适用于activity之间的跳转
         * 隐式跳转多用于打开内置(如浏览器等)
         */
        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                /**
                 * 用于显示用户的数据。比较通用，会根据用户的数据类型打开相应的Activity。
                 * 比如tel:13400010001打开拨号程序，http://www.baidu.com则会打开浏览器等。
                 */
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });
    }
}
