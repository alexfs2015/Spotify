package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: euu reason: default package */
final class euu implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ ewh f;
    private final /* synthetic */ euj g;

    euu(euj euj, AtomicReference atomicReference, String str, String str2, String str3, boolean z, ewh ewh) {
        this.g = euj;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = ewh;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                ere ere = this.g.b;
                if (ere == null) {
                    this.g.q().c.a("Failed to get user properties", ern.a(this.b), this.c, this.d);
                    this.a.set(Collections.emptyList());
                    this.a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.b)) {
                    this.a.set(ere.a(this.c, this.d, this.e, this.f));
                } else {
                    this.a.set(ere.a(this.b, this.c, this.d, this.e));
                }
                this.g.y();
                this.a.notify();
            } catch (RemoteException e2) {
                try {
                    this.g.q().c.a("Failed to get user properties", ern.a(this.b), this.c, e2);
                    this.a.set(Collections.emptyList());
                    this.a.notify();
                } catch (Throwable th) {
                    this.a.notify();
                    throw th;
                }
            }
        }
    }
}
