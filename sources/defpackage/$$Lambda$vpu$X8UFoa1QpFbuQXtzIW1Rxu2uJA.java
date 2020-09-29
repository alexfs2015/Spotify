package defpackage;

import android.media.AudioRecord;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/* renamed from: -$$Lambda$vpu$X8UFoa1QpFbuQXtzI-W1Rxu2uJA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vpu$X8UFoa1QpFbuQXtzIW1Rxu2uJA implements Function {
    private final /* synthetic */ vps f$0;

    public /* synthetic */ $$Lambda$vpu$X8UFoa1QpFbuQXtzIW1Rxu2uJA(vps vps) {
        this.f$0 = vps;
    }

    public final Object apply(Object obj) {
        return Flowable.a((FlowableOnSubscribe<T>) new vpv<T>((AudioRecord) obj, this.f$0.b), BackpressureStrategy.DROP).b(Schedulers.b());
    }
}
