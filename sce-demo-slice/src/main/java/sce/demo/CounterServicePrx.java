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
// Generated from file `CounterServicePrx.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package sce.demo;

public interface CounterServicePrx extends Ice.ObjectPrx
{
    public int incr();

    public int incr(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_incr();

    public Ice.AsyncResult begin_incr(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_incr(Ice.Callback __cb);

    public Ice.AsyncResult begin_incr(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_incr(Callback_CounterService_incr __cb);

    public Ice.AsyncResult begin_incr(java.util.Map<String, String> __ctx, Callback_CounterService_incr __cb);

    public int end_incr(Ice.AsyncResult __result);

    public int decr();

    public int decr(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_decr();

    public Ice.AsyncResult begin_decr(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_decr(Ice.Callback __cb);

    public Ice.AsyncResult begin_decr(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_decr(Callback_CounterService_decr __cb);

    public Ice.AsyncResult begin_decr(java.util.Map<String, String> __ctx, Callback_CounterService_decr __cb);

    public int end_decr(Ice.AsyncResult __result);

    public int get();

    public int get(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_get();

    public Ice.AsyncResult begin_get(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_get(Ice.Callback __cb);

    public Ice.AsyncResult begin_get(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_get(Callback_CounterService_get __cb);

    public Ice.AsyncResult begin_get(java.util.Map<String, String> __ctx, Callback_CounterService_get __cb);

    public int end_get(Ice.AsyncResult __result);

    public void set(int num);

    public void set(int num, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_set(int num);

    public Ice.AsyncResult begin_set(int num, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_set(int num, Ice.Callback __cb);

    public Ice.AsyncResult begin_set(int num, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_set(int num, Callback_CounterService_set __cb);

    public Ice.AsyncResult begin_set(int num, java.util.Map<String, String> __ctx, Callback_CounterService_set __cb);

    public void end_set(Ice.AsyncResult __result);
}