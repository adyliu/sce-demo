// **********************************************************************
//
// Copyright (c) 2003-2011 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.4.2
//
// <auto-generated>
//
// Generated from file `CounterServicePrxHelper.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package sce.demo;

public final class CounterServicePrxHelper extends Ice.ObjectPrxHelperBase implements CounterServicePrx
{
    public int
    decr()
    {
        return decr(null, false);
    }

    public int
    decr(java.util.Map<String, String> __ctx)
    {
        return decr(__ctx, true);
    }

    private int
    decr(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("decr");
                __delBase = __getDelegate(false);
                _CounterServiceDel __del = (_CounterServiceDel)__delBase;
                return __del.decr(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __decr_name = "decr";

    public Ice.AsyncResult begin_decr()
    {
        return begin_decr(null, false, null);
    }

    public Ice.AsyncResult begin_decr(java.util.Map<String, String> __ctx)
    {
        return begin_decr(__ctx, true, null);
    }

    public Ice.AsyncResult begin_decr(Ice.Callback __cb)
    {
        return begin_decr(null, false, __cb);
    }

    public Ice.AsyncResult begin_decr(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_decr(__ctx, true, __cb);
    }

    public Ice.AsyncResult begin_decr(Callback_CounterService_decr __cb)
    {
        return begin_decr(null, false, __cb);
    }

    public Ice.AsyncResult begin_decr(java.util.Map<String, String> __ctx, Callback_CounterService_decr __cb)
    {
        return begin_decr(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_decr(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__decr_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __decr_name, __cb);
        try
        {
            __result.__prepare(__decr_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public int end_decr(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __decr_name);
        if(!__result.__wait())
        {
            try
            {
                __result.__throwUserException();
            }
            catch(Ice.UserException __ex)
            {
                throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
            }
        }
        int __ret;
        IceInternal.BasicStream __is = __result.__is();
        __is.startReadEncaps();
        __ret = __is.readInt();
        __is.endReadEncaps();
        return __ret;
    }

    public int
    get()
    {
        return get(null, false);
    }

    public int
    get(java.util.Map<String, String> __ctx)
    {
        return get(__ctx, true);
    }

    private int
    get(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("get");
                __delBase = __getDelegate(false);
                _CounterServiceDel __del = (_CounterServiceDel)__delBase;
                return __del.get(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __get_name = "get";

    public Ice.AsyncResult begin_get()
    {
        return begin_get(null, false, null);
    }

    public Ice.AsyncResult begin_get(java.util.Map<String, String> __ctx)
    {
        return begin_get(__ctx, true, null);
    }

    public Ice.AsyncResult begin_get(Ice.Callback __cb)
    {
        return begin_get(null, false, __cb);
    }

    public Ice.AsyncResult begin_get(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_get(__ctx, true, __cb);
    }

    public Ice.AsyncResult begin_get(Callback_CounterService_get __cb)
    {
        return begin_get(null, false, __cb);
    }

    public Ice.AsyncResult begin_get(java.util.Map<String, String> __ctx, Callback_CounterService_get __cb)
    {
        return begin_get(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_get(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__get_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __get_name, __cb);
        try
        {
            __result.__prepare(__get_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public int end_get(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __get_name);
        if(!__result.__wait())
        {
            try
            {
                __result.__throwUserException();
            }
            catch(Ice.UserException __ex)
            {
                throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
            }
        }
        int __ret;
        IceInternal.BasicStream __is = __result.__is();
        __is.startReadEncaps();
        __ret = __is.readInt();
        __is.endReadEncaps();
        return __ret;
    }

    public int
    incr()
    {
        return incr(null, false);
    }

    public int
    incr(java.util.Map<String, String> __ctx)
    {
        return incr(__ctx, true);
    }

    private int
    incr(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("incr");
                __delBase = __getDelegate(false);
                _CounterServiceDel __del = (_CounterServiceDel)__delBase;
                return __del.incr(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __incr_name = "incr";

    public Ice.AsyncResult begin_incr()
    {
        return begin_incr(null, false, null);
    }

    public Ice.AsyncResult begin_incr(java.util.Map<String, String> __ctx)
    {
        return begin_incr(__ctx, true, null);
    }

    public Ice.AsyncResult begin_incr(Ice.Callback __cb)
    {
        return begin_incr(null, false, __cb);
    }

    public Ice.AsyncResult begin_incr(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_incr(__ctx, true, __cb);
    }

    public Ice.AsyncResult begin_incr(Callback_CounterService_incr __cb)
    {
        return begin_incr(null, false, __cb);
    }

    public Ice.AsyncResult begin_incr(java.util.Map<String, String> __ctx, Callback_CounterService_incr __cb)
    {
        return begin_incr(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_incr(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__incr_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __incr_name, __cb);
        try
        {
            __result.__prepare(__incr_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public int end_incr(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __incr_name);
        if(!__result.__wait())
        {
            try
            {
                __result.__throwUserException();
            }
            catch(Ice.UserException __ex)
            {
                throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
            }
        }
        int __ret;
        IceInternal.BasicStream __is = __result.__is();
        __is.startReadEncaps();
        __ret = __is.readInt();
        __is.endReadEncaps();
        return __ret;
    }

    public void
    set(int num)
    {
        set(num, null, false);
    }

    public void
    set(int num, java.util.Map<String, String> __ctx)
    {
        set(num, __ctx, true);
    }

    private void
    set(int num, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __delBase = __getDelegate(false);
                _CounterServiceDel __del = (_CounterServiceDel)__delBase;
                __del.set(num, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __set_name = "set";

    public Ice.AsyncResult begin_set(int num)
    {
        return begin_set(num, null, false, null);
    }

    public Ice.AsyncResult begin_set(int num, java.util.Map<String, String> __ctx)
    {
        return begin_set(num, __ctx, true, null);
    }

    public Ice.AsyncResult begin_set(int num, Ice.Callback __cb)
    {
        return begin_set(num, null, false, __cb);
    }

    public Ice.AsyncResult begin_set(int num, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_set(num, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_set(int num, Callback_CounterService_set __cb)
    {
        return begin_set(num, null, false, __cb);
    }

    public Ice.AsyncResult begin_set(int num, java.util.Map<String, String> __ctx, Callback_CounterService_set __cb)
    {
        return begin_set(num, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_set(int num, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __set_name, __cb);
        try
        {
            __result.__prepare(__set_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.writeInt(num);
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public void end_set(Ice.AsyncResult __result)
    {
        __end(__result, __set_name);
    }

    public static CounterServicePrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        CounterServicePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (CounterServicePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    CounterServicePrxHelper __h = new CounterServicePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static CounterServicePrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        CounterServicePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (CounterServicePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    CounterServicePrxHelper __h = new CounterServicePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static CounterServicePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        CounterServicePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    CounterServicePrxHelper __h = new CounterServicePrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static CounterServicePrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        CounterServicePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    CounterServicePrxHelper __h = new CounterServicePrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static CounterServicePrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        CounterServicePrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (CounterServicePrx)__obj;
            }
            catch(ClassCastException ex)
            {
                CounterServicePrxHelper __h = new CounterServicePrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static CounterServicePrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        CounterServicePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            CounterServicePrxHelper __h = new CounterServicePrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::sce::demo::CounterService"
    };

    public static String
    ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _CounterServiceDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _CounterServiceDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, CounterServicePrx v)
    {
        __os.writeProxy(v);
    }

    public static CounterServicePrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            CounterServicePrxHelper result = new CounterServicePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
