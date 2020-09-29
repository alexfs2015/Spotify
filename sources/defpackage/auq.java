package defpackage;

import com.google.android.exoplayer2.ParserException;

/* renamed from: auq reason: default package */
final class auq {

    /* renamed from: auq$a */
    public static final class a {
        private int a;
        private int b;
        private long[] c;
        private int d;
        private boolean e;

        public a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = jArr;
            this.d = i3;
            this.e = z;
        }
    }

    /* renamed from: auq$b */
    public static final class b {
        private String a;
        private String[] b;
        private int c;

        public b(String str, String[] strArr, int i) {
            this.a = str;
            this.b = strArr;
            this.c = i;
        }
    }

    /* renamed from: auq$c */
    public static final class c {
        public final boolean a;
        private int b;
        private int c;
        private int d;

        public c(boolean z, int i, int i2, int i3) {
            this.a = z;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    /* renamed from: auq$d */
    public static final class d {
        public final int a;
        public final long b;
        public final int c;
        public final int d;
        public final int e;
        public final byte[] f;
        private long g;
        private int h;
        private int i;
        private boolean j;

        public d(long j2, int i2, long j3, int i3, int i4, int i5, int i6, int i7, boolean z, byte[] bArr) {
            this.g = j2;
            this.a = i2;
            this.b = j3;
            this.h = i3;
            this.c = i4;
            this.i = i5;
            this.d = i6;
            this.e = i7;
            this.j = z;
            this.f = bArr;
        }
    }

    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static boolean a(int i, bdj bdj, boolean z) {
        if (bdj.b() < 7) {
            if (z) {
                return false;
            }
            StringBuilder sb = new StringBuilder("too short header: ");
            sb.append(bdj.b());
            throw new ParserException(sb.toString());
        } else if (bdj.c() != i) {
            if (z) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder("expected header type ");
            sb2.append(Integer.toHexString(i));
            throw new ParserException(sb2.toString());
        } else if (bdj.c() == 118 && bdj.c() == 111 && bdj.c() == 114 && bdj.c() == 98 && bdj.c() == 105 && bdj.c() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new ParserException("expected characters 'vorbis'");
        }
    }

    static c[] a(auo auo) {
        int a2 = auo.a(6) + 1;
        c[] cVarArr = new c[a2];
        for (int i = 0; i < a2; i++) {
            cVarArr[i] = new c(auo.a(), auo.a(16), auo.a(16), auo.a(8));
        }
        return cVarArr;
    }

    static void a(int i, auo auo) {
        int a2 = auo.a(6) + 1;
        for (int i2 = 0; i2 < a2; i2++) {
            int a3 = auo.a(16);
            if (a3 != 0) {
                StringBuilder sb = new StringBuilder("mapping type other than 0 not supported: ");
                sb.append(a3);
                bdd.d("VorbisUtil", sb.toString());
            } else {
                int a4 = auo.a() ? auo.a(4) + 1 : 1;
                if (auo.a()) {
                    int a5 = auo.a(8) + 1;
                    for (int i3 = 0; i3 < a5; i3++) {
                        int i4 = i - 1;
                        auo.b(a(i4));
                        auo.b(a(i4));
                    }
                }
                if (auo.a(2) == 0) {
                    if (a4 > 1) {
                        for (int i5 = 0; i5 < i; i5++) {
                            auo.b(4);
                        }
                    }
                    for (int i6 = 0; i6 < a4; i6++) {
                        auo.b(8);
                        auo.b(8);
                        auo.b(8);
                    }
                } else {
                    throw new ParserException("to reserved bits must be zero after mapping coupling steps");
                }
            }
        }
    }

    static void b(auo auo) {
        int a2 = auo.a(6) + 1;
        int i = 0;
        while (i < a2) {
            if (auo.a(16) <= 2) {
                auo.b(24);
                auo.b(24);
                auo.b(24);
                int a3 = auo.a(6) + 1;
                auo.b(8);
                int[] iArr = new int[a3];
                for (int i2 = 0; i2 < a3; i2++) {
                    iArr[i2] = ((auo.a() ? auo.a(5) : 0) << 3) + auo.a(3);
                }
                for (int i3 = 0; i3 < a3; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((iArr[i3] & (1 << i4)) != 0) {
                            auo.b(8);
                        }
                    }
                }
                i++;
            } else {
                throw new ParserException("residueType greater than 2 is not decodable");
            }
        }
    }

    static void c(auo auo) {
        int a2 = auo.a(6) + 1;
        for (int i = 0; i < a2; i++) {
            int a3 = auo.a(16);
            if (a3 == 0) {
                auo.b(8);
                auo.b(16);
                auo.b(16);
                auo.b(6);
                auo.b(8);
                int a4 = auo.a(4) + 1;
                for (int i2 = 0; i2 < a4; i2++) {
                    auo.b(8);
                }
            } else if (a3 == 1) {
                int a5 = auo.a(5);
                int[] iArr = new int[a5];
                int i3 = -1;
                for (int i4 = 0; i4 < a5; i4++) {
                    iArr[i4] = auo.a(4);
                    if (iArr[i4] > i3) {
                        i3 = iArr[i4];
                    }
                }
                int[] iArr2 = new int[(i3 + 1)];
                for (int i5 = 0; i5 < iArr2.length; i5++) {
                    iArr2[i5] = auo.a(3) + 1;
                    int a6 = auo.a(2);
                    if (a6 > 0) {
                        auo.b(8);
                    }
                    for (int i6 = 0; i6 < (1 << a6); i6++) {
                        auo.b(8);
                    }
                }
                auo.b(2);
                int a7 = auo.a(4);
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < a5; i9++) {
                    i7 += iArr2[iArr[i9]];
                    while (i8 < i7) {
                        auo.b(a7);
                        i8++;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder("floor type greater than 1 not decodable: ");
                sb.append(a3);
                throw new ParserException(sb.toString());
            }
        }
    }
}
