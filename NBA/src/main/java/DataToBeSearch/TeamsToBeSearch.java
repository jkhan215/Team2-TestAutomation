package DataToBeSearch;

import utility.DataReader;

import java.io.IOException;

/**
 * Created by Jubar on 1/14/2017.
 */
public class TeamsToBeSearch {
    DataReader dr = new DataReader();
    public String[] getData() throws IOException {
        String path = System.getProperty("user.dir") + "/TeamData/nbaTeams.xls";
        String[] st = dr.fileReader(path);
        return st;
    }
}
