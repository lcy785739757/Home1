package com.example.homework1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course_list extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);

        //1.获取listView对象
        ListView listView = (ListView) findViewById(R.id.lv_main);
        //2.准备数据源
        //String[] data = {"移动应用开发技术","操作系统","数据库","离散数学","微积分","羽毛球","线性代数"};
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("课程名称","00000000");
        map.put("开课院系","软件学院");
        map.put("主讲教师","000");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("课程名称","AAAAAAAA");
        map.put("开课院系","软件学院");
        map.put("主讲教师","aaa");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("课程名称","BBBBBBBB");
        map.put("开课院系","软件学院");
        map.put("主讲教师","bbb");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("课程名称","CCCCCCCC");
        map.put("开课院系","理学院");
        map.put("主讲教师","ccc");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("课程名称","DDDDDDDD");
        map.put("开课院系","软件学院");
        map.put("主讲教师","ddd");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("课程名称","EEEEEEEE");
        map.put("开课院系","软件学院");
        map.put("主讲教师","eee");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("课程名称","FFFFFFFF");
        map.put("开课院系","软件学院");
        map.put("主讲教师","fff");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("课程名称","GGGGGGGG");
        map.put("开课院系","软件学院");
        map.put("主讲教师","ggg");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("课程名称","HHHHHHHH");
        map.put("开课院系","软件学院");
        map.put("主讲教师","hhh");
        list.add(map);

        //3.准备适配器Adapter

        SimpleAdapter adapter = new SimpleAdapter(
                this,
                list,
                R.layout.course_list_item,
                new String[]{"课程名称","开课院系","主讲教师"},
                new int[]{R.id.name,R.id.dept,R.id.teacher}
        );

        /*
        ArrayAdapter<String> adapter
                = new ArrayAdapter<String>(
                        this,//上下文
                        android.R.layout.simple_list_item_1,//行布局
                        data);

        MyAdapter adapter = new MyAdapter(this);
        adapter.setList(list);
        */

        //4.将适配器关联到ListView
        listView.setAdapter(adapter);

        //5.
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);

        Button button_select = (Button) findViewById(R.id.buttonsl);
        button_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),Course_information.class);
                //startIntent.putExtra("com.example.homework1.someting","Hello World");
                startActivity(a);
            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent a = new Intent(getApplicationContext(),Course_information.class);
        //startIntent.putExtra("com.example.homework1.someting","Hello World");
        startActivity(a);
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent a = new Intent(getApplicationContext(),Course_resources.class);
        //startIntent.putExtra("com.example.homework1.someting","Hello World");
        startActivity(a);
        return false;
    }
}
