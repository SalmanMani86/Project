package com.example.project_final.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.project_final.Buyers.HomeActivity;
import com.example.project_final.Buyers.MainActivity;
import com.example.project_final.R;
import com.example.project_final.Sellers.SellerAddnewProductActivity;
import com.example.project_final.Sellers.SellerProductCategoryActivity;

public class AdminHomeActivity extends AppCompatActivity {
    private Button logoutBtn , checkOrdersBtn,maintainProductsBtn,checkApproveProductsBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        logoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        checkOrdersBtn = (Button) findViewById(R.id.check_orders_btn);
        maintainProductsBtn = (Button) findViewById(R.id.maintain_btn);
        checkApproveProductsBtn = (Button) findViewById(R.id.check_approve_products_btn);

        maintainProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeActivity.this , HomeActivity.class);
                intent.putExtra("com/example/project_final/Admin", "com/example/project_final/Admin");
                startActivity(intent);
            }
        });


        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeActivity.this , MainActivity.class);
                intent.putExtra("com/example/project_final/Admin", "com/example/project_final/Admin");
                startActivity(intent);
                finish();
            }
        });

        checkOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeActivity.this , AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });

        checkApproveProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeActivity.this ,AdminCheckNewProductsActivity.class);
                startActivity(intent);
            }
        });




    }
}