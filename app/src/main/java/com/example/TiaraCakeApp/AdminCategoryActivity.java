package com.example.TiaraCakeApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView gmbr1, gmbr2, gmbr3, gmbr4;
    private ImageView gmbr5, gmbr6, gmbr7, gmbr8;
    private ImageView gmbr9, gmbr10, gmbr11, gmbr12;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });


        gmbr1 = (ImageView) findViewById(R.id.menu4);
        gmbr2 = (ImageView) findViewById(R.id.menu2);
        gmbr3 = (ImageView) findViewById(R.id.menu5);
        gmbr4 = (ImageView) findViewById(R.id.menu3);

        gmbr5 = (ImageView) findViewById(R.id.menu1);
        gmbr6 = (ImageView) findViewById(R.id.menu7);
        gmbr7 = (ImageView) findViewById(R.id.menu5);
        gmbr8 = (ImageView) findViewById(R.id.menu8);

        gmbr9 = (ImageView) findViewById(R.id.menu9);
        gmbr10 = (ImageView) findViewById(R.id.menu10);
        gmbr11 = (ImageView) findViewById(R.id.menu11);
        gmbr12 = (ImageView) findViewById(R.id.menu12);


        gmbr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Menu 4");
                startActivity(intent);
            }
        });
        gmbr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Menu 2");
                startActivity(intent);
            }
        });


        gmbr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Menu 5");
                startActivity(intent);
            }
        });


        gmbr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Menu 3");
                startActivity(intent);
            }
        });


        gmbr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Menu 1");
                startActivity(intent);
            }
        });


        gmbr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Menu 7");
                startActivity(intent);
            }
        });



        gmbr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Menu 6");
                startActivity(intent);
            }
        });


        gmbr8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Menu 8");
                startActivity(intent);
            }
        });



        gmbr9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Menu 9");
                startActivity(intent);
            }
        });


        gmbr10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Menu 10");
                startActivity(intent);
            }
        });


        gmbr11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Menu 11");
                startActivity(intent);
            }
        });


        gmbr12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Mobile Phones");
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(false);

    }
}