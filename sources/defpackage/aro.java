package defpackage;

import com.comscore.streaming.ContentType;
import java.nio.ByteBuffer;

/* renamed from: aro reason: default package */
public final class aro {
    private static final int[] a = {1, 2, 3, 6};
    private static final int[] b = {48000, 44100, 32000};
    private static final int[] c = {24000, 22050, 16000};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, ContentType.LONG_FORM_ON_DEMAND, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: aro$a */
    public static final class a {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        private int f;

        private a(String str, int i, int i2, int i3, int i4, int i5) {
            this.a = str;
            this.f = i;
            this.c = i2;
            this.b = i3;
            this.d = i4;
            this.e = i5;
        }

        /* synthetic */ a(String str, int i, int i2, int i3, int i4, int i5, byte b2) {
            this(str, i, i2, i3, i4, i5);
        }
    }

    public static int a() {
        return 1536;
    }

    private static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = b[i];
        if (i4 == 44100) {
            return (f[i3] + (i2 % 2)) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static int a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    public static int a(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (!(((bArr[5] & 255) >> 3) == 16)) {
            return a((bArr[4] & 192) >> 6, (int) bArr[4] & 63);
        }
        return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) << 1;
    }

    public static aqv a(bea bea, String str, String str2, ast ast) {
        int i = b[(bea.c() & 192) >> 6];
        int c2 = bea.c();
        int i2 = d[(c2 & 56) >> 3];
        if ((c2 & 4) != 0) {
            i2++;
        }
        return aqv.a(str, "audio/ac3", (String) null, -1, -1, i2, i, null, ast, 0, str2);
    }

