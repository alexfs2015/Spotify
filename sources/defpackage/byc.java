package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: byc reason: default package */
final class byc implements a {
    private final /* synthetic */ bsi a;
    private final /* synthetic */ exj b;
    private final /* synthetic */ a c;
    private final /* synthetic */ b d;

    byc(bsi bsi, exj exj, a aVar, b bVar) {
        this.a = bsi;
        this.b = exj;
        this.c = aVar;
        this.d = bVar;
    }

    public final void a(Status status) {
        if (status.c()) {
            this.b.a(this.c.a(this.a.a(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.b.a((Exception) this.d.a(status));
    }
}
