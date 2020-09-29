package defpackage;

import android.media.AudioRecord;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/* renamed from: -$$Lambda$wcv$tGGNFyrOSTGSSHrF73FRa6E0s6Y reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$wcv$tGGNFyrOSTGSSHrF73FRa6E0s6Y implements Function {
    private final /* synthetic */ wct f$0;

    public /* synthetic */ $$Lambda$wcv$tGGNFyrOSTGSSHrF73FRa6E0s6Y(wct wct) {
        this.f$0 = wct;
    }

    public final Object apply(Object obj) {
        return Flowable.a((FlowableOnSubscribe<T>) new wcw<T>((AudioRecord) obj, this.f$0.b), BackpressureStrategy.DROP).b(Schedulers.b());
    }
}
