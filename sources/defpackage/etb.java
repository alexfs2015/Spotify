package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: etb reason: default package */
final class etb implements Callable<List<ewl>> {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ esr d;

    etb(esr esr, String str, String str2, String str3) {
        this.d = esr;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final /* synthetic */ Object call() {
        this.d.a.k();
        return this.d.a.d().b(this.a, this.b, this.c);
    }
}
