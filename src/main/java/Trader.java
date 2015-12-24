import com.etrade.etws.sdk.common.ETWSException;

import java.io.IOException;

/**
 * Created by caneba on 12/23/15.
 */
public class Trader {

    public static void main(String[] args) throws IOException, ETWSException {
        System.out.println("trader activated");
        APIHookup apiHookup = new APIHookup();
        apiHookup.runTrader();
        System.out.println("trader done");
    }



}
