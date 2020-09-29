package com.google.common.hash;

import java.io.Serializable;
import java.nio.charset.Charset;

final class Murmur3_32HashFunction extends fdo implements Serializable {
    static final fdr a = new Murmur3_32HashFunction(0);
    static final fdr b = new Murmur3_32HashFunction(Hashing.a);
    private static final long serialVersionUID = 0;
    private final int seed;

    static final class a extends fdp {
        private int a;
        private long b;
        private int c;
        private int d = 0;
        private boolean e = false;

        a(int i) {
            this.a = i;
        }

        private void a(int i, long j) {
            long j2 = this.b;
            long j3 = j & 4294967295L;
            int i2 = this.c;
            this.b = (j3 << i2) | j2;
            this.c = i2 + (i << 3);
            this.d += i;
            if (this.c >= 32) {
                this.a = Murmur3_32HashFunction.c(this.a, Murmur3_32HashFunction.d((int) this.b));
                this.b >>>= 32;
                this.c -= 32;
            }
        }

        public final fds b(byte b2) {
            a(1, (long) (b2 & 255));
            return this;
        }

        public final fds b(byte[] bArr, int i, int i2) {
            fay.a(i, i + i2, bArr.length);
            int i3 = 0;
            while (true) {
                int i4 = i3 + 4;
                if (i4 > i2) {
                    break;
                }
                a(4, (long) Murmur3_32HashFunction.b(bArr, i3 + i));
                i3 = i4;
            }
            while (i3 < i2) {
                b(bArr[i + i3]);
                i3++;
            }
            return this;
        }

        public final fds a(char c2) {
            a(2, (long) c2);
            return this;
        }

        public final fds a(CharSequence charSequence, Charset charset) {
            if (!far.c.equals(charset)) {
                return super.a(charSequence, charset);
            }
            int length = charSequence.length();
            int i = 0;
            while (true) {
                int i2 = i + 4;
                if (i2 > length) {
                    break;
                }
                char charAt = charSequence.charAt(i);
                char charAt2 = charSequence.charAt(i + 1);
                char charAt3 = charSequence.charAt(i + 2);
                char charAt4 = charSequence.charAt(i + 3);
                if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                    break;
                }
                a(4, (long) ((charAt2 << 8) | charAt | (charAt3 << 16) | (charAt4 << 24)));
                i = i2;
            }
            while (i < length) {
                char charAt5 = charSequence.charAt(i);
                if (charAt5 < 128) {
                    a(1, (long) charAt5);
                } else if (charAt5 < 2048) {
                    a(2, Murmur3_32HashFunction.d(charAt5));
                } else if (charAt5 < 55296 || charAt5 > 57343) {
                    a(3, Murmur3_32HashFunction.c(charAt5));
                } else {
                    int codePointAt = Character.codePointAt(charSequence, i);
                    if (codePointAt == charAt5) {
                        a(charSequence.subSequence(i, length).toString().getBytes(charset));
                        return this;
                    }
                    i++;
                    a(4, Murmur3_32HashFunction.e(codePointAt));
                }
                i++;
            }
            return this;
        }

