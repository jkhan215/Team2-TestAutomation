package YahooData;

import utility.DataReader;

import java.io.IOException;

/**
 * Created by Russel on 1/27/2017.
 */
public class YahooSearch {
    DataReader dr = new DataReader();

    public String[] getData() throws IOException {
        String path = System.getProperty("user.dir") + "/DataSearch/YahooSearch.xls";
        String[] st = dr.fileReader(path);
        return st;
    }
}
