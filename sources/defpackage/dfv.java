package defpackage;

import com.google.android.gms.internal.ads.zzbep;

/* renamed from: dfv reason: default package */
final class dfv extends dft {
    dfv() {
    }

    private static int a(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return dfs.b(i);
        }
        if (i2 == 1) {
            return dfs.b(i, dfq.a(bArr, j));
        }
        if (i2 == 2) {
            return dfs.b(i, (int) dfq.a(bArr, j), (int) dfq.a(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    public final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        CharSequence charSequence2 = charSequence;
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        long j4 = (long) i3;
        long j5 = ((long) i4) + j4;
        int length = charSequence.length();
        String str = " at index ";
        String str2 = "Failed writing ";
        if (length > i4 || bArr2.length - i4 < i3) {
            char charAt = charSequence2.charAt(length - 1);
            int i5 = i3 + i4;
            StringBuilder sb = new StringBuilder(37);
            sb.append(str2);
            sb.append(charAt);
            sb.append(str);
            sb.append(i5);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i6 = 0;
        while (true) {
            c = 128;
            j = 1;
            if (i6 >= length) {
                break;
            }
            char charAt2 = charSequence2.charAt(i6);
            if (charAt2 >= 128) {
                break;
            }
            long j6 = 1 + j4;
            dfq.a(bArr2, j4, (byte) charAt2);
            i6++;
            j4 = j6;
        }
        if (i6 == length) {
            return (int) j4;
        }
        while (i6 < length) {
            char charAt3 = charSequence2.charAt(i6);
            if (charAt3 < c && j4 < j5) {
                long j7 = j4 + j;
                dfq.a(bArr2, j4, (byte) charAt3);
                j3 = j;
                j2 = j7;
            } else if (charAt3 < 2048 && j4 <= j5 - 2) {
                long j8 = j4 + j;
                dfq.a(bArr2, j4, (byte) ((charAt3 >>> 6) | 960));
                long j9 = j8 + j;
                dfq.a(bArr2, j8, (byte) ((charAt3 & '?') | 128));
                j2 = j9;
                j3 = j;
                i6++;
                c = 128;
                long j10 = j3;
                j4 = j2;
                j = j10;
            } else if ((charAt3 < 55296 || 57343 < charAt3) && j4 <= j5 - 3) {
                long j11 = j4 + j;
                dfq.a(bArr2, j4, (byte) ((charAt3 >>> 12) | 480));
                long j12 = j11 + j;
                dfq.a(bArr2, j11, (byte) (((charAt3 >>> 6) & 63) | 128));
                long j13 = j12 + 1;
                dfq.a(bArr2, j12, (byte) ((charAt3 & '?') | 128));
                j2 = j13;
                j3 = 1;
            } else if (j4 <= j5 - 4) {
                int i7 = i6 + 1;
                if (i7 != length) {
                    char charAt4 = charSequence2.charAt(i7);
                    if (Character.isSurrogatePair(charAt3, charAt4)) {
                        int codePoint = Character.toCodePoint(charAt3, charAt4);
                        long j14 = j4 + 1;
                        dfq.a(bArr2, j4, (byte) ((codePoint >>> 18) | 240));
                        long j15 = j14 + 1;
                        dfq.a(bArr2, j14, (byte) (((codePoint >>> 12) & 63) | 128));
                        long j16 = j15 + 1;
                        dfq.a(bArr2, j15, (byte) (((codePoint >>> 6) & 63) | 128));
                        j3 = 1;
                        j2 = j16 + 1;
                        dfq.a(bArr2, j16, (byte) ((codePoint & 63) | 128));
                        i6 = i7;
                        i6++;
                        c = 128;
                        long j102 = j3;
                        j4 = j2;
                        j = j102;
                    } else {
                        i6 = i7;
                    }
                }
                throw new zzbep(i6 - 1, length);
            } else {
                if (55296 <= charAt3 && charAt3 <= 57343) {
                    int i8 = i6 + 1;
                    if (i8 == length || !Character.isSurrogatePair(charAt3, charSequence2.charAt(i8))) {
                        throw new zzbep(i6, length);
                    }
                }
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append(str2);
                sb2.append(charAt3);
                sb2.append(str);
                sb2.append(j4);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
            i6++;
            c = 128;
            long j1022 = j3;
            j4 = j2;
            j = j1022;
        }
        return (int) j4;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b0, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(byte[] r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = r14 | r15
            int r1 = r13.length
            int r1 = r1 - r15
            r0 = r0 | r1
            r1 = 2
            r2 = 3
            r3 = 0
            if (r0 < 0) goto L_0x00b1
            long r4 = (long) r14
            long r14 = (long) r15
            long r14 = r14 - r4
            int r15 = (int) r14
            r14 = 16
            r6 = 1
            if (r15 >= r14) goto L_0x0016
            r14 = 0
            goto L_0x0028
        L_0x0016:
            r8 = r4
            r14 = 0
        L_0x0018:
            if (r14 >= r15) goto L_0x0027
            long r10 = r8 + r6
            byte r0 = defpackage.dfq.a(r13, r8)
            if (r0 >= 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            int r14 = r14 + 1
            r8 = r10
            goto L_0x0018
        L_0x0027:
            r14 = r15
        L_0x0028:
            int r15 = r15 - r14
            long r8 = (long) r14
            long r4 = r4 + r8
        L_0x002b:
            r14 = 0
        L_0x002c:
            if (r15 <= 0) goto L_0x003b
            long r8 = r4 + r6
            byte r14 = defpackage.dfq.a(r13, r4)
            if (r14 < 0) goto L_0x003a
            int r15 = r15 + -1
            r4 = r8
            goto L_0x002c
        L_0x003a:
            r4 = r8
        L_0x003b:
            if (r15 != 0) goto L_0x003e
            return r3
        L_0x003e:
            int r15 = r15 + -1
            r0 = -32
            r8 = -65
            r9 = -1
            if (r14 >= r0) goto L_0x005c
            if (r15 != 0) goto L_0x004a
            return r14
        L_0x004a:
            int r15 = r15 + -1
            r0 = -62
            if (r14 < r0) goto L_0x005b
            long r10 = r4 + r6
            byte r14 = defpackage.dfq.a(r13, r4)
            if (r14 <= r8) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r4 = r10
            goto L_0x002b
        L_0x005b:
            return r9
        L_0x005c:
            r10 = -16
            if (r14 >= r10) goto L_0x0086
            if (r15 >= r1) goto L_0x0067
            int r13 = a(r13, r14, r4, r15)
            return r13
        L_0x0067:
            int r15 = r15 + -2
            long r10 = r4 + r6
            byte r4 = defpackage.dfq.a(r13, r4)
            if (r4 > r8) goto L_0x0085
            r5 = -96
            if (r14 != r0) goto L_0x0077
            if (r4 < r5) goto L_0x0085
        L_0x0077:
            r0 = -19
            if (r14 != r0) goto L_0x007d
            if (r4 >= r5) goto L_0x0085
        L_0x007d:
            long r4 = r10 + r6
            byte r14 = defpackage.dfq.a(r13, r10)
            if (r14 <= r8) goto L_0x002b
        L_0x0085:
            return r9
        L_0x0086:
            if (r15 >= r2) goto L_0x008d
            int r13 = a(r13, r14, r4, r15)
            return r13
        L_0x008d:
            int r15 = r15 + -3
            long r10 = r4 + r6
            byte r0 = defpackage.dfq.a(r13, r4)
            if (r0 > r8) goto L_0x00b0
            int r14 = r14 << 28
            int r0 = r0 + 112
            int r14 = r14 + r0
            int r14 = r14 >> 30
            if (r14 != 0) goto L_0x00b0
            long r4 = r10 + r6
            byte r14 = defpackage.dfq.a(r13, r10)
            if (r14 > r8) goto L_0x00b0
            long r10 = r4 + r6
            byte r14 = defpackage.dfq.a(r13, r4)
            if (r14 <= r8) goto L_0x0059
        L_0x00b0:
            return r9
        L_0x00b1:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r13 = r13.length
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r2[r3] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            r14 = 1
            r2[r14] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            r2[r1] = r13
            java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r13 = java.lang.String.format(r13, r2)
            r0.<init>(r13)
            goto L_0x00d4
        L_0x00d3:
            throw r0
        L_0x00d4:
            goto L_0x00d3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfv.b(byte[], int, int):int");
    }
}
