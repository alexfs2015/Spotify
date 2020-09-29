package defpackage;

import com.google.android.exoplayer2.ParserException;

/* renamed from: avw reason: default package */
final class avw {

    /* renamed from: avw$a */
    static final class a {
        public final int a;
        public final long b;

        private a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(asu asu, bdj bdj) {
            asu.c(bdj.a, 0, 8);
            bdj.c(0);
            return new a(bdj.i(), bdj.h());
        }
    }

    public static avv a(asu asu) {
        a a2;
        bcu.a(asu);
        bdj bdj = new bdj(16);
        if (a.a(asu, bdj).a != arq.a) {
            return null;
        }
        asu.c(bdj.a, 0, 4);
        bdj.c(0);
        int i = bdj.i();
        String str = "WavHeaderReader";
        if (i != arq.b) {
            StringBuilder sb = new StringBuilder("Unsupported RIFF format: ");
            sb.append(i);
            bdd.d(str, sb.toString());
            return null;
        }
        while (true) {
            a2 = a.a(asu, bdj);
            if (a2.a == arq.c) {
                break;
            }
            asu.c((int) a2.b);
        }
        bcu.b(a2.b >= 16);
        asu.c(bdj.a, 0, 16);
        bdj.c(0);
        int e = bdj.e();
        int e2 = bdj.e();
        int o = bdj.o();
        int o2 = bdj.o();
        int e3 = bdj.e();
        int e4 = bdj.e();
        int i2 = (e2 * e4) / 8;
        if (e3 == i2) {
            int a3 = arq.a(e, e4);
            if (a3 == 0) {
                StringBuilder sb2 = new StringBuilder("Unsupported WAV format: ");
                sb2.append(e4);
                sb2.append(" bit/sample, type ");
                sb2.append(e);
                bdd.d(str, sb2.toString());
                return null;
            }
            asu.c(((int) a2.b) - 16);
            avv avv = new avv(e2, o, o2, e3, e4, a3);
            return avv;
        }
        StringBuilder sb3 = new StringBuilder("Expected block alignment: ");
        sb3.append(i2);
        sb3.append("; got: ");
        sb3.append(e3);
        throw new ParserException(sb3.toString());
    }
}
