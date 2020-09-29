package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: kte reason: default package */
public final class kte implements wig<hga> {
    private final wzi<RxResolver> a;
    private final wzi<rwl> b;
    private final wzi<Integer> c;

    private kte(wzi<RxResolver> wzi, wzi<rwl> wzi2, wzi<Integer> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static kte a(wzi<RxResolver> wzi, wzi<rwl> wzi2, wzi<Integer> wzi3) {
        return new kte(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        hga hga = new hga((RxResolver) this.a.get(), (rwl) this.b.get(), ((Integer) this.c.get()).intValue(), true, true, true, true);
        return (hga) wil.a(hga, "Cannot return null from a non-@Nullable @Provides method");
    }
}
