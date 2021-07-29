package com.flashcardnamechange.flashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        //brings user back to main page when back button is clicked
        findViewById(R.id.backButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddCardActivity.this, MainActivity.class);
                AddCardActivity.this.startActivity(intent);
                overridePendingTransition(R.anim.right_to_left, R.anim.left_to_right);
            }
        });


        ImageButton SaveButton = ((ImageButton) findViewById(R.id.saveButton));
        //when click on save button


        SaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Do something here

                String question = ((EditText) findViewById(R.id.addQuestionText)).getText().toString();
                String answer = ((EditText) findViewById(R.id.addAnswerText)).getText().toString();

                Intent data = new Intent(); // create a new Intent, this is where we will put our data
                data.putExtra("string1", question); // puts one string into the Intent, with the key as 'string1'
                data.putExtra("string2", answer); // puts another string into the Intent, with the key as 'string2
                setResult(RESULT_OK, data); // set result code and bundle data for response
                finish(); // closes this activity and pass data to the original activity that launched this activity
                //overridePendingTransition(R.anim.left_out, R.anim.left_out);
                overridePendingTransition(R.anim.right_to_left, R.anim.left_to_right);
            }
        });

    }
}