package defpackage;

import com.google.android.gms.internal.ads.zzbfh;
import java.util.concurrent.Callable;

/* renamed from: djx reason: default package */
public final class djx implements Callable {
    private final djc a;
    private final dci b;

    public djx(djc djc, dci dci) {
        this.a = djc;
        this.b = dci;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() {
        if (this.a.g != null) {
            this.a.g.get();
        }
        dci dci = this.a.f;
        if (dci != null) {
            try {
                synchronized (this.b) {
                    dci dci2 = this.b;
                    byte[] a2 = dgw.a((dgw) dci);
                    dgw.a(dci2, a2, a2.length);
                }
            } catch (zzbfh unused) {
            }
        }
        return null;
    }
}
