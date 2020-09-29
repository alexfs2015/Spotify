package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: hzc reason: default package */
public final class hzc implements wig<hzw> {
    private final wzi<rwl> a;
    private final wzi<RxResolver> b;

    private hzc(wzi<rwl> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hzc a(wzi<rwl> wzi, wzi<RxResolver> wzi2) {
        return new hzc(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (hzw) wil.a(CC.c((rwl) this.a.get(), (RxResolver) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
