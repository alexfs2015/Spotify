package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: gvj reason: default package */
public final class gvj implements wig<hga> {
    private final wzi<RxResolver> a;
    private final wzi<rwl> b;

    private gvj(wzi<RxResolver> wzi, wzi<rwl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static gvj a(wzi<RxResolver> wzi, wzi<rwl> wzi2) {
        return new gvj(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        hga hga = new hga((RxResolver) this.a.get(), (rwl) this.b.get(), 10, true, true, true, true, true, false, true);
        return (hga) wil.a(hga, "Cannot return null from a non-@Nullable @Provides method");
    }
}
