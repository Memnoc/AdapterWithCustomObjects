package com.smartdroidesign.adapterwithcustomobjects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listViewStudents;
    private ArrayList<Student> students = new ArrayList<>();
    private StudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateListView();
    }

    public void populateListView() {
        listViewStudents = findViewById(R.id.listView_students);
        students.add(new Student("Matteo", "smartdroidesign@gmail.com", ""));
        students.add(new Student("Jim", "jim@gmail.com", ""));
        students.add(new Student("Jack", "jack@gmail.com", ""));
        students.add(new Student("Marius", "marius@gmail.com", ""));
        students.add(new Student("Carl", "carl@gmail.com", ""));
        students.add(new Student("Frank", "frank@gmail.com", ""));
        students.add(new Student("Maurice", "maurice@gmail.com", ""));
        students.add(new Student("Klaus", "klaus@gmail.com", ""));
        students.add(new Student("Elijah", "elijah@gmail.com", ""));
        students.add(new Student("Kol", "kol@gmail.com", ""));
        students.add(new Student("Rebeka", "rebeka@gmail.com", ""));
        students.add(new Student("Mikael", "mikael@gmail.com", ""));
        students.add(new Student("Freya", "freya@gmail.com", ""));
        adapter = new StudentAdapter(this, students);
        listViewStudents.setAdapter(adapter);

        listViewStudents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String student = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, String.valueOf(student), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
