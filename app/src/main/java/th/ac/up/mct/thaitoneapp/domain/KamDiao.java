package th.ac.up.mct.thaitoneapp.domain;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

/**
 * Created by chaow on 1/2/2016 AD.
 */
public class KamDiao extends Model {

    @Column(name = "KamThai")
    public String kamThai;

    @Column(name = "SET_ID")
    public KamDiaoSet kamDiaoSet;

}
