package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;

@cey
/* renamed from: dms reason: default package */
public final class dms {
    public final Runnable a = new dmt(this);
    public final Object b = new Object();
    dmz c;
    dnd d;
    private Context e;

    public final dmx a(dna dna) {
        synchronized (this.b) {
            if (this.d == null) {
                dmx dmx = new dmx();
                return dmx;
            }
            try {
                dmx a2 = this.d.a(dna);
                return a2;
            } catch (RemoteException e2) {
                clu.a("Unable to call into cache service.", e2);
                return new dmx();
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
            dmz r1 = r6.c     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000c
            goto L_0x002e
        L_0x000c:
            dmv r1 = new dmv     // Catch:{ all -> 0x0030 }
            r1.<init>(r6)     // Catch:{ all -> 0x0030 }
            dmw r2 = new dmw     // Catch:{ all -> 0x0030 }
            r2.<init>(r6)     // Catch:{ all -> 0x0030 }
            dmz r3 = new dmz     // Catch:{ all -> 0x0030 }
            android.content.Context r4 = r6.e     // Catch:{ all -> 0x0030 }
            cny r5 = defpackage.bjl.t()     // Catch:{ all -> 0x0030 }
            android.os.Looper r5 = r5.a()     // Catch:{ all -> 0x0030 }
            r3.<init>(r4, r5, r1, r2)     // Catch:{ all -> 0x0030 }
            r6.c = r3     // Catch:{ all -> 0x0030 }
            dmz r1 = r6.c     // Catch:{ all -> 0x0030 }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dms.a():void");
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
            dsf<java.lang.Boolean> r3 = defpackage.dsp.cC     // Catch:{ all -> 0x0048 }
            dsn r1 = defpackage.dpn.f()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.a()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            dsf<java.lang.Boolean> r3 = defpackage.dsp.cB     // Catch:{ all -> 0x0048 }
            dsn r1 = defpackage.dpn.f()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            dmu r3 = new dmu     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            dlu r1 = defpackage.bjl.h()     // Catch:{ all -> 0x0048 }
            r1.a(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dms.a(android.content.Context):void");
    }

    static /* synthetic */ void a(dms dms) {
        synchronized (dms.b) {
            if (dms.c != null) {
                if (dms.c.g() || dms.c.h()) {
                    dms.c.f();
                }
                dms.c = null;
                dms.d = null;
                Binder.flushPendingCommands();
            }
        }
    }
}
