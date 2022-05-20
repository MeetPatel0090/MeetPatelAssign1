/* Meet Patel N01460090 Section B */

package meet.patel.n01460090;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MeetActivity extends AppCompatActivity {

    //Button siteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating a button for the first button which launches a site
        Button siteButton;
        siteButton = findViewById(R.id.MeetSiteButton);

        // Creating a button for the second button which displays a toast
        Button displayButton;
        displayButton = findViewById(R.id.MeetToastDisplayButton);


        // Setting up the functioning of the First button
        siteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context;
                context = getApplicationContext();
                CharSequence text = "Meet Patel - Launching Wikipedia!!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                gotoUrl();
            }


            private void gotoUrl() {
                Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Android_Studio");
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }

        });


        // Setting up the functioning of the Second Button
        displayButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                EditText text;
                text = (EditText)findViewById(R.id.MeetEditText);
                String textToToast = text.getText().toString();

                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(MeetActivity.this, textToToast, duration);
                toast.show();

            }
        });


    }
}
















