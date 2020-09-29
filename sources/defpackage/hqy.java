package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: hqy reason: default package */
public final class hqy implements wlc<hde> {
    private final RxResolver a;
    private final rnf b;
    private final hth c;

    public hqy(RxResolver rxResolver, rnf rnf, hth hth) {
        this.a = rxResolver;
        this.b = rnf;
        this.c = hth;
    }

    /* renamed from: a */
    public final hde get() {
        boolean a2 = this.c.a.a();
        hde hde = new hde(this.a, this.b, 15, a2, true, true, false, !a2, !a2, true);
        return hde;
    }
}
