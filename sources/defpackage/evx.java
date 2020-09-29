package defpackage;

import java.util.concurrent.Callable;

/* renamed from: evx reason: default package */
final class evx implements Callable<String> {
    private final /* synthetic */ ewh a;
    private final /* synthetic */ evt b;

    evx(evt evt, ewh ewh) {
        this.b = evt;
        this.a = ewh;
    }

    public final /* synthetic */ Object call() {
        ewg a2 = this.b.b().e(this.a.a) ? this.b.c(this.a) : this.b.d().b(this.a.a);
        if (a2 != null) {
            return a2.b();
        }
        this.b.q().f.a("App info was null when attempting to get app instance id");
        return null;
    }
}
