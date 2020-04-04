package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                intent.putExtra("who", "Me");
                intent.putExtra("person", new Person("张三", 21, "三里屯"));
                startActivity(intent);
            }
        });
    }
}

/**
 * 敲黑板，划重点
 * intent要传递对象有以下两种方法
 * 1、类实现Serializable,Java提供的序列化的接口
 * 2、类实现Parcelable,Android提供的在移动端的序列化接口，效率更高
 */
class Person implements Serializable {
    String name; //姓名
    int age;     //年龄
    String addr; //住址

    public Person(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }
}