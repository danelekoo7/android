package pl.daniel.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class IntentTest extends AppCompatActivity {

    private EditText titleField;
    private EditText messageField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_intent);

        titleField = findViewById(R.id.title);
        messageField = findViewById(R.id.message);
    }


    public void sendButton(View view) {
        Intent intent = new Intent(android.content.Intent.ACTION_SEND);
        intent.setType("text/plain");

        String title = titleField.getText().toString();
        String message = messageField.getText().toString();

        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, title);
        intent.putExtra(android.content.Intent.EXTRA_TEXT, message);
        startActivity(intent);
    }
}
