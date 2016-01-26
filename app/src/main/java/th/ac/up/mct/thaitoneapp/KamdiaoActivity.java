package th.ac.up.mct.thaitoneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;

import th.ac.up.mct.thaitoneapp.domain.KamDiao;
import th.ac.up.mct.thaitoneapp.ui.KamdiaoButton;

public class KamdiaoActivity extends ActionBarActivity {

    //private KamDiao currentKamdiao;
    LinearLayout kamdiaoactivityMainLayout;
    LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamdiao);

        inflater = LayoutInflater.from(this);

        ImageView kamdiaoImage = (ImageView) findViewById(R.id.kamdiaoImage);


        Intent intent = getIntent();
        long kamdiaoId = intent.getLongExtra("KAMDIAO_ID", 0);
        KamDiao kamDioao = KamDiao.get(kamdiaoId);
        //currentKamdiao = KamDiao.get(kamdiaoId);
        int id = getResources().getIdentifier(kamDioao.pictureword,"drawable",getPackageName());
        kamdiaoImage.setBackgroundResource(id);




    }

}
