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
import th.ac.up.mct.thaitoneapp.ui.KamDiaoSetButton;

public class KamDiaoSetActivity extends ActionBarActivity {

    LinearLayout kamdiaoMainLayout;

    LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kam_diao_set);

        inflater = LayoutInflater.from(this);

        kamdiaoMainLayout = (LinearLayout) findViewById(R.id.KamdiaoMainLayout);

        List<KamDiaoSet> kamdiaoSets = KamDiaoSet.getAll();





        for(KamDiaoSet k : kamdiaoSets){
            KamDiaoSetButton kamdiaosetBn = new KamDiaoSetButton(this);
            kamdiaosetBn.setText(k.name);
            kamdiaosetBn.setKamDiaoSet(k);

            kamdiaoMainLayout.addView(kamdiaosetBn);
        }





    }

}
