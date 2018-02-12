import org.mwdl.scripts.data.DataFetcher;
import org.mwdl.scripts.webManagement.Collection;

import javax.xml.crypto.Data;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Just use this to test methods in a closed environment
 *
 * I frequently used this class to run DataFetcher methods, ie, how many in/active collections are there?
 *
 * @author Jonathan Wiggins
 * @version 6/28/17
 */

public class Test {
    public static void main(String[] args) {
        try {
            ArrayList<String> results = DataFetcher.refineInactiveCollectionLines();

            System.out.println(results.size());

            for(String c : results)
                System.out.println(c);

            } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
