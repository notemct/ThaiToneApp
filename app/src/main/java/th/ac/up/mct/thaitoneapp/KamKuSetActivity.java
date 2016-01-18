package th.ac.up.mct.thaitoneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import java.util.List;

import th.ac.up.mct.thaitoneapp.domain.KamDiaoSet;
import th.ac.up.mct.thaitoneapp.domain.KamKuSet;
import th.ac.up.mct.thaitoneapp.ui.KamDiaoSetButton;

public class KamKuSetActivity extends ActionBarActivity {
    LinearLayout kamkuMainLayout;

    LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kam_ku_set);

        inflater =LayoutInflater.from(this);

        kamkuMainLayout =(LinearLayout) findViewById(R.id.KamkuMainLayout);
        //List<KamKuSet> kamkuSets = KamKuSet.getAll();
    }
    View.OnClickListener kamkusetOnclickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //KamKuSetButton btn = (KamKuSetButton)v;
            //
            //Intent inttentkamku = new Intent(KamKuSetActivity.this,KamKuWordsActivity.class);
            //inttentkamku.putExtra("KAMKUSET_ID",btn.getKamKuSet().Id);
            //startActivity(inttentkamku);

        }
    };
    /*for(KamKuSet k : kamkuSets){
        KamKuSetButton kamKusetBn = new KamKuSetButton(this);

        int id = getResources().getIdentifier("kamku", "drawable", getPackageName());
        kamkusetBn.setBackgroundResource(id);
        kamkusetBn.setKamDiaoSet(k);
        kamkusetBn.setOnClickListener(kamdiaosetOnclickListener);
        kamkuMainLayout.addView(kamkusetBn);
    }*/


}
