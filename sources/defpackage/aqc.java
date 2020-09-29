package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: aqc reason: default package */
public final class aqc implements Callback, defpackage.apx.a, defpackage.aqn.a, defpackage.axo.a, defpackage.axp.b, defpackage.bbf.a {
    private int A;
    private boolean B;
    private int C;
    private d D;
    private long E;
    private int F;
    public final bdc a;
    final HandlerThread b;
    private final aqo[] c;
    private final aqp[] d;
    private final bbf e;
    private final bbg f;
    private final aqg g;
    private final bbj h;
    private final Handler i;
    private final apz j;
    private final defpackage.aqu.b k;
    private final defpackage.aqu.a l;
    private final long m;
    private final boolean n;
    private final apx o;
    private final c p;
    private final ArrayList<b> q;
    private final bcw r;
    private final aqj s = new aqj();
    private aqs t;
    private aqk u;
    private axp v;
    private aqo[] w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* renamed from: aqc$a */
    static final class a {
        public final axp a;
        public final aqu b;
        public final Object c;

        public a(axp axp, aqu aqu, Object obj) {
            this.a = axp;
            this.b = aqu;
            this.c = obj;
        }
    }

    /* renamed from: aqc$b */
    static final class b implements Comparable<b> {
        public final aqn a;
        public int b;
        public long c;
        public Object d;

        public final /* synthetic */ int compareTo(Object obj) {
            int i;
            b bVar = (b) obj;
            if ((this.d == null) != (bVar.d == null)) {
                if (this.d == null) {
                    return 1;
                }
                i = -1;
            } else if (this.d == null) {
                return 0;
            } else {
                int i2 = this.b - bVar.b;
                if (i2 != 0) {
                    return i2;
                }
                i = bdw.b(this.c, bVar.c);
            }
            return i;
        }

        public b(aqn aqn) {
            this.a = aqn;
        }

        public final void a(int i, long j, Object obj) {
            this.b = i;
            this.c = j;
            this.d = obj;
        }
    }

    /* renamed from: aqc$c */
    static final class c {
        int a;
        boolean b;
        int c;
        private aqk d;

        private c() {
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        public final boolean a(aqk aqk) {
            return aqk != this.d || this.a > 0 || this.b;
        }

        public final void b(aqk aqk) {
            this.d = aqk;
            this.a = 0;
            this.b = false;
        }

        public final void a(int i) {
            this.a += i;
        }

        public final void b(int i) {
            boolean z = true;
            if (!this.b || this.c == 4) {
                this.b = true;
                this.c = i;
                return;
            }
            if (i != 4) {
                z = false;
            }
            bcu.a(z);
        }
    }

    /* renamed from: aqc$d */
    static final class d {
        public final aqu a;
        public final int b;
        public final long c;

        public d(aqu aqu, int i, long j) {
            this.a = aqu;
            this.b = i;
            this.c = j;
        }
    }

    public final /* synthetic */ void a(axu axu) {
        this.a.a(10, (Object) (axo) axu).sendToTarget();
    }

    public aqc(aqo[] aqoArr, bbf bbf, bbg bbg, aqg aqg, bbj bbj, boolean z2, int i2, boolean z3, Handler handler, apz apz, bcw bcw) {
        this.c = aqoArr;
        this.e = bbf;
        this.f = bbg;
        this.g = aqg;
        this.h = bbj;
        this.y = z2;
        this.A = i2;
        this.B = z3;
        this.i = handler;
        this.j = apz;
        this.r = bcw;
        this.m = aqg.e();
        this.n = aqg.f();
        this.t = aqs.b;
        this.u = aqk.a(-9223372036854775807L, bbg);
        this.p = new c(0);
        this.d = new aqp[aqoArr.length];
        for (int i3 = 0; i3 < aqoArr.length; i3++) {
            aqoArr[i3].a(i3);
            this.d[i3] = aqoArr[i3].b();
        }
        this.o = new apx(this, bcw);
        this.q = new ArrayList<>();
        this.w = new aqo[0];
        this.k = new defpackage.aqu.b();
        this.l = new defpackage.aqu.a();
        bbf.a = this;
        bbf.b = bbj;
        this.b = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.b.start();
        this.a = bcw.a(this.b.getLooper(), this);
    }

    public final void a(axp axp, boolean z2, boolean z3) {
        this.a.a(0, z2 ? 1 : 0, z3 ? 1 : 0, axp).sendToTarget();
    }

    public final void a(boolean z2) {
        this.a.a(1, z2 ? 1 : 0, 0).sendToTarget();
    }

    public final void b(boolean z2) {
        this.a.a(6, z2 ? 1 : 0, 0).sendToTarget();
    }

    public final synchronized void a(aqn aqn) {
        if (this.x) {
            bdd.c("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            aqn.b(false);
            return;
        }
        this.a.a(14, (Object) aqn).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.x     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            bdc r0 = r2.a     // Catch:{ all -> 0x0023 }
            r1 = 7
            r0.a(r1)     // Catch:{ all -> 0x0023 }
            r0 = 0
        L_0x000e:
            boolean r1 = r2.x     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0018
            r2.wait()     // Catch:{ InterruptedException -> 0x0016 }
            goto L_0x000e
        L_0x0016:
            r0 = 1
            goto L_0x000e
        L_0x0018:
            if (r0 == 0) goto L_0x0021
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0023 }
            r0.interrupt()     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0027
        L_0x0026:
            throw r0
        L_0x0027:
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqc.a():void");
    }

    public final void onSourceInfoRefreshed(axp axp, aqu aqu, Object obj) {
        this.a.a(8, (Object) new a(axp, aqu, obj)).sendToTarget();
    }

    public final void a(axo axo) {
        this.a.a(9, (Object) axo).sendToTarget();
    }

    public final void b() {
        this.a.a(11);
    }

    public final void a(aql aql) {
        this.a.a(16, (Object) aql).sendToTarget();
    }

