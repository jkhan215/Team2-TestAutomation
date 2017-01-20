package dataToSearch;

import utility.DataReader;

import java.io.IOException;

/**
 * Created by abra on 1/18/17.
 */
public class ExcelDataReader {

    DataReader dr = new DataReader();
    public String[] getData() throws IOException{
        String path = System.getProperty("user.dir")+"/data/AmazonTestSearchItems.xls";
        String[] st = dr.fileReader(path);
        return st;
    }
}

