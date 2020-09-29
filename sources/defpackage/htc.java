package defpackage;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: htc reason: default package */
public final class htc {
    private final hta a;
    private final Observable<Boolean> b;

    public htc(hta hta, kxz kxz) {
        this.a = hta;
        this.b = kxz.a().a(1).a();
    }

    public final Single<Boolean> a(String str) {
        return this.b.d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$htc$COSgmQRurb2MSxFz1n9EFzXnPSs<Object,Object>(this, str), false).a(0, Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return Single.b(Boolean.TRUE);
        }
        return this.a.a(str);
    }
}
