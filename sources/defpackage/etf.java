package defpackage;

import java.util.concurrent.Callable;

/* renamed from: etf reason: default package */
final class etf implements Callable<byte[]> {
    private final /* synthetic */ erb a;
    private final /* synthetic */ String b;
    private final /* synthetic */ esr c;

    etf(esr esr, erb erb, String str) {
        this.c = esr;
        this.a = erb;
        this.b = str;
    }

    public final /* synthetic */ Object call() {
        this.c.a.k();
        evt a2 = this.c.a;
        evt.a((evs) a2.a);
        return a2.a.a(this.a, this.b);
    }
}
