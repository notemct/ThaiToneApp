package th.ac.up.mct.thaitoneapp.domain;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;
/**
 * Created by MooMee on 14/1/2559.
 */
public class KamGroupSet extends Model {


    @Column(name = "NAME")
    public String name;

    @Column(name = "Picture")
    public String picturet;
}
