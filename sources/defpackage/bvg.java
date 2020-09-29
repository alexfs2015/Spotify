package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

/* renamed from: bvg reason: default package */
final class bvg implements Runnable {
    private final /* synthetic */ ConnectionResult a;
    private final /* synthetic */ c b;

    bvg(c cVar, ConnectionResult connectionResult) {
        this.b = cVar;
        this.a = connectionResult;
    }

    public final void run() {
        if (this.a.b()) {
            c cVar = this.b;
            cVar.c = true;
            if (cVar.a.i()) {
                this.b.a();
                return;
            }
            try {
                this.b.a.a((bxh) null, Collections.emptySet());
            } catch (SecurityException unused) {
                ((a) btj.this.p.get(this.b.b)).a(new ConnectionResult(10));
            }
        } else {
            ((a) btj.this.p.get(this.b.b)).a(this.a);
        }
    }
}
