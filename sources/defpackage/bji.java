package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bji reason: default package */
final class bji implements Callable<dhx> {
    private final /* synthetic */ bjf a;

    bji(bjf bjf) {
        this.a = bjf;
    }

    public final /* synthetic */ Object call() {
        return new dhx(dhw.a(this.a.a.a, this.a.d, false));
    }
}
