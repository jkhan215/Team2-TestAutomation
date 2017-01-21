package IteamsToBeSearch;

import Base.CommonAPI;
import utility.DataReader;

import java.io.IOException;

/**
 * Created by Jubar on 1/20/2017.
 */
public class SearchIteams extends CommonAPI {
    DataReader dr = new DataReader();

    public String[] getData() throws IOException {
        String path = System.getProperty("user.dir") + "/IteamsData/Twitchteams.xls";
        String[] st = dr.fileReader(path);
        return st;
    }
}
