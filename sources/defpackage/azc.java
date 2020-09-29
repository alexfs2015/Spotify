package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistResetException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistStuckException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.c;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.d;
import com.google.android.exoplayer2.upstream.Loader.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;

/* renamed from: azc reason: default package */
public final class azc implements HlsPlaylistTracker, com.google.android.exoplayer2.upstream.Loader.a<bca<azf>> {
    public static final com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.a a = $$Lambda$sFQSlm8DZdi1eLeRxbpQONgQ6HU.INSTANCE;
    /* access modifiers changed from: private */
    public final ayr b;
    private final azh c;
    /* access modifiers changed from: private */
    public final bby d;
    private final IdentityHashMap<defpackage.azd.a, a> e = new IdentityHashMap<>();
    private final List<b> f = new ArrayList();
    /* access modifiers changed from: private */
    public defpackage.bca.a<azf> g;
    /* access modifiers changed from: private */
    public defpackage.axq.a h;
    private Loader i;
    /* access modifiers changed from: private */
    public Handler j;
    private c k;
    /* access modifiers changed from: private */
    public azd l;
    /* access modifiers changed from: private */
    public defpackage.azd.a m;
    private aze n;
    private boolean o;
    private long p = -9223372036854775807L;

    /* renamed from: azc$a */
    final class a implements com.google.android.exoplayer2.upstream.Loader.a<bca<azf>>, Runnable {
        final Loader a = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");
        aze b;
        long c;
        /* access modifiers changed from: private */
        public final defpackage.azd.a d;
        private final bca<azf> e;
        private long f;
        private long g;
        /* access modifiers changed from: private */
        public long h;
        private boolean i;
        private IOException j;

        public final /* synthetic */ Loader.b a(d dVar, long j2, long j3, IOException iOException, int i2) {
            Loader.b bVar;
            IOException iOException2 = iOException;
            bca bca = (bca) dVar;
            long a2 = azc.this.d.a(iOException2);
            boolean z = a2 != -9223372036854775807L;
            boolean z2 = azc.a(azc.this, this.d, a2) || !z;
            if (z) {
                z2 |= a(a2);
            }
            if (z2) {
                long a3 = azc.this.d.a(iOException2, i2);
                bVar = a3 != -9223372036854775807L ? Loader.a(false, a3) : Loader.b;
            } else {
                bVar = Loader.a;
            }
            Loader.b bVar2 = bVar;
            azc.this.h.a(bca.a, bca.c.b, bca.c.c, 4, j2, j3, bca.c.a, iOException, !bVar2.a());
            return bVar2;
        }

        public final /* synthetic */ void a(d dVar, long j2, long j3) {
            bca bca = (bca) dVar;
            azf azf = (azf) bca.d;
            if (azf instanceof aze) {
                long j4 = j3;
                a((aze) azf, j4);
                azc.this.h.a(bca.a, bca.c.b, bca.c.c, 4, j2, j4, bca.c.a);
                return;
            }
            this.j = new ParserException("Loaded playlist has unexpected type.");
        }

        public final /* synthetic */ void a(d dVar, long j2, long j3, boolean z) {
            bca bca = (bca) dVar;
            azc.this.h.b(bca.a, bca.c.b, bca.c.c, 4, j2, j3, bca.c.a);
        }

        public a(defpackage.azd.a aVar) {
            this.d = aVar;
            this.e = new bca<>(azc.this.b.a(), bdv.a(azc.this.l.n, aVar.a), 4, azc.this.g);
        }

        public final void a() {
            this.h = 0;
            if (!this.i && !this.a.a()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < this.g) {
                    this.i = true;
                    azc.this.j.postDelayed(this, this.g - elapsedRealtime);
                    return;
                }
                b();
            }
        }

        public final void run() {
            this.i = false;
            b();
        }

        private void b() {
            azc.this.h.a(this.e.a, this.e.b, this.a.a(this.e, this, azc.this.d.a(this.e.b)));
        }

        /* access modifiers changed from: private */
        public void a(aze aze, long j2) {
            aze aze2 = this.b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.c = elapsedRealtime;
            this.b = azc.a(azc.this, aze2, aze);
            aze aze3 = this.b;
            if (aze3 != aze2) {
                this.j = null;
                this.f = elapsedRealtime;
                azc.a(azc.this, this.d, aze3);
            } else if (!aze3.i) {
                if (aze.f + ((long) aze.l.size()) < this.b.f) {
                    this.j = new PlaylistResetException(this.d.a);
                    azc.a(azc.this, this.d, -9223372036854775807L);
                } else {
                    double d2 = (double) (elapsedRealtime - this.f);
                    double a2 = (double) apv.a(this.b.h);
                    Double.isNaN(a2);
                    if (d2 > a2 * 3.5d) {
                        this.j = new PlaylistStuckException(this.d.a);
                        long a3 = azc.this.d.a(this.j);
                        azc.a(azc.this, this.d, a3);
                        if (a3 != -9223372036854775807L) {
                            a(a3);
                        }
                    }
                }
            }
            aze aze4 = this.b;
            this.g = elapsedRealtime + apv.a(aze4 != aze2 ? aze4.h : aze4.h / 2);
            if (this.d == azc.this.m && !this.b.i) {
                a();
            }
        }

