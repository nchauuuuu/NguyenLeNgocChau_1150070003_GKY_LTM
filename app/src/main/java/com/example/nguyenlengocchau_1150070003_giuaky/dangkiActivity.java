package com.example.nguyenlengocchau_1150070003_giuaky;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class dangkiActivity extends AppCompatActivity {
    EditText edtUsername, edtPassword, edtConfirmPassword;
    Button btnRegister;
    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangki);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        edtConfirmPassword = findViewById(R.id.edtConfirmPassword);
        btnRegister = findViewById(R.id.btnRegister);
        tvLogin = findViewById(R.id.tvLogin);

        btnRegister.setOnClickListener(v -> {
            String user = edtUsername.getText().toString();
            String pass = edtPassword.getText().toString();
            String confirm = edtConfirmPassword.getText().toString();

            if(user.isEmpty() || pass.isEmpty() || confirm.isEmpty()){
                Toast.makeText(this, "Vui lòng nhập đủ thông tin", Toast.LENGTH_SHORT).show();
            } else if(!pass.equals(confirm)){
                Toast.makeText(this, "Mật khẩu xác nhận không khớp", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Đăng ký thành công!", Toast.LENGTH_SHORT).show();
                // Quay về đăng nhập
                startActivity(new Intent(dangkiActivity.this, dangnhapActivity.class));
                finish();
            }
        });

        tvLogin.setOnClickListener(v -> {
            startActivity(new Intent(dangkiActivity.this, dangnhapActivity.class));
            finish();
        });
    }
}
