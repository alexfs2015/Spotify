package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$waa$EeOCe47gz3bIU1EU6aedftp-AJA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$waa$EeOCe47gz3bIU1EU6aedftpAJA implements ObservableTransformer {
    private final /* synthetic */ boolean f$0;
    private final /* synthetic */ gom f$1;

    public /* synthetic */ $$Lambda$waa$EeOCe47gz3bIU1EU6aedftpAJA(boolean z, gom gom) {
        this.f$0 = z;
        this.f$1 = gom;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$waa$vEusBLZc8UL_4OQ6nIgqkU58TW4(this.f$0, this.f$1));
    }
}
