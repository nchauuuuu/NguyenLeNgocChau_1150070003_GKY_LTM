package com.example.nguyenlengocchau_1150070003_giuaky;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {
    ImageView imgFood;
    TextView tvName, tvPrice, tvDescription;
    Button btnAddCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        imgFood = findViewById(R.id.imgFood);
        tvName = findViewById(R.id.tvName);
        tvPrice = findViewById(R.id.tvPrice);
        tvDescription = findViewById(R.id.tvDescription);
        btnAddCart = findViewById(R.id.btnAddCart);

        // Lấy dữ liệu từ MainActivity
        String name = getIntent().getStringExtra("foodName");
        int image = getIntent().getIntExtra("foodImage", R.drawable.ic_launcher_foreground);
        String price = getIntent().getStringExtra("foodPrice");
        String desc = getIntent().getStringExtra("foodDesc");

        // Hiển thị dữ liệu
        tvName.setText(name);
        tvPrice.setText("Giá: " + price);
        tvDescription.setText(desc);
        imgFood.setImageResource(image);

        // Sự kiện thêm giỏ hàng
        btnAddCart.setOnClickListener(v -> {
            Toast.makeText(this, name + " đã thêm vào giỏ hàng 🛒", Toast.LENGTH_SHORT).show();
        });
    }
}
