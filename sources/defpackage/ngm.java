package defpackage;

import com.google.common.collect.Sets;
import io.reactivex.CompletableSource;
import java.util.Set;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: ngm reason: default package */
public final class ngm implements ndd {
    private final uzi a;
    private final wlc<rfe> b;
    private final ndn c;
    private final ndr d;
    private final boolean e;
    private final boolean f;

    public ngm(uzi uzi, wlc<rfe> wlc, ndn ndn, ndr ndr, boolean z, boolean z2) {
        this.a = (uzi) fay.a(uzi);
        this.b = (wlc) fay.a(wlc);
        this.c = ndn;
        this.d = ndr;
        this.e = z;
        this.f = z2;
    }

    public final wud<gzz> a() {
        wud wud;
        if (this.e) {
            wud = vun.a((wrf<T>) ((rfe) this.b.get()).a());
        } else {
            wud = this.d.a().a((c<? super T, ? extends R>) this.c);
        }
        return wud.i(new $$Lambda$ngm$O00xqRXpGqWdc1y7hJ3qkFbebk(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(gzz gzz) {
        String[] stringArray = gzz.custom().stringArray("ondemand");
        if (stringArray == null || stringArray.length <= 0 || this.f) {
            return ScalarSynchronousObservable.d(gzz);
        }
        return vun.a((CompletableSource) this.a.a((Set<String>) Sets.a((E[]) stringArray))).b((wud<T>) ScalarSynchronousObservable.d(gzz));
    }
}
