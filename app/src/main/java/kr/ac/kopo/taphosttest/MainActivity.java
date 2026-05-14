package kr.ac.kopo.taphosttest;

import android.os.Bundle;
import android.widget.TabHost;
import androidx.appcompat.app.AppCompatActivity;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabHost tabHost = findViewById(android.R.id.tabhost);
        // 2. 반드시 setup()을 먼저 호출해야 함!
        tabHost.setup();


        TabHost.TabSpec tabSpecMusic = tabHost.newTabSpec("music").setIndicator("음악");
        tabSpecMusic.setContent(R.id.tabMusic);
        tabHost.addTab(tabSpecMusic);


        TabHost.TabSpec tabSpecArtist = tabHost.newTabSpec("artist").setIndicator("가수");
        tabSpecArtist.setContent(R.id.tabArtist);


        TabHost.TabSpec tabSpecAlbum = tabHost.newTabSpec("album").setIndicator("앨범");
        tabSpecAlbum.setContent(R.id.tabAlbum);
        tabHost.addTab(tabSpecAlbum);


        tabHost.setCurrentTab(0);
    }
}