/**
 * $Id$
 * (C)2011 Sohu Inc.
 */
package sce.demo.server;

/**
 * @author adyliu (imxylz@gmail.com)
 * @since 2012-2-28
 */
public class Server {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Ice.Communicator ic = null;
        try {
            ic = Ice.Util.initialize(args);
            Ice.ObjectAdapter adapter = ic.createObjectAdapterWithEndpoints("Demo", "default -p 2012");
            adapter.add(new CounterServiceI(), ic.stringToIdentity("Counter"));
            adapter.activate();
            ic.waitForShutdown();
        } finally {
            if (ic != null) ic.destroy();
        }
    }

}
