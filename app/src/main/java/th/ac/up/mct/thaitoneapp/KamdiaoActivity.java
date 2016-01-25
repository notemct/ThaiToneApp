package th.ac.up.mct.thaitoneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
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
        kamdiaoactivityMainLayout = (LinearLayout)findViewById(R.id.kamdiaoactivityMainLayout);


        Intent intent = getIntent();
        long kamdiaoId = intent.getLongExtra("KAMDIAO_ID", 0);
        KamDiao set = KamDiao.get(kamdiaoId);
        //currentKamdiao = KamDiao.get(kamdiaoId);
        for (KamDiao k : set.kamDiaoss()){
            KamdiaoButton kamdiaoactivitybtn = new KamdiaoButton(this);
            int id = getResources().getIdentifier(k.pictureword, "drawable", getPackageName());
            Log.i("ID", Integer.toString(id));
            kamdiaoactivitybtn.setBackgroundResource(id);
            kamdiaoactivitybtn.setKamdiaoactivity(k);
            kamdiaoactivitybtn.setLayoutParams(new LinearLayout.LayoutParams(300, 300));
            // kamdiaoBtn.setText(k.kamThai);
            //kamdiaoactivitybtn.setOnClickListener(kamWordOnClickListener);
            kamdiaoactivityMainLayout.addView(kamdiaoactivitybtn);

        }



    }

}
