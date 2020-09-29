package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Completable;
import io.reactivex.Scheduler;

/* renamed from: nsz reason: default package */
public final class nsz implements wig<nsy> {
    private final wzi<a> a;
    private final wzi<vjj> b;
    private final wzi<nsv> c;
    private final wzi<String> d;
    private final wzi<Scheduler> e;
    private final wzi<oml> f;
    private final wzi<Completable> g;

    private nsz(wzi<a> wzi, wzi<vjj> wzi2, wzi<nsv> wzi3, wzi<String> wzi4, wzi<Scheduler> wzi5, wzi<oml> wzi6, wzi<Completable> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static nsz a(wzi<a> wzi, wzi<vjj> wzi2, wzi<nsv> wzi3, wzi<String> wzi4, wzi<Scheduler> wzi5, wzi<oml> wzi6, wzi<Completable> wzi7) {
        nsz nsz = new nsz(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return nsz;
    }

    public final /* synthetic */ Object get() {
        nsy nsy = new nsy(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        return nsy;
    }
}
