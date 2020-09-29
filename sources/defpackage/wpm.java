package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;

/* renamed from: wpm reason: default package */
public final class wpm {
    public static final Charset a = Charset.forName("UTF-8");
    static final b b;
    private final b c;

    /* renamed from: wpm$a */
    public static final class a {
        public static final boolean a(byte b) {
            byte b2 = b & 255;
            return b2 <= Byte.MAX_VALUE || b2 >= 224;
        }

        public static final boolean b(byte b) {
            return (b & -16) == -112;
        }

        public static final boolean c(byte b) {
            return (b & -32) == Byte.MIN_VALUE;
        }

        public static final boolean d(byte b) {
            return (b & -32) == -96;
        }
    }

    /* renamed from: wpm$b */
    public static class b {
        final boolean a;
        final boolean b;
        final CodingErrorAction c;
        final CodingErrorAction d;
        final int e;
        public final int f;
        private final int g;
        private final int h;
        private final int i;

        public b(boolean z, boolean z2, CodingErrorAction codingErrorAction, CodingErrorAction codingErrorAction2, int i2, int i3, int i4, int i5, int i6) {
            boolean z3 = true;
            boolean z4 = i5 > 0;
            StringBuilder sb = new StringBuilder("packer buffer size must be larger than 0: ");
            sb.append(i5);
            wpp.a(z4, (Object) sb.toString());
            boolean z5 = i3 > 0;
            StringBuilder sb2 = new StringBuilder("string encoder buffer size must be larger than 0: ");
            sb2.append(i3);
            wpp.a(z5, (Object) sb2.toString());
            if (i4 <= 0) {
                z3 = false;
            }
            StringBuilder sb3 = new StringBuilder("string decoder buffer size must be larger than 0: ");
            sb3.append(i4);
            wpp.a(z3, (Object) sb3.toString());
            this.a = z;
            this.b = z2;
            this.c = codingErrorAction;
            this.d = codingErrorAction2;
            this.g = i2;
            this.h = i3;
            this.i = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    /* renamed from: wpm$c */
    public static class c {
        boolean a = true;
        boolean b = true;
        CodingErrorAction c = CodingErrorAction.REPLACE;
        CodingErrorAction d = CodingErrorAction.REPLACE;
        int e = Integer.MAX_VALUE;
        int f = 8192;
        int g = 8192;
        int h = 8192;
        int i = 512;
    }

    static {
        c cVar = new c();
        b bVar = new b(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f, cVar.g, cVar.h, cVar.i);
        b = bVar;
        new wpm(b);
    }

    public wpm() {
        this(b);
    }

    private wpm(b bVar) {
        this.c = bVar;
    }
}
