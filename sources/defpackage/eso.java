package defpackage;

import java.util.concurrent.Callable;

/* renamed from: eso reason: default package */
final class eso implements Callable<byte[]> {
    private final /* synthetic */ eqk a;
    private final /* synthetic */ String b;
    private final /* synthetic */ esa c;

    eso(esa esa, eqk eqk, String str) {
        this.c = esa;
        this.a = eqk;
        this.b = str;
    }

    public final /* synthetic */ Object call() {
        this.c.a.k();
        evc a2 = this.c.a;
        evc.a((evb) a2.a);
        return a2.a.a(this.a, this.b);
    }
}
