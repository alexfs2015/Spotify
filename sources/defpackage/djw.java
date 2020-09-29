package defpackage;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.IOException;

/* renamed from: djw reason: default package */
public final class djw extends dkn {
    public djw(djc djc, String str, String str2, dci dci, int i) {
        super(djc, str, str2, dci, i, 24);
    }

    private final void c() {
        AdvertisingIdClient b = this.a.b();
        if (b != null) {
            try {
                Info info = b.getInfo();
                String a = djk.a(info.getId());
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

    public final Void b() {
        if (this.a.k) {
            return super.call();
        }
        if (this.a.i) {
            c();
        }
        return null;
    }

    public final /* synthetic */ Object call() {
        return call();
    }
}
