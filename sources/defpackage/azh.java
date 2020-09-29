package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

/* renamed from: azh reason: default package */
final class azh {
    final ayn a;
    boolean b;
    byte[] c;
    IOException d;
    defpackage.azu.a e;
    bbu f;
    boolean g;
    private final azj h;
    private final bce i;
    private final bce j;
    private final azq k;
    private final defpackage.azu.a[] l;
    private final HlsPlaylistTracker m;
    private final List<aqv> n;
    private boolean o;
    private Uri p;
    private byte[] q;
    private String r;
    private byte[] s;
    private long t = -9223372036854775807L;

    /* renamed from: azh$a */
    static final class a extends ayz {
        public final String b;
        byte[] c;

        public a(bce bce, bcg bcg, aqv aqv, int i, Object obj, byte[] bArr, String str) {
            super(bce, bcg, 3, aqv, i, obj, bArr);
            this.b = str;
        }

        public final void a(byte[] bArr, int i) {
            this.c = Arrays.copyOf(bArr, i);
        }
    }

    /* renamed from: azh$b */
    public static final class b {
        public ayt a;
        public boolean b;
        public defpackage.azu.a c;

        public b() {
            a();
        }

        public final void a() {
            this.a = null;
            this.b = false;
            this.c = null;
        }
    }

    /* renamed from: azh$c */
    static final class c extends ayr {
        private final azv b;
        private final long c;

        public c(azv azv, long j, int i) {
            super((long) i, (long) (azv.l.size() - 1));
            this.b = azv;
            this.c = j;
        }
    }

    /* renamed from: azh$d */
    static final class d extends bbq {
        private int c;

        public d(ayn ayn, int[] iArr) {
            super(ayn, iArr);
            this.c = a(ayn.b[0]);
        }

        public final int a() {
            return this.c;
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

        public final int b() {
            return 0;
        }

        public final Object c() {
            return null;
        }
    }

    public azh(azj azj, HlsPlaylistTracker hlsPlaylistTracker, defpackage.azu.a[] aVarArr, azi azi, bcu bcu, azq azq, List<aqv> list) {
        this.h = azj;
        this.m = hlsPlaylistTracker;
        this.l = aVarArr;
        this.k = azq;
        this.n = list;
        aqv[] aqvArr = new aqv[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            aqvArr[i2] = aVarArr[i2].b;
            iArr[i2] = i2;
        }
        this.i = azi.a();
        if (bcu != null) {
            this.i.a(bcu);
        }
        this.j = azi.a();
        this.a = new ayn(aqvArr);
        this.f = new d(this.a, iArr);
    }

    private long a(azl azl, boolean z, azv azv, long j2, long j3) {
        long a2;
        long j4;
        if (azl != null && !z) {
            return azl.f();
        }
        long j5 = azv.m + j2;
        if (azl != null && !this.o) {
            j3 = azl.j;
        }
        if (azv.i || j3 < j5) {
            a2 = (long) ben.a(azv.l, Long.valueOf(j3 - j2), true, !this.m.e() || azl == null);
            j4 = azv.f;
        } else {
            a2 = azv.f;
            j4 = (long) azv.l.size();
        }
        return a2 + j4;
    }

