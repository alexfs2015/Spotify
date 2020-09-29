package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: uiv reason: default package */
public final class uiv implements wig<uiu> {
    private final wzi<RxResolver> a;
    private final wzi<rwl> b;

    private uiv(wzi<RxResolver> wzi, wzi<rwl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uiv a(wzi<RxResolver> wzi, wzi<rwl> wzi2) {
        return new uiv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new uiu((RxResolver) this.a.get(), (rwl) this.b.get());
    }
}
