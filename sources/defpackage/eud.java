package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: eud reason: default package */
final class eud implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ evq f;
    private final /* synthetic */ ets g;

    eud(ets ets, AtomicReference atomicReference, String str, String str2, String str3, boolean z, evq evq) {
        this.g = ets;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = evq;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                eqn eqn = this.g.b;
                if (eqn == null) {
                    this.g.q().c.a("Failed to get user properties", eqw.a(this.b), this.c, this.d);
                    this.a.set(Collections.emptyList());
                    this.a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.b)) {
                    this.a.set(eqn.a(this.c, this.d, this.e, this.f));
                } else {
                    this.a.set(eqn.a(this.b, this.c, this.d, this.e));
                }
                this.g.y();
                this.a.notify();
            } catch (RemoteException e2) {
                try {
                    this.g.q().c.a("Failed to get user properties", eqw.a(this.b), this.c, e2);
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