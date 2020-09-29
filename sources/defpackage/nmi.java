package defpackage;

import com.google.common.collect.Sets;
import io.reactivex.CompletableSource;
import java.util.Set;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: nmi reason: default package */
public final class nmi implements nis {
    private final vll a;
    private final wzi<rog> b;
    private final njc c;
    private final njg d;
    private final boolean e;
    private final boolean f;

    public nmi(vll vll, wzi<rog> wzi, njc njc, njg njg, boolean z, boolean z2) {
        this.a = (vll) fbp.a(vll);
        this.b = (wzi) fbp.a(wzi);
        this.c = njc;
        this.d = njg;
        this.e = z;
        this.f = z2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(hcs hcs) {
        String[] stringArray = hcs.custom().stringArray("ondemand");
        return (stringArray == null || stringArray.length <= 0 || this.f) ? ScalarSynchronousObservable.d(hcs) : wit.a((CompletableSource) this.a.a((Set<String>) Sets.a((E[]) stringArray))).b((xii<T>) ScalarSynchronousObservable.d(hcs));
    }

    public final xii<hcs> a() {
        return (this.e ? wit.a((xfk<T>) ((rog) this.b.get()).a()) : this.d.a().a((c<? super T, ? extends R>) this.c)).h(new $$Lambda$nmi$EClySXiAJzAAXVP2f5W8Xo_6E94(this));
    }
}
