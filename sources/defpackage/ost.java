package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Completable;
import io.reactivex.Scheduler;

/* renamed from: ost reason: default package */
public final class ost implements vua<oss> {
    private final wlc<a> a;
    private final wlc<uxh> b;
    private final wlc<osp> c;
    private final wlc<String> d;
    private final wlc<Scheduler> e;
    private final wlc<ofh> f;
    private final wlc<Completable> g;

    private ost(wlc<a> wlc, wlc<uxh> wlc2, wlc<osp> wlc3, wlc<String> wlc4, wlc<Scheduler> wlc5, wlc<ofh> wlc6, wlc<Completable> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static ost a(wlc<a> wlc, wlc<uxh> wlc2, wlc<osp> wlc3, wlc<String> wlc4, wlc<Scheduler> wlc5, wlc<ofh> wlc6, wlc<Completable> wlc7) {
        ost ost = new ost(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return ost;
    }

    public final /* synthetic */ Object get() {
        oss oss = new oss(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        return oss;
    }
}
