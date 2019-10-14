package com.example.homework1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class MyAdapter extends BaseAdapter {
    List<Map<String,Object>> list;
    LayoutInflater inflater;

    public MyAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    public void setList(List<Map<String, Object>> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.course_list_item,null);

        TextView name = (TextView) view.findViewById(R.id.name);
        TextView dept = (TextView) view.findViewById(R.id.dept);
        TextView teacher = (TextView) view.findViewById(R.id.teacher);

        Map map = list.get(position);
        name.setText((String) map.get("name"));
        dept.setText((String) map.get("dept"));
        teacher.setText((String) map.get("teacher"));

        return view;
    }
}
