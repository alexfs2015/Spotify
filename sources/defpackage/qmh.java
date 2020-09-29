package defpackage;

import android.content.Context;
import com.spotify.cosmos.android.RxResolver;

/* renamed from: qmh reason: default package */
public final class qmh implements wig<lqj> {
    private final wzi<Context> a;
    private final wzi<jty> b;
    private final wzi<RxResolver> c;
    private final wzi<xil> d;

    private qmh(wzi<Context> wzi, wzi<jty> wzi2, wzi<RxResolver> wzi3, wzi<xil> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qmh a(wzi<Context> wzi, wzi<jty> wzi2, wzi<RxResolver> wzi3, wzi<xil> wzi4) {
        return new qmh(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        xil xil = (xil) this.d.get();
        lqj lqj = new lqj(new lqh(context, new lqe(), (jty) this.b.get()), new lqf(), new lqc(context), new lqd((RxResolver) this.c.get()), xil);
        return (lqj) wil.a(lqj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
