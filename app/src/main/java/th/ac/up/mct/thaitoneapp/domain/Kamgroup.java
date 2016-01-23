package th.ac.up.mct.thaitoneapp.domain;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by MooMee on 14/1/2559.
 */
public class KamGroup extends Model {

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

    public List<KamGroup> kamGroupss() {
        return getMany(KamGroup.class, "SET_ID");
    }

    public static List<KamGroup> getAll(){
        return new Select().from(KamGroup.class).execute();
    }

    public static KamGroup get(long id){
        return new Select().from(KamGroup.class).where("Id = ?",id).executeSingle();
    }


}
