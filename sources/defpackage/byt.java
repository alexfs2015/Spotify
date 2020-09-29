package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: byt reason: default package */
final class byt implements a {
    private final /* synthetic */ bsz a;
    private final /* synthetic */ eya b;
    private final /* synthetic */ a c;
    private final /* synthetic */ b d;

    byt(bsz bsz, eya eya, a aVar, b bVar) {
        this.a = bsz;
        this.b = eya;
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
