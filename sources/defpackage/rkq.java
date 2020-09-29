package defpackage;

import android.app.Application;

/* renamed from: rkq reason: default package */
public final class rkq {
    private boolean a;
    private final Application b;
    private final rko c;
    private final wlc<rkm> d;
    private final rkk e;
    private final a f;
    private final rkf g;
    private final rki h;

    /* renamed from: rkq$a */
    public interface a {
    }

    rkq(Application application, a aVar, rkf rkf, rko rko, wlc<rkm> wlc, rkk rkk, rki rki) {
        this.b = application;
        this.f = aVar;
        this.g = rkf;
        this.d = wlc;
        this.c = rko;
        this.e = rkk;
        this.h = rki;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:6|7|(2:9|10)|11|12|(3:14|(1:16)|17)|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0019 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.a     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r11)
            return
        L_0x0007:
            rkh r0 = new rkh     // Catch:{ all -> 0x0094 }
            r0.<init>()     // Catch:{ all -> 0x0094 }
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]     // Catch:{ all -> 0x0094 }
            r0.execute(r1)     // Catch:{ all -> 0x0094 }
            boolean r0 = defpackage.kzd.a.a     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x0019
            com.spotify.android.util.PRNGFixes.a()     // Catch:{ Exception -> 0x0019 }
        L_0x0019:
            rko r0 = r11.c     // Catch:{ all -> 0x0094 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0094 }
            r2 = 6
            r1.<init>(r2)     // Catch:{ all -> 0x0094 }
            jui r2 = new jui     // Catch:{ all -> 0x0094 }
            com.spotify.base.java.logging.LogLevel r3 = com.spotify.base.java.logging.LogLevel.ERROR     // Catch:{ all -> 0x0094 }
            java.util.EnumSet r3 = java.util.EnumSet.of(r3)     // Catch:{ all -> 0x0094 }
            r2.<init>(r3)     // Catch:{ all -> 0x0094 }
            r1.add(r2)     // Catch:{ all -> 0x0094 }
            juj r0 = r0.a     // Catch:{ all -> 0x0094 }
            r1.add(r0)     // Catch:{ all -> 0x0094 }
            gbu r0 = new gbu     // Catch:{ all -> 0x0094 }
            r0.<init>()     // Catch:{ all -> 0x0094 }
            gca r2 = new gca     // Catch:{ all -> 0x0094 }
            r2.<init>()     // Catch:{ all -> 0x0094 }
            com.spotify.base.java.logging.Logger.a(r0, r2, r1)     // Catch:{ all -> 0x0094 }
            wlc<rkm> r0 = r11.d     // Catch:{ all -> 0x0094 }
            r0.get()     // Catch:{ all -> 0x0094 }
            rki r0 = r11.h     // Catch:{ all -> 0x0094 }
            jsa r1 = new jsa     // Catch:{ all -> 0x0094 }
            jsq r0 = r0.a     // Catch:{ all -> 0x0094 }
            r1.<init>(r0)     // Catch:{ all -> 0x0094 }
            com.spotify.mobile.android.util.Assertion.a(r1)     // Catch:{ all -> 0x0094 }
            rkk r0 = r11.e     // Catch:{ all -> 0x0094 }
            android.app.Application r2 = r11.b     // Catch:{ all -> 0x0094 }
            rlj r1 = r0.d     // Catch:{ all -> 0x0094 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0094 }
            r1.a = r3     // Catch:{ all -> 0x0094 }
            com.spotify.music.internal.util.process.ProcessType r1 = r0.b     // Catch:{ all -> 0x0094 }
            com.spotify.music.internal.util.process.ProcessType r3 = com.spotify.music.internal.util.process.ProcessType.MAIN     // Catch:{ all -> 0x0094 }
            if (r1 != r3) goto L_0x008c
            rli r1 = r0.f     // Catch:{ all -> 0x0094 }
            boolean r1 = r1.a     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0087
            rme r10 = new rme     // Catch:{ all -> 0x0094 }
            rlx r3 = new rlx     // Catch:{ all -> 0x0094 }
            gho r1 = r0.c     // Catch:{ all -> 0x0094 }
            wmb r1 = r1.a     // Catch:{ all -> 0x0094 }
            r3.<init>(r1)     // Catch:{ all -> 0x0094 }
            rlj r4 = r0.d     // Catch:{ all -> 0x0094 }
            rlr r5 = r0.e     // Catch:{ all -> 0x0094 }
            rli r6 = r0.f     // Catch:{ all -> 0x0094 }
            rmb r7 = r0.i     // Catch:{ all -> 0x0094 }
            rnf r8 = r0.h     // Catch:{ all -> 0x0094 }
            r9 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0094 }
            r10.a()     // Catch:{ all -> 0x0094 }
        L_0x0087:
            rla r0 = r0.a     // Catch:{ all -> 0x0094 }
            r0.c()     // Catch:{ all -> 0x0094 }
        L_0x008c:
            com.uber.rxdogtag.RxDogTag.a()     // Catch:{ all -> 0x0094 }
            r0 = 1
            r11.a = r0     // Catch:{ all -> 0x0094 }
            monitor-exit(r11)
            return
        L_0x0094:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkq.a():void");
    }
}
