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

import com.google.android.material.snackbar.Snackbar;

public class MeetActivity extends AppCompatActivity {


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

        // Creating a button for the Third button which launches the second activity
        Button actButton;
        actButton = findViewById(R.id.MeetLaunchButton);




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
        displayButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Getting the text from EditText and saving it in a variable
                EditText inputText;
                inputText = findViewById(R.id.MeetEditText);
                String textFromUser;
                textFromUser = inputText.getText().toString();

                // Variable for Duration of Toast
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(MeetActivity.this, textFromUser, duration);
                toast.show();

            }
        });


        // Setting up the functioning of the Third Button
        actButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Creating a Snackbar
                Snackbar mySnackbar = Snackbar.make(findViewById(R.id.MeetLayout),
                        R.string.SnackStr, Snackbar.LENGTH_LONG);

                // Setting up Snackbar Function
                mySnackbar.setAction(R.string.SnackActionStr, new View.OnClickListener() {

                    // Setting up On click for the button on the Snackbar
                    @Override
                    public void onClick(View v) {
                        
                        openSecActivity();

                    }

                    private void openSecActivity(){

                        // Getting the text from EditText and saving it in a variable
                        EditText inputText;
                        inputText = findViewById(R.id.MeetEditText);
                        String textFromUser;
                        textFromUser = inputText.getText().toString();

                        Intent intent = new Intent(MeetActivity.this, PatelActivity.class);
                        intent.putExtra("sendTextToSecActivity", textFromUser);
                        startActivity(intent);
                    }
                });

                mySnackbar.show();

            }
        });


    }
}
















