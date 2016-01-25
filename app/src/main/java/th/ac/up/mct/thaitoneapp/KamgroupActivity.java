package th.ac.up.mct.thaitoneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import th.ac.up.mct.thaitoneapp.domain.KamGroup;
import th.ac.up.mct.thaitoneapp.ui.KamgroupButton;

public class KamgroupActivity extends ActionBarActivity {

    LinearLayout kamgroupactivityMainLayout;
    LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamgroup);

        inflater = LayoutInflater.from(this);
        kamgroupactivityMainLayout = (LinearLayout)findViewById(R.id.kamgroupactivityMainLayout);


        Intent intent = getIntent();
        long kamgroupId = intent.getLongExtra("KAMDIAO_ID", 0);
        KamGroup set = KamGroup.get(kamgroupId);
        //currentKamdiao = KamDiao.get(kamdiaoId);
        for (KamGroup k : set.kamGroupss()){
            KamgroupButton kamgroupactivitybtn = new KamgroupButton(this);
            int id = getResources().getIdentifier(k.pictureword, "drawable", getPackageName());
            Log.i("ID", Integer.toString(id));
            kamgroupactivitybtn.setBackgroundResource(id);
            kamgroupactivitybtn.setKamgroupactivity(k);
            kamgroupactivitybtn.setLayoutParams(new LinearLayout.LayoutParams(300, 300));
            // kamdiaoBtn.setText(k.kamThai);
            //kamdiaoactivitybtn.setOnClickListener(kamWordOnClickListener);
            kamgroupactivityMainLayout.addView(kamgroupactivitybtn);

        }
    }

}
