package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;

@cfp
/* renamed from: dnj reason: default package */
public final class dnj {
    public final Runnable a = new dnk(this);
    public final Object b = new Object();
    dnq c;
    dnu d;
    private Context e;

    static /* synthetic */ void a(dnj dnj) {
        synchronized (dnj.b) {
            if (dnj.c != null) {
                if (dnj.c.g() || dnj.c.h()) {
                    dnj.c.f();
                }
                dnj.c = null;
                dnj.d = null;
                Binder.flushPendingCommands();
            }
        }
    }

    public final dno a(dnr dnr) {
        synchronized (this.b) {
            if (this.d == null) {
                dno dno = new dno();
                return dno;
            }
            try {
                dno a2 = this.d.a(dnr);
                return a2;
            } catch (RemoteException e2) {
                cml.a("Unable to call into cache service.", e2);
                return new dno();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            monitor-enter(r0)
            android.content.Context r1 = r6.e     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            dnq r1 = r6.c     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000c
            goto L_0x002e
        L_0x000c:
            dnm r1 = new dnm     // Catch:{ all -> 0x0030 }
            r1.<init>(r6)     // Catch:{ all -> 0x0030 }
            dnn r2 = new dnn     // Catch:{ all -> 0x0030 }
            r2.<init>(r6)     // Catch:{ all -> 0x0030 }
            dnq r3 = new dnq     // Catch:{ all -> 0x0030 }
            android.content.Context r4 = r6.e     // Catch:{ all -> 0x0030 }
            cop r5 = defpackage.bkc.t()     // Catch:{ all -> 0x0030 }
            android.os.Looper r5 = r5.a()     // Catch:{ all -> 0x0030 }
            r3.<init>(r4, r5, r1, r2)     // Catch:{ all -> 0x0030 }
            r6.c = r3     // Catch:{ all -> 0x0030 }
            dnq r1 = r6.c     // Catch:{ all -> 0x0030 }
            r1.l()     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnj.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            android.content.Context r1 = r2.e     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.e = r3     // Catch:{ all -> 0x0048 }
            dsw<java.lang.Boolean> r3 = defpackage.dtg.cC     // Catch:{ all -> 0x0048 }
            dte r1 = defpackage.dqe.f()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.a()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            dsw<java.lang.Boolean> r3 = defpackage.dtg.cB     // Catch:{ all -> 0x0048 }
            dte r1 = defpackage.dqe.f()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            dnl r3 = new dnl     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            dml r1 = defpackage.bkc.h()     // Catch:{ all -> 0x0048 }
            r1.a(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnj.a(android.content.Context):void");
    }
}
