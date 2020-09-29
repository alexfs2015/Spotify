package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: guy reason: default package */
public final class guy implements wig<gux> {
    private final wzi<RxResolver> a;
    private final wzi<xil> b;
    private final wzi<xil> c;

    private guy(wzi<RxResolver> wzi, wzi<xil> wzi2, wzi<xil> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static guy a(wzi<RxResolver> wzi, wzi<xil> wzi2, wzi<xil> wzi3) {
        return new guy(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new gux((RxResolver) this.a.get(), (xil) this.b.get(), (xil) this.c.get());
    }
}
