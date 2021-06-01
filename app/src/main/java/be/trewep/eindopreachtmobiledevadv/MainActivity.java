package be.trewep.eindopreachtmobiledevadv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Fragment currentLayout; //holds the currents fragment that's been showed on this moment
    final ronde1Speler1 ronde1Speler1 = new ronde1Speler1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}