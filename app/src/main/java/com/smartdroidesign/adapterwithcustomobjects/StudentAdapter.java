package com.smartdroidesign.adapterwithcustomobjects;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter {
    private final LayoutInflater inflater;
    Activity context;
    ArrayList<Student> students;

    public StudentAdapter(Activity context, ArrayList<Student> students) {
        this.context = context;
        this.students = students;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int position) {
        return students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        itemView = (itemView == null) ? inflater.inflate(R.layout.list_item, null): itemView;
        TextView textViewName = itemView.findViewById(R.id.listItem_student_name);
        TextView textViewEmail = itemView.findViewById(R.id.listItem_student_email);
        Student selectedStudent = students.get(position);
        textViewName.setText(selectedStudent.getName());
        textViewEmail.setText(selectedStudent.getEmail());
        return itemView;
    }
}
