package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: esk reason: default package */
final class esk implements Callable<List<evu>> {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ esa d;

    esk(esa esa, String str, String str2, String str3) {
        this.d = esa;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final /* synthetic */ Object call() {
        this.d.a.k();
        return this.d.a.d().b(this.a, this.b, this.c);
    }
}
