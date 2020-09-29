package defpackage;

import io.netty.util.Recycler;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Locale;

/* renamed from: wng reason: default package */
public final class wng {
    static final wnc a;
    private static final wyc b = wyd.a(wng.class);
    private static final wwg<CharBuffer> c = new wwg<CharBuffer>() {
        public final /* synthetic */ Object a() {
            return CharBuffer.allocate(1024);
        }
    };
    private static final int d = wxu.a("io.netty.maxThreadLocalCharBufferSize", 16384);
    /* access modifiers changed from: private */
    public static final int e = wxu.a("io.netty.threadLocalDirectBufferSize", 65536);

    /* renamed from: wng$a */
    static final class a {
        private static final char[] a = new char[256];
        private static final char[] b = new char[1024];
        private static final String[] c = new String[16];
        private static final String[] d = new String[4096];
        private static final String[] e = new String[256];
        private static final String[] f = new String[16];

        static {
            char[] charArray = "0123456789abcdef".toCharArray();
            for (int i = 0; i < 256; i++) {
                char[] cArr = b;
                int i2 = i << 1;
                cArr[i2] = charArray[(i >>> 4) & 15];
                cArr[i2 + 1] = charArray[i & 15];
            }
            for (int i3 = 0; i3 < 16; i3++) {
                int i4 = 16 - i3;
                StringBuilder sb = new StringBuilder(i4 * 3);
                for (int i5 = 0; i5 < i4; i5++) {
                    sb.append("   ");
                }
                c[i3] = sb.toString();
            }
            for (int i6 = 0; i6 < 4096; i6++) {
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append(wxt.a);
                sb2.append(Long.toHexString((((long) (i6 << 4)) & 4294967295L) | 4294967296L));
                sb2.setCharAt(sb2.length() - 9, '|');
                sb2.append('|');
                d[i6] = sb2.toString();
            }
            for (int i7 = 0; i7 < 256; i7++) {
                String[] strArr = e;
                StringBuilder sb3 = new StringBuilder(" ");
                sb3.append(wxt.a(i7));
                strArr[i7] = sb3.toString();
            }
            for (int i8 = 0; i8 < 16; i8++) {
                int i9 = 16 - i8;
                StringBuilder sb4 = new StringBuilder(i9);
                for (int i10 = 0; i10 < i9; i10++) {
                    sb4.append(' ');
                }
                f[i8] = sb4.toString();
            }
            for (int i11 = 0; i11 < 256; i11++) {
                if (i11 <= 31 || i11 >= 127) {
                    a[i11] = '.';
                } else {
                    a[i11] = (char) i11;
                }
            }
        }

