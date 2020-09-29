package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ipg reason: default package */
public final class ipg implements wig<ipf> {
    private final wzi<RxResolver> a;
    private final wzi<xil> b;
    private final wzi<xil> c;

    private ipg(wzi<RxResolver> wzi, wzi<xil> wzi2, wzi<xil> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ipg a(wzi<RxResolver> wzi, wzi<xil> wzi2, wzi<xil> wzi3) {
        return new ipg(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ipf((RxResolver) this.a.get(), (xil) this.b.get(), (xil) this.c.get());
    }
}
