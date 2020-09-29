package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

/* renamed from: bup reason: default package */
final class bup implements Runnable {
    private final /* synthetic */ ConnectionResult a;
    private final /* synthetic */ c b;

    bup(c cVar, ConnectionResult connectionResult) {
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
                this.b.a.a((bwq) null, Collections.emptySet());
            } catch (SecurityException unused) {
                ((a) bss.this.p.get(this.b.b)).a(new ConnectionResult(10));
            }
        } else {
            ((a) bss.this.p.get(this.b.b)).a(this.a);
        }
    }
}
