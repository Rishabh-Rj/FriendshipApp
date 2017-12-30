package com.example.rishabhjoshi.friendshipapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FriendshipActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendship);
        et1=(EditText) findViewById(R.id.editText1);
        et2=(EditText) findViewById(R.id.editText2);
        tv=(TextView) findViewById(R.id.textView2);
    }//end of onCreate()

    public void FriendshipMeter(View v){
        String name1= et1.getText().toString();
        String name2= et2.getText().toString();

        int len1=name1.length();//8
        int len2=name2.length();//9
        int total= len1 + len2; //17
        int rem= total % 11;
        int percent= rem*10;
        tv.setText("Friendship Meter :"+ percent);
    }
}
