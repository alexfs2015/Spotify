package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: obw reason: default package */
public final class obw implements vua<gmk<oas, oau>> {
    private final wlc<a> a;

    private obw(wlc<a> wlc) {
        this.a = wlc;
    }

    public static obw a(wlc<a> wlc) {
        return new obw(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gmk) vuf.a(new gmk((a) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
