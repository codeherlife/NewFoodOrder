package com.codeherlife.newfoodorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

public class AddFood extends AppCompatActivity {

    private ImageButton foodImage;
    private static final int GALLREQ = 1;
    private EditText name, desc, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);

        name = (EditText) findViewById(R.id.itemName);
        desc = (EditText) findViewById(R.id.itemDesc);
        price = (EditText) findViewById(R.id.itemPrice);
    }
}
