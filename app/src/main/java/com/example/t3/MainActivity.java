package com.example.t3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.TooManyListenersException;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<modelactivity>Heros_List;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();


    }

    private void initData() {

        Heros_List = new ArrayList<>();
        //Assign variables
        //listView = findViewById(R.id.list_view);

        //Initialize JSON Array
        String Heros_array = "{\"Heros\":[{\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"A-Bomb\",\n" +
                "    \"slug\": \"1-a-bomb\",\n" +
                "    \"powerstats\": {\n" +
                "      \"intelligence\": 38,\n" +
                "      \"strength\": 100,\n" +
                "      \"speed\": 17,\n" +
                "      \"durability\": 80,\n" +
                "      \"power\": 24,\n" +
                "      \"combat\": 64\n" +
                "    },\n" +
                "    \"appearance\": {\n" +
                "      \"gender\": \"Male\",\n" +
                "      \"race\": \"Human\",\n" +
                "      \"height\": [\n" +
                "        \"6'8\",\n" +
                "        \"203 cm\"\n" +
                "      ],\n" +
                "      \"weight\": [\n" +
                "        \"980 lb\",\n" +
                "        \"441 kg\"\n" +
                "      ],\n" +
                "      \"eyeColor\": \"Yellow\",\n" +
                "      \"hairColor\": \"No Hair\"\n" +
                "    },\n" +
                "    \"biography\": {\n" +
                "      \"fullName\": \"Richard Milhouse Jones\",\n" +
                "      \"alterEgos\": \"No alter egos found.\",\n" +
                "      \"aliases\": [\n" +
                "        \"Rick Jones\"\n" +
                "      ],\n" +
                "      \"placeOfBirth\": \"Scarsdale, Arizona\",\n" +
                "      \"firstAppearance\": \"Hulk Vol 2 #2 (April, 2008) (as A-Bomb)\",\n" +
                "      \"publisher\": \"Marvel Comics\",\n" +
                "      \"alignment\": \"good\"\n" +
                "    },\n" +
                "    \"work\": {\n" +
                "      \"occupation\": \"Musician, adventurer, author; formerly talk show host\",\n" +
                "      \"base\": \"-\"\n" +
                "    },\n" +
                "    \"connections\": {\n" +
                "      \"groupAffiliation\": \"Hulk Family; Excelsior (sponsor), Avengers (honorary member); formerly partner of the Hulk, Captain America and Captain Marvel; Teen Brigade; ally of Rom\",\n" +
                "      \"relatives\": \"Marlo Chandler-Jones (wife); Polly (aunt); Mrs. Chandler (mother-in-law); Keith Chandler, Ray Chandler, three unidentified others (brothers-in-law); unidentified father (deceased); Jackie Shorr (alleged mother; unconfirmed)\"\n" +
                "    },\n" +
                "    \"images\": {\n" +
                "      \"xs\": \"https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/xs/1-a-bomb.jpg\",\n" +
                "      \"sm\": \"https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/1-a-bomb.jpg\",\n" +
                "      \"md\": \"https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg\",\n" +
                "      \"lg\": \"https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/1-a-bomb.jpg\"\n" +
                "    }]}";                                                                  //json add here

        //Fetch JSON Array
        try {
            JSONObject jsonObject = new JSONObject(Heros_array);
            JSONArray jsonArray = jsonObject.getJSONArray("Heros");
            for (int i=0; i<jsonArray.length();i++){
                JSONObject object = jsonArray.getJSONObject(i);
                String HerosID = object.getString("id");

                //the sub json brackets


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }




    }

    private void initRecyclerView() {

        recyclerView=findViewById(R.id.recycler_view);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(Heros_List);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}