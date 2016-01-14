package th.ac.up.mct.thaitoneapp.domain;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;
/**
 * Created by MooMee on 14/1/2559.
 */
public class KamKuSet extends Model {

    @Column(name="Id")
    public Integer Id;

    @Column(name = "NAME")
    public String name;
}
