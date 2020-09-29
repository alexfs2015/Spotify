package defpackage;

import android.os.RemoteException;
import android.view.View;
import java.util.Map;

/* renamed from: bim reason: default package */
final class bim implements bgl<csr> {
    private final /* synthetic */ edb a;
    private final /* synthetic */ bhr b;
    private final /* synthetic */ edf c;

    bim(edb edb, bhr bhr, edf edf) {
        this.a = edb;
        this.b = bhr;
        this.c = edf;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        csr csr = (csr) obj;
        View o = csr.o();
        try {
            if (this.a == null) {
                if (this.c != null) {
                    if (!this.c.i()) {
                        this.c.a(cas.a(o));
                        this.b.a.e();
                        return;
                    }
                    bih.a(csr);
                }
            } else if (!this.a.k()) {
                this.a.a(cas.a(o));
                this.b.a.e();
            } else {
                bih.a(csr);
            }
        } catch (RemoteException unused) {
            cow.a(5);
        }
    }
}
