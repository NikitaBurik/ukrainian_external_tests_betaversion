package com.diplom.nck.externaltesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);
    }

    public void Ukr16 (View view){
        Intent i = new Intent(this,Ukr16Activity.class);
        startActivity(i);
    }
    public void Phys16 (View view){
        Intent i = new Intent(this,Physics16Activity.class);
        startActivity(i);
    }
    public void Math16(View view){
        Intent i = new Intent(this,Math16Activity.class);
        startActivity(i);
    }
}
