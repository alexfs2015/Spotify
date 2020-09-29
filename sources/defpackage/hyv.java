package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: hyv reason: default package */
public final class hyv implements wig<hzr> {
    private final wzi<rwl> a;
    private final wzi<RxResolver> b;

    private hyv(wzi<rwl> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hyv a(wzi<rwl> wzi, wzi<RxResolver> wzi2) {
        return new hyv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (hzr) wil.a(CC.a((rwl) this.a.get(), (RxResolver) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
