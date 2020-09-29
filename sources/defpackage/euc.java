package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: euc reason: default package */
final class euc implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ evq e;
    private final /* synthetic */ ets f;

    euc(ets ets, AtomicReference atomicReference, String str, String str2, String str3, evq evq) {
        this.f = ets;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = evq;
    }

    public final void run() {
        synchronized (this.a) {
            try {
                eqn eqn = this.f.b;
                if (eqn == null) {
                    this.f.q().c.a("Failed to get conditional properties", eqw.a(this.b), this.c, this.d);
                    this.a.set(Collections.emptyList());
                    this.a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.b)) {
                    this.a.set(eqn.a(this.c, this.d, this.e));
                } else {
                    this.a.set(eqn.a(this.b, this.c, this.d));
                }
                this.f.y();
                this.a.notify();
            } catch (RemoteException e2) {
                try {
                    this.f.q().c.a("Failed to get conditional properties", eqw.a(this.b), this.c, e2);
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
