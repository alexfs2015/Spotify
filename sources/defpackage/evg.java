package defpackage;

import java.util.concurrent.Callable;

/* renamed from: evg reason: default package */
final class evg implements Callable<String> {
    private final /* synthetic */ evq a;
    private final /* synthetic */ evc b;

    evg(evc evc, evq evq) {
        this.b = evc;
        this.a = evq;
    }

    public final /* synthetic */ Object call() {
        evp evp;
        if (this.b.b().e(this.a.a)) {
            evp = this.b.c(this.a);
        } else {
            evp = this.b.d().b(this.a.a);
        }
        if (evp != null) {
            return evp.b();
        }
        this.b.q().f.a("App info was null when attempting to get app instance id");
        return null;
    }
}
