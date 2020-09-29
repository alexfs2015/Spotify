package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ipe reason: default package */
public final class ipe implements wig<ipd> {
    private final wzi<RxResolver> a;
    private final wzi<xil> b;
    private final wzi<xil> c;

    private ipe(wzi<RxResolver> wzi, wzi<xil> wzi2, wzi<xil> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ipe a(wzi<RxResolver> wzi, wzi<xil> wzi2, wzi<xil> wzi3) {
        return new ipe(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ipd((RxResolver) this.a.get(), (xil) this.b.get(), (xil) this.c.get());
    }
}
