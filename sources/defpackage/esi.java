package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: esi reason: default package */
final class esi implements Callable<List<evl>> {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ esa d;

    esi(esa esa, String str, String str2, String str3) {
        this.d = esa;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final /* synthetic */ Object call() {
        this.d.a.k();
        return this.d.a.d().a(this.a, this.b, this.c);
    }
}
