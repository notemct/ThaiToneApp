package th.ac.up.mct.thaitoneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.List;

import th.ac.up.mct.thaitoneapp.domain.KamDiao;
import th.ac.up.mct.thaitoneapp.domain.KamDiaoSet;

public class KamDiaoWordsActivity extends ActionBarActivity {

    LinearLayout kamdiaoWordsMainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kam_diao_words);
        kamdiaoWordsMainLayout = (LinearLayout)findViewById(R.id.KamdiaoWordsMainLayout1);

        Intent intent = getIntent();
        long KamdiaoSetID = intent.getLongExtra("KAMDIAOSET_ID", 0);

        //Log.i("KamdiaoSetID", Long.toString(KamdiaoSetID));
        KamDiaoSet set = KamDiaoSet.get(KamdiaoSetID);

        //Log.i("TEST",set.name);

        // เอาค่าออกมาเป็นButton
        for(KamDiao k : set.kamDiaos()){
            Button kamdiaoBtn =new Button(this);
            kamdiaoBtn.setText(k.kamThai);
            kamdiaoWordsMainLayout.addView(kamdiaoBtn);
        }
    }
}
