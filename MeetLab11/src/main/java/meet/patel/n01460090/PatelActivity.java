/* Meet Patel N01460090 Section RNB */

package meet.patel.n01460090;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PatelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patel);
        
        TextView TxtView = findViewById(R.id.MeetTextView3);

        String txtView = getIntent().getStringExtra(getString(R.string.secAct));
        
        TxtView.setText(txtView);
        
    }
}