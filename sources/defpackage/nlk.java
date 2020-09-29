package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: nlk reason: default package */
public final class nlk implements wig<hga> {
    private final wzi<RxResolver> a;
    private final wzi<rwl> b;
    private final wzi<Boolean> c;

    private nlk(wzi<RxResolver> wzi, wzi<rwl> wzi2, wzi<Boolean> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hga a(RxResolver rxResolver, rwl rwl, boolean z) {
        return (hga) wil.a(CC.a(rxResolver, rwl, z), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static nlk a(wzi<RxResolver> wzi, wzi<rwl> wzi2, wzi<Boolean> wzi3) {
        return new nlk(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return a((RxResolver) this.a.get(), (rwl) this.b.get(), ((Boolean) this.c.get()).booleanValue());
    }
}
