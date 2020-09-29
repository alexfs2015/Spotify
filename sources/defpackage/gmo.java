package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: gmo reason: default package */
public final class gmo implements wig<gmn> {
    private final wzi<RxResolver> a;
    private final wzi<xil> b;
    private final wzi<rwl> c;

    private gmo(wzi<RxResolver> wzi, wzi<xil> wzi2, wzi<rwl> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static gmo a(wzi<RxResolver> wzi, wzi<xil> wzi2, wzi<rwl> wzi3) {
        return new gmo(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new gmn((RxResolver) this.a.get(), (xil) this.b.get(), (rwl) this.c.get());
    }
}
