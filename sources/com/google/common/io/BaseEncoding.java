package com.google.common.io;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

public abstract class BaseEncoding {
    private static final BaseEncoding a;
    private static final BaseEncoding b;
    private static final BaseEncoding c = new b("base16()", "0123456789ABCDEF");

    public static final class DecodingException extends IOException {
        DecodingException(String str) {
            super(str);
        }
    }

    static final class a {
        final String a;
        final char[] b;
        final int c;
        final int d;
        final int e;
        final int f;
        final byte[] g;
        private final boolean[] h;

        a(String str, char[] cArr) {
            int i;
            this.a = (String) fay.a(str);
            this.b = (char[]) fay.a(cArr);
            try {
                int length = cArr.length;
                RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                String str2 = "x";
                if (length > 0) {
                    switch (AnonymousClass1.a[roundingMode.ordinal()]) {
                        case 1:
                            fdx.a((length > 0) & (((length + -1) & length) == 0));
                            break;
                        case 2:
                        case 3:
                            break;
                        case 4:
                        case 5:
                            i = 32 - Integer.numberOfLeadingZeros(length - 1);
                            break;
                        case 6:
                        case 7:
                        case 8:
                            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length);
                            i = (31 - numberOfLeadingZeros) + (((((-1257966797 >>> numberOfLeadingZeros) - length) ^ -1) ^ -1) >>> 31);
                            break;
                        default:
                            throw new AssertionError();
                    }
                    i = 31 - Integer.numberOfLeadingZeros(length);
                    this.d = i;
                    int min = Math.min(8, Integer.lowestOneBit(this.d));
                    try {
                        this.e = 8 / min;
                        this.f = this.d / min;
                        this.c = cArr.length - 1;
                        byte[] bArr = new byte[128];
                        Arrays.fill(bArr, -1);
                        for (int i2 = 0; i2 < cArr.length; i2++) {
                            char c2 = cArr[i2];
                            fay.a(c2 < 128, "Non-ASCII character: %s", c2);
                            fay.a(bArr[c2] == -1, "Duplicate character: %s", c2);
                            bArr[c2] = (byte) i2;
                        }
                        this.g = bArr;
                        boolean[] zArr = new boolean[this.e];
                        for (int i3 = 0; i3 < this.f; i3++) {
                            zArr[fdw.a(i3 << 3, this.d, RoundingMode.CEILING)] = true;
                        }
                        this.h = zArr;
                    } catch (ArithmeticException e2) {
                        StringBuilder sb = new StringBuilder("Illegal alphabet ");
                        sb.append(new String(cArr));
                        throw new IllegalArgumentException(sb.toString(), e2);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(" (");
                    sb2.append(length);
                    sb2.append(") must be > 0");
                    throw new IllegalArgumentException(sb2.toString());
                }
            } catch (ArithmeticException e3) {
                StringBuilder sb3 = new StringBuilder("Illegal alphabet length ");
                sb3.append(cArr.length);
                throw new IllegalArgumentException(sb3.toString(), e3);
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(int i) {
            return this.h[i % this.e];
        }

        /* access modifiers changed from: 0000 */
        public final int a(char c2) {
            String str = "Unrecognized character: 0x";
            if (c2 <= 127) {
                byte b2 = this.g[c2];
                if (b2 != -1) {
                    return b2;
                }
                if (c2 <= ' ' || c2 == 127) {
                    StringBuilder sb = new StringBuilder(str);
                    sb.append(Integer.toHexString(c2));
                    throw new DecodingException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder("Unrecognized character: ");
                sb2.append(c2);
                throw new DecodingException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(str);
            sb3.append(Integer.toHexString(c2));
            throw new DecodingException(sb3.toString());
        }

        public final String toString() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return Arrays.equals(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.b);
        }
    }

    static final class b extends d {
        private char[] b;

        b(String str, String str2) {
            this(new a(str, str2.toCharArray()));
        }

        private b(a aVar) {
            super(aVar, null);
            this.b = new char[512];
            fay.a(aVar.b.length == 16);
            for (int i = 0; i < 256; i++) {
                this.b[i] = aVar.b[i >>> 4];
                this.b[i | 256] = aVar.b[i & 15];
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(Appendable appendable, byte[] bArr, int i, int i2) {
            fay.a(appendable);
            fay.a(i, i + i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                byte b2 = bArr[i + i3] & 255;
                appendable.append(this.b[b2]);
                appendable.append(this.b[b2 | 256]);
            }
        }

        /* access modifiers changed from: 0000 */
        public final int a(byte[] bArr, CharSequence charSequence) {
            fay.a(bArr);
            if (charSequence.length() % 2 != 1) {
                int i = 0;
                int i2 = 0;
                while (i < charSequence.length()) {
                    int i3 = i2 + 1;
                    bArr[i2] = (byte) ((this.a.a(charSequence.charAt(i)) << 4) | this.a.a(charSequence.charAt(i + 1)));
                    i += 2;
                    i2 = i3;
                }
                return i2;
            }
            StringBuilder sb = new StringBuilder("Invalid input length ");
            sb.append(charSequence.length());
            throw new DecodingException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        public final BaseEncoding a(a aVar, Character ch) {
            return new b(aVar);
        }
    }

    static final class c extends d {
        c(String str, String str2, Character ch) {
            this(new a(str, str2.toCharArray()), ch);
        }

        private c(a aVar, Character ch) {
            super(aVar, ch);
            fay.a(aVar.b.length == 64);
        }

        /* access modifiers changed from: 0000 */
        public final void a(Appendable appendable, byte[] bArr, int i, int i2) {
            fay.a(appendable);
            int i3 = i + i2;
            fay.a(i, i3, bArr.length);
            while (i2 >= 3) {
                int i4 = i + 1;
                int i5 = i4 + 1;
                byte b = ((bArr[i] & 255) << 16) | ((bArr[i4] & 255) << 8);
                int i6 = i5 + 1;
                byte b2 = b | (bArr[i5] & 255);
                appendable.append(this.a.b[b2 >>> 18]);
                appendable.append(this.a.b[(b2 >>> 12) & 63]);
                appendable.append(this.a.b[(b2 >>> 6) & 63]);
                appendable.append(this.a.b[b2 & 63]);
                i2 -= 3;
                i = i6;
            }
            if (i < i3) {
                b(appendable, bArr, i, i3 - i);
            }
        }

        /* access modifiers changed from: 0000 */
        public final int a(byte[] bArr, CharSequence charSequence) {
            fay.a(bArr);
            CharSequence b = b(charSequence);
            if (this.a.a(b.length())) {
                int i = 0;
                int i2 = 0;
                while (i < b.length()) {
                    int i3 = i + 1;
                    int i4 = i3 + 1;
                    int a = (this.a.a(b.charAt(i)) << 18) | (this.a.a(b.charAt(i3)) << 12);
                    int i5 = i2 + 1;
                    bArr[i2] = (byte) (a >>> 16);
                    if (i4 < b.length()) {
                        int i6 = i4 + 1;
                        int a2 = a | (this.a.a(b.charAt(i4)) << 6);
                        i2 = i5 + 1;
                        bArr[i5] = (byte) (a2 >>> 8);
                        if (i6 < b.length()) {
                            i4 = i6 + 1;
                            i5 = i2 + 1;
                            bArr[i2] = (byte) (a2 | this.a.a(b.charAt(i6)));
                        } else {
                            i = i6;
                        }
                    }
                    i2 = i5;
                    i = i4;
                }
                return i2;
            }
            StringBuilder sb = new StringBuilder("Invalid input length ");
            sb.append(b.length());
            throw new DecodingException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        public final BaseEncoding a(a aVar, Character ch) {
            return new c(aVar, ch);
        }
    }

    static class d extends BaseEncoding {
        final a a;
        private Character b;
        private transient BaseEncoding c;

        d(String str, String str2, Character ch) {
            this(new a(str, str2.toCharArray()), ch);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
            if ((r2 < 128 && r5.g[r2] != -1) == false) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        d(com.google.common.io.BaseEncoding.a r5, java.lang.Character r6) {
            /*
                r4 = this;
                r4.<init>()
                java.lang.Object r0 = defpackage.fay.a(r5)
                com.google.common.io.BaseEncoding$a r0 = (com.google.common.io.BaseEncoding.a) r0
                r4.a = r0
                r0 = 0
                r1 = 1
                if (r6 == 0) goto L_0x0023
                char r2 = r6.charValue()
                r3 = 128(0x80, float:1.794E-43)
                if (r2 >= r3) goto L_0x0020
                byte[] r5 = r5.g
                byte r5 = r5[r2]
                r2 = -1
                if (r5 == r2) goto L_0x0020
                r5 = 1
                goto L_0x0021
            L_0x0020:
                r5 = 0
            L_0x0021:
                if (r5 != 0) goto L_0x0024
            L_0x0023:
                r0 = 1
            L_0x0024:
                java.lang.String r5 = "Padding character %s was already in alphabet"
                defpackage.fay.a(r0, r5, r6)
                r4.b = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.BaseEncoding.d.<init>(com.google.common.io.BaseEncoding$a, java.lang.Character):void");
        }

        /* access modifiers changed from: 0000 */
        public final int a(int i) {
            return this.a.e * fdw.a(i, this.a.f, RoundingMode.CEILING);
        }

        /* access modifiers changed from: 0000 */
        public void a(Appendable appendable, byte[] bArr, int i, int i2) {
            fay.a(appendable);
            fay.a(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                b(appendable, bArr, i + i3, Math.min(this.a.f, i2 - i3));
                i3 += this.a.f;
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(Appendable appendable, byte[] bArr, int i, int i2) {
            fay.a(appendable);
            fay.a(i, i + i2, bArr.length);
            int i3 = 0;
            fay.a(i2 <= this.a.f);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | ((long) (bArr[i + i4] & 255))) << 8;
            }
            int i5 = ((i2 + 1) << 3) - this.a.d;
            while (i3 < (i2 << 3)) {
                appendable.append(this.a.b[((int) (j >>> (i5 - i3))) & this.a.c]);
                i3 += this.a.d;
            }
            if (this.b != null) {
                while (i3 < (this.a.f << 3)) {
                    appendable.append(this.b.charValue());
                    i3 += this.a.d;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final int b(int i) {
            return (int) (((((long) this.a.d) * ((long) i)) + 7) / 8);
        }

        /* access modifiers changed from: 0000 */
        public final CharSequence b(CharSequence charSequence) {
            fay.a(charSequence);
            Character ch = this.b;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        /* access modifiers changed from: 0000 */
        public int a(byte[] bArr, CharSequence charSequence) {
            fay.a(bArr);
            CharSequence b2 = b(charSequence);
            if (this.a.a(b2.length())) {
                int i = 0;
                int i2 = 0;
                while (i < b2.length()) {
                    long j = 0;
                    int i3 = 0;
                    for (int i4 = 0; i4 < this.a.e; i4++) {
                        j <<= this.a.d;
                        if (i + i4 < b2.length()) {
                            j |= (long) this.a.a(b2.charAt(i3 + i));
                            i3++;
                        }
                    }
                    int i5 = (this.a.f << 3) - (i3 * this.a.d);
                    int i6 = (this.a.f - 1) << 3;
                    while (i6 >= i5) {
                        int i7 = i2 + 1;
                        bArr[i2] = (byte) ((int) ((j >>> i6) & 255));
                        i6 -= 8;
                        i2 = i7;
                    }
                    i += this.a.e;
                }
                return i2;
            }
            StringBuilder sb = new StringBuilder("Invalid input length ");
            sb.append(b2.length());
            throw new DecodingException(sb.toString());
        }

        public final BaseEncoding a() {
            return this.b == null ? this : a(this.a, (Character) null);
        }

        public final BaseEncoding b() {
            boolean z;
            boolean z2;
            BaseEncoding baseEncoding = this.c;
            if (baseEncoding == 0) {
                a aVar = this.a;
                char[] cArr = aVar.b;
                int length = cArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else if (fap.a(cArr[i])) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    char[] cArr2 = aVar.b;
                    int length2 = cArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            z2 = false;
                            break;
                        }
                        char c2 = cArr2[i2];
                        if (c2 >= 'a' && c2 <= 'z') {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                    fay.b(!z2, "Cannot call lowerCase() on a mixed-case alphabet");
                    char[] cArr3 = new char[aVar.b.length];
                    for (int i3 = 0; i3 < aVar.b.length; i3++) {
                        char c3 = aVar.b[i3];
                        if (fap.a(c3)) {
                            c3 = (char) (c3 ^ ' ');
                        }
                        cArr3[i3] = c3;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(aVar.a);
                    sb.append(".lowerCase()");
                    aVar = new a(sb.toString(), cArr3);
                }
                BaseEncoding a2 = aVar == this.a ? this : a(aVar, this.b);
                this.c = a2;
                baseEncoding = a2;
            }
            return baseEncoding;
        }

        /* access modifiers changed from: 0000 */
        public BaseEncoding a(a aVar, Character ch) {
            return new d(aVar, ch);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.a.toString());
            if (8 % this.a.d != 0) {
                if (this.b == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.b);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.a.equals(dVar.a) && faw.a(this.b, dVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() ^ Arrays.hashCode(new Object[]{this.b});
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract int a(int i);

    /* access modifiers changed from: 0000 */
    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract BaseEncoding a();

    /* access modifiers changed from: 0000 */
    public abstract void a(Appendable appendable, byte[] bArr, int i, int i2);

    /* access modifiers changed from: 0000 */
    public abstract int b(int i);

    public abstract BaseEncoding b();

    BaseEncoding() {
    }

    public final String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private String a(byte[] bArr, int i, int i2) {
        fay.a(0, i2 + 0, bArr.length);
        StringBuilder sb = new StringBuilder(a(i2));
        try {
            a(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    public CharSequence b(CharSequence charSequence) {
        return (CharSequence) fay.a(charSequence);
    }

    static {
        Character valueOf = Character.valueOf('=');
        a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
    }

    public static BaseEncoding c() {
        return a;
    }

    public static BaseEncoding d() {
        return b;
    }

    public static BaseEncoding e() {
        return c;
    }

    public final byte[] a(CharSequence charSequence) {
        try {
            CharSequence b2 = b(charSequence);
            byte[] bArr = new byte[b(b2.length())];
            int a2 = a(bArr, b2);
            if (a2 == bArr.length) {
                return bArr;
            }
            byte[] bArr2 = new byte[a2];
            System.arraycopy(bArr, 0, bArr2, 0, a2);
            return bArr2;
        } catch (DecodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
