package com.yann.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] data = { "Apple", "Banana", "Orange", "Watermelon",
            "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango" };

    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.lv_test);
        initFruits(); // 初始化水果数据
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        listView.setAdapter(adapter);
    }

    private void initFruits() {
        Fruit apple = new Fruit("Apple", R.drawable.ic_launcher_background);
        fruitList.add(apple);
        Fruit banana = new Fruit("Banana", R.drawable.ic_launcher_background);
        fruitList.add(banana);
        Fruit orange = new Fruit("Orange", R.drawable.ic_launcher_background);
        fruitList.add(orange);
        Fruit watermelon = new Fruit("Watermelon", R.drawable.ic_launcher_background);
        fruitList.add(watermelon);
        Fruit pear = new Fruit("Pear", R.drawable.ic_launcher_background);
        fruitList.add(pear);
        Fruit grape = new Fruit("Grape", R.drawable.ic_launcher_background);
        fruitList.add(grape);
        Fruit pineapple = new Fruit("Pineapple", R.drawable.ic_launcher_background);
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("Strawberry", R.drawable.ic_launcher_background);
        fruitList.add(strawberry);
        Fruit cherry = new Fruit("Cherry", R.drawable.ic_launcher_background);
        fruitList.add(cherry);
        Fruit mango = new Fruit("Mango", R.drawable.ic_launcher_background);
        fruitList.add(mango);
    }

}