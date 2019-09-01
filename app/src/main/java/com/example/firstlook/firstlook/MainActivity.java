package com.example.firstlook.firstlook;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.firstlook.firstlook.R.drawable.ic_launcher_background;

public class MainActivity extends AppCompatActivity {

    //create Button object in the class main - to be able to code with it
    //private Button hiButton;
    //create TextView object to handle it (as we have it in design view);
    //create EditText object (after adding itin the design  view);

    private Button clickButton;
    private TextView mTextView;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //below are handlers to the widgets - (event-handlers)- can be used in onClick method

        //instantiate Button object in the method - onCreate - creating the view with all its objects
       clickButton=(Button)findViewById(R.id.clickButton); // (Button) - casts the method args to Button object bi id - to return Button value -
        //code file connects -gets access to the widget button in xml file - it's properties and methods

       mTextView=(TextView)findViewById(R.id.mTextView);// casting to obj TextView

        mEditText=(EditText)findViewById(R.id.editText);



        // hiButton=(Button)findViewById(R.id.hiButton);// (Button) - casts the method args to Button object bi id - to return Button value -
        //code file connects -gets access to the widget button in xml file - it's properties and methods:


        //to change the name of the button:
        clickButton.setText(R.string.button_name);

        //to attach events to objects - event-handlers: inside the OnCreate method!
        clickButton.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                               String enteredText;
           //need to cast the value of getText toString - though the method toString();
                                               //getText takes the value entered by the user:
                                               enteredText=mEditText.getText().toString();

                                            //to make textView visible
                                               mTextView.setVisibility(View.VISIBLE);
                                               //mTextView.setText(R.string.show_text);
            // now instead of the string show-_text - TextView will show the text ,entered in the Edit text
                                               mTextView.setText(enteredText);
                                           }
        });
                // event created with OnClickListener


      //  hiButton.setText("HEllO Stranger!");// rewrote var -buttonText in the method. but initial text is still the same in xml
        //but it's a bad practice to hard-code text like that!
        //because you will have to manually do it in every java file (since the value remains as in xml)
//should change text f strings - in the string xml file!

        //the correct way to use seText method:
        //hiButton.setText(R.string.button_name);

        //hiButton.setBackgroundColor(Color.LTGRAY);
        //hiButton.setTextSize(16);
        //hiButton.setMinHeight(10);
        //hiButton.setMinWidth(80);//???
        //hiButton.setTextColor(Color.CYAN);

    }

   // public void ShowMe(View view){
     //   mTextView.setText(R.string.show_text);
        //to make textView visible
       // mTextView.setVisibility(View.VISIBLE);
    //}

    //instead of creating special method - there's a better - more android way -
    //to attach events to objects - event-handlers: inside the OnCreate method!



}
