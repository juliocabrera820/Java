package CommonsChain.commands;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class CloseSale implements Command {
    @Override
    public boolean execute(Context context) throws Exception {
        System.out.println("Congratulations "
            +context.get("customerName")
            +", you bought a new car!");
        return false;
    }
}
