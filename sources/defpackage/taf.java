package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

/* renamed from: taf reason: default package */
public final class taf {
    public static Flowable<Boolean> a(tal tal) {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$taf$agad7B695gj07EULj0CfM_pjGYs<T>(tal), BackpressureStrategy.LATEST).c((wrf<? extends T>) Flowable.a((Callable<? extends wrf<? extends T>>) new $$Lambda$taf$jEIkZrJytsWIa1GQhgGwhiAadtk<Object>(tal))).a(Functions.a());
    }
}
