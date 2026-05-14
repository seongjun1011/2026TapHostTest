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

        // 1. getTabHost() 대신 findViewById를 사용하세요.
        TabHost tabHost = findViewById(android.R.id.tabhost);

        // 2. 반드시 setup()을 호출해야 합니다.
        tabHost.setup();

        // 고양이 탭
        TabHost.TabSpec tabSpecCat = tabHost.newTabSpec("cat").setIndicator("고양이");
        tabSpecCat.setContent(R.id.tabCat);
        tabHost.addTab(tabSpecCat);

        // 개 탭
        TabHost.TabSpec tabSpecDog = tabHost.newTabSpec("dog").setIndicator("개");
        tabSpecDog.setContent(R.id.tabDog);
        tabHost.addTab(tabSpecDog);

        // 토끼 탭
        TabHost.TabSpec tabSpecRabbit = tabHost.newTabSpec("rabbit").setIndicator("토끼");
        tabSpecRabbit.setContent(R.id.tabRabbit);
        tabHost.addTab(tabSpecRabbit);

        // 말 탭 (태그를 "cat"에서 "horse"로 수정했습니다)
        TabHost.TabSpec tabSpecHorse = tabHost.newTabSpec("horse").setIndicator("말");
        tabSpecHorse.setContent(R.id.tabHorse);
        tabHost.addTab(tabSpecHorse);

        // (선택사항) 시작할 때 보여줄 탭 설정
        tabHost.setCurrentTab(0);
    }
}