package com.example.saibahmed.wampserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Username,Password;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username=(EditText)findViewById(R.id.edittext1);
        Password=(EditText)findViewById(R.id.edittext2);
        btn=(Button)findViewById(R.id.button);
    }
    //kya problem aa rhi hai?>
    //login success wali coomand nhi run horhi

    public void OnLogin(View view){
        String username=Username.getText().toString();
        String password=Password.getText().toString();
        String type="login";

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type,username,password);
    }
}
