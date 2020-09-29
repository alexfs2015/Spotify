package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: hyw reason: default package */
public final class hyw implements wig<hzt> {
    private final wzi<rwl> a;
    private final wzi<RxResolver> b;

    private hyw(wzi<rwl> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hyw a(wzi<rwl> wzi, wzi<RxResolver> wzi2) {
        return new hyw(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (hzt) wil.a(CC.d((rwl) this.a.get(), (RxResolver) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
