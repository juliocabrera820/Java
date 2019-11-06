package CommonsChain.chain;

import CommonsChain.commands.*;
import org.apache.commons.chain.impl.ChainBase;

public class Chain extends ChainBase {
    public Chain() {
        super();
        addCommand(new GetCustomerInfo());
        addCommand(new TestDriveVehicle());
        addCommand(new NegotiateSale());
        addCommand(new ArrangeFinancing());
        addCommand(new CloseSale());
    }
}
