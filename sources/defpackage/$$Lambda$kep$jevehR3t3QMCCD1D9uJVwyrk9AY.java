package defpackage;

import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;

/* renamed from: -$$Lambda$kep$jevehR3t3QMCCD1D9uJVwyrk9AY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kep$jevehR3t3QMCCD1D9uJVwyrk9AY implements CompletableOnSubscribe {
    private final /* synthetic */ kep f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ String f$2;

    public /* synthetic */ $$Lambda$kep$jevehR3t3QMCCD1D9uJVwyrk9AY(kep kep, String str, String str2) {
        this.f$0 = kep;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final void subscribe(CompletableEmitter completableEmitter) {
        this.f$0.a(this.f$1, this.f$2, completableEmitter);
    }
}
