package com.example.firstlook.firstlook;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import static com.example.firstlook.firstlook.R.drawable.ic_launcher_background;

public class MainActivity extends AppCompatActivity {

    //create Button object in the class main - to be able to code with it
    private Button hiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);

        //instantiate Button object in the method - onCreate - creating the view with all its objects
        hiButton=(Button)findViewById(R.id.hiButton);// (Button) - casts the method args to Button object bi id - to return Button value -
        //code file connects -gets access to the widget button in xml file - it's properties and methods:
        hiButton.setText("HEllO Stranger!");// rewrote var -buttonText in the method. but initial text is still the same in xml
        hiButton.setBackgroundColor(Color.LTGRAY);
        hiButton.setTextSize(16);
        hiButton.setMinHeight(10);
        hiButton.setMinWidth(80);//???
        hiButton.setTextColor(Color.CYAN);



    }
}
