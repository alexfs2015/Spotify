package defpackage;

import android.os.Bundle;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$hvz$KBb-kseB3QNgAfG10yc-QPNY8mo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hvz$KBbkseB3QNgAfG10ycQPNY8mo implements SingleOnSubscribe {
    private final /* synthetic */ hvz f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ String f$2;
    private final /* synthetic */ int f$3;
    private final /* synthetic */ int f$4;
    private final /* synthetic */ Bundle f$5;

    public /* synthetic */ $$Lambda$hvz$KBbkseB3QNgAfG10ycQPNY8mo(hvz hvz, String str, String str2, int i, int i2, Bundle bundle) {
        this.f$0 = hvz;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = i;
        this.f$4 = i2;
        this.f$5 = bundle;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, singleEmitter);
    }
}
