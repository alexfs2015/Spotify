package defpackage;

import com.google.android.exoplayer2.ParserException;

/* renamed from: awn reason: default package */
final class awn {

    /* renamed from: awn$a */
    static final class a {
        public final int a;
        public final long b;

        private a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(atl atl, bea bea) {
            atl.c(bea.a, 0, 8);
            bea.c(0);
            return new a(bea.i(), bea.h());
        }
    }

    public static awm a(atl atl) {
        a a2;
        bdl.a(atl);
        bea bea = new bea(16);
        if (a.a(atl, bea).a != ash.a) {
            return null;
        }
        atl.c(bea.a, 0, 4);
        bea.c(0);
        int i = bea.i();
        String str = "WavHeaderReader";
        if (i != ash.b) {
            StringBuilder sb = new StringBuilder("Unsupported RIFF format: ");
            sb.append(i);
            bdu.d(str, sb.toString());
            return null;
        }
        while (true) {
            a2 = a.a(atl, bea);
            if (a2.a == ash.c) {
                break;
            }
            atl.c((int) a2.b);
        }
        bdl.b(a2.b >= 16);
        atl.c(bea.a, 0, 16);
        bea.c(0);
        int e = bea.e();
        int e2 = bea.e();
        int o = bea.o();
        int o2 = bea.o();
        int e3 = bea.e();
        int e4 = bea.e();
        int i2 = (e2 * e4) / 8;
        if (e3 == i2) {
            int a3 = ash.a(e, e4);
            if (a3 == 0) {
                StringBuilder sb2 = new StringBuilder("Unsupported WAV format: ");
                sb2.append(e4);
                sb2.append(" bit/sample, type ");
                sb2.append(e);
                bdu.d(str, sb2.toString());
                return null;
            }
            atl.c(((int) a2.b) - 16);
            awm awm = new awm(e2, o, o2, e3, e4, a3);
            return awm;
        }
        StringBuilder sb3 = new StringBuilder("Expected block alignment: ");
        sb3.append(i2);
        sb3.append("; got: ");
        sb3.append(e3);
        throw new ParserException(sb3.toString());
    }
}
