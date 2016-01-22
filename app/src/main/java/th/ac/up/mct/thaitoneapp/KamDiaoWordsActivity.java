package th.ac.up.mct.thaitoneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.List;

import th.ac.up.mct.thaitoneapp.domain.KamDiao;
import th.ac.up.mct.thaitoneapp.domain.KamDiaoSet;
import th.ac.up.mct.thaitoneapp.ui.KamDiaoWordButton;

public class KamDiaoWordsActivity extends ActionBarActivity {

    LinearLayout kamdiaoWordsMainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kam_diao_words);
        kamdiaoWordsMainLayout = (LinearLayout)findViewById(R.id.KamdiaoWordsMainLayout);

        Intent intent = getIntent();
        long KamdiaoSetID = intent.getLongExtra("KAMDIAOSET_ID", 0);

        //Log.i("KamdiaoSetID", Long.toString(KamdiaoSetID));
        KamDiaoSet set = KamDiaoSet.get(KamdiaoSetID);

        View.OnClickListener kamWordOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KamDiaoWordButton btn = (KamDiaoWordButton)v;
                //
                Intent inttentkamgroup = new Intent(KamDiaoWordsActivity.this,KamdiaoActivity.class);
                inttentkamgroup.putExtra("KAMDIAO_ID", btn.getKamDiao().getId());
                startActivity(inttentkamgroup);
            }
        };


        // เอาค่าออกมาเป็นButton
        for(KamDiao k : set.kamDiaos()){
            Button kamdiaoBtn =new Button(this);
            int id = getResources().getIdentifier(k.picture, "drawable", getPackageName());
            kamdiaoBtn.setBackgroundResource(id);
            kamdiaoBtn.setText(k.kamThai);
            kamdiaoBtn.setOnClickListener(kamWordOnClickListener);
            kamdiaoWordsMainLayout.addView(kamdiaoBtn);
        }
    }
}