    public final void a() {
        IOException iOException = this.d;
        if (iOException == null) {
            defpackage.azu.a aVar = this.e;
            if (aVar != null && this.g) {
                this.m.c(aVar);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void a(long j2, long j3, List<azl> list, b bVar) {
        long j4;
        defpackage.azu.a aVar;
        bcg bcg;
        long j5 = j3;
        b bVar2 = bVar;
        azl azl = list.isEmpty() ? null : (azl) list.get(list.size() - 1);
        int a2 = azl == null ? -1 : this.a.a(azl.g);
        long j6 = j5 - j2;
        long j7 = -9223372036854775807L;
        long j8 = (this.t > -9223372036854775807L ? 1 : (this.t == -9223372036854775807L ? 0 : -1)) != 0 ? this.t - j2 : -9223372036854775807L;
        if (azl != null && !this.o) {
            long j9 = azl.k - azl.j;
            j6 = Math.max(0, j6 - j9);
            if (j8 != -9223372036854775807L) {
                j8 = Math.max(0, j8 - j9);
            }
        }
        long j10 = j8;
        long j11 = j6;
        a(azl, j5);
        this.f.a(j2, j11, j10);
        int h2 = this.f.h();
        boolean z = a2 != h2;
        defpackage.azu.a aVar2 = this.l[h2];
        if (!this.m.b(aVar2)) {
            bVar2.c = aVar2;
            this.g &= this.e == aVar2;
            this.e = aVar2;
            return;
        }
        azv a3 = this.m.a(aVar2);
        this.o = a3.p;
        if (!a3.i) {
            j7 = a3.a() - this.m.c();
        }
        this.t = j7;
        long c2 = a3.c - this.m.c();
        azv azv = a3;
        defpackage.azu.a aVar3 = aVar2;
        boolean z2 = false;
        long a4 = a(azl, z, a3, c2, j3);
        if (a4 >= azv.f) {
            j4 = a4;
            aVar = aVar3;
        } else if (azl == null || !z) {
            this.d = new BehindLiveWindowException();
            return;
        } else {
            aVar = this.l[a2];
            azv a5 = this.m.a(aVar);
            c2 = a5.c - this.m.c();
            j4 = azl.f();
            azv = a5;
            h2 = a2;
        }
        int i2 = (int) (j4 - azv.f);
        if (i2 < azv.l.size()) {
            this.g = false;
            this.e = null;
            defpackage.azv.a aVar4 = (defpackage.azv.a) azv.l.get(i2);
            if (aVar4.g != null) {
                Uri a6 = bem.a(azv.n, aVar4.g);
                if (!a6.equals(this.p)) {
                    String str = aVar4.h;
                    int b2 = this.f.b();
                    Object c3 = this.f.c();
                    bcg bcg2 = new bcg(a6, 0, -1, null, 1);
                    a aVar5 = new a(this.j, bcg2, this.l[h2].b, b2, c3, this.c, str);
                    bVar2.a = aVar5;
                    return;
                }
                if (!ben.a((Object) aVar4.h, (Object) this.r)) {
                    a(a6, aVar4.h, this.q);
                }
                bcg = null;
            } else {
                bcg = null;
                this.p = null;
                this.q = null;
                this.r = null;
                this.s = null;
            }
            defpackage.azv.a aVar6 = aVar4.b;
            bcg bcg3 = aVar6 != null ? new bcg(bem.a(azv.n, aVar6.a), aVar6.i, aVar6.j, null) : bcg;
            long j12 = c2 + aVar4.e;
            int i3 = azv.e + aVar4.d;
            azq azq = this.k;
            bek bek = (bek) azq.a.get(i3);
            if (bek == null) {
                bek = new bek(Long.MAX_VALUE);
                azq.a.put(i3, bek);
            }
            bek bek2 = bek;
            bcg bcg4 = r33;
            bcg bcg5 = new bcg(bem.a(azv.n, aVar4.a), aVar4.i, aVar4.j, null);
            azl azl2 = new azl(this.h, this.i, bcg4, bcg3, aVar, this.n, this.f.b(), this.f.c(), j12, j12 + aVar4.c, j4, i3, aVar4.k, this.b, bek2, azl, aVar4.f, this.q, this.s);
            bVar2.a = azl2;
        } else if (azv.i) {
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

    /* access modifiers changed from: 0000 */
    public void a(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(ben.d(str).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.p = uri;
        this.q = bArr;
        this.r = str;
        this.s = bArr2;
    }

    public final azc[] a(azl azl, long j2) {
        azl azl2 = azl;
        int a2 = azl2 == null ? -1 : this.a.a(azl2.g);
        azc[] azcArr = new azc[this.f.f()];
        for (int i2 = 0; i2 < azcArr.length; i2++) {
            int b2 = this.f.b(i2);
            defpackage.azu.a aVar = this.l[b2];
            if (!this.m.b(aVar)) {
                azcArr[i2] = azc.a;
            } else {
                azv a3 = this.m.a(aVar);
                long c2 = a3.c - this.m.c();
                long j3 = c2;
                long a4 = a(azl, b2 != a2, a3, c2, j2);
                if (a4 < a3.f) {
                    azcArr[i2] = azc.a;
                } else {
                    azcArr[i2] = new c(a3, j3, (int) (a4 - a3.f));
                }
            }
        }
        return azcArr;
    }
}
