package CommonsChain.principal;

import CommonsChain.chain.Chain;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ContextBase;

public class Principal {
    public static void main(String[] args) {
        Command process = new Chain();
        Context ctx = new ContextBase();
        try {
            process.execute(ctx);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
