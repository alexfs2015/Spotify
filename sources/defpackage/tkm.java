package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

/* renamed from: tkm reason: default package */
public final class tkm {
    public static Flowable<Boolean> a(tks tks) {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$tkm$LXll36pG5sE6ywflxS1TP0PLkRE<T>(tks), BackpressureStrategy.LATEST).c((xfk<? extends T>) Flowable.a((Callable<? extends xfk<? extends T>>) new $$Lambda$tkm$jqEOt94SEeYCB_AHjewp4t3CVL8<Object>(tks))).a(Functions.a());
    }
}