        public final HashCode a() {
            fay.b(!this.e);
            this.e = true;
            this.a ^= Murmur3_32HashFunction.d((int) this.b);
            return Murmur3_32HashFunction.d(this.a, this.d);
        }
    }

    /* access modifiers changed from: private */
    public static long c(char c) {
        return (long) ((((c & '?') | 128) << 16) | (((c >>> 12) | 480) & 255) | ((((c >>> 6) & 63) | 128) << 8));
    }

    /* access modifiers changed from: private */
    public static long d(char c) {
        return (long) ((((c & '?') | 128) << 8) | (((c >>> 6) | 960) & 255));
    }

    /* access modifiers changed from: private */
    public static long e(int i) {
        return ((((long) (i >>> 18)) | 240) & 255) | ((((long) ((i >>> 12) & 63)) | 128) << 8) | ((((long) ((i >>> 6) & 63)) | 128) << 16) | ((((long) (i & 63)) | 128) << 24);
    }

    public final int b() {
        return 32;
    }

    private Murmur3_32HashFunction(int i) {
        this.seed = i;
    }

    public final fds a() {
        return new a(this.seed);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Hashing.murmur3_32(");
        sb.append(this.seed);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Murmur3_32HashFunction) {
            if (this.seed == ((Murmur3_32HashFunction) obj).seed) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.seed;
    }

    public final HashCode a(CharSequence charSequence) {
        int i = this.seed;
        for (int i2 = 1; i2 < charSequence.length(); i2 += 2) {
            i = c(i, d((int) charSequence.charAt(i2 - 1) | (charSequence.charAt(i2) << 16)));
        }
        if ((charSequence.length() & 1) == 1) {
            i ^= d((int) charSequence.charAt(charSequence.length() - 1));
        }
        return d(i, charSequence.length() * 2);
    }

    public final HashCode a(CharSequence charSequence, Charset charset) {
        int i;
        if (!far.c.equals(charset)) {
            return a(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int i2 = 0;
        int i3 = this.seed;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i4 + 4;
            if (i6 > length) {
                break;
            }
            char charAt = charSequence.charAt(i4);
            char charAt2 = charSequence.charAt(i4 + 1);
            char charAt3 = charSequence.charAt(i4 + 2);
            char charAt4 = charSequence.charAt(i4 + 3);
            if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                break;
            }
            i3 = c(i3, d((int) (charAt2 << 8) | charAt | (charAt3 << 16) | (charAt4 << 24)));
            i5 = i + 4;
            i4 = i6;
        }
        long j = 0;
        while (i4 < length) {
            char charAt5 = charSequence.charAt(i4);
            if (charAt5 < 128) {
                j |= ((long) charAt5) << i2;
                i2 += 8;
                i++;
            } else if (charAt5 < 2048) {
                j |= d(charAt5) << i2;
                i2 += 16;
                i += 2;
            } else if (charAt5 < 55296 || charAt5 > 57343) {
                j |= c(charAt5) << i2;
                i2 += 24;
                i += 3;
            } else {
                int codePointAt = Character.codePointAt(charSequence, i4);
                if (codePointAt == charAt5) {
                    return a(charSequence.toString().getBytes(charset));
                }
                i4++;
                j |= e(codePointAt) << i2;
                i += 4;
            }
            if (i2 >= 32) {
                i3 = c(i3, d((int) j));
                j >>>= 32;
                i2 -= 32;
            }
            i4++;
        }
        return d(d((int) j) ^ i3, i);
    }

    public final HashCode a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        fay.a(0, i2 + 0, bArr.length);
        int i4 = this.seed;
        int i5 = 0;
        while (true) {
            int i6 = i5 + 4;
            if (i6 > i2) {
                break;
            }
            i4 = c(i4, d(b(bArr, i5 + 0)));
            i5 = i6;
        }
        int i7 = 0;
        while (i5 < i2) {
            i3 ^= (bArr[i5 + 0] & 255) << i7;
            i5++;
            i7 += 8;
        }
        return d(d(i3) ^ i4, i2);
    }

    /* access modifiers changed from: private */
    public static int b(byte[] bArr, int i) {
        return feb.a(bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
    }

    /* access modifiers changed from: private */
    public static int d(int i) {
        return Integer.rotateLeft(i * -862048943, 15) * 461845907;
    }

    /* access modifiers changed from: private */
    public static int c(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    /* access modifiers changed from: private */
    public static HashCode d(int i, int i2) {
        int i3 = i ^ i2;
        int i4 = (i3 ^ (i3 >>> 16)) * -2048144789;
        int i5 = (i4 ^ (i4 >>> 13)) * -1028477387;
        return HashCode.a(i5 ^ (i5 >>> 16));
    }
}