    public static a a(bdz bdz) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        bdz bdz2 = bdz;
        int b2 = bdz.b();
        bdz2.b(40);
        boolean z = bdz2.c(5) == 16;
        bdz2.a(b2);
        int i10 = -1;
        if (z) {
            bdz2.b(16);
            int c2 = bdz2.c(2);
            if (c2 == 0) {
                i10 = 0;
            } else if (c2 == 1) {
                i10 = 1;
            } else if (c2 == 2) {
                i10 = 2;
            }
            bdz2.b(3);
            int c3 = (bdz2.c(11) + 1) << 1;
            int c4 = bdz2.c(2);
            if (c4 == 3) {
                i6 = c[bdz2.c(2)];
                i8 = 3;
                i7 = 6;
            } else {
                i8 = bdz2.c(2);
                i7 = a[i8];
                i6 = b[c4];
            }
            int i11 = i7 * 256;
            int c5 = bdz2.c(3);
            boolean e2 = bdz.e();
            int i12 = d[c5] + (e2 ? 1 : 0);
            bdz2.b(10);
            if (bdz.e()) {
                bdz2.b(8);
            }
            if (c5 == 0) {
                bdz2.b(5);
                if (bdz.e()) {
                    bdz2.b(8);
                }
            }
            if (i10 == 1 && bdz.e()) {
                bdz2.b(16);
            }
            if (bdz.e()) {
                if (c5 > 2) {
                    bdz2.b(2);
                }
                if ((c5 & 1) != 0 && c5 > 2) {
                    bdz2.b(6);
                }
                if ((c5 & 4) != 0) {
                    bdz2.b(6);
                }
                if (e2 && bdz.e()) {
                    bdz2.b(5);
                }
                if (i10 == 0) {
                    if (bdz.e()) {
                        bdz2.b(6);
                    }
                    if (c5 == 0 && bdz.e()) {
                        bdz2.b(6);
                    }
                    if (bdz.e()) {
                        bdz2.b(6);
                    }
                    int c6 = bdz2.c(2);
                    if (c6 == 1) {
                        bdz2.b(5);
                    } else if (c6 == 2) {
                        bdz2.b(12);
                    } else if (c6 == 3) {
                        int c7 = bdz2.c(5);
                        if (bdz.e()) {
                            bdz2.b(5);
                            if (bdz.e()) {
                                bdz2.b(4);
                            }
                            if (bdz.e()) {
                                bdz2.b(4);
                            }
                            if (bdz.e()) {
                                bdz2.b(4);
                            }
                            if (bdz.e()) {
                                bdz2.b(4);
                            }
                            if (bdz.e()) {
                                bdz2.b(4);
                            }
                            if (bdz.e()) {
                                bdz2.b(4);
                            }
                            if (bdz.e()) {
                                bdz2.b(4);
                            }
                            if (bdz.e()) {
                                if (bdz.e()) {
                                    bdz2.b(4);
                                }
                                if (bdz.e()) {
                                    bdz2.b(4);
                                }
                            }
                        }
                        if (bdz.e()) {
                            bdz2.b(5);
                            if (bdz.e()) {
                                bdz2.b(7);
                                if (bdz.e()) {
                                    bdz2.b(8);
                                }
                            }
                        }
                        bdz2.b((c7 + 2) * 8);
                        bdz.f();
                    }
                    if (c5 < 2) {
                        if (bdz.e()) {
                            bdz2.b(14);
                        }
                        if (c5 == 0 && bdz.e()) {
                            bdz2.b(14);
                        }
                    }
                    if (bdz.e()) {
                        if (i8 == 0) {
                            bdz2.b(5);
                        } else {
                            for (int i13 = 0; i13 < i7; i13++) {
                                if (bdz.e()) {
                                    bdz2.b(5);
                                }
                            }
                        }
                    }
                }
            }
            if (bdz.e()) {
                bdz2.b(5);
                if (c5 == 2) {
                    bdz2.b(4);
                }
                if (c5 >= 6) {
                    bdz2.b(2);
                }
                if (bdz.e()) {
                    bdz2.b(8);
                }
                if (c5 == 0 && bdz.e()) {
                    bdz2.b(8);
                }
                i9 = 3;
                if (c4 < 3) {
                    bdz.d();
                }
            } else {
                i9 = 3;
            }
            if (i10 == 0 && i8 != i9) {
                bdz.d();
            }
            if (i10 == 2 && (i8 == i9 || bdz.e())) {
                bdz2.b(6);
            }
            str = (bdz.e() && bdz2.c(6) == 1 && bdz2.c(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i10;
            i2 = c3;
            i3 = i6;
            i = i11;
            i4 = i12;
        } else {
            bdz2.b(32);
            int c8 = bdz2.c(2);
            int a2 = a(c8, bdz2.c(6));
            bdz2.b(8);
            int c9 = bdz2.c(3);
            if (!((c9 & 1) == 0 || c9 == 1)) {
                bdz2.b(2);
            }
            if ((c9 & 4) != 0) {
                bdz2.b(2);
            }
            if (c9 == 2) {
                bdz2.b(2);
            }
            str = "audio/ac3";
            i2 = a2;
            i3 = b[c8];
            i4 = d[c9] + (bdz.e() ? 1 : 0);
            i5 = -1;
            i = 1536;
        }
        a aVar = new a(str, i5, i4, i3, i2, i, 0);
        return aVar;
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((byteBuffer.getInt(i + 4) & -16777217) == -1167101192) {
                return i - position;
            }
        }
        return -1;
    }

    public static int b(byte[] bArr) {
        boolean z = false;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        if ((bArr[7] & 255) == 187) {
            z = true;
        }
        return 40 << ((bArr[z ? (char) 9 : 8] >> 4) & 7);
    }

    public static aqv b(bea bea, String str, String str2, ast ast) {
        bea bea2 = bea;
        bea.d(2);
        int i = b[(bea.c() & 192) >> 6];
        int c2 = bea.c();
        int i2 = d[(c2 & 14) >> 1];
        if ((c2 & 1) != 0) {
            i2++;
        }
        if (((bea.c() & 30) >> 1) > 0 && (2 & bea.c()) != 0) {
            i2 += 2;
        }
        return aqv.a(str, (bea.b() <= 0 || (bea.c() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", (String) null, -1, -1, i2, i, null, ast, 0, str2);
    }
}
