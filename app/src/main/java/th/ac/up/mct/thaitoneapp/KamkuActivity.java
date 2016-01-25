package th.ac.up.mct.thaitoneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import th.ac.up.mct.thaitoneapp.domain.KamKu;
import th.ac.up.mct.thaitoneapp.ui.KamkuButton;

public class KamkuActivity extends ActionBarActivity {

    LinearLayout kamkuactivityMainLayout;
    LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamku);

        inflater = LayoutInflater.from(this);
        kamkuactivityMainLayout = (LinearLayout)findViewById(R.id.kamkuactivityMainLayout);


        Intent intent = getIntent();
        long kamkuId = intent.getLongExtra("KAMDIAO_ID", 0);
        KamKu set = KamKu.get(kamkuId);
        //currentKamdiao = KamDiao.get(kamdiaoId);
        for (KamKu k : set.kamKuss()){
            KamkuButton kamkuactivitybtn = new KamkuButton(this);
            int id = getResources().getIdentifier(k.pictureword, "drawable", getPackageName());
            Log.i("ID", Integer.toString(id));
            kamkuactivitybtn.setBackgroundResource(id);
            kamkuactivitybtn.setKamkuactivity(k);
            kamkuactivitybtn.setLayoutParams(new LinearLayout.LayoutParams(300, 300));
            // kamdiaoBtn.setText(k.kamThai);
            //kamdiaoactivitybtn.setOnClickListener(kamWordOnClickListener);
            kamkuactivityMainLayout.addView(kamkuactivitybtn);

        }
    }

}
