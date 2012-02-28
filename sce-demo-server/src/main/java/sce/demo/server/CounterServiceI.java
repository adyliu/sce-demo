/**
 * $Id$
 * (C)2011 Sohu Inc.
 */
package sce.demo.server;

import java.util.concurrent.atomic.AtomicInteger;

import Ice.Current;
import sce.demo._CounterServiceDisp;

/**
 * @author adyliu (imxylz@gmail.com)
 * @since 2012-2-28
 */
public class CounterServiceI extends _CounterServiceDisp {

    final AtomicInteger counter = new AtomicInteger(0);

    public int incr(Current __current) {
        return counter.incrementAndGet();
    }

    public int decr(Current __current) {
        return counter.decrementAndGet();
    }

    public int get(Current __current) {
        return counter.get();
    }

    public void set(int num, Current __current) {
        counter.set(num);
    }

}
