package defpackage;

import java.util.Map;

/* renamed from: cty reason: default package */
final /* synthetic */ class cty implements Runnable {
    private final ctx a;
    private final Map b;

    cty(ctx ctx, Map map) {
        this.a = ctx;
        this.b = map;
    }

    public final void run() {
        ctx ctx = this.a;
        ctx.a.a("pubVideoCmd", this.b);
    }
}
