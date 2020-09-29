package com.google.protobuf;

public final class Utf8 {
    private static final a a = (fky.a() && fky.b() ? new c() : new b());

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i, int i2) {
            StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
            sb.append(i);
            sb.append(" of ");
            sb.append(i2);
            super(sb.toString());
        }
    }

    static abstract class a {
        /* access modifiers changed from: 0000 */
        public abstract int a(int i, byte[] bArr, int i2, int i3);

        /* access modifiers changed from: 0000 */
        public abstract int a(CharSequence charSequence, byte[] bArr, int i, int i2);

        a() {
        }
    }

    static final class b extends a {
        b() {
        }

        /* access modifiers changed from: 0000 */
        public final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int length = charSequence.length();
            int i4 = i2 + i;
            int i5 = 0;
            while (i5 < length) {
                int i6 = i5 + i;
                if (i6 >= i4) {
                    break;
                }
                char charAt = charSequence.charAt(i5);
                if (charAt >= 128) {
                    break;
                }
                bArr[i6] = (byte) charAt;
                i5++;
            }
            if (i5 == length) {
                return i + length;
            }
            int i7 = i + i5;
            while (i5 < length) {
                char charAt2 = charSequence.charAt(i5);
                if (charAt2 < 128 && i7 < i4) {
                    i3 = i7 + 1;
                    bArr[i7] = (byte) charAt2;
                } else if (charAt2 < 2048 && i7 <= i4 - 2) {
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                    i7 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 & '?') | 128);
                    i5++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i7 <= i4 - 3) {
                    int i9 = i7 + 1;
                    bArr[i7] = (byte) ((charAt2 >>> 12) | 480);
                    int i10 = i9 + 1;
                    bArr[i9] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i3 = i10 + 1;
                    bArr[i10] = (byte) ((charAt2 & '?') | 128);
                } else if (i7 <= i4 - 4) {
                    int i11 = i5 + 1;
                    if (i11 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i11);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i12 = i7 + 1;
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            int i13 = i12 + 1;
                            bArr[i12] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 = i14 + 1;
                            bArr[i14] = (byte) ((codePoint & 63) | 128);
                            i5 = i11;
                            i5++;
                        } else {
                            i5 = i11;
                        }
                    }
                    throw new UnpairedSurrogateException(i5 - 1, length);
                } else {
                    if (55296 <= charAt2 && charAt2 <= 57343) {
                        int i15 = i5 + 1;
                        if (i15 == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i15))) {
                            throw new UnpairedSurrogateException(i5, length);
                        }
                    }
                    StringBuilder sb = new StringBuilder("Failed writing ");
                    sb.append(charAt2);
                    sb.append(" at index ");
                    sb.append(i7);
                    throw new ArrayIndexOutOfBoundsException(sb.toString());
                }
                i7 = i3;
                i5++;
            }
            return i7;
        }

        /* access modifiers changed from: 0000 */
        public final int a(int i, byte[] bArr, int i2, int i3) {
            while (r9 < i3 && bArr[r9] >= 0) {
                i2 = r9 + 1;
            }
            if (r9 >= i3) {
                return 0;
            }
            while (r9 < i3) {
                int i4 = r9 + 1;
                byte b = bArr[r9];
                if (b < 0) {
                    if (b < -32) {
                        if (i4 >= i3) {
                            return b;
                        }
                        if (b >= -62) {
                            r9 = i4 + 1;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    } else if (b < -16) {
                        if (i4 >= i3 - 1) {
                            return Utf8.b(bArr, i4, i3);
                        }
                        int i5 = i4 + 1;
                        byte b2 = bArr[i4];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            r9 = i5 + 1;
                            if (bArr[i5] > -65) {
                            }
                        }
                        return -1;
                    } else if (i4 >= i3 - 2) {
                        return Utf8.b(bArr, i4, i3);
                    } else {
                        int i6 = i4 + 1;
                        byte b3 = bArr[i4];
                        if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                            int i7 = i6 + 1;
                            if (bArr[i6] <= -65) {
                                i4 = i7 + 1;
                                if (bArr[i7] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                r9 = i4;
            }
            return 0;
        }
    }

    static final class c extends a {
        c() {
        }

        /* access modifiers changed from: 0000 */
        public final int a(int i, byte[] bArr, int i2, int i3) {
            if ((i2 | i3 | (bArr.length - i3)) >= 0) {
                long c = fky.c() + ((long) i2);
                return a(bArr, c, (int) ((fky.c() + ((long) i3)) - c));
            }
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
        }

        /* access modifiers changed from: 0000 */
        public final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            char c;
            long j;
            long c2;
            long j2;
            long j3;
            CharSequence charSequence2 = charSequence;
            byte[] bArr2 = bArr;
            int i3 = i;
            int i4 = i2;
            long c3 = fky.c() + ((long) i3);
            long j4 = ((long) i4) + c3;
            int length = charSequence.length();
            String str = " at index ";
            String str2 = "Failed writing ";
            if (length > i4 || bArr2.length - i4 < i3) {
                StringBuilder sb = new StringBuilder(str2);
                sb.append(charSequence2.charAt(length - 1));
                sb.append(str);
                sb.append(i3 + i4);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            int i5 = 0;
            while (true) {
                c = 128;
                j = 1;
                if (i5 >= length) {
                    break;
                }
                char charAt = charSequence2.charAt(i5);
                if (charAt >= 128) {
                    break;
                }
                long j5 = 1 + c3;
                fky.a(bArr2, c3, (byte) charAt);
                i5++;
                c3 = j5;
            }
            if (i5 == length) {
                c2 = fky.c();
            } else {
                while (i5 < length) {
                    char charAt2 = charSequence2.charAt(i5);
                    if (charAt2 < c && c3 < j4) {
                        long j6 = c3 + j;
                        fky.a(bArr2, c3, (byte) charAt2);
                        j3 = j;
                        j2 = j6;
                    } else if (charAt2 < 2048 && c3 <= j4 - 2) {
                        long j7 = c3 + j;
                        fky.a(bArr2, c3, (byte) ((charAt2 >>> 6) | 960));
                        long j8 = j7 + j;
                        fky.a(bArr2, j7, (byte) ((charAt2 & '?') | 128));
                        j2 = j8;
                        j3 = j;
                        i5++;
                        c = 128;
                        long j9 = j3;
                        c3 = j2;
                        j = j9;
                    } else if ((charAt2 < 55296 || 57343 < charAt2) && c3 <= j4 - 3) {
                        long j10 = c3 + j;
                        fky.a(bArr2, c3, (byte) ((charAt2 >>> 12) | 480));
                        long j11 = j10 + j;
                        fky.a(bArr2, j10, (byte) (((charAt2 >>> 6) & 63) | 128));
                        long j12 = j11 + 1;
                        fky.a(bArr2, j11, (byte) ((charAt2 & '?') | 128));
                        j2 = j12;
                        j3 = 1;
                    } else if (c3 <= j4 - 4) {
                        int i6 = i5 + 1;
                        if (i6 != length) {
                            char charAt3 = charSequence2.charAt(i6);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                long j13 = c3 + 1;
                                fky.a(bArr2, c3, (byte) ((codePoint >>> 18) | 240));
                                long j14 = j13 + 1;
                                fky.a(bArr2, j13, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j15 = j14 + 1;
                                fky.a(bArr2, j14, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 = 1;
                                j2 = j15 + 1;
                                fky.a(bArr2, j15, (byte) ((codePoint & 63) | 128));
                                i5 = i6;
                                i5++;
                                c = 128;
                                long j92 = j3;
                                c3 = j2;
                                j = j92;
                            } else {
                                i5 = i6;
                            }
                        }
                        throw new UnpairedSurrogateException(i5 - 1, length);
                    } else {
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            int i7 = i5 + 1;
                            if (i7 == length || !Character.isSurrogatePair(charAt2, charSequence2.charAt(i7))) {
                                throw new UnpairedSurrogateException(i5, length);
                            }
                        }
                        StringBuilder sb2 = new StringBuilder(str2);
                        sb2.append(charAt2);
                        sb2.append(str);
                        sb2.append(c3);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    i5++;
                    c = 128;
                    long j922 = j3;
                    c3 = j2;
                    j = j922;
                }
                c2 = fky.c();
            }
            return (int) (c3 - c2);
        }

        private static int a(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return Utf8.b(i);
            }
            if (i2 == 1) {
                return Utf8.b(i, fky.a(bArr, j));
            }
            if (i2 == 2) {
                return Utf8.b(i, (int) fky.a(bArr, j), (int) fky.a(bArr, j + 1));
            }
            throw new AssertionError();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a1, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static int a(byte[] r17, long r18, int r20) {
            /*
                r0 = r17
                r1 = r18
                r3 = r20
                r4 = 0
                r5 = 1
                r7 = 16
                if (r3 >= r7) goto L_0x000f
                r7 = 0
                goto L_0x0042
            L_0x000f:
                int r7 = (int) r1
                r7 = r7 & 7
                r9 = r1
                r8 = r7
            L_0x0014:
                if (r8 <= 0) goto L_0x0024
                long r11 = r9 + r5
                byte r9 = defpackage.fky.a(r0, r9)
                if (r9 >= 0) goto L_0x0020
                int r7 = r7 - r8
                goto L_0x0042
            L_0x0020:
                int r8 = r8 + -1
                r9 = r11
                goto L_0x0014
            L_0x0024:
                int r7 = r3 - r7
            L_0x0026:
                r8 = 8
                if (r7 < r8) goto L_0x0040
                long r11 = defpackage.fky.b(r0, r9)
                r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r11 = r11 & r13
                r13 = 0
                int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r8 != 0) goto L_0x0040
                r11 = 8
                long r9 = r9 + r11
                int r7 = r7 + -8
                goto L_0x0026
            L_0x0040:
                int r7 = r3 - r7
            L_0x0042:
                int r3 = r3 - r7
                long r7 = (long) r7
                long r1 = r1 + r7
            L_0x0045:
                r7 = 0
            L_0x0046:
                if (r3 <= 0) goto L_0x0056
                long r7 = r1 + r5
                byte r1 = defpackage.fky.a(r0, r1)
                if (r1 < 0) goto L_0x0059
                int r3 = r3 + -1
                r15 = r7
                r7 = r1
                r1 = r15
                goto L_0x0046
            L_0x0056:
                r15 = r1
                r1 = r7
                r7 = r15
            L_0x0059:
                if (r3 != 0) goto L_0x005c
                return r4
            L_0x005c:
                int r3 = r3 + -1
                r2 = -32
                r9 = -65
                r10 = -1
                if (r1 >= r2) goto L_0x0077
                if (r3 != 0) goto L_0x0068
                return r1
            L_0x0068:
                int r3 = r3 + -1
                r2 = -62
                if (r1 < r2) goto L_0x0076
                long r1 = r7 + r5
                byte r7 = defpackage.fky.a(r0, r7)
                if (r7 <= r9) goto L_0x0045
            L_0x0076:
                return r10
            L_0x0077:
                r11 = -16
                if (r1 >= r11) goto L_0x00a2
                r11 = 2
                if (r3 >= r11) goto L_0x0083
                int r0 = a(r0, r1, r7, r3)
                return r0
            L_0x0083:
                int r3 = r3 + -2
                long r11 = r7 + r5
                byte r7 = defpackage.fky.a(r0, r7)
                if (r7 > r9) goto L_0x00a1
                r8 = -96
                if (r1 != r2) goto L_0x0093
                if (r7 < r8) goto L_0x00a1
            L_0x0093:
                r2 = -19
                if (r1 != r2) goto L_0x0099
                if (r7 >= r8) goto L_0x00a1
            L_0x0099:
                long r1 = r11 + r5
                byte r7 = defpackage.fky.a(r0, r11)
                if (r7 <= r9) goto L_0x0045
            L_0x00a1:
                return r10
            L_0x00a2:
                r2 = 3
                if (r3 >= r2) goto L_0x00aa
                int r0 = a(r0, r1, r7, r3)
                return r0
            L_0x00aa:
                int r3 = r3 + -3
                long r11 = r7 + r5
                byte r2 = defpackage.fky.a(r0, r7)
                if (r2 > r9) goto L_0x00d1
                int r1 = r1 << 28
                int r2 = r2 + 112
                int r1 = r1 + r2
                int r1 = r1 >> 30
                if (r1 != 0) goto L_0x00d1
                long r1 = r11 + r5
                byte r7 = defpackage.fky.a(r0, r11)
                if (r7 > r9) goto L_0x00d1
                long r7 = r1 + r5
                byte r1 = defpackage.fky.a(r0, r1)
                if (r1 <= r9) goto L_0x00ce
                goto L_0x00d1
            L_0x00ce:
                r1 = r7
                goto L_0x0045
            L_0x00d1:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.c.a(byte[], long, int):int");
        }
    }

    /* access modifiers changed from: private */
    public static int b(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    public static int b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    public static int b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean a(byte[] bArr, int i, int i2) {
        return a.a(0, bArr, i, i2) == 0;
    }

    static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new UnpairedSurrogateException(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    static int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return a.a(charSequence, bArr, i, i2);
    }

    static /* synthetic */ int b(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return b(b2);
        }
        if (i3 == 1) {
            return b(b2, bArr[i]);
        }
        if (i3 == 2) {
            return b((int) b2, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }
}
