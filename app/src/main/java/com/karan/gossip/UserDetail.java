package com.karan.gossip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.karan.gossip.R;

public class UserDetail extends AppCompatActivity {

    String Name;
    EditText nameEditText;

    public void sendName(View view){
        Name = nameEditText.getText().toString();
        Intent mIntent = new Intent(this, MainActivity.class);
        mIntent.putExtra("Name", Name);
        startActivity(mIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        nameEditText = (EditText) findViewById(R.id.nameEditText);
    }
}
