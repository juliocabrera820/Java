package CommonsChain.commands;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class ArrangeFinancing implements Command {
    @Override
    public boolean execute(Context context) throws Exception {
        System.out.println("Arrange financing");
        return false;
    }
}
