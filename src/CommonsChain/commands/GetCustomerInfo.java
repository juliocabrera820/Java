package CommonsChain.commands;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class GetCustomerInfo implements Command {
    @Override
    public boolean execute(Context context) throws Exception {
        System.out.println("Get customer info");
        context.put("customerName","George Burdell");
        return false;
    }
}
