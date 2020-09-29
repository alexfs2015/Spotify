package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: esr reason: default package */
final class esr implements Callable<List<evl>> {
    private final /* synthetic */ evq a;
    private final /* synthetic */ esa b;

    esr(esa esa, evq evq) {
        this.b = esa;
        this.a = evq;
    }

    public final /* synthetic */ Object call() {
        this.b.a.k();
        return this.b.a.d().a(this.a.a);
    }
}
