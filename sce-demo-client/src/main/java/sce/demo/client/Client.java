/**
 * $Id$
 * (C)2011 Sohu Inc.
 */
package sce.demo.client;

import sce.demo.CounterServicePrx;
import sce.demo.CounterServicePrxHelper;

/**
 * @author adyliu (imxylz@gmail.com)
 * @since 2012-2-28
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Ice.Communicator ic = null;
        try {
            ic = Ice.Util.initialize(args);
            Ice.ObjectPrx base = ic.stringToProxy("Counter:default -p 2012");
            CounterServicePrx counter = CounterServicePrxHelper.checkedCast(base);
            //
            final int initValue = 100;
            counter.set(initValue);
            System.out.println((initValue+1)+" => "+counter.incr());
            System.out.println((initValue+1)+" => "+counter.get());
            System.out.println((initValue)+" => "+counter.decr());
        } finally {
            if (ic != null) ic.destroy();
        }
    }

}
