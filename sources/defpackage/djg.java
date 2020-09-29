package defpackage;

import com.google.android.gms.internal.ads.zzbfh;
import java.util.concurrent.Callable;

/* renamed from: djg reason: default package */
public final class djg implements Callable {
    private final dil a;
    private final dbr b;

    public djg(dil dil, dbr dbr) {
        this.a = dil;
        this.b = dbr;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() {
        if (this.a.g != null) {
            this.a.g.get();
        }
        dbr dbr = this.a.f;
        if (dbr != null) {
            try {
                synchronized (this.b) {
                    dbr dbr2 = this.b;
                    byte[] a2 = dgf.a((dgf) dbr);
                    dgf.a(dbr2, a2, a2.length);
                }
            } catch (zzbfh unused) {
            }
        }
        return null;
    }
}
