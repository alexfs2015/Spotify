package defpackage;

import android.content.Context;
import io.reactivex.Flowable;

/* renamed from: scv reason: default package */
public final class scv implements wig<scu> {
    private final wzi<Context> a;
    private final wzi<Flowable<fqn>> b;
    private final wzi<xil> c;
    private final wzi<xil> d;
    private final wzi<hub> e;

    private scv(wzi<Context> wzi, wzi<Flowable<fqn>> wzi2, wzi<xil> wzi3, wzi<xil> wzi4, wzi<hub> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static scv a(wzi<Context> wzi, wzi<Flowable<fqn>> wzi2, wzi<xil> wzi3, wzi<xil> wzi4, wzi<hub> wzi5) {
        scv scv = new scv(wzi, wzi2, wzi3, wzi4, wzi5);
        return scv;
    }

    public final /* synthetic */ Object get() {
        scu scu = new scu(this.a, this.b, this.c, this.d, this.e);
        return scu;
    }
}