        static /* synthetic */ String a(wnb wnb, int i, int i2) {
            if (i2 < 0) {
                StringBuilder sb = new StringBuilder("length: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else if (i2 == 0) {
                return "";
            } else {
                int i3 = i + i2;
                char[] cArr = new char[(i2 << 1)];
                int i4 = 0;
                while (i < i3) {
                    System.arraycopy(b, wnb.g(i) << 1, cArr, i4, 2);
                    i++;
                    i4 += 2;
                }
                return new String(cArr);
            }
        }

        static /* synthetic */ String a(byte[] bArr, int i, int i2) {
            if (i2 < 0) {
                StringBuilder sb = new StringBuilder("length: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else if (i2 == 0) {
                return "";
            } else {
                int i3 = i + i2;
                char[] cArr = new char[(i2 << 1)];
                int i4 = 0;
                while (i < i3) {
                    System.arraycopy(b, (bArr[i] & 255) << 1, cArr, i4, 2);
                    i++;
                    i4 += 2;
                }
                return new String(cArr);
            }
        }

        private static void a(StringBuilder sb, int i, int i2) {
            if (i < 4096) {
                sb.append(d[i]);
                return;
            }
            sb.append(wxt.a);
            sb.append(Long.toHexString((((long) i2) & 4294967295L) | 4294967296L));
            sb.setCharAt(sb.length() - 9, '|');
            sb.append('|');
        }

        static /* synthetic */ void a(StringBuilder sb, wnb wnb, int i, int i2) {
            String str;
            if (wxm.a(i, i2, wnb.P())) {
                StringBuilder sb2 = new StringBuilder("expected: 0 <= offset(");
                sb2.append(i);
                sb2.append(") <= offset + length(");
                sb2.append(i2);
                sb2.append(") <= buf.capacity(");
                sb2.append(wnb.P());
                sb2.append(')');
                throw new IndexOutOfBoundsException(sb2.toString());
            } else if (i2 != 0) {
                StringBuilder sb3 = new StringBuilder("         +-------------------------------------------------+");
                sb3.append(wxt.a);
                sb3.append("         |  0  1  2  3  4  5  6  7  8  9  a  b  c  d  e  f |");
                sb3.append(wxt.a);
                String str2 = "+--------+-------------------------------------------------+----------------+";
                sb3.append(str2);
                sb.append(sb3.toString());
                int i3 = i2 >>> 4;
                int i4 = i2 & 15;
                int i5 = 0;
                while (true) {
                    str = " |";
                    if (i5 >= i3) {
                        break;
                    }
                    int i6 = (i5 << 4) + i;
                    a(sb, i5, i6);
                    int i7 = i6 + 16;
                    for (int i8 = i6; i8 < i7; i8++) {
                        sb.append(e[wnb.g(i8)]);
                    }
                    sb.append(str);
                    while (i6 < i7) {
                        sb.append(a[wnb.g(i6)]);
                        i6++;
                    }
                    sb.append('|');
                    i5++;
                }
                if (i4 != 0) {
                    int i9 = (i3 << 4) + i;
                    a(sb, i3, i9);
                    int i10 = i9 + i4;
                    for (int i11 = i9; i11 < i10; i11++) {
                        sb.append(e[wnb.g(i11)]);
                    }
                    sb.append(c[i4]);
                    sb.append(str);
                    while (i9 < i10) {
                        sb.append(a[wnb.g(i9)]);
                        i9++;
                    }
                    sb.append(f[i4]);
                    sb.append('|');
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(wxt.a);
                sb4.append(str2);
                sb.append(sb4.toString());
            }
        }
    }

    /* renamed from: wng$b */
    static final class b extends woe {
        private static final Recycler<b> e = new Recycler<b>() {
            public final /* synthetic */ Object a(io.netty.util.Recycler.b bVar) {
                return new b(bVar, 0);
            }
        };
        private final io.netty.util.Recycler.b<b> g;

        private b(io.netty.util.Recycler.b<b> bVar) {
            super((wnc) wod.b, 256, Integer.MAX_VALUE);
            this.g = bVar;
        }

        /* synthetic */ b(io.netty.util.Recycler.b bVar, byte b) {
            this(bVar);
        }

        static b M() {
            b bVar = (b) e.a();
            bVar.f = 1;
            return bVar;
        }

        /* access modifiers changed from: protected */
        public final void aX_() {
            if (P() > wng.e) {
                super.aX_();
                return;
            }
            e();
            this.g.a(this);
        }
    }

    /* renamed from: wng$c */
    static final class c extends woi {
        private static final Recycler<c> g = new Recycler<c>() {
            public final /* synthetic */ Object a(io.netty.util.Recycler.b bVar) {
                return new c(bVar, 0);
            }
        };
        private final io.netty.util.Recycler.b<c> h;

        private c(io.netty.util.Recycler.b<c> bVar) {
            super((wnc) wod.b, 256, Integer.MAX_VALUE);
            this.h = bVar;
        }

        /* synthetic */ c(io.netty.util.Recycler.b bVar, byte b) {
            this(bVar);
        }

        static c M() {
            c cVar = (c) g.a();
            cVar.f = 1;
            return cVar;
        }

        /* access modifiers changed from: protected */
        public final void aX_() {
            if (P() > wng.e) {
                super.aX_();
                return;
            }
            e();
            this.h.a(this);
        }
    }

    static {
        wnc wnc;
        wvh.a(wvh.a).maxBytesPerChar();
        String str = "unpooled";
        String str2 = "pooled";
        String trim = wxu.a("io.netty.allocator.type", PlatformDependent.a() ? str : str2).toLowerCase(Locale.US).trim();
        String str3 = "-Dio.netty.allocator.type: {}";
        if (str.equals(trim)) {
            wnc = wod.b;
            b.b(str3, (Object) trim);
        } else if (str2.equals(trim)) {
            wnc = wnr.b;
            b.b(str3, (Object) trim);
        } else {
            wnc = wnr.b;
            b.b("-Dio.netty.allocator.type: pooled (unknown: {})", (Object) trim);
        }
        a = wnc;
        b.b("-Dio.netty.threadLocalDirectBufferSize: {}", (Object) Integer.valueOf(e));
        b.b("-Dio.netty.maxThreadLocalCharBufferSize: {}", (Object) Integer.valueOf(d));
        new wvg() {
            public final boolean a(byte b) {
                return b >= 0;
            }
        };
    }

    private wng() {
    }

    public static int a(int i) {
        return Integer.reverseBytes(i);
    }

    public static long a(long j) {
        return Long.reverseBytes(j);
    }

    public static String a(wnb wnb) {
        return a.a(wnb, wnb.c(), wnb.g());
    }

    static String a(wnb wnb, int i, int i2, Charset charset) {
        if (i2 == 0) {
            return "";
        }
        CharsetDecoder b2 = wvh.b(charset);
        double d2 = (double) i2;
        double maxCharsPerByte = (double) b2.maxCharsPerByte();
        Double.isNaN(d2);
        Double.isNaN(maxCharsPerByte);
        int i3 = (int) (d2 * maxCharsPerByte);
        CharBuffer charBuffer = (CharBuffer) c.a(wxi.b());
        if (charBuffer.length() < i3) {
            charBuffer = CharBuffer.allocate(i3);
            if (i3 <= d) {
                wwg<CharBuffer> wwg = c;
                if (charBuffer != wxi.a) {
                    wwg.a(wxi.b(), charBuffer);
                } else {
                    wwg.b(wxi.a());
                }
            }
        } else {
            charBuffer.clear();
        }
        if (wnb.J() == 1) {
            a(b2, wnb.n(i, i2), charBuffer);
        } else {
            wnb c2 = wnb.D().c(i2);
            try {
                c2.a(wnb, i, i2);
                a(b2, c2.n(0, i2), charBuffer);
            } finally {
                c2.B();
            }
        }
        return charBuffer.flip().toString();
    }

    public static String a(byte[] bArr, int i, int i2) {
        return a.a(bArr, 24, 4);
    }

    public static wnb a() {
        if (e <= 0) {
            return null;
        }
        return PlatformDependent.e() ? c.M() : b.M();
    }

    static wnb a(wnc wnc, boolean z, CharBuffer charBuffer, Charset charset, int i) {
        CharsetEncoder a2 = wvh.a(charset);
        double remaining = (double) charBuffer.remaining();
        double maxBytesPerChar = (double) a2.maxBytesPerChar();
        Double.isNaN(remaining);
        Double.isNaN(maxBytesPerChar);
        int i2 = (int) (remaining * maxBytesPerChar);
        wnb c2 = wnc.c(i2);
        try {
            ByteBuffer n = c2.n(0, i2);
            int position = n.position();
            CoderResult encode = a2.encode(charBuffer, n, true);
            if (!encode.isUnderflow()) {
                encode.throwException();
            }
            CoderResult flush = a2.flush(n);
            if (!flush.isUnderflow()) {
                flush.throwException();
            }
            c2.b((c2.d() + n.position()) - position);
            return c2;
        } catch (CharacterCodingException e2) {
            throw new IllegalStateException(e2);
        } catch (Throwable th) {
            c2.B();
            throw th;
        }
    }

    public static short a(short s) {
        return Short.reverseBytes(s);
    }

    public static void a(StringBuilder sb, wnb wnb) {
        a.a(sb, wnb, wnb.c(), wnb.g());
    }

    private static void a(CharsetDecoder charsetDecoder, ByteBuffer byteBuffer, CharBuffer charBuffer) {
        try {
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, true);
            if (!decode.isUnderflow()) {
                decode.throwException();
            }
            CoderResult flush = charsetDecoder.flush(charBuffer);
            if (!flush.isUnderflow()) {
                flush.throwException();
            }
        } catch (CharacterCodingException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void a(wvc wvc, int i, wnb wnb, int i2) {
        if (!wxm.a(i, i2, wvc.length())) {
            ((wnb) wxq.a(wnb, "dst")).b(wvc.a, i + wvc.b, i2);
            return;
        }
        StringBuilder sb = new StringBuilder("expected: 0 <= srcIdx(");
        sb.append(i);
        sb.append(") <= srcIdx + length(");
        sb.append(i2);
        sb.append(") <= srcLen(");
        sb.append(wvc.length());
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static void a(wvc wvc, int i, wnb wnb, int i2, int i3) {
        if (!wxm.a(0, i3, wvc.length())) {
            ((wnb) wxq.a(wnb, "dst")).b(i2, wvc.a, wvc.b + 0, i3);
            return;
        }
        StringBuilder sb = new StringBuilder("expected: 0 <= srcIdx(");
        sb.append(0);
        sb.append(") <= srcIdx + length(");
        sb.append(i3);
        sb.append(") <= srcLen(");
        sb.append(wvc.length());
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static boolean a(wnb wnb, wnb wnb2) {
        int g = wnb.g();
        if (g != wnb2.g()) {
            return false;
        }
        int c2 = wnb.c();
        int c3 = wnb2.c();
        if (c2 < 0 || c3 < 0 || g < 0) {
            throw new IllegalArgumentException("All indexes and lengths must be non-negative");
        } else if (wnb.d() - g < c2 || wnb2.d() - g < c3) {
            return false;
        } else {
            int i = g >>> 3;
            if (wnb.E() == wnb2.E()) {
                while (i > 0) {
                    if (wnb.s(c2) != wnb2.s(c3)) {
                        return false;
                    }
                    c2 += 8;
                    c3 += 8;
                    i--;
                }
            } else {
                while (i > 0) {
                    if (wnb.s(c2) != Long.reverseBytes(wnb2.s(c3))) {
                        return false;
                    }
                    c2 += 8;
                    c3 += 8;
                    i--;
                }
            }
            for (int i2 = g & 7; i2 > 0; i2--) {
                if (wnb.e(c2) != wnb2.e(c3)) {
                    return false;
                }
                c2++;
                c3++;
            }
            return true;
        }
    }

    public static int b(wnb wnb) {
        int i;
        int i2;
        int g = wnb.g();
        int i3 = g >>> 2;
        int i4 = g & 3;
        int c2 = wnb.c();
        if (wnb.E() == ByteOrder.BIG_ENDIAN) {
            i = c2;
            i2 = 1;
            while (i3 > 0) {
                i2 = (i2 * 31) + wnb.m(i);
                i += 4;
                i3--;
            }
        } else {
            int i5 = c2;
            int i6 = 1;
            while (i3 > 0) {
                i6 = (i2 * 31) + Integer.reverseBytes(wnb.m(i));
                i5 = i + 4;
                i3--;
            }
        }
        while (i4 > 0) {
            i2 = (i2 * 31) + wnb.e(i);
            i4--;
            i++;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public static int b(wnb wnb, wnb wnb2) {
        long j;
        wnb wnb3 = wnb;
        wnb wnb4 = wnb2;
        int g = wnb.g();
        int g2 = wnb2.g();
        int min = Math.min(g, g2);
        int i = min >>> 2;
        int i2 = min & 3;
        int c2 = wnb.c();
        int c3 = wnb2.c();
        if (i > 0) {
            boolean z = wnb.E() == ByteOrder.BIG_ENDIAN;
            int i3 = i << 2;
            if (wnb.E() != wnb2.E()) {
                if (!z) {
                    int i4 = c2 + i3;
                    int i5 = c2;
                    int i6 = c3;
                    while (true) {
                        if (i5 >= i4) {
                            break;
                        }
                        j = wnb3.r(i5) - wnb4.q(i6);
                        if (j != 0) {
                            break;
                        }
                        i5 += 4;
                        i6 += 4;
                    }
                } else {
                    int i7 = c2 + i3;
                    int i8 = c2;
                    int i9 = c3;
                    while (true) {
                        if (i8 >= i7) {
                            break;
                        }
                        j = wnb3.q(i8) - wnb4.r(i9);
                        if (j != 0) {
                            break;
                        }
                        i8 += 4;
                        i9 += 4;
                    }
                }
            } else if (!z) {
                int i10 = c2 + i3;
                int i11 = c2;
                int i12 = c3;
                while (true) {
                    if (i11 >= i10) {
                        break;
                    }
                    j = wnb3.r(i11) - wnb4.r(i12);
                    if (j != 0) {
                        break;
                    }
                    i11 += 4;
                    i12 += 4;
                }
            } else {
                int i13 = c2 + i3;
                int i14 = c2;
                int i15 = c3;
                while (true) {
                    if (i14 >= i13) {
                        break;
                    }
                    j = wnb3.q(i14) - wnb4.q(i15);
                    if (j != 0) {
                        break;
                    }
                    i14 += 4;
                    i15 += 4;
                }
            }
            j = 0;
            if (j != 0) {
                return (int) Math.min(2147483647L, j);
            }
            c2 += i3;
            c3 += i3;
        }
        int i16 = i2 + c2;
        while (c2 < i16) {
            int g3 = wnb3.g(c2) - wnb4.g(c3);
            if (g3 != 0) {
                return g3;
            }
            c2++;
            c3++;
        }
        return g - g2;
    }
}
