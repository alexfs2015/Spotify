package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: bdy reason: default package */
public final class bdy {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object c = new Object();
    private static int[] d = new int[10];

    /* renamed from: bdy$a */
    public static final class a {
        public final int a;
        public final int b;
        public final boolean c;

        public a(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* renamed from: bdy$b */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final float g;
        public final boolean h;
        public final boolean i;
        public final int j;
        public final int k;
        public final int l;
        public final boolean m;

        public b(int i2, int i3, int i4, int i5, int i6, int i7, float f2, boolean z, boolean z2, int i8, int i9, int i10, boolean z3) {
            this.a = i2;
            this.b = i3;
            this.c = i4;
            this.d = i5;
            this.e = i6;
            this.f = i7;
            this.g = f2;
            this.h = z;
            this.i = z2;
            this.j = i8;
            this.k = i9;
            this.l = i10;
            this.m = z3;
        }
    }

    public static int a(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 < i - 2) {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = i;
                        break;
                    }
                }
                if (i3 < i) {
                    if (d.length <= i4) {
                        int[] iArr = d;
                        d = Arrays.copyOf(iArr, iArr.length << 1);
                    }
                    int i5 = i4 + 1;
                    d[i4] = i3;
                    i3 += 3;
                    i4 = i5;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = d[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i11 + 1;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i2 - i6);
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0096, code lost:
        r8 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(byte[] r7, int r8, int r9, boolean[] r10) {
        /*
            int r0 = r9 - r8
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            defpackage.bdl.b(r3)
            if (r0 != 0) goto L_0x000f
            return r9
        L_0x000f:
            r3 = 2
            if (r10 == 0) goto L_0x0040
            boolean r4 = r10[r1]
            if (r4 == 0) goto L_0x001c
            a(r10)
            int r8 = r8 + -3
            return r8
        L_0x001c:
            if (r0 <= r2) goto L_0x002b
            boolean r4 = r10[r2]
            if (r4 == 0) goto L_0x002b
            byte r4 = r7[r8]
            if (r4 != r2) goto L_0x002b
            a(r10)
            int r8 = r8 - r3
            return r8
        L_0x002b:
            if (r0 <= r3) goto L_0x0040
            boolean r4 = r10[r3]
            if (r4 == 0) goto L_0x0040
            byte r4 = r7[r8]
            if (r4 != 0) goto L_0x0040
            int r4 = r8 + 1
            byte r4 = r7[r4]
            if (r4 != r2) goto L_0x0040
            a(r10)
            int r8 = r8 - r2
            return r8
        L_0x0040:
            int r4 = r9 + -1
            int r8 = r8 + r3
        L_0x0043:
            if (r8 >= r4) goto L_0x0066
            byte r5 = r7[r8]
            r5 = r5 & 254(0xfe, float:3.56E-43)
            if (r5 != 0) goto L_0x0063
            int r5 = r8 + -2
            byte r6 = r7[r5]
            if (r6 != 0) goto L_0x0061
            int r6 = r8 + -1
            byte r6 = r7[r6]
            if (r6 != 0) goto L_0x0061
            byte r6 = r7[r8]
            if (r6 != r2) goto L_0x0061
            if (r10 == 0) goto L_0x0060
            a(r10)
        L_0x0060:
            return r5
        L_0x0061:
            int r8 = r8 + -2
        L_0x0063:
            int r8 = r8 + 3
            goto L_0x0043
        L_0x0066:
            if (r10 == 0) goto L_0x00ba
            if (r0 <= r3) goto L_0x007d
            int r8 = r9 + -3
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007b
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007b
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007b
            goto L_0x0096
        L_0x007b:
            r8 = 0
            goto L_0x0097
        L_0x007d:
            if (r0 != r3) goto L_0x008e
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x007b
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007b
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007b
            goto L_0x0096
        L_0x008e:
            boolean r8 = r10[r2]
            if (r8 == 0) goto L_0x007b
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007b
        L_0x0096:
            r8 = 1
        L_0x0097:
            r10[r1] = r8
            if (r0 <= r2) goto L_0x00a6
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x00b0
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00b0
            goto L_0x00ae
        L_0x00a6:
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x00b0
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00b0
        L_0x00ae:
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            r10[r2] = r8
            byte r7 = r7[r4]
            if (r7 != 0) goto L_0x00b8
            r1 = 1
        L_0x00b8:
            r10[r3] = r1
        L_0x00ba:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdy.a(byte[], int, int, boolean[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0161  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.bdy.b a(byte[] r21, int r22, int r23) {
        /*
            beb r0 = new beb
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.a(r1)
            int r3 = r0.c(r1)
            int r4 = r0.c(r1)
            int r5 = r0.c(r1)
            int r6 = r0.e()
            r7 = 3
            r9 = 1
            r10 = 100
            if (r3 == r10) goto L_0x004e
            r10 = 110(0x6e, float:1.54E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 122(0x7a, float:1.71E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 244(0xf4, float:3.42E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 44
            if (r3 == r10) goto L_0x004e
            r10 = 83
            if (r3 == r10) goto L_0x004e
            r10 = 86
            if (r3 == r10) goto L_0x004e
            r10 = 118(0x76, float:1.65E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 128(0x80, float:1.794E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 138(0x8a, float:1.93E-43)
            if (r3 != r10) goto L_0x004b
            goto L_0x004e
        L_0x004b:
            r10 = 1
            r11 = 0
            goto L_0x00a1
        L_0x004e:
            int r10 = r0.e()
            if (r10 != r7) goto L_0x0059
            boolean r11 = r0.b()
            goto L_0x005a
        L_0x0059:
            r11 = 0
        L_0x005a:
            r0.e()
            r0.e()
            r0.a()
            boolean r12 = r0.b()
            if (r12 == 0) goto L_0x00a1
            if (r10 == r7) goto L_0x006e
            r12 = 8
            goto L_0x0070
        L_0x006e:
            r12 = 12
        L_0x0070:
            r13 = 0
        L_0x0071:
            if (r13 >= r12) goto L_0x00a1
            boolean r14 = r0.b()
            if (r14 == 0) goto L_0x009e
            r14 = 6
            if (r13 >= r14) goto L_0x007f
            r14 = 16
            goto L_0x0081
        L_0x007f:
            r14 = 64
        L_0x0081:
            r15 = 0
            r16 = 8
            r17 = 8
        L_0x0086:
            if (r15 >= r14) goto L_0x009e
            if (r16 == 0) goto L_0x0096
            int r16 = r0.d()
            int r8 = r17 + r16
            int r8 = r8 + 256
            int r8 = r8 % 256
            r16 = r8
        L_0x0096:
            if (r16 != 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r17 = r16
        L_0x009b:
            int r15 = r15 + 1
            goto L_0x0086
        L_0x009e:
            int r13 = r13 + 1
            goto L_0x0071
        L_0x00a1:
            int r8 = r0.e()
            int r12 = r8 + 4
            int r13 = r0.e()
            if (r13 != 0) goto L_0x00b5
            int r8 = r0.e()
            int r8 = r8 + 4
            r14 = r8
            goto L_0x00d9
        L_0x00b5:
            if (r13 != r9) goto L_0x00d8
            boolean r8 = r0.b()
            r0.d()
            r0.d()
            int r14 = r0.e()
            long r14 = (long) r14
            r16 = r8
            r2 = 0
        L_0x00c9:
            long r7 = (long) r2
            int r17 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r17 >= 0) goto L_0x00d4
            r0.e()
            int r2 = r2 + 1
            goto L_0x00c9
        L_0x00d4:
            r15 = r16
            r14 = 0
            goto L_0x00da
        L_0x00d8:
            r14 = 0
        L_0x00d9:
            r15 = 0
        L_0x00da:
            r0.e()
            r0.a()
            int r2 = r0.e()
            int r2 = r2 + r9
            int r7 = r0.e()
            int r7 = r7 + r9
            boolean r16 = r0.b()
            r8 = 2
            int r17 = 2 - r16
            int r17 = r17 * r7
            if (r16 != 0) goto L_0x00f8
            r0.a()
        L_0x00f8:
            r0.a()
            int r2 = r2 << 4
            int r7 = r17 << 4
            boolean r17 = r0.b()
            if (r17 == 0) goto L_0x0134
            int r17 = r0.e()
            int r18 = r0.e()
            int r19 = r0.e()
            int r20 = r0.e()
            if (r10 != 0) goto L_0x011b
            int r8 = 2 - r16
            r1 = 1
            goto L_0x0128
        L_0x011b:
            r1 = 3
            if (r10 != r1) goto L_0x0120
            r1 = 1
            goto L_0x0121
        L_0x0120:
            r1 = 2
        L_0x0121:
            if (r10 != r9) goto L_0x0124
            r9 = 2
        L_0x0124:
            int r8 = 2 - r16
            int r8 = r8 * r9
        L_0x0128:
            int r17 = r17 + r18
            int r17 = r17 * r1
            int r2 = r2 - r17
            int r19 = r19 + r20
            int r19 = r19 * r8
            int r7 = r7 - r19
        L_0x0134:
            r8 = r7
            r7 = r2
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x017e
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x017e
            r2 = 8
            int r2 = r0.c(r2)
            r9 = 255(0xff, float:3.57E-43)
            if (r2 != r9) goto L_0x0161
            r9 = 16
            int r2 = r0.c(r9)
            int r0 = r0.c(r9)
            if (r2 == 0) goto L_0x015f
            if (r0 == 0) goto L_0x015f
            float r1 = (float) r2
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x015f:
            r9 = r1
            goto L_0x0180
        L_0x0161:
            r0 = 17
            if (r2 >= r0) goto L_0x016b
            float[] r0 = b
            r0 = r0[r2]
            r9 = r0
            goto L_0x0180
        L_0x016b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r9 = "Unexpected aspect_ratio_idc value: "
            r0.<init>(r9)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "NalUnitUtil"
            defpackage.bdu.c(r2, r0)
        L_0x017e:
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x0180:
            bdy$b r0 = new bdy$b
            r2 = r0
            r10 = r11
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdy.a(byte[], int, int):bdy$b");
    }

    public static void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                byte b2 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (b2 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b2 == 0) {
                    i2++;
                }
                if (b2 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean a(String str, byte b2) {
        return ("video/avc".equals(str) && (b2 & 31) == 6) || ("video/hevc".equals(str) && ((b2 & 126) >> 1) == 39);
    }

    public static int b(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static a b(byte[] bArr, int i, int i2) {
        beb beb = new beb(bArr, 3, i2);
        beb.a(8);
        int e = beb.e();
        int e2 = beb.e();
        beb.a();
        return new a(e, e2, beb.b());
    }

    public static int c(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }
}
