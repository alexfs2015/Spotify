package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: iqo reason: default package */
public final class iqo implements wig<iqn> {
    private final wzi<RxResolver> a;
    private final wzi<rwl> b;

    private iqo(wzi<RxResolver> wzi, wzi<rwl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static iqo a(wzi<RxResolver> wzi, wzi<rwl> wzi2) {
        return new iqo(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new iqn(this.a, this.b);
    }
}
