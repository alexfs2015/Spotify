package defpackage;

import com.google.android.exoplayer2.ParserException;

/* renamed from: awl reason: default package */
public final class awl implements atk {
    private atm a;
    private atu b;
    private awm c;
    private int d;
    private int e;

    static {
        $$Lambda$awl$oU1pYmi49YQIxUieQZdLNIzbj6I r0 = $$Lambda$awl$oU1pYmi49YQIxUieQZdLNIzbj6I.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ atk[] a() {
        return new atk[]{new awl()};
    }

    public final int a(atl atl, atr atr) {
        if (this.c == null) {
            this.c = awn.a(atl);
            awm awm = this.c;
            if (awm != null) {
                this.b.a(aqv.a((String) null, "audio/raw", (String) null, awm.b * awm.d * awm.a, 32768, this.c.a, this.c.b, this.c.e, null, (ast) null, 0, (String) null));
                this.d = this.c.c;
            } else {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
        }
        if (!this.c.c()) {
            awm awm2 = this.c;
            bdl.a(atl);
            bdl.a(awm2);
            atl.a();
            bea bea = new bea(8);
            a a2 = a.a(atl, bea);
            while (a2.a != ben.g("data")) {
                StringBuilder sb = new StringBuilder("Ignoring unknown WAV chunk: ");
                sb.append(a2.a);
                bdu.c("WavHeaderReader", sb.toString());
                long j = a2.b + 8;
                if (a2.a == ben.g("RIFF")) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    atl.b((int) j);
                    a2 = a.a(atl, bea);
                } else {
                    StringBuilder sb2 = new StringBuilder("Chunk is too large (~2GB+) to skip; id: ");
                    sb2.append(a2.a);
                    throw new ParserException(sb2.toString());
                }
            }
            atl.b(8);
            long c2 = atl.c();
            long j2 = a2.b;
            awm2.f = c2;
            awm2.g = j2;
            this.a.a(this.c);
        }
        awm awm3 = this.c;
        long j3 = awm3.c() ? awm3.f + awm3.g : -1;
        bdl.b(j3 != -1);
        long c3 = j3 - atl.c();
        if (c3 <= 0) {
            return -1;
        }
        int a3 = this.b.a(atl, (int) Math.min((long) (32768 - this.e), c3), true);
        if (a3 != -1) {
            this.e += a3;
        }
        int i = this.e / this.d;
        if (i > 0) {
            long b2 = this.c.b(atl.c() - ((long) this.e));
            int i2 = i * this.d;
            this.e -= i2;
            this.b.a(b2, 1, i2, this.e, null);
        }
        return a3 == -1 ? -1 : 0;
    }

    public final void a(long j, long j2) {
        this.e = 0;
    }

    public final void a(atm atm) {
        this.a = atm;
        this.b = atm.a(0, 1);
        this.c = null;
        atm.a();
    }

    public final boolean a(atl atl) {
        return awn.a(atl) != null;
    }
}
