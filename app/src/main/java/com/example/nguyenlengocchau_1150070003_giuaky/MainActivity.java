package com.example.nguyenlengocchau_1150070003_giuaky;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    // Menu đơn giản
    String[] foods = {
            "🍔 Burger",
            "🍟 Khoai tây chiên",
            "🌭 Hotdog",
            "🍕 Pizza",
            "🥤 Pepsi",
            "🍗 Gà rán",
            "🥪 Sandwich"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        // Adapter để hiển thị dữ liệu trong ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                foods
        );

        listView.setAdapter(adapter);

        // Bắt sự kiện khi chọn món ăn
        listView.setOnItemClickListener((parent, view, position, id) -> {
            String item = foods[position];
            Toast.makeText(this, "Bạn chọn: " + item, Toast.LENGTH_SHORT).show();
        });
    }
}
