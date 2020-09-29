package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

/* renamed from: ayq reason: default package */
final class ayq {
    final axw a;
    boolean b;
    byte[] c;
    IOException d;
    defpackage.azd.a e;
    bbd f;
    boolean g;
    private final ays h;
    private final bbn i;
    private final bbn j;
    private final ayz k;
    private final defpackage.azd.a[] l;
    private final HlsPlaylistTracker m;
    private final List<aqe> n;
    private boolean o;
    private Uri p;
    private byte[] q;
    private String r;
    private byte[] s;
    private long t = -9223372036854775807L;

    /* renamed from: ayq$a */
    static final class a extends ayi {
        public final String b;
        byte[] c;

        public a(bbn bbn, bbp bbp, aqe aqe, int i, Object obj, byte[] bArr, String str) {
            super(bbn, bbp, 3, aqe, i, obj, bArr);
            this.b = str;
        }

        public final void a(byte[] bArr, int i) {
            this.c = Arrays.copyOf(bArr, i);
        }
    }

    /* renamed from: ayq$b */
    public static final class b {
        public ayc a;
        public boolean b;
        public defpackage.azd.a c;

        public b() {
            a();
        }

        public final void a() {
            this.a = null;
            this.b = false;
            this.c = null;
        }
    }

    /* renamed from: ayq$c */
    static final class c extends aya {
        private final aze b;
        private final long c;

        public c(aze aze, long j, int i) {
            super((long) i, (long) (aze.l.size() - 1));
            this.b = aze;
            this.c = j;
        }
    }

    /* renamed from: ayq$d */
    static final class d extends baz {
        private int c;

        public final int b() {
            return 0;
        }

        public final Object c() {
            return null;
        }

        public d(axw axw, int[] iArr) {
            super(axw, iArr);
            this.c = a(axw.b[0]);
        }

