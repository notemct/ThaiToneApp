package th.ac.up.mct.thaitoneapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

public class KamDiaoSetActivity extends ActionBarActivity {

    LinearLayout kamdiaoMainLayout;

    LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kam_diao_set);

        inflater = LayoutInflater.from(this);


        kamdiaoMainLayout = (LinearLayout)findViewById(R.id.KamdiaoMainLayout);

        LinearLayout twoColumns = (LinearLayout) inflater.inflate(R.layout.two_column_button,null,false);

        kamdiaoMainLayout.addView(twoColumns);

    }

}
