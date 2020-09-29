package defpackage;

import java.util.Map;

/* renamed from: cth reason: default package */
final /* synthetic */ class cth implements Runnable {
    private final ctg a;
    private final Map b;

    cth(ctg ctg, Map map) {
        this.a = ctg;
        this.b = map;
    }

    public final void run() {
        ctg ctg = this.a;
        ctg.a.a("pubVideoCmd", this.b);
    }
}
