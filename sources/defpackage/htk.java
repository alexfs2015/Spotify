package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: htk reason: default package */
public final class htk implements wzi<hga> {
    private final RxResolver a;
    private final rwl b;

    public htk(RxResolver rxResolver, rwl rwl) {
        this.a = rxResolver;
        this.b = rwl;
    }

    /* renamed from: a */
    public final hga get() {
        hga hga = new hga(this.a, this.b, 15, true, true, true, false, false, false, true);
        return hga;
    }
}
