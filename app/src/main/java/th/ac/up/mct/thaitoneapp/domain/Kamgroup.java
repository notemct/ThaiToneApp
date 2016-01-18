package th.ac.up.mct.thaitoneapp.domain;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
/**
 * Created by MooMee on 14/1/2559.
 */
public class Kamgroup extends Model {

    @Column(name = "Word")
    public String word;

    @Column(name = "IPA")
    public String ipa;

    @Column(name = "MeaningEN")
    public String meaningEN;

    @Column(name = "SET_ID")
    public KamGroupSet kamgroupSet;

    @Column(name = "Picture")
    public String picture;




}
