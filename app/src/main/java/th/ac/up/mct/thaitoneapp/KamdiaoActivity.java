package th.ac.up.mct.thaitoneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import th.ac.up.mct.thaitoneapp.domain.KamDiao;

public class KamdiaoActivity extends ActionBarActivity {

    private KamDiao currentKamdiao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamdiao);

        Intent intent = getIntent();
        long kamdiaoId = intent.getLongExtra("KAMDIAO_ID",0);
        currentKamdiao = KamDiao.get(kamdiaoId);



    }

}
