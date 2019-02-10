package com.rds.firstlook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private TextView mTextView;
    private EditText mEditText;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mButton = (Button) findViewById(R.id.mButton);
       mTextView = (TextView) findViewById(R.id.mTextView);
       mEditText = (EditText)findViewById(R.id.mEditText);

       mButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String enteredName = mEditText.getText().toString();
               if (enteredName.length() > 0) {
                   mTextView.setText(getResources().getString(R.string.prefix_text) + " " + enteredName);
                   mTextView.setVisibility(View.VISIBLE);
               } else {
                   mTextView.setText(R.string.warning_edit_text);
                   mTextView.setVisibility(View.VISIBLE);
               }
           }

       });



    }

//    public void ShowTextView (View view) {
//        mTextView.setVisibility(View.VISIBLE);
//        mTextView.setText(R.string.show_text);
//    }
}