        private boolean a(long j2) {
            this.h = SystemClock.elapsedRealtime() + j2;
            return azc.this.m == this.d && !azc.h(azc.this);
        }
    }

    public final /* bridge */ /* synthetic */ Loader.b a(d dVar, long j2, long j3, IOException iOException, int i2) {
        bca bca = (bca) dVar;
        long a2 = this.d.a(iOException, i2);
        boolean z = a2 == -9223372036854775807L;
        long j4 = a2;
        this.h.a(bca.a, bca.c.b, bca.c.c, 4, j2, j3, bca.c.a, iOException, z);
        if (z) {
            return Loader.b;
        }
        return Loader.a(false, j4);
    }

    public final /* synthetic */ void a(d dVar, long j2, long j3) {
        azd azd;
        bca bca = (bca) dVar;
        azf azf = (azf) bca.d;
        boolean z = azf instanceof aze;
        if (z) {
            azd = azd.a(azf.n);
        } else {
            azd = (azd) azf;
        }
        this.l = azd;
        this.g = this.c.a(azd);
        this.m = (defpackage.azd.a) azd.b.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(azd.b);
        arrayList.addAll(azd.c);
        arrayList.addAll(azd.d);
        a((List<defpackage.azd.a>) arrayList);
        a aVar = (a) this.e.get(this.m);
        if (z) {
            aVar.a((aze) azf, j3);
        } else {
            long j4 = j3;
            aVar.a();
        }
        this.h.a(bca.a, bca.c.b, bca.c.c, 4, j2, j3, bca.c.a);
    }

    public final /* synthetic */ void a(d dVar, long j2, long j3, boolean z) {
        bca bca = (bca) dVar;
        this.h.b(bca.a, bca.c.b, bca.c.c, 4, j2, j3, bca.c.a);
    }

    public azc(ayr ayr, bby bby, azh azh) {
        this.b = ayr;
        this.c = azh;
        this.d = bby;
    }

    public final void a(Uri uri, defpackage.axq.a aVar, c cVar) {
        this.j = new Handler();
        this.h = aVar;
        this.k = cVar;
        bca bca = new bca(this.b.a(), uri, 4, this.c.a());
        bcu.b(this.i == null);
        this.i = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
        aVar.a(bca.a, bca.b, this.i.a(bca, this, this.d.a(bca.b)));
    }

    public final void a() {
        this.m = null;
        this.n = null;
        this.l = null;
        this.p = -9223372036854775807L;
        this.i.a((e) null);
        this.i = null;
        for (a aVar : this.e.values()) {
            aVar.a.a((e) null);
        }
        this.j.removeCallbacksAndMessages(null);
        this.j = null;
        this.e.clear();
    }

    public final void a(b bVar) {
        this.f.add(bVar);
    }

    public final void b(b bVar) {
        this.f.remove(bVar);
    }

    public final azd b() {
        return this.l;
    }

    public final aze a(defpackage.azd.a aVar) {
        aze aze = ((a) this.e.get(aVar)).b;
        if (!(aze == null || aVar == this.m || !this.l.b.contains(aVar))) {
            aze aze2 = this.n;
            if (aze2 == null || !aze2.i) {
                this.m = aVar;
                ((a) this.e.get(this.m)).a();
            }
        }
        return aze;
    }

    public final long c() {
        return this.p;
    }

    public final boolean b(defpackage.azd.a aVar) {
        a aVar2 = (a) this.e.get(aVar);
        if (aVar2.b != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000, apv.a(aVar2.b.m));
            if (aVar2.b.i || aVar2.b.a == 2 || aVar2.b.a == 1 || aVar2.c + max > elapsedRealtime) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        defpackage.azd.a aVar = this.m;
        if (aVar != null) {
            c(aVar);
        }
    }

    public final void c(defpackage.azd.a aVar) {
        this.e.get(aVar);
    }

    public final void d(defpackage.azd.a aVar) {
        ((a) this.e.get(aVar)).a();
    }

    public final boolean e() {
        return this.o;
    }

    private void a(List<defpackage.azd.a> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.azd.a aVar = (defpackage.azd.a) list.get(i2);
            this.e.put(aVar, new a(aVar));
        }
    }

    private static defpackage.aze.a a(aze aze, aze aze2) {
        int i2 = (int) (aze2.f - aze.f);
        List<defpackage.aze.a> list = aze.l;
        if (i2 < list.size()) {
            return (defpackage.aze.a) list.get(i2);
        }
        return null;
    }

    static /* synthetic */ boolean a(azc azc, defpackage.azd.a aVar, long j2) {
        boolean z = false;
        for (int i2 = 0; i2 < azc.f.size(); i2++) {
            z |= !((b) azc.f.get(i2)).a(aVar, j2);
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r1.i != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ defpackage.aze a(defpackage.azc r27, defpackage.aze r28, defpackage.aze r29) {
        /*
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0035
            long r5 = r2.f
            long r7 = r1.f
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0013
            goto L_0x0035
        L_0x0013:
            long r5 = r2.f
            long r7 = r1.f
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x0034
            java.util.List<aze$a> r5 = r2.l
            int r5 = r5.size()
            java.util.List<aze$a> r6 = r1.l
            int r6 = r6.size()
            if (r5 > r6) goto L_0x0035
            if (r5 != r6) goto L_0x0034
            boolean r5 = r2.i
            if (r5 == 0) goto L_0x0034
            boolean r5 = r1.i
            if (r5 != 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            if (r3 != 0) goto L_0x0079
            boolean r0 = r2.i
            if (r0 == 0) goto L_0x0078
            boolean r0 = r1.i
            if (r0 == 0) goto L_0x0042
            r0 = r1
            goto L_0x0106
        L_0x0042:
            aze r0 = new aze
            r2 = r0
            int r3 = r1.a
            java.lang.String r4 = r1.n
            java.util.List r5 = r1.o
            long r6 = r1.b
            long r8 = r1.c
            boolean r10 = r1.d
            int r11 = r1.e
            long r12 = r1.f
            int r14 = r1.g
            r27 = r2
            r29 = r3
            long r2 = r1.h
            r15 = r2
            boolean r2 = r1.p
            r17 = r2
            r18 = 1
            boolean r2 = r1.j
            r19 = r2
            asc r2 = r1.k
            r20 = r2
            java.util.List<aze$a> r1 = r1.l
            r21 = r1
            r2 = r27
            r3 = r29
            r2.<init>(r3, r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21)
            return r0
        L_0x0078:
            return r1
        L_0x0079:
            boolean r3 = r2.j
            if (r3 == 0) goto L_0x0081
            long r5 = r2.c
        L_0x007f:
            r13 = r5
            goto L_0x00ad
        L_0x0081:
            aze r3 = r0.n
            if (r3 == 0) goto L_0x0088
            long r5 = r3.c
            goto L_0x008a
        L_0x0088:
            r5 = 0
        L_0x008a:
            if (r1 == 0) goto L_0x007f
            java.util.List<aze$a> r3 = r1.l
            int r3 = r3.size()
            aze$a r7 = a(r28, r29)
            if (r7 == 0) goto L_0x009e
            long r5 = r1.c
            long r7 = r7.e
            long r5 = r5 + r7
            goto L_0x007f
        L_0x009e:
            long r7 = (long) r3
            long r9 = r2.f
            long r11 = r1.f
            long r9 = r9 - r11
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x007f
            long r5 = r28.a()
            goto L_0x007f
        L_0x00ad:
            boolean r3 = r2.d
            if (r3 == 0) goto L_0x00b6
            int r0 = r2.e
        L_0x00b3:
            r16 = r0
            goto L_0x00d7
        L_0x00b6:
            aze r0 = r0.n
            if (r0 == 0) goto L_0x00bd
            int r0 = r0.e
            goto L_0x00be
        L_0x00bd:
            r0 = 0
        L_0x00be:
            if (r1 == 0) goto L_0x00b3
            aze$a r3 = a(r28, r29)
            if (r3 == 0) goto L_0x00b3
            int r0 = r1.e
            int r1 = r3.d
            int r0 = r0 + r1
            java.util.List<aze$a> r1 = r2.l
            java.lang.Object r1 = r1.get(r4)
            aze$a r1 = (defpackage.aze.a) r1
            int r1 = r1.d
            int r0 = r0 - r1
            goto L_0x00b3
        L_0x00d7:
            aze r0 = new aze
            r7 = r0
            int r8 = r2.a
            java.lang.String r9 = r2.n
            java.util.List r10 = r2.o
            long r11 = r2.b
            r15 = 1
            long r3 = r2.f
            r17 = r3
            int r1 = r2.g
            r19 = r1
            long r3 = r2.h
            r20 = r3
            boolean r1 = r2.p
            r22 = r1
            boolean r1 = r2.i
            r23 = r1
            boolean r1 = r2.j
            r24 = r1
            asc r1 = r2.k
            r25 = r1
            java.util.List<aze$a> r1 = r2.l
            r26 = r1
            r7.<init>(r8, r9, r10, r11, r13, r15, r16, r17, r19, r20, r22, r23, r24, r25, r26)
        L_0x0106:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azc.a(azc, aze, aze):aze");
    }

    static /* synthetic */ void a(azc azc, defpackage.azd.a aVar, aze aze) {
        if (aVar == azc.m) {
            if (azc.n == null) {
                azc.o = !aze.i;
                azc.p = aze.c;
            }
            azc.n = aze;
            azc.k.a(aze);
        }
        int size = azc.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((b) azc.f.get(i2)).g();
        }
    }

    static /* synthetic */ boolean h(azc azc) {
        List<defpackage.azd.a> list = azc.l.b;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = (a) azc.e.get(list.get(i2));
            if (elapsedRealtime > aVar.h) {
                azc.m = aVar.d;
                aVar.a();
                return true;
            }
        }
        return false;
    }
}
