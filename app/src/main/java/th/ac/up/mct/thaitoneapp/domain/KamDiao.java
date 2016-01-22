package th.ac.up.mct.thaitoneapp.domain;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by chaow on 1/2/2016 AD.
 */
public class KamDiao extends Model {

    @Column(name = "KamThai")
    public String kamThai;

    @Column(name = "SET_ID")
    public KamDiaoSet kamDiaoSet;

    @Column(name = "Picture")
    public String picture;

    public static KamDiao get(long id){
        return new Select().from(KamDiao.class).where("Id = ?",id).executeSingle();
    }

}
