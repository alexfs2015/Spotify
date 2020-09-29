package defpackage;

import com.google.android.exoplayer2.ParserException;

/* renamed from: avu reason: default package */
public final class avu implements ast {
    private asv a;
    private atd b;
    private avv c;
    private int d;
    private int e;

    static {
        $$Lambda$avu$g0vbbLzzbHAmb7y7HwY26w3qEA r0 = $$Lambda$avu$g0vbbLzzbHAmb7y7HwY26w3qEA.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ast[] a() {
        return new ast[]{new avu()};
    }

    public final boolean a(asu asu) {
        return avw.a(asu) != null;
    }

    public final void a(asv asv) {
        this.a = asv;
        this.b = asv.a(0, 1);
        this.c = null;
        asv.a();
    }

    public final void a(long j, long j2) {
        this.e = 0;
    }

    public final int a(asu asu, ata ata) {
        if (this.c == null) {
            this.c = avw.a(asu);
            avv avv = this.c;
            if (avv != null) {
                this.b.a(aqe.a((String) null, "audio/raw", (String) null, avv.b * avv.d * avv.a, 32768, this.c.a, this.c.b, this.c.e, null, (asc) null, 0, (String) null));
                this.d = this.c.c;
            } else {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
        }
        if (!this.c.c()) {
            avv avv2 = this.c;
            bcu.a(asu);
            bcu.a(avv2);
            asu.a();
            bdj bdj = new bdj(8);
            a a2 = a.a(asu, bdj);
            while (a2.a != bdw.g("data")) {
                StringBuilder sb = new StringBuilder("Ignoring unknown WAV chunk: ");
                sb.append(a2.a);
                bdd.c("WavHeaderReader", sb.toString());
                long j = a2.b + 8;
                if (a2.a == bdw.g("RIFF")) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    asu.b((int) j);
                    a2 = a.a(asu, bdj);
                } else {
                    StringBuilder sb2 = new StringBuilder("Chunk is too large (~2GB+) to skip; id: ");
                    sb2.append(a2.a);
                    throw new ParserException(sb2.toString());
                }
            }
            asu.b(8);
            long c2 = asu.c();
            long j2 = a2.b;
            avv2.f = c2;
            avv2.g = j2;
            this.a.a(this.c);
        }
        avv avv3 = this.c;
        long j3 = avv3.c() ? avv3.f + avv3.g : -1;
        bcu.b(j3 != -1);
        long c3 = j3 - asu.c();
        if (c3 <= 0) {
            return -1;
        }
        int a3 = this.b.a(asu, (int) Math.min((long) (32768 - this.e), c3), true);
        if (a3 != -1) {
            this.e += a3;
        }
        int i = this.e / this.d;
        if (i > 0) {
            long b2 = this.c.b(asu.c() - ((long) this.e));
            int i2 = i * this.d;
            this.e -= i2;
            this.b.a(b2, 1, i2, this.e, null);
        }
        if (a3 == -1) {
            return -1;
        }
        return 0;
    }
}
