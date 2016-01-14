package th.ac.up.mct.thaitoneapp.domain;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

/**
 * Created by MooMee on 14/1/2559.
 */
public class Kamku  extends Model {

    @Column(name = "KamThai")
    public String kamThai;

    @Column(name = "SET_ID")
    public Kamku kamKuSet;

    @Column(name = "Picture")
    public Kamku kamKuPicture;

}