        public final void a(long j, long j2, long j3) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (b(this.c, elapsedRealtime)) {
                for (int i = this.a - 1; i >= 0; i--) {
                    if (!b(i, elapsedRealtime)) {
                        this.c = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        public final int a() {
            return this.c;
        }
    }

    public ayq(ays ays, HlsPlaylistTracker hlsPlaylistTracker, defpackage.azd.a[] aVarArr, ayr ayr, bcd bcd, ayz ayz, List<aqe> list) {
        this.h = ays;
        this.m = hlsPlaylistTracker;
        this.l = aVarArr;
        this.k = ayz;
        this.n = list;
        aqe[] aqeArr = new aqe[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            aqeArr[i2] = aVarArr[i2].b;
            iArr[i2] = i2;
        }
        this.i = ayr.a();
        if (bcd != null) {
            this.i.a(bcd);
        }
        this.j = ayr.a();
        this.a = new axw(aqeArr);
        this.f = new d(this.a, iArr);
    }

    public final void a() {
        IOException iOException = this.d;
        if (iOException == null) {
            defpackage.azd.a aVar = this.e;
            if (aVar != null && this.g) {
                this.m.c(aVar);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void a(long j2, long j3, List<ayu> list, b bVar) {
        int i2;
        long j4;
        defpackage.azd.a aVar;
        bbp bbp;
        long j5 = j3;
        b bVar2 = bVar;
        ayu ayu = list.isEmpty() ? null : (ayu) list.get(list.size() - 1);
        if (ayu == null) {
            i2 = -1;
        } else {
            i2 = this.a.a(ayu.g);
        }
        long j6 = j5 - j2;
        long j7 = -9223372036854775807L;
        long j8 = (this.t > -9223372036854775807L ? 1 : (this.t == -9223372036854775807L ? 0 : -1)) != 0 ? this.t - j2 : -9223372036854775807L;
        if (ayu != null && !this.o) {
            long j9 = ayu.k - ayu.j;
            j6 = Math.max(0, j6 - j9);
            if (j8 != -9223372036854775807L) {
                j8 = Math.max(0, j8 - j9);
            }
        }
        long j10 = j8;
        long j11 = j6;
        a(ayu, j5);
        this.f.a(j2, j11, j10);
        int h2 = this.f.h();
        boolean z = i2 != h2;
        defpackage.azd.a aVar2 = this.l[h2];
        if (!this.m.b(aVar2)) {
            bVar2.c = aVar2;
            this.g &= this.e == aVar2;
            this.e = aVar2;
            return;
        }
        aze a2 = this.m.a(aVar2);
        this.o = a2.p;
        if (!a2.i) {
            j7 = a2.a() - this.m.c();
        }
        this.t = j7;
        long c2 = a2.c - this.m.c();
        aze aze = a2;
        defpackage.azd.a aVar3 = aVar2;
        boolean z2 = false;
        long a3 = a(ayu, z, a2, c2, j3);
        if (a3 >= aze.f) {
            j4 = a3;
            aVar = aVar3;
        } else if (ayu == null || !z) {
            this.d = new BehindLiveWindowException();
            return;
        } else {
            aVar = this.l[i2];
            aze a4 = this.m.a(aVar);
            c2 = a4.c - this.m.c();
            j4 = ayu.f();
            aze = a4;
            h2 = i2;
        }
        int i3 = (int) (j4 - aze.f);
        if (i3 < aze.l.size()) {
            this.g = false;
            this.e = null;
            defpackage.aze.a aVar4 = (defpackage.aze.a) aze.l.get(i3);
            if (aVar4.g != null) {
                Uri a5 = bdv.a(aze.n, aVar4.g);
                if (!a5.equals(this.p)) {
                    String str = aVar4.h;
                    int b2 = this.f.b();
                    Object c3 = this.f.c();
                    bbp bbp2 = new bbp(a5, 0, -1, null, 1);
                    a aVar5 = new a(this.j, bbp2, this.l[h2].b, b2, c3, this.c, str);
                    bVar2.a = aVar5;
                    return;
                }
                if (!bdw.a((Object) aVar4.h, (Object) this.r)) {
                    a(a5, aVar4.h, this.q);
                }
                bbp = null;
            } else {
                bbp = null;
                this.p = null;
                this.q = null;
                this.r = null;
                this.s = null;
            }
            defpackage.aze.a aVar6 = aVar4.b;
            bbp bbp3 = aVar6 != null ? new bbp(bdv.a(aze.n, aVar6.a), aVar6.i, aVar6.j, null) : bbp;
            long j12 = c2 + aVar4.e;
            int i4 = aze.e + aVar4.d;
            ayz ayz = this.k;
            bdt bdt = (bdt) ayz.a.get(i4);
            if (bdt == null) {
                bdt = new bdt(Long.MAX_VALUE);
                ayz.a.put(i4, bdt);
            }
            bdt bdt2 = bdt;
            bbp bbp4 = r33;
            bbp bbp5 = new bbp(bdv.a(aze.n, aVar4.a), aVar4.i, aVar4.j, null);
            ayu ayu2 = new ayu(this.h, this.i, bbp4, bbp3, aVar, this.n, this.f.b(), this.f.c(), j12, j12 + aVar4.c, j4, i4, aVar4.k, this.b, bdt2, ayu, aVar4.f, this.q, this.s);
            bVar2.a = ayu2;
        } else if (aze.i) {
            bVar2.b = true;
        } else {
            bVar2.c = aVar;
            boolean z3 = this.g;
            if (this.e == aVar) {
                z2 = true;
            }
            this.g = z3 & z2;
            this.e = aVar;
        }
    }

    public final ayl[] a(ayu ayu, long j2) {
        int i2;
        ayu ayu2 = ayu;
        if (ayu2 == null) {
            i2 = -1;
        } else {
            i2 = this.a.a(ayu2.g);
        }
        ayl[] aylArr = new ayl[this.f.f()];
        for (int i3 = 0; i3 < aylArr.length; i3++) {
            int b2 = this.f.b(i3);
            defpackage.azd.a aVar = this.l[b2];
            if (!this.m.b(aVar)) {
                aylArr[i3] = ayl.a;
            } else {
                aze a2 = this.m.a(aVar);
                long c2 = a2.c - this.m.c();
                long j3 = c2;
                long a3 = a(ayu, b2 != i2, a2, c2, j2);
                if (a3 < a2.f) {
                    aylArr[i3] = ayl.a;
                } else {
                    aylArr[i3] = new c(a2, j3, (int) (a3 - a2.f));
                }
            }
        }
        return aylArr;
    }

    private long a(ayu ayu, boolean z, aze aze, long j2, long j3) {
        long a2;
        long j4;
        if (ayu != null && !z) {
            return ayu.f();
        }
        long j5 = aze.m + j2;
        if (ayu != null && !this.o) {
            j3 = ayu.j;
        }
        if (aze.i || j3 < j5) {
            a2 = (long) bdw.a(aze.l, Long.valueOf(j3 - j2), true, !this.m.e() || ayu == null);
            j4 = aze.f;
        } else {
            a2 = aze.f;
            j4 = (long) aze.l.size();
        }
        return a2 + j4;
    }

    /* access modifiers changed from: 0000 */
    public void a(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(bdw.d(str).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.p = uri;
        this.q = bArr;
        this.r = str;
        this.s = bArr2;
    }
}