    /* JADX INFO: used method not loaded: aqj.a(aqh):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01dd, code lost:
        r38 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x033c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x033d, code lost:
        r2 = r0;
        r1.u = r1.u.a(h(), -9223372036854775807L, -9223372036854775807L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0354, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x051e, code lost:
        if (r3.a(r2) == false) goto L_0x0523;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0521, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0523, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0524, code lost:
        if (r2 != false) goto L_0x052b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0526, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        d(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x052b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x052c, code lost:
        e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0531, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0532, code lost:
        r38 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0536, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0537, code lost:
        r5 = r3;
        r2 = false;
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x053c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x053d, code lost:
        r5 = r3;
        r2 = false;
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0647, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0648, code lost:
        r2 = r0;
        r1.u = r1.u.a(r4, r11, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0659, code lost:
        if (r9 != false) goto L_0x065b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x065d, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:?, code lost:
        r1.p.b(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x09d1, code lost:
        if (r13 == false) goto L_0x09d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0a97, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0a9c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0a9d, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0aa0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0aa1, code lost:
        r3 = r0;
        r5 = r38;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0aa7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0aa8, code lost:
        r3 = r0;
        r5 = r38;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0aae, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0aaf, code lost:
        r38 = r3;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0acf, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0ad0, code lost:
        r5 = r3;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0ad2, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0aec, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x0aed, code lost:
        r5 = r3;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0aef, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:112:0x0238, B:117:0x026d] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:122:0x0295, B:138:0x0307, B:274:0x05c5] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0536 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:112:0x0238] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x053c A[ExcHandler: ExoPlaybackException (e com.google.android.exoplayer2.ExoPlaybackException), Splitter:B:112:0x0238] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0643 A[Catch:{ all -> 0x0647, IllegalSeekPositionException -> 0x033c, ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x06be A[Catch:{ all -> 0x0647, IllegalSeekPositionException -> 0x033c, ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0760 A[Catch:{ all -> 0x0647, IllegalSeekPositionException -> 0x033c, ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x077d A[Catch:{ all -> 0x0647, IllegalSeekPositionException -> 0x033c, ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }] */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x092a A[Catch:{ all -> 0x0647, IllegalSeekPositionException -> 0x033c, ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }] */
    /* JADX WARNING: Removed duplicated region for block: B:572:0x0a9c A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r38 
      PHI: (r38v7 java.lang.String) = (r38v10 java.lang.String), (r38v10 java.lang.String), (r38v10 java.lang.String), (r38v13 java.lang.String), (r38v13 java.lang.String), (r38v13 java.lang.String), (r38v13 java.lang.String), (r38v13 java.lang.String), (r38v13 java.lang.String), (r38v17 java.lang.String), (r38v19 java.lang.String), (r38v19 java.lang.String), (r38v19 java.lang.String), (r38v19 java.lang.String), (r38v19 java.lang.String), (r38v19 java.lang.String) binds: [B:526:0x09d8, B:527:?, B:528:0x09db, B:274:0x05c5, B:323:0x066e, B:317:0x065e, B:318:?, B:308:0x0639, B:294:0x0615, B:252:0x0544, B:122:0x0295, B:133:0x0301, B:135:0x0303, B:136:?, B:138:0x0307, B:141:0x030f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:274:0x05c5] */
    /* JADX WARNING: Removed duplicated region for block: B:581:0x0aae A[ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:1:0x0009] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r41) {
        /*
            r40 = this;
            r1 = r40
            r2 = r41
            java.lang.String r3 = "ExoPlayerImplInternal"
            r4 = 2
            r5 = 0
            r6 = 1
            int r7 = r2.what     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r8 = 0
            r10 = 4
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            switch(r7) {
                case 0: goto L_0x0a5d;
                case 1: goto L_0x0a28;
                case 2: goto L_0x066f;
                case 3: goto L_0x056f;
                case 4: goto L_0x0562;
                case 5: goto L_0x0558;
                case 6: goto L_0x0549;
                case 7: goto L_0x0542;
                case 8: goto L_0x026d;
                case 9: goto L_0x01f8;
                case 10: goto L_0x01e1;
                case 11: goto L_0x00f3;
                case 12: goto L_0x00dd;
                case 13: goto L_0x00c2;
                case 14: goto L_0x0082;
                case 15: goto L_0x005d;
                case 16: goto L_0x0017;
                default: goto L_0x0015;
            }     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
        L_0x0015:
            r2 = 0
            return r2
        L_0x0017:
            java.lang.Object r2 = r2.obj     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aql r2 = (defpackage.aql) r2     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            android.os.Handler r7 = r1.i     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            android.os.Message r7 = r7.obtainMessage(r6, r2)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r7.sendToTarget()     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            float r7 = r2.b     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqj r8 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqh r8 = r8.a()     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
        L_0x002c:
            if (r8 == 0) goto L_0x004b
            bbg r9 = r8.i     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r9 == 0) goto L_0x0048
            bbg r9 = r8.i     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            bbe r9 = r9.c     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            bbd[] r9 = r9.a()     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            int r10 = r9.length     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r11 = 0
        L_0x003c:
            if (r11 >= r10) goto L_0x0048
            r12 = r9[r11]     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r12 == 0) goto L_0x0045
            r12.a(r7)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
        L_0x0045:
            int r11 = r11 + 1
            goto L_0x003c
        L_0x0048:
            aqh r8 = r8.g     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            goto L_0x002c
        L_0x004b:
            aqo[] r7 = r1.c     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            int r8 = r7.length     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r9 = 0
        L_0x004f:
            if (r9 >= r8) goto L_0x01dd
            r10 = r7[r9]     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r10 == 0) goto L_0x005a
            float r11 = r2.b     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r10.a(r11)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
        L_0x005a:
            int r9 = r9 + 1
            goto L_0x004f
        L_0x005d:
            java.lang.Object r2 = r2.obj     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqn r2 = (defpackage.aqn) r2     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            android.os.Handler r7 = r2.e     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            -$$Lambda$aqc$jQDsFdkok8NSsU2BcwQkv9HgMYw r8 = new -$$Lambda$aqc$jQDsFdkok8NSsU2BcwQkv9HgMYw     // Catch:{ ExoPlaybackException -> 0x007b, IOException -> 0x0074, RuntimeException -> 0x006d }
            r8.<init>(r1, r2)     // Catch:{ ExoPlaybackException -> 0x007b, IOException -> 0x0074, RuntimeException -> 0x006d }
            r7.post(r8)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            goto L_0x01dd
        L_0x006d:
            r0 = move-exception
            r2 = r0
            r38 = r3
            r3 = r2
            goto L_0x0a9e
        L_0x0074:
            r0 = move-exception
            r2 = r0
            r5 = r3
            r3 = r2
        L_0x0078:
            r2 = 0
            goto L_0x0ad3
        L_0x007b:
            r0 = move-exception
            r2 = r0
            r5 = r3
            r3 = r2
        L_0x007f:
            r2 = 0
            goto L_0x0af0
        L_0x0082:
            java.lang.Object r2 = r2.obj     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqn r2 = (defpackage.aqn) r2     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r7 = r2.g     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x0091
            r1.b(r2)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            goto L_0x01dd
        L_0x0091:
            axp r7 = r1.v     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r7 == 0) goto L_0x00b6
            int r7 = r1.C     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r7 <= 0) goto L_0x009a
            goto L_0x00b6
        L_0x009a:
            aqc$b r7 = new aqc$b     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r7.<init>(r2)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            boolean r8 = r1.a(r7)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r8 == 0) goto L_0x00b1
            java.util.ArrayList<aqc$b> r2 = r1.q     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r2.add(r7)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            java.util.ArrayList<aqc$b> r2 = r1.q     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            java.util.Collections.sort(r2)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            goto L_0x01dd
        L_0x00b1:
            r2.b(r5)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            goto L_0x01dd
        L_0x00b6:
            java.util.ArrayList<aqc$b> r7 = r1.q     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqc$b r8 = new aqc$b     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r8.<init>(r2)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r7.add(r8)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            goto L_0x01dd
        L_0x00c2:
            int r2 = r2.arg1     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r2 == 0) goto L_0x00c8
            r2 = 1
            goto L_0x00c9
        L_0x00c8:
            r2 = 0
        L_0x00c9:
            r1.B = r2     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqj r7 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r7.e = r2     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            boolean r2 = r7.d()     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r2 != 0) goto L_0x00d8
            r1.d(r6)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
        L_0x00d8:
            r1.e(r5)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            goto L_0x01dd
        L_0x00dd:
            int r2 = r2.arg1     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r1.A = r2     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqj r7 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r7.d = r2     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            boolean r2 = r7.d()     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r2 != 0) goto L_0x00ee
            r1.d(r6)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
        L_0x00ee:
            r1.e(r5)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            goto L_0x01dd
        L_0x00f3:
            aqj r2 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            boolean r2 = r2.b()     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r2 == 0) goto L_0x01dd
            apx r2 = r1.o     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aql r2 = r2.e()     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            float r2 = r2.b     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqj r7 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqh r7 = r7.f     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqj r8 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqh r8 = r8.g     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r9 = 1
        L_0x010c:
            if (r7 == 0) goto L_0x01dd
            boolean r11 = r7.d     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r11 != 0) goto L_0x0114
            goto L_0x01dd
        L_0x0114:
            boolean r11 = r7.a(r2)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r11 != 0) goto L_0x0120
            if (r7 != r8) goto L_0x011d
            r9 = 0
        L_0x011d:
            aqh r7 = r7.g     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            goto L_0x010c
        L_0x0120:
            if (r9 == 0) goto L_0x01af
            aqj r2 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqh r2 = r2.f     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqj r7 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            boolean r7 = r7.a(r2)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqo[] r8 = r1.c     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            int r8 = r8.length     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            boolean[] r8 = new boolean[r8]     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqk r9 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r11 = r9.n     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r11 = r2.a(r11, r7, r8)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqk r7 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            int r7 = r7.g     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r7 == r10) goto L_0x0162
            aqk r7 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r13 = r7.n     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0162
            aqk r13 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqk r7 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            axp$a r14 = r7.d     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqk r7 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r6 = r7.f     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r15 = r11
            r17 = r6
            aqk r6 = r13.a(r14, r15, r17)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r1.u = r6     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqc$c r6 = r1.p     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r6.b(r10)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r1.a(r11)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
        L_0x0162:
            aqo[] r6 = r1.c     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            int r6 = r6.length     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            boolean[] r6 = new boolean[r6]     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r7 = 0
            r9 = 0
        L_0x0169:
            aqo[] r11 = r1.c     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            int r11 = r11.length     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r7 >= r11) goto L_0x019f
            aqo[] r11 = r1.c     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r11 = r11[r7]     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            int r12 = r11.j_()     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r12 == 0) goto L_0x017a
            r12 = 1
            goto L_0x017b
        L_0x017a:
            r12 = 0
        L_0x017b:
            r6[r7] = r12     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            axt[] r12 = r2.c     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r12 = r12[r7]     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r12 == 0) goto L_0x0185
            int r9 = r9 + 1
        L_0x0185:
            boolean r13 = r6[r7]     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r13 == 0) goto L_0x019c
            axt r13 = r11.f()     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r12 == r13) goto L_0x0193
            r1.b(r11)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            goto L_0x019c
        L_0x0193:
            boolean r12 = r8[r7]     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r12 == 0) goto L_0x019c
            long r12 = r1.E     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r11.a(r12)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
        L_0x019c:
            int r7 = r7 + 1
            goto L_0x0169
        L_0x019f:
            aqk r7 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            axx r8 = r2.h     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            bbg r2 = r2.i     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqk r2 = r7.a(r8, r2)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r1.u = r2     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r1.a(r6, r9)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            goto L_0x01c8
        L_0x01af:
            aqj r2 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r2.a(r7)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            boolean r2 = r7.d     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r2 == 0) goto L_0x01c8
            aqi r2 = r7.f     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r8 = r2.b     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r11 = r1.E     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r13 = r7.j     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r11 = r11 - r13
            long r8 = java.lang.Math.max(r8, r11)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r7.a(r8, r5)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
        L_0x01c8:
            r2 = 1
            r1.e(r2)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqk r2 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            int r2 = r2.g     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r2 == r10) goto L_0x01dd
            r40.l()     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r40.f()     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            bdc r2 = r1.a     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r2.a(r4)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
        L_0x01dd:
            r38 = r3
            goto L_0x0a97
        L_0x01e1:
            java.lang.Object r2 = r2.obj     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            axo r2 = (defpackage.axo) r2     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqj r6 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            boolean r2 = r6.a(r2)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r2 == 0) goto L_0x01dd
            aqj r2 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r6 = r1.E     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r2.a(r6)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r40.l()     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            goto L_0x01dd
        L_0x01f8:
            java.lang.Object r2 = r2.obj     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            axo r2 = (defpackage.axo) r2     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqj r6 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            boolean r2 = r6.a(r2)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            if (r2 == 0) goto L_0x01dd
            aqj r2 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqh r2 = r2.h     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            apx r6 = r1.o     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aql r6 = r6.e()     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            float r6 = r6.b     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r7 = 1
            r2.d = r7     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            axo r7 = r2.a     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            axx r7 = r7.b()     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r2.h = r7     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            r2.a(r6)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqi r6 = r2.f     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r6 = r6.b     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r11 = r2.a(r6, r5)     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r6 = r2.j     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqi r9 = r2.f     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r9 = r9.b     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r9 = r9 - r11
            long r6 = r6 + r9
            r2.j = r6     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqi r6 = r2.f     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            aqi r7 = new aqi     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            axp$a r10 = r6.a     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r13 = r6.c     // Catch:{ ExoPlaybackException -> 0x0aec, IOException -> 0x0acf, RuntimeException -> 0x0aae }
            long r4 = r6.d     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
            boolean r15 = r6.e     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
            boolean r6 = r6.f     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
            r9 = r7
            r17 = r15
            r15 = r4
            r18 = r6
            r9.<init>(r10, r11, r13, r15, r17, r18)     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
            r2.f = r7     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
            axx r4 = r2.h     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
            bbg r2 = r2.i     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
            r1.a(r4, r2)     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
            aqj r2 = r1.s     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
            boolean r2 = r2.b()     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
            if (r2 != 0) goto L_0x0268
            aqj r2 = r1.s     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
            aqh r2 = r2.c()     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
            aqi r2 = r2.f     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
            long r4 = r2.b     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
            r1.a(r4)     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
            r1.a(r8)     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
        L_0x0268:
            r40.l()     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0aae }
            goto L_0x01dd
        L_0x026d:
            java.lang.Object r2 = r2.obj     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            aqc$a r2 = (defpackage.aqc.a) r2     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            axp r4 = r2.a     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            axp r5 = r1.v     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            if (r4 != r5) goto L_0x01dd
            aqk r4 = r1.u     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            aqu r4 = r4.b     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            aqu r5 = r2.b     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            java.lang.Object r2 = r2.c     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            aqj r6 = r1.s     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            r6.c = r5     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            aqk r6 = r1.u     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            aqk r7 = new aqk     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            axp$a r9 = r6.d     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            long r11 = r6.e     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            long r13 = r6.f     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            int r10 = r6.g     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            boolean r15 = r6.h     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            axx r8 = r6.i     // Catch:{ ExoPlaybackException -> 0x053c, IOException -> 0x0536, RuntimeException -> 0x0531 }
            r38 = r3
            bbg r3 = r6.j     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r41 = r4
            axp$a r4 = r6.k     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r30 = r3
            r31 = r4
            long r3 = r6.l     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r32 = r3
            long r3 = r6.m     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r34 = r3
            long r3 = r6.n     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r19 = r7
            r20 = r5
            r21 = r2
            r22 = r9
            r23 = r11
            r25 = r13
            r27 = r10
            r28 = r15
            r29 = r8
            r36 = r3
            r19.<init>(r20, r21, r22, r23, r25, r27, r28, r29, r30, r31, r32, r34, r36)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.u = r7     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.util.ArrayList<aqc$b> r2 = r1.q     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r2 = r2.size()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r3 = 1
            int r2 = r2 - r3
        L_0x02ca:
            if (r2 < 0) goto L_0x02f0
            java.util.ArrayList<aqc$b> r3 = r1.q     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqc$b r3 = (defpackage.aqc.b) r3     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r3 = r1.a(r3)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r3 != 0) goto L_0x02ed
            java.util.ArrayList<aqc$b> r3 = r1.q     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqc$b r3 = (defpackage.aqc.b) r3     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqn r3 = r3.a     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r4 = 0
            r3.b(r4)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.util.ArrayList<aqc$b> r3 = r1.q     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r3.remove(r2)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x02ed:
            int r2 = r2 + -1
            goto L_0x02ca
        L_0x02f0:
            java.util.ArrayList<aqc$b> r2 = r1.q     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.util.Collections.sort(r2)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r2 = r1.C     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 <= 0) goto L_0x03ad
            aqc$c r2 = r1.p     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r3 = r1.C     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r2.a(r3)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r2 = 0
            r1.C = r2     // Catch:{ ExoPlaybackException -> 0x03a7, IOException -> 0x03a1, RuntimeException -> 0x039e }
            aqc$d r2 = r1.D     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 == 0) goto L_0x0355
            aqc$d r2 = r1.D     // Catch:{ IllegalSeekPositionException -> 0x033c }
            r3 = 1
            android.util.Pair r2 = r1.a(r2, r3)     // Catch:{ IllegalSeekPositionException -> 0x033c }
            r3 = 0
            r1.D = r3     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 != 0) goto L_0x0318
            r40.k()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x0318:
            java.lang.Object r3 = r2.first     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Object r2 = r2.second     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r8 = r2.longValue()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqj r2 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axp$a r5 = r2.a(r3, r8)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqk r4 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r2 = r5.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 == 0) goto L_0x0333
            r6 = 0
            goto L_0x0334
        L_0x0333:
            r6 = r8
        L_0x0334:
            aqk r2 = r4.a(r5, r6, r8)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.u = r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x033c:
            r0 = move-exception
            r2 = r0
            aqk r3 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axp$a r4 = r40.h()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            aqk r3 = r3.a(r4, r5, r7)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.u = r3     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            throw r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x0355:
            aqk r2 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r2 = r2.e     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0a97
            boolean r2 = r5.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 == 0) goto L_0x036d
            r40.k()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x036d:
            int r2 = r5.c()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            android.util.Pair r2 = r1.a(r5, r2, r3)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Object r3 = r2.first     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Object r2 = r2.second     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r8 = r2.longValue()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqj r2 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axp$a r5 = r2.a(r3, r8)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqk r4 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r2 = r5.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 == 0) goto L_0x0395
            r6 = 0
            goto L_0x0396
        L_0x0395:
            r6 = r8
        L_0x0396:
            aqk r2 = r4.a(r5, r6, r8)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.u = r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x039e:
            r0 = move-exception
            goto L_0x0ab2
        L_0x03a1:
            r0 = move-exception
            r3 = r0
            r5 = r38
            goto L_0x0aa5
        L_0x03a7:
            r0 = move-exception
            r3 = r0
            r5 = r38
            goto L_0x0aac
        L_0x03ad:
            boolean r2 = r41.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 == 0) goto L_0x03ea
            boolean r2 = r5.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 != 0) goto L_0x0a97
            int r2 = r5.c()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            android.util.Pair r2 = r1.a(r5, r2, r3)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Object r3 = r2.first     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Object r2 = r2.second     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r8 = r2.longValue()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqj r2 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axp$a r5 = r2.a(r3, r8)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqk r4 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r2 = r5.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 == 0) goto L_0x03e1
            r6 = 0
            goto L_0x03e2
        L_0x03e1:
            r6 = r8
        L_0x03e2:
            aqk r2 = r4.a(r5, r6, r8)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.u = r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x03ea:
            aqj r2 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r2 = r2.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqk r3 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r10 = r3.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 != 0) goto L_0x03fd
            aqk r3 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axp$a r3 = r3.d     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Object r3 = r3.a     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x03ff
        L_0x03fd:
            java.lang.Object r3 = r2.b     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x03ff:
            int r4 = r5.a(r3)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r6 = -1
            if (r4 != r6) goto L_0x0469
            r4 = r41
            java.lang.Object r3 = r1.a(r3, r4, r5)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r3 != 0) goto L_0x0413
            r40.k()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x0413:
            aqu$a r4 = r1.l     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqu$a r3 = r5.a(r3, r4)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r3 = r3.c     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            android.util.Pair r3 = r1.a(r5, r3, r6)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Object r4 = r3.first     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Object r3 = r3.second     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r9 = r3.longValue()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqj r3 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axp$a r6 = r3.a(r4, r9)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 == 0) goto L_0x0451
        L_0x0436:
            aqh r3 = r2.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r3 == 0) goto L_0x0451
            aqh r2 = r2.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqi r3 = r2.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axp$a r3 = r3.a     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r3 = r3.equals(r6)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r3 == 0) goto L_0x0436
            aqj r3 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqi r4 = r2.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqi r3 = r3.a(r4)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r2.f = r3     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0436
        L_0x0451:
            boolean r2 = r6.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 == 0) goto L_0x045a
            r2 = 0
            goto L_0x045b
        L_0x045a:
            r2 = r9
        L_0x045b:
            long r7 = r1.a(r6, r2)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqk r5 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqk r2 = r5.a(r6, r7, r9)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.u = r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x0469:
            aqk r2 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axp$a r2 = r2.d     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r4 = r2.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 == 0) goto L_0x0497
            aqj r4 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axp$a r7 = r4.a(r3, r10)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r3 = r7.equals(r2)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r3 != 0) goto L_0x0497
            boolean r2 = r7.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 == 0) goto L_0x0488
            r2 = 0
            goto L_0x0489
        L_0x0488:
            r2 = r10
        L_0x0489:
            long r8 = r1.a(r7, r2)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqk r6 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqk r2 = r6.a(r7, r8, r10)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.u = r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x0497:
            aqj r3 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r4 = r1.E     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqu r7 = r3.c     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Object r2 = r2.a     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r2 = r7.a(r2)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r7 = r3.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r10 = r2
            r8 = r7
            r2 = 0
        L_0x04aa:
            if (r8 == 0) goto L_0x0523
            if (r2 != 0) goto L_0x04b7
            aqi r2 = r8.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqi r2 = r3.a(r2)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r8.f = r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x04fd
        L_0x04b7:
            if (r10 == r6) goto L_0x051a
            java.lang.Object r7 = r8.b     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqu r9 = r3.c     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Object r9 = r9.a(r10)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r7 = r7.equals(r9)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r7 != 0) goto L_0x04c8
            goto L_0x051a
        L_0x04c8:
            aqi r7 = r3.a(r2, r4)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r7 != 0) goto L_0x04d5
            boolean r2 = r3.a(r2)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 != 0) goto L_0x0521
            goto L_0x0523
        L_0x04d5:
            aqi r9 = r8.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqi r9 = r3.a(r9)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r8.f = r9     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqi r9 = r8.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r11 = r9.b     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r13 = r7.b     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x04f3
            axp$a r9 = r9.a     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axp$a r7 = r7.a     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r7 = r9.equals(r7)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r7 == 0) goto L_0x04f3
            r7 = 1
            goto L_0x04f4
        L_0x04f3:
            r7 = 0
        L_0x04f4:
            if (r7 != 0) goto L_0x04fd
            boolean r2 = r3.a(r2)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 != 0) goto L_0x0521
            goto L_0x0523
        L_0x04fd:
            aqi r2 = r8.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r2 = r2.e     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 == 0) goto L_0x0512
            aqu r9 = r3.c     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqu$a r11 = r3.a     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqu$b r12 = r3.b     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r13 = r3.d     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r14 = r3.e     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r2 = r9.a(r10, r11, r12, r13, r14)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r10 = r2
        L_0x0512:
            aqh r2 = r8.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r39 = r8
            r8 = r2
            r2 = r39
            goto L_0x04aa
        L_0x051a:
            boolean r2 = r3.a(r2)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 != 0) goto L_0x0521
            goto L_0x0523
        L_0x0521:
            r2 = 0
            goto L_0x0524
        L_0x0523:
            r2 = 1
        L_0x0524:
            if (r2 != 0) goto L_0x052b
            r2 = 0
            r1.d(r2)     // Catch:{ ExoPlaybackException -> 0x03a7, IOException -> 0x03a1, RuntimeException -> 0x039e }
            goto L_0x052c
        L_0x052b:
            r2 = 0
        L_0x052c:
            r1.e(r2)     // Catch:{ ExoPlaybackException -> 0x03a7, IOException -> 0x03a1, RuntimeException -> 0x039e }
            goto L_0x0a97
        L_0x0531:
            r0 = move-exception
            r38 = r3
            goto L_0x0a9d
        L_0x0536:
            r0 = move-exception
            r5 = r3
            r2 = 0
            r4 = 2
            goto L_0x0ad2
        L_0x053c:
            r0 = move-exception
            r5 = r3
            r2 = 0
            r4 = 2
            goto L_0x0aef
        L_0x0542:
            r38 = r3
            r40.g()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r2 = 1
            return r2
        L_0x0549:
            r38 = r3
            int r2 = r2.arg1     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 == 0) goto L_0x0551
            r2 = 1
            goto L_0x0552
        L_0x0551:
            r2 = 0
        L_0x0552:
            r3 = 1
            r1.a(r2, r3)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x0558:
            r38 = r3
            java.lang.Object r2 = r2.obj     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqs r2 = (defpackage.aqs) r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.t = r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x0562:
            r38 = r3
            java.lang.Object r2 = r2.obj     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aql r2 = (defpackage.aql) r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            apx r3 = r1.o     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r3.a(r2)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x056f:
            r38 = r3
            java.lang.Object r2 = r2.obj     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqc$d r2 = (defpackage.aqc.d) r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqc$c r3 = r1.p     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r4 = 1
            r3.a(r4)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            android.util.Pair r3 = r1.a(r2, r4)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r3 != 0) goto L_0x0592
            axp$a r3 = r40.h()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r4 = r3
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 1
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x05c5
        L_0x0592:
            java.lang.Object r4 = r3.first     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Object r5 = r3.second     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r13 = r5.longValue()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqj r5 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axp$a r4 = r5.a(r4, r13)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r5 = r4.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r5 == 0) goto L_0x05ad
            r7 = r13
            r9 = 1
            r11 = 0
            goto L_0x05c5
        L_0x05ad:
            java.lang.Object r3 = r3.second     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r11 = r3.longValue()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r5 = r2.c     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x05c2
            r6 = 1
            goto L_0x05c3
        L_0x05c2:
            r6 = 0
        L_0x05c3:
            r9 = r6
            r7 = r13
        L_0x05c5:
            axp r3 = r1.v     // Catch:{ all -> 0x0647 }
            if (r3 == 0) goto L_0x0636
            int r3 = r1.C     // Catch:{ all -> 0x0647 }
            if (r3 <= 0) goto L_0x05cf
            goto L_0x0636
        L_0x05cf:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x05e1
            r1.a(r10)     // Catch:{ all -> 0x0647 }
            r2 = 0
            r3 = 1
            r1.a(r2, r3, r2)     // Catch:{ all -> 0x0647 }
            goto L_0x0638
        L_0x05e1:
            aqk r2 = r1.u     // Catch:{ all -> 0x0647 }
            axp$a r2 = r2.d     // Catch:{ all -> 0x0647 }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0647 }
            if (r2 == 0) goto L_0x0627
            aqj r2 = r1.s     // Catch:{ all -> 0x0647 }
            aqh r2 = r2.f     // Catch:{ all -> 0x0647 }
            if (r2 == 0) goto L_0x0600
            r5 = 0
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0600
            axo r2 = r2.a     // Catch:{ all -> 0x0647 }
            aqs r3 = r1.t     // Catch:{ all -> 0x0647 }
            long r2 = r2.a(r11, r3)     // Catch:{ all -> 0x0647 }
            goto L_0x0601
        L_0x0600:
            r2 = r11
        L_0x0601:
            long r5 = defpackage.apv.a(r2)     // Catch:{ all -> 0x0647 }
            aqk r10 = r1.u     // Catch:{ all -> 0x0647 }
            long r13 = r10.n     // Catch:{ all -> 0x0647 }
            long r13 = defpackage.apv.a(r13)     // Catch:{ all -> 0x0647 }
            int r10 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x0628
            aqk r2 = r1.u     // Catch:{ all -> 0x0647 }
            long r5 = r2.n     // Catch:{ all -> 0x0647 }
            aqk r3 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqk r2 = r3.a(r4, r5, r7)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.u = r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r9 == 0) goto L_0x0a97
            aqc$c r2 = r1.p     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r3 = 2
        L_0x0622:
            r2.b(r3)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x0627:
            r2 = r11
        L_0x0628:
            long r2 = r1.a(r4, r2)     // Catch:{ all -> 0x0647 }
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0632
            r5 = 1
            goto L_0x0633
        L_0x0632:
            r5 = 0
        L_0x0633:
            r9 = r9 | r5
            r5 = r2
            goto L_0x0639
        L_0x0636:
            r1.D = r2     // Catch:{ all -> 0x0647 }
        L_0x0638:
            r5 = r11
        L_0x0639:
            aqk r3 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqk r2 = r3.a(r4, r5, r7)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.u = r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r9 == 0) goto L_0x0a97
            aqc$c r2 = r1.p     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r3 = 2
            goto L_0x0622
        L_0x0647:
            r0 = move-exception
            r2 = r0
            aqk r3 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r19 = r3
            r20 = r4
            r21 = r11
            r23 = r7
            aqk r3 = r19.a(r20, r21, r23)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.u = r3     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r9 == 0) goto L_0x066e
            aqc$c r3 = r1.p     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r4 = 2
            r3.b(r4)     // Catch:{ ExoPlaybackException -> 0x0668, IOException -> 0x0662, RuntimeException -> 0x0a9c }
            goto L_0x066e
        L_0x0662:
            r0 = move-exception
            r3 = r0
            r5 = r38
            goto L_0x0078
        L_0x0668:
            r0 = move-exception
            r3 = r0
            r5 = r38
            goto L_0x007f
        L_0x066e:
            throw r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x066f:
            r38 = r3
            bcw r2 = r1.r     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r2 = r2.b()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axp r4 = r1.v     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 == 0) goto L_0x08b1
            int r4 = r1.C     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 <= 0) goto L_0x0686
            axp r4 = r1.v     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r4.b()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x08b1
        L_0x0686:
            aqj r4 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r5 = r1.E     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r4.a(r5)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqj r4 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r5 = r4.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r5 == 0) goto L_0x06bb
            aqh r5 = r4.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqi r5 = r5.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r5 = r5.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r5 != 0) goto L_0x06b9
            aqh r5 = r4.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r5 = r5.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r5 == 0) goto L_0x06b9
            aqh r5 = r4.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqi r5 = r5.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r5 = r5.d     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x06b9
            int r4 = r4.i     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r5 = 100
            if (r4 >= r5) goto L_0x06b9
            goto L_0x06bb
        L_0x06b9:
            r4 = 0
            goto L_0x06bc
        L_0x06bb:
            r4 = 1
        L_0x06bc:
            if (r4 == 0) goto L_0x075a
            aqj r4 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r5 = r1.E     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqk r7 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r8 = r4.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r8 != 0) goto L_0x06db
            axp$a r5 = r7.d     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r11 = r7.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r6 = r7.e     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r19 = r4
            r20 = r5
            r21 = r11
            r23 = r6
            aqi r4 = r19.a(r20, r21, r23)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x06e1
        L_0x06db:
            aqh r7 = r4.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqi r4 = r4.a(r7, r5)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x06e1:
            if (r4 != 0) goto L_0x0700
            aqj r4 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r4 = r4.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 == 0) goto L_0x06fa
            aqo[] r4 = r1.w     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r5 = r4.length     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r6 = 0
        L_0x06ed:
            if (r6 >= r5) goto L_0x06fa
            r7 = r4[r6]     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r7 = r7.g()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r7 == 0) goto L_0x075a
            int r6 = r6 + 1
            goto L_0x06ed
        L_0x06fa:
            axp r4 = r1.v     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r4.b()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x075a
        L_0x0700:
            aqj r5 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqp[] r6 = r1.d     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            bbf r7 = r1.e     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqg r8 = r1.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            bbi r24 = r8.d()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axp r8 = r1.v     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r11 = r5.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r11 != 0) goto L_0x0717
            long r11 = r4.b     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x0714:
            r21 = r11
            goto L_0x0723
        L_0x0717:
            aqh r11 = r5.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r11 = r11.j     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r13 = r5.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqi r13 = r13.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r13 = r13.d     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r11 = r11 + r13
            goto L_0x0714
        L_0x0723:
            aqh r11 = new aqh     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r19 = r11
            r20 = r6
            r23 = r7
            r25 = r8
            r26 = r4
            r19.<init>(r20, r21, r23, r24, r25, r26)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r6 = r5.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r6 == 0) goto L_0x0741
            boolean r6 = r5.b()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            defpackage.bcu.b(r6)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r6 = r5.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r6.g = r11     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x0741:
            r6 = 0
            r5.j = r6     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r5.h = r11     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r6 = r5.i     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r7 = 1
            int r6 = r6 + r7
            r5.i = r6     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axo r5 = r11.a     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r11 = r4.b     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r5.a(r1, r11)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.c(r7)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r4 = 0
            r1.e(r4)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x075a:
            aqj r4 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r4 = r4.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 == 0) goto L_0x0771
            boolean r4 = r4.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 == 0) goto L_0x0767
            goto L_0x0771
        L_0x0767:
            aqk r4 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r4 = r4.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 != 0) goto L_0x0775
            r40.l()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0775
        L_0x0771:
            r4 = 0
            r1.c(r4)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x0775:
            aqj r4 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r4 = r4.b()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 == 0) goto L_0x08b1
            aqj r4 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r4 = r4.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqj r5 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r5 = r5.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r6 = 0
        L_0x0786:
            boolean r7 = r1.y     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r7 == 0) goto L_0x07d3
            if (r4 == r5) goto L_0x07d3
            long r7 = r1.E     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r11 = r4.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqi r12 = r11.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r12 = r12.b     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r14 = r11.j     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r12 = r12 + r14
            int r11 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r11 < 0) goto L_0x07d3
            if (r6 == 0) goto L_0x07a0
            r40.c()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x07a0:
            aqi r6 = r4.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r6 = r6.e     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r6 == 0) goto L_0x07a8
            r6 = 0
            goto L_0x07a9
        L_0x07a8:
            r6 = 3
        L_0x07a9:
            aqj r7 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r7 = r7.c()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.a(r4)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqk r11 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqi r4 = r7.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axp$a r12 = r4.a     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqi r4 = r7.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r13 = r4.b     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqi r4 = r7.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r9 = r4.c     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r15 = r9
            aqk r4 = r11.a(r12, r13, r15)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.u = r4     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqc$c r4 = r1.p     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r4.b(r6)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r40.f()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r4 = r7
            r6 = 1
            r10 = 4
            goto L_0x0786
        L_0x07d3:
            aqi r4 = r5.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r4 = r4.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 == 0) goto L_0x07fb
            r4 = 0
        L_0x07da:
            aqo[] r6 = r1.c     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r6 = r6.length     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 >= r6) goto L_0x08b1
            aqo[] r6 = r1.c     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r6 = r6[r4]     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axt[] r7 = r5.c     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r7 = r7[r4]     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r7 == 0) goto L_0x07f8
            axt r9 = r6.f()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r9 != r7) goto L_0x07f8
            boolean r7 = r6.g()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r7 == 0) goto L_0x07f8
            r6.h()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x07f8:
            int r4 = r4 + 1
            goto L_0x07da
        L_0x07fb:
            aqh r4 = r5.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 == 0) goto L_0x08b1
            r4 = 0
        L_0x0800:
            aqo[] r6 = r1.c     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r6 = r6.length     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 >= r6) goto L_0x0820
            aqo[] r6 = r1.c     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r6 = r6[r4]     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axt[] r7 = r5.c     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r7 = r7[r4]     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axt r9 = r6.f()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r9 != r7) goto L_0x08b1
            if (r7 == 0) goto L_0x081d
            boolean r6 = r6.g()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r6 != 0) goto L_0x081d
            goto L_0x08b1
        L_0x081d:
            int r4 = r4 + 1
            goto L_0x0800
        L_0x0820:
            aqh r4 = r5.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r4 = r4.d     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 != 0) goto L_0x082b
            r40.j()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x08b1
        L_0x082b:
            bbg r4 = r5.i     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqj r5 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r6 = r5.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r6 == 0) goto L_0x083b
            aqh r6 = r5.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r6 = r6.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r6 == 0) goto L_0x083b
            r6 = 1
            goto L_0x083c
        L_0x083b:
            r6 = 0
        L_0x083c:
            defpackage.bcu.b(r6)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r6 = r5.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r6 = r6.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r5.g = r6     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r5 = r5.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            bbg r6 = r5.i     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axo r7 = r5.a     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r9 = r7.c()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x085a
            r7 = 1
            goto L_0x085b
        L_0x085a:
            r7 = 0
        L_0x085b:
            r9 = 0
        L_0x085c:
            aqo[] r10 = r1.c     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r10 = r10.length     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r9 >= r10) goto L_0x08b1
            aqo[] r10 = r1.c     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r10 = r10[r9]     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r11 = r4.a(r9)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r11 == 0) goto L_0x08ae
            if (r7 != 0) goto L_0x08ab
            boolean r11 = r10.i()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r11 != 0) goto L_0x08ae
            bbe r11 = r6.c     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            bbd[] r11 = r11.b     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r11 = r11[r9]     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r12 = r6.a(r9)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqp[] r13 = r1.d     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r13 = r13[r9]     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r13 = r13.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r14 = 6
            if (r13 != r14) goto L_0x088a
            r13 = 1
            goto L_0x088b
        L_0x088a:
            r13 = 0
        L_0x088b:
            aqq[] r14 = r4.b     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r14 = r14[r9]     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqq[] r15 = r6.b     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r15 = r15[r9]     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r12 == 0) goto L_0x08ab
            boolean r12 = r15.equals(r14)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r12 == 0) goto L_0x08ab
            if (r13 != 0) goto L_0x08ab
            aqe[] r11 = a(r11)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axt[] r12 = r5.c     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r12 = r12[r9]     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r13 = r5.j     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r10.a(r11, r12, r13)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x08ae
        L_0x08ab:
            r10.h()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x08ae:
            int r9 = r9 + 1
            goto L_0x085c
        L_0x08b1:
            aqj r4 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r4 = r4.b()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r5 = 10
            if (r4 != 0) goto L_0x08c3
            r40.j()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.a(r2, r5)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x08c3:
            aqj r4 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r4 = r4.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            java.lang.String r7 = "doSomeWork"
            defpackage.bdu.a(r7)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r40.f()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r11
            axo r7 = r4.a     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqk r13 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r13 = r13.n     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r11 = r1.m     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r13 = r13 - r11
            boolean r11 = r1.n     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r7.a(r13, r11)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqo[] r7 = r1.w     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r11 = r7.length     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r12 = 0
            r13 = 1
            r14 = 1
        L_0x08eb:
            if (r12 >= r11) goto L_0x0939
            r8 = r7[r12]     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r5 = r1.E     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r8.a(r5, r9)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r14 == 0) goto L_0x08fe
            boolean r5 = r8.r()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r5 == 0) goto L_0x08fe
            r14 = 1
            goto L_0x08ff
        L_0x08fe:
            r14 = 0
        L_0x08ff:
            boolean r5 = r8.q()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r5 != 0) goto L_0x0927
            boolean r5 = r8.r()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r5 != 0) goto L_0x0927
            aqj r5 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r5 = r5.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r6 = r5.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r6 == 0) goto L_0x0921
            aqh r5 = r5.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r5 = r5.d     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r5 == 0) goto L_0x0921
            boolean r5 = r8.g()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r5 == 0) goto L_0x0921
            r5 = 1
            goto L_0x0922
        L_0x0921:
            r5 = 0
        L_0x0922:
            if (r5 == 0) goto L_0x0925
            goto L_0x0927
        L_0x0925:
            r5 = 0
            goto L_0x0928
        L_0x0927:
            r5 = 1
        L_0x0928:
            if (r5 != 0) goto L_0x092d
            r8.j()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x092d:
            if (r13 == 0) goto L_0x0933
            if (r5 == 0) goto L_0x0933
            r13 = 1
            goto L_0x0934
        L_0x0933:
            r13 = 0
        L_0x0934:
            int r12 = r12 + 1
            r5 = 10
            goto L_0x08eb
        L_0x0939:
            if (r13 != 0) goto L_0x093e
            r40.j()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x093e:
            aqi r5 = r4.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r5 = r5.d     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r14 == 0) goto L_0x0964
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0955
            aqk r7 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r7 = r7.n     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0964
        L_0x0955:
            aqi r4 = r4.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r4 = r4.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 == 0) goto L_0x0964
            r4 = 4
            r1.a(r4)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r40.e()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x09de
        L_0x0964:
            aqk r4 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r4 = r4.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r5 = 2
            if (r4 != r5) goto L_0x09be
            aqo[] r4 = r1.w     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r4 = r4.length     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 != 0) goto L_0x0975
            boolean r5 = r40.i()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x09b0
        L_0x0975:
            if (r13 == 0) goto L_0x09af
            aqk r4 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r4 = r4.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 != 0) goto L_0x097f
        L_0x097d:
            r5 = 1
            goto L_0x09b0
        L_0x097f:
            aqj r4 = r1.s     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqh r4 = r4.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqi r5 = r4.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r5 = r5.f     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r5 != 0) goto L_0x098b
            r5 = 1
            goto L_0x098c
        L_0x098b:
            r5 = 0
        L_0x098c:
            long r5 = r4.a(r5)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r7 = -9223372036854775808
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x097d
            aqg r7 = r1.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r8 = r1.E     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r10 = r4.j     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            long r8 = r8 - r10
            long r5 = r5 - r8
            apx r4 = r1.o     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aql r4 = r4.e()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            float r4 = r4.b     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r8 = r1.z     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r4 = r7.a(r5, r4, r8)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 == 0) goto L_0x09af
            goto L_0x097d
        L_0x09af:
            r5 = 0
        L_0x09b0:
            if (r5 == 0) goto L_0x09be
            r4 = 3
            r1.a(r4)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            boolean r4 = r1.y     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 == 0) goto L_0x09de
            r40.d()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x09de
        L_0x09be:
            aqk r4 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r4 = r4.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r5 = 3
            if (r4 != r5) goto L_0x09de
            aqo[] r4 = r1.w     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r4 = r4.length     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 != 0) goto L_0x09d1
            boolean r4 = r40.i()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 == 0) goto L_0x09d3
            goto L_0x09de
        L_0x09d1:
            if (r13 != 0) goto L_0x09de
        L_0x09d3:
            boolean r4 = r1.y     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.z = r4     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r4 = 2
            r1.a(r4)     // Catch:{ ExoPlaybackException -> 0x0668, IOException -> 0x0662, RuntimeException -> 0x0a9c }
            r40.e()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x09de:
            aqk r4 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r4 = r4.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r5 = 2
            if (r4 != r5) goto L_0x09f3
            aqo[] r4 = r1.w     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r5 = r4.length     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r6 = 0
        L_0x09e9:
            if (r6 >= r5) goto L_0x09f3
            r7 = r4[r6]     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r7.j()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r6 = r6 + 1
            goto L_0x09e9
        L_0x09f3:
            boolean r4 = r1.y     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 == 0) goto L_0x09fe
            aqk r4 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r4 = r4.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r5 = 3
            if (r4 == r5) goto L_0x0a05
        L_0x09fe:
            aqk r4 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r4 = r4.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r5 = 2
            if (r4 != r5) goto L_0x0a0b
        L_0x0a05:
            r4 = 10
            r1.a(r2, r4)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a23
        L_0x0a0b:
            aqo[] r4 = r1.w     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r4 = r4.length     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 == 0) goto L_0x0a1d
            aqk r4 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r4 = r4.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r5 = 4
            if (r4 == r5) goto L_0x0a1d
            r4 = 1000(0x3e8, double:4.94E-321)
            r1.a(r2, r4)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a23
        L_0x0a1d:
            bdc r2 = r1.a     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r3 = 2
            r2.b(r3)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x0a23:
            defpackage.bdu.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x0a28:
            r38 = r3
            int r2 = r2.arg1     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 == 0) goto L_0x0a30
            r2 = 1
            goto L_0x0a31
        L_0x0a30:
            r2 = 0
        L_0x0a31:
            r3 = 0
            r1.z = r3     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.y = r2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 != 0) goto L_0x0a3f
            r40.e()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r40.f()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x0a3f:
            aqk r2 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r2 = r2.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r3 = 3
            if (r2 != r3) goto L_0x0a50
            r40.d()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            bdc r2 = r1.a     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r3 = 2
            r2.a(r3)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x0a50:
            aqk r2 = r1.u     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r2 = r2.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r3 = 2
            if (r2 != r3) goto L_0x0a97
            bdc r2 = r1.a     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r2.a(r3)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0a97
        L_0x0a5d:
            r38 = r3
            java.lang.Object r3 = r2.obj     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            axp r3 = (defpackage.axp) r3     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            int r4 = r2.arg1     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r4 == 0) goto L_0x0a69
            r4 = 1
            goto L_0x0a6a
        L_0x0a69:
            r4 = 0
        L_0x0a6a:
            int r2 = r2.arg2     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            if (r2 == 0) goto L_0x0a70
            r2 = 1
            goto L_0x0a71
        L_0x0a70:
            r2 = 0
        L_0x0a71:
            int r5 = r1.C     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r6 = 1
            int r5 = r5 + r6
            r1.C = r5     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.a(r6, r4, r2)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            aqg r2 = r1.g     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r2.a()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r1.v = r3     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r2 = 2
            r1.a(r2)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            apz r2 = r1.j     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            bbj r4 = r1.h     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            bcd r4 = r4.b()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r5 = 1
            r3.a(r2, r5, r1, r4)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            bdc r2 = r1.a     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            r3 = 2
            r2.a(r3)     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
        L_0x0a97:
            r40.c()     // Catch:{ ExoPlaybackException -> 0x0aa7, IOException -> 0x0aa0, RuntimeException -> 0x0a9c }
            goto L_0x0b04
        L_0x0a9c:
            r0 = move-exception
        L_0x0a9d:
            r3 = r0
        L_0x0a9e:
            r2 = 0
            goto L_0x0ab3
        L_0x0aa0:
            r0 = move-exception
            r3 = r0
            r5 = r38
            r2 = 0
        L_0x0aa5:
            r4 = 2
            goto L_0x0ad3
        L_0x0aa7:
            r0 = move-exception
            r3 = r0
            r5 = r38
            r2 = 0
        L_0x0aac:
            r4 = 2
            goto L_0x0af0
        L_0x0aae:
            r0 = move-exception
            r38 = r3
            r2 = 0
        L_0x0ab2:
            r3 = r0
        L_0x0ab3:
            java.lang.String r4 = "Internal runtime error."
            r5 = r38
            defpackage.bdd.b(r5, r4, r3)
            r1.a(r2, r2)
            android.os.Handler r2 = r1.i
            com.google.android.exoplayer2.ExoPlaybackException r3 = com.google.android.exoplayer2.ExoPlaybackException.a(r3)
            r4 = 2
            android.os.Message r2 = r2.obtainMessage(r4, r3)
            r2.sendToTarget()
            r40.c()
            goto L_0x0b04
        L_0x0acf:
            r0 = move-exception
            r5 = r3
            r2 = 0
        L_0x0ad2:
            r3 = r0
        L_0x0ad3:
            java.lang.String r6 = "Source error."
            defpackage.bdd.b(r5, r6, r3)
            r1.a(r2, r2)
            android.os.Handler r2 = r1.i
            com.google.android.exoplayer2.ExoPlaybackException r3 = com.google.android.exoplayer2.ExoPlaybackException.a(r3)
            android.os.Message r2 = r2.obtainMessage(r4, r3)
            r2.sendToTarget()
            r40.c()
            goto L_0x0b04
        L_0x0aec:
            r0 = move-exception
            r5 = r3
            r2 = 0
        L_0x0aef:
            r3 = r0
        L_0x0af0:
            java.lang.String r6 = "Playback error."
            defpackage.bdd.b(r5, r6, r3)
            r1.a(r2, r2)
            android.os.Handler r2 = r1.i
            android.os.Message r2 = r2.obtainMessage(r4, r3)
            r2.sendToTarget()
            r40.c()
        L_0x0b04:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqc.handleMessage(android.os.Message):boolean");
    }

    private void a(int i2) {
        if (this.u.g != i2) {
            this.u = this.u.a(i2);
        }
    }

    private void c(boolean z2) {
        if (this.u.h != z2) {
            this.u = this.u.a(z2);
        }
    }

    private void c() {
        int i2;
        if (this.p.a(this.u)) {
            Handler handler = this.i;
            int i3 = this.p.a;
            if (this.p.b) {
                i2 = this.p.c;
            } else {
                i2 = -1;
            }
            handler.obtainMessage(0, i3, i2, this.u).sendToTarget();
            this.p.b(this.u);
        }
    }

    private void d(boolean z2) {
        defpackage.axp.a aVar = this.s.f.f.a;
        long a2 = a(aVar, this.u.n, true);
        if (a2 != this.u.n) {
            aqk aqk = this.u;
            this.u = aqk.a(aVar, a2, aqk.f);
            if (z2) {
                this.p.b(4);
            }
        }
    }

    private void d() {
        this.z = false;
        this.o.a();
        for (aqo k_ : this.w) {
            k_.k_();
        }
    }

    private void e() {
        this.o.b();
        for (aqo a2 : this.w) {
            a(a2);
        }
    }

    private void f() {
        if (this.s.b()) {
            aqh aqh = this.s.f;
            long c2 = aqh.a.c();
            if (c2 != -9223372036854775807L) {
                a(c2);
                if (c2 != this.u.n) {
                    aqk aqk = this.u;
                    this.u = aqk.a(aqk.d, c2, this.u.f);
                    this.p.b(4);
                }
            } else {
                this.E = this.o.c();
                long j2 = this.E - aqh.j;
                b(this.u.n, j2);
                this.u.n = j2;
            }
            aqh aqh2 = this.s.h;
            this.u.l = aqh2.a(true);
            aqk aqk2 = this.u;
            aqk2.m = aqk2.l - (this.E - aqh2.j);
        }
    }

    private void a(long j2, long j3) {
        this.a.b(2);
        this.a.a(2, j2 + j3);
    }

    private long a(defpackage.axp.a aVar, long j2) {
        return a(aVar, j2, this.s.f != this.s.g);
    }

    private long a(defpackage.axp.a aVar, long j2, boolean z2) {
        e();
        this.z = false;
        a(2);
        aqh aqh = this.s.f;
        aqh aqh2 = aqh;
        while (true) {
            if (aqh2 != null) {
                if (aVar.equals(aqh2.f.a) && aqh2.d) {
                    this.s.a(aqh2);
                    break;
                }
                aqh2 = this.s.c();
            } else {
                break;
            }
        }
        if (aqh != aqh2 || z2) {
            for (aqo b2 : this.w) {
                b(b2);
            }
            this.w = new aqo[0];
            aqh = null;
        }
        if (aqh2 != null) {
            a(aqh);
            if (aqh2.e) {
                long b3 = aqh2.a.b(j2);
                aqh2.a.a(b3 - this.m, this.n);
                j2 = b3;
            }
            a(j2);
            l();
        } else {
            this.s.a(true);
            this.u = this.u.a(axx.a, this.f);
            a(j2);
        }
        e(false);
        this.a.a(2);
        return j2;
    }

    private void a(long j2) {
        if (this.s.b()) {
            j2 += this.s.f.j;
        }
        this.E = j2;
        this.o.a(this.E);
        for (aqo a2 : this.w) {
            a2.a(this.E);
        }
    }

    private void a(boolean z2, boolean z3) {
        a(true, z2, z2);
        this.p.a(this.C + (z3 ? 1 : 0));
        this.C = 0;
        this.g.b();
        a(1);
    }

    private void g() {
        a(true, true, true);
        this.g.c();
        a(1);
        this.b.quit();
        synchronized (this) {
            this.x = true;
            notifyAll();
        }
    }

    private defpackage.axp.a h() {
        aqu aqu = this.u.b;
        if (aqu.a()) {
            return aqk.a;
        }
        return new defpackage.axp.a(aqu.a(aqu.a(aqu.c(), this.k, false).f));
    }

    private void a(boolean z2, boolean z3, boolean z4) {
        long j2;
        this.a.b(2);
        this.z = false;
        this.o.b();
        this.E = 0;
        for (aqo b2 : this.w) {
            try {
                b(b2);
            } catch (ExoPlaybackException | RuntimeException e2) {
                bdd.b("ExoPlayerImplInternal", "Stop failed.", e2);
            }
        }
        this.w = new aqo[0];
        this.s.a(!z3);
        c(false);
        if (z3) {
            this.D = null;
        }
        if (z4) {
            this.s.c = aqu.a;
            Iterator it = this.q.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a.b(false);
            }
            this.q.clear();
            this.F = 0;
        }
        defpackage.axp.a h2 = z3 ? h() : this.u.d;
        long j3 = -9223372036854775807L;
        if (z3) {
            j2 = -9223372036854775807L;
        } else {
            j2 = this.u.n;
        }
        if (!z3) {
            j3 = this.u.f;
        }
        aqk aqk = new aqk(z4 ? aqu.a : this.u.b, z4 ? null : this.u.c, h2, j2, j3, this.u.g, false, z4 ? axx.a : this.u.i, z4 ? this.f : this.u.j, h2, j2, 0, j2);
        this.u = aqk;
        if (z2) {
            axp axp = this.v;
            if (axp != null) {
                axp.a((defpackage.axp.b) this);
                this.v = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(aqn aqn) {
        try {
            c(aqn);
        } catch (ExoPlaybackException e2) {
            bdd.b("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    private static void c(aqn aqn) {
        if (!aqn.b()) {
            try {
                aqn.a.handleMessage(aqn.c, aqn.d);
            } finally {
                aqn.b(true);
            }
        }
    }

    private boolean a(b bVar) {
        if (bVar.d == null) {
            Pair a2 = a(new d(bVar.a.b, bVar.a.f, apv.b(bVar.a.g)), false);
            if (a2 == null) {
                return false;
            }
            bVar.a(this.u.b.a(a2.first), ((Long) a2.second).longValue(), a2.first);
        } else {
            int a3 = this.u.b.a(bVar.d);
            if (a3 == -1) {
                return false;
            }
            bVar.b = a3;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a8 A[ADDED_TO_REGION, EDGE_INSN: B:62:0x00a8->B:75:0x00a8 ?: BREAK  
    EDGE_INSN: B:62:0x00a8->B:75:0x00a8 ?: BREAK  
    EDGE_INSN: B:62:0x00a8->B:75:0x00a8 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(long r7, long r9) {
        /*
            r6 = this;
            java.util.ArrayList<aqc$b> r0 = r6.q
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00f7
            aqk r0 = r6.u
            axp$a r0 = r0.d
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0014
            goto L_0x00f7
        L_0x0014:
            aqk r0 = r6.u
            long r0 = r0.e
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x001f
            r0 = 1
            long r7 = r7 - r0
        L_0x001f:
            aqk r0 = r6.u
            aqu r0 = r0.b
            aqk r1 = r6.u
            axp$a r1 = r1.d
            java.lang.Object r1 = r1.a
            int r0 = r0.a(r1)
            int r1 = r6.F
            r2 = 0
            if (r1 <= 0) goto L_0x003d
            java.util.ArrayList<aqc$b> r3 = r6.q
            int r1 = r1 + -1
            java.lang.Object r1 = r3.get(r1)
            aqc$b r1 = (defpackage.aqc.b) r1
            goto L_0x003e
        L_0x003d:
            r1 = r2
        L_0x003e:
            if (r1 == 0) goto L_0x0063
            int r3 = r1.b
            if (r3 > r0) goto L_0x004e
            int r3 = r1.b
            if (r3 != r0) goto L_0x0063
            long r3 = r1.c
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0063
        L_0x004e:
            int r1 = r6.F
            int r1 = r1 + -1
            r6.F = r1
            int r1 = r6.F
            if (r1 <= 0) goto L_0x003d
            java.util.ArrayList<aqc$b> r3 = r6.q
            int r1 = r1 + -1
            java.lang.Object r1 = r3.get(r1)
            aqc$b r1 = (defpackage.aqc.b) r1
            goto L_0x003e
        L_0x0063:
            int r1 = r6.F
            java.util.ArrayList<aqc$b> r3 = r6.q
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0078
            java.util.ArrayList<aqc$b> r1 = r6.q
            int r3 = r6.F
            java.lang.Object r1 = r1.get(r3)
            aqc$b r1 = (defpackage.aqc.b) r1
            goto L_0x0079
        L_0x0078:
            r1 = r2
        L_0x0079:
            if (r1 == 0) goto L_0x00a8
            java.lang.Object r3 = r1.d
            if (r3 == 0) goto L_0x00a8
            int r3 = r1.b
            if (r3 < r0) goto L_0x008d
            int r3 = r1.b
            if (r3 != r0) goto L_0x00a8
            long r3 = r1.c
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x00a8
        L_0x008d:
            int r1 = r6.F
            int r1 = r1 + 1
            r6.F = r1
            int r1 = r6.F
            java.util.ArrayList<aqc$b> r3 = r6.q
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0078
            java.util.ArrayList<aqc$b> r1 = r6.q
            int r3 = r6.F
            java.lang.Object r1 = r1.get(r3)
            aqc$b r1 = (defpackage.aqc.b) r1
            goto L_0x0079
        L_0x00a8:
            if (r1 == 0) goto L_0x00f7
            java.lang.Object r3 = r1.d
            if (r3 == 0) goto L_0x00f7
            int r3 = r1.b
            if (r3 != r0) goto L_0x00f7
            long r3 = r1.c
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f7
            long r3 = r1.c
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x00f7
            aqn r3 = r1.a
            r6.b(r3)
            aqn r3 = r1.a
            boolean r3 = r3.h
            if (r3 != 0) goto L_0x00d9
            aqn r1 = r1.a
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x00d2
            goto L_0x00d9
        L_0x00d2:
            int r1 = r6.F
            int r1 = r1 + 1
            r6.F = r1
            goto L_0x00e0
        L_0x00d9:
            java.util.ArrayList<aqc$b> r1 = r6.q
            int r3 = r6.F
            r1.remove(r3)
        L_0x00e0:
            int r1 = r6.F
            java.util.ArrayList<aqc$b> r3 = r6.q
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00f5
            java.util.ArrayList<aqc$b> r1 = r6.q
            int r3 = r6.F
            java.lang.Object r1 = r1.get(r3)
            aqc$b r1 = (defpackage.aqc.b) r1
            goto L_0x00a8
        L_0x00f5:
            r1 = r2
            goto L_0x00a8
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqc.b(long, long):void");
    }

    private static void a(aqo aqo) {
        if (aqo.j_() == 2) {
            aqo.k();
        }
    }

    private void b(aqo aqo) {
        this.o.b(aqo);
        a(aqo);
        aqo.l();
    }

    private boolean i() {
        aqh aqh = this.s.f;
        long j2 = aqh.f.d;
        return j2 == -9223372036854775807L || this.u.n < j2 || (aqh.g != null && (aqh.g.d || aqh.g.f.a.a()));
    }

    private void j() {
        aqh aqh = this.s.h;
        aqh aqh2 = this.s.g;
        if (aqh != null && !aqh.d && (aqh2 == null || aqh2.g == aqh)) {
            aqo[] aqoArr = this.w;
            int length = aqoArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (aqoArr[i2].g()) {
                    i2++;
                } else {
                    return;
                }
            }
            aqh.a.m_();
        }
    }

    private void k() {
        a(4);
        a(false, true, false);
    }

    private Object a(Object obj, aqu aqu, aqu aqu2) {
        int a2 = aqu.a(obj);
        int d2 = aqu.d();
        int i2 = a2;
        int i3 = -1;
        for (int i4 = 0; i4 < d2 && i3 == -1; i4++) {
            i2 = aqu.a(i2, this.l, this.k, this.A, this.B);
            if (i2 == -1) {
                break;
            }
            i3 = aqu2.a(aqu.a(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return aqu2.a(i3);
    }

    private Pair<Object, Long> a(d dVar, boolean z2) {
        aqu aqu = this.u.b;
        aqu aqu2 = dVar.a;
        if (aqu.a()) {
            return null;
        }
        if (aqu2.a()) {
            aqu2 = aqu;
        }
        try {
            Pair<Object, Long> a2 = aqu2.a(this.k, this.l, dVar.b, dVar.c);
            if (aqu == aqu2) {
                return a2;
            }
            int a3 = aqu.a(a2.first);
            if (a3 != -1) {
                return a2;
            }
            if (!z2 || a(a2.first, aqu2, aqu) == null) {
                return null;
            }
            return a(aqu, aqu.a(a3, this.l, false).c, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalSeekPositionException(aqu, dVar.b, dVar.c);
        }
    }

    private Pair<Object, Long> a(aqu aqu, int i2, long j2) {
        return aqu.a(this.k, this.l, i2, -9223372036854775807L);
    }

    private void l() {
        aqh aqh = this.s.h;
        long b2 = aqh.b();
        if (b2 == Long.MIN_VALUE) {
            c(false);
            return;
        }
        boolean a2 = this.g.a(b2 - (this.E - aqh.j), this.o.e().b);
        c(a2);
        if (a2) {
            aqh.c(this.E);
        }
    }

    private void a(aqh aqh) {
        aqh aqh2 = this.s.f;
        if (aqh2 != null && aqh != aqh2) {
            boolean[] zArr = new boolean[this.c.length];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                aqo[] aqoArr = this.c;
                if (i2 < aqoArr.length) {
                    aqo aqo = aqoArr[i2];
                    zArr[i2] = aqo.j_() != 0;
                    if (aqh2.i.a(i2)) {
                        i3++;
                    }
                    if (zArr[i2] && (!aqh2.i.a(i2) || (aqo.i() && aqo.f() == aqh.c[i2]))) {
                        b(aqo);
                    }
                    i2++;
                } else {
                    this.u = this.u.a(aqh2.h, aqh2.i);
                    a(zArr, i3);
                    return;
                }
            }
        }
    }

    private void a(boolean[] zArr, int i2) {
        this.w = new aqo[i2];
        aqh aqh = this.s.f;
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4++) {
            if (aqh.i.a(i4)) {
                int i5 = i3 + 1;
                a(i4, zArr[i4], i3);
                i3 = i5;
            }
        }
    }

    private void a(int i2, boolean z2, int i3) {
        aqh aqh = this.s.f;
        aqo aqo = this.c[i2];
        this.w[i3] = aqo;
        if (aqo.j_() == 0) {
            aqq aqq = aqh.i.b[i2];
            aqe[] a2 = a(aqh.i.c.b[i2]);
            boolean z3 = this.y && this.u.g == 3;
            aqo.a(aqq, a2, aqh.c[i2], this.E, !z2 && z3, aqh.j);
            this.o.a(aqo);
            if (z3) {
                aqo.k_();
            }
        }
    }

    private void e(boolean z2) {
        aqh aqh = this.s.h;
        defpackage.axp.a aVar = aqh == null ? this.u.d : aqh.f.a;
        boolean z3 = !this.u.k.equals(aVar);
        if (z3) {
            this.u = this.u.a(aVar);
        }
        if ((z3 || z2) && aqh != null && aqh.d) {
            a(aqh.h, aqh.i);
        }
    }

    private void a(axx axx, bbg bbg) {
        this.g.a(this.c, bbg.c);
    }

    private static aqe[] a(bbd bbd) {
        int f2 = bbd != null ? bbd.f() : 0;
        aqe[] aqeArr = new aqe[f2];
        for (int i2 = 0; i2 < f2; i2++) {
            aqeArr[i2] = bbd.a(i2);
        }
        return aqeArr;
    }

    private void b(aqn aqn) {
        if (aqn.e.getLooper() == this.a.a()) {
            c(aqn);
            if (this.u.g == 3 || this.u.g == 2) {
                this.a.a(2);
            }
        } else {
            this.a.a(15, (Object) aqn).sendToTarget();
        }
    }
}
