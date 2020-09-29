package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: esy reason: default package */
final class esy implements Callable<List<ewc>> {
    private final /* synthetic */ ewh a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ esr d;

    esy(esr esr, ewh ewh, String str, String str2) {
        this.d = esr;
        this.a = ewh;
        this.b = str;
        this.c = str2;
    }

    public final /* synthetic */ Object call() {
        this.d.a.k();
        return this.d.a.d().a(this.a.a, this.b, this.c);
    }
}
