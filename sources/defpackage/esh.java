package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: esh reason: default package */
final class esh implements Callable<List<evl>> {
    private final /* synthetic */ evq a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ esa d;

    esh(esa esa, evq evq, String str, String str2) {
        this.d = esa;
        this.a = evq;
        this.b = str;
        this.c = str2;
    }

    public final /* synthetic */ Object call() {
        this.d.a.k();
        return this.d.a.d().a(this.a.a, this.b, this.c);
    }
}
