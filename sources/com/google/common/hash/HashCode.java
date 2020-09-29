package com.google.common.hash;

import java.io.Serializable;

public abstract class HashCode {
    private static final char[] a = "0123456789abcdef".toCharArray();

    static final class BytesHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final byte[] bytes;

        BytesHashCode(byte[] bArr) {
            this.bytes = (byte[]) fbp.a(bArr);
        }

        public final int a() {
            return this.bytes.length << 3;
        }

        /* access modifiers changed from: 0000 */
        public final void a(byte[] bArr, int i, int i2) {
            System.arraycopy(this.bytes, 0, bArr, i, i2);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(HashCode hashCode) {
            if (this.bytes.length != hashCode.e().length) {
                return false;
            }
            int i = 0;
            boolean z = true;
            while (true) {
                byte[] bArr = this.bytes;
                if (i >= bArr.length) {
                    return z;
                }
                z &= bArr[i] == hashCode.e()[i];
                i++;
            }
        }

        public final int b() {
            fbp.b(this.bytes.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", this.bytes.length);
            byte[] bArr = this.bytes;
            return ((bArr[3] & 255) << 24) | ((bArr[1] & 255) << 8) | (bArr[0] & 255) | ((bArr[2] & 255) << 16);
        }

        public final long c() {
            fbp.b(this.bytes.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", this.bytes.length);
            long j = (long) (this.bytes[0] & 255);
            for (int i = 1; i < Math.min(this.bytes.length, 8); i++) {
                j |= (((long) this.bytes[i]) & 255) << (i << 3);
            }
            return j;
        }

        public final byte[] d() {
            return (byte[]) this.bytes.clone();
        }

        /* access modifiers changed from: 0000 */
        public final byte[] e() {
            return this.bytes;
        }
    }

    static final class IntHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final int hash;

        IntHashCode(int i) {
            this.hash = i;
        }

        public final int a() {
            return 32;
        }

        /* access modifiers changed from: 0000 */
        public final void a(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                bArr[i + i3] = (byte) (this.hash >> (i3 << 3));
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(HashCode hashCode) {
            return this.hash == hashCode.b();
        }

        public final int b() {
            return this.hash;
        }

        public final long c() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        public final byte[] d() {
            int i = this.hash;
            return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
        }
    }

    static final class LongHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final long hash;

        LongHashCode(long j) {
            this.hash = j;
        }

        public final int a() {
            return 64;
        }

        /* access modifiers changed from: 0000 */
        public final void a(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                bArr[i + i3] = (byte) ((int) (this.hash >> (i3 << 3)));
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(HashCode hashCode) {
            return this.hash == hashCode.c();
        }

        public final int b() {
            return (int) this.hash;
        }

        public final long c() {
            return this.hash;
        }

        public final byte[] d() {
            long j = this.hash;
            return new byte[]{(byte) ((int) j), (byte) ((int) (j >> 8)), (byte) ((int) (j >> 16)), (byte) ((int) (j >> 24)), (byte) ((int) (j >> 32)), (byte) ((int) (j >> 40)), (byte) ((int) (j >> 48)), (byte) ((int) (j >> 56))};
        }
    }

    HashCode() {
    }

    private static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 'a') + 10;
        }
        StringBuilder sb = new StringBuilder("Illegal hexadecimal character: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }

    public static HashCode a(int i) {
        return new IntHashCode(i);
    }

    public static HashCode a(long j) {
        return new LongHashCode(j);
    }

    public static HashCode a(String str) {
        boolean z = true;
        fbp.a(str.length() >= 2, "input string (%s) must have at least 2 characters", (Object) str);
        if (str.length() % 2 != 0) {
            z = false;
        }
        fbp.a(z, "input string (%s) must have an even number of characters", (Object) str);
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < str.length(); i += 2) {
            bArr[i / 2] = (byte) ((a(str.charAt(i)) << 4) + a(str.charAt(i + 1)));
        }
        return a(bArr);
    }

    static HashCode a(byte[] bArr) {
        return new BytesHashCode(bArr);
    }

    public abstract int a();

    /* access modifiers changed from: 0000 */
    public abstract void a(byte[] bArr, int i, int i2);

    /* access modifiers changed from: 0000 */
    public abstract boolean a(HashCode hashCode);

    public abstract int b();

    public abstract long c();

    public abstract byte[] d();

    /* access modifiers changed from: 0000 */
    public byte[] e() {
        return d();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof HashCode) {
            HashCode hashCode = (HashCode) obj;
            if (a() == hashCode.a() && a(hashCode)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (a() >= 32) {
            return b();
        }
        byte[] e = e();
        byte b = e[0] & 255;
        for (int i = 1; i < e.length; i++) {
            b |= (e[i] & 255) << (i << 3);
        }
        return b;
    }

    public final String toString() {
        byte[] e = e();
        StringBuilder sb = new StringBuilder(e.length * 2);
        for (byte b : e) {
            sb.append(a[(b >> 4) & 15]);
            sb.append(a[b & 15]);
        }
        return sb.toString();
    }
}
