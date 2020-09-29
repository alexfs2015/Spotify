package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: hyx reason: default package */
public final class hyx implements wig<hzu> {
    private final wzi<rwl> a;
    private final wzi<RxResolver> b;
    private final wzi<gmn> c;

    private hyx(wzi<rwl> wzi, wzi<RxResolver> wzi2, wzi<gmn> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hyx a(wzi<rwl> wzi, wzi<RxResolver> wzi2, wzi<gmn> wzi3) {
        return new hyx(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (hzu) wil.a(CC.a((rwl) this.a.get(), (RxResolver) this.b.get(), (gmn) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
