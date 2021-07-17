import com.vgu.cs.engine.dao.*;

public class Logic {
    public static void main(String[] args) {
        ObservationDao dao = new ObservationDao("someInstance");
        System.out.println(dao.selectColumns("SELECT value_as_number FROM observation WHERE observation_id=1"));
    }
}
