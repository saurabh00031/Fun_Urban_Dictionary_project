package com.example.sss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] tStory=getResources().getStringArray(R.array.title_story) ;
        String[] dStory=getResources().getStringArray(R.array.details_story) ;

        listView=findViewById(R.id.list);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,tStory);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
            {

                    String t=dStory[position];
                    Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("story",t);
                    startActivity(intent);
            }


        });
    }
}