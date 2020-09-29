package defpackage;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.IOException;

/* renamed from: djf reason: default package */
public final class djf extends djw {
    public djf(dil dil, String str, String str2, dbr dbr, int i) {
        super(dil, str, str2, dbr, i, 24);
    }

    private final void c() {
        AdvertisingIdClient b = this.a.b();
        if (b != null) {
            try {
                Info info = b.getInfo();
                String a = dit.a(info.getId());
                if (a != null) {
                    synchronized (this.b) {
                        this.b.T = a;
                        this.b.V = Boolean.valueOf(info.isLimitAdTrackingEnabled());
                        this.b.U = Integer.valueOf(5);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public final /* synthetic */ Object call() {
        return call();
    }

    public final Void b() {
        if (this.a.k) {
            return super.call();
        }
        if (this.a.i) {
            c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.a.i) {
            c();
            return;
        }
        synchronized (this.b) {
            this.b.T = (String) this.c.invoke(null, new Object[]{this.a.a()});
        }
    }
}
