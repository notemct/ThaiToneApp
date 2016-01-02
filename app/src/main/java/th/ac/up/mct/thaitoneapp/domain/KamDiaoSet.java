package th.ac.up.mct.thaitoneapp.domain;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by chaow on 1/2/2016 AD.
 */
@Table(name = "KamDiaoSet",id="Id")
public class KamDiaoSet extends Model {

    @Column(name="Id")
    public Integer Id;

    @Column(name = "NAME")
    public String name;


    public List<KamDiao> kamDiaos() {
        return getMany(KamDiao.class, "SET_ID");
    }

    public static List<KamDiaoSet> getAll(){
        return new Select().from(KamDiaoSet.class).execute();
    }

    public static KamDiaoSet get(int id){
        return new Select().from(KamDiaoSet.class).where("Id = ?",id).executeSingle();
    }

}