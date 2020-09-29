package com.google.common.hash;

import java.util.Arrays;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

public final class Hashing {
    static final int a = ((int) System.currentTimeMillis());

    enum ChecksumType implements fdt<Checksum> {
        CRC_32("Hashing.crc32()") {
            public final /* synthetic */ Object get() {
                return new CRC32();
            }
        },
        ADLER_32("Hashing.adler32()") {
            public final /* synthetic */ Object get() {
                return new Adler32();
            }
        };
        
        public final fdr hashFunction;

        private ChecksumType(String str) {
            this.hashFunction = new ChecksumHashFunction(this, 32, str);
        }
    }

    static final class a extends fdn {
        /* synthetic */ a(fdr[] fdrArr, byte b) {
            this(fdrArr);
        }

        private a(fdr... fdrArr) {
            super(fdrArr);
            int length = fdrArr.length;
            int i = 0;
            while (i < length) {
                fdr fdr = fdrArr[i];
                boolean z = fdr.b() % 8 == 0;
                int b = fdr.b();
                if (z) {
                    i++;
                } else {
                    throw new IllegalArgumentException(fbc.a("the number of bits (%s) in hashFunction (%s) must be divisible by 8", Integer.valueOf(b), fdr));
                }
            }
        }

        public final HashCode a(fds[] fdsArr) {
            byte[] bArr = new byte[(b() / 8)];
            int length = fdsArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                HashCode a = fdsArr[i].a();
                int[] iArr = {a.a() / 8, a.a() / 8};
                fay.a(true);
                int i3 = iArr[0];
                for (int i4 = 1; i4 < 2; i4++) {
                    if (iArr[1] < i3) {
                        i3 = iArr[1];
                    }
                }
                int i5 = i2 + i3;
                fay.a(i2, i5, bArr.length);
                a.a(bArr, i2, i3);
                i++;
                i2 = i5;
            }
            return HashCode.a(bArr);
        }

        public final int b() {
            int i = 0;
            for (fdr b : this.a) {
                i += b.b();
            }
            return i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return Arrays.equals(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.a);
        }
    }

    static class b {
        static final fdr a = new MessageDigestHashFunction("MD5", "Hashing.md5()");
    }

    static class c {
        static final fdr a = new MessageDigestHashFunction("SHA-1", "Hashing.sha1()");
    }

    public static fdr a() {
        return Murmur3_32HashFunction.a;
    }

    public static fdr b() {
        return Murmur3_128HashFunction.a;
    }

    @Deprecated
    public static fdr c() {
        return b.a;
    }

    @Deprecated
    public static fdr d() {
        return c.a;
    }

    public static fdr e() {
        return ChecksumType.CRC_32.hashFunction;
    }

    public static fdr a(int i) {
        fay.a(true, (Object) "Number of bits must be positive");
        return Murmur3_128HashFunction.b;
    }
}
