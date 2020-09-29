package defpackage;

import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$kep$zoRTqB2lekIa6aOSVO29GPWgO98 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kep$zoRTqB2lekIa6aOSVO29GPWgO98 implements SingleOnSubscribe {
    private final /* synthetic */ kep f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ String f$2;

    public /* synthetic */ $$Lambda$kep$zoRTqB2lekIa6aOSVO29GPWgO98(kep kep, String str, String str2) {
        this.f$0 = kep;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, this.f$2, singleEmitter);
    }
}
