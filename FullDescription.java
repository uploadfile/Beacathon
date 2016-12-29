package in.codingninjas.beacathonregion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class FullDescription extends AppCompatActivity {

    TextView tle,dsc;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_description);

        tle = (TextView)findViewById(R.id.);
        tle = (TextView)findViewById(R.id.);
        btn = (Button)findViewById(R.id.);

        Bundle extras = getIntent().getExtras();
        String title = extras.getString("Title");
        String Description = extras.getString("Desc");

        tle.setText(title);
        dsc.setText(Description);
    }
}
