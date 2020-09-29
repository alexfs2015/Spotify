package com.google.common.hash;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class Murmur3_128HashFunction extends feg implements Serializable {
    static final fej a = new Murmur3_128HashFunction(0);
    static final fej b = new Murmur3_128HashFunction(Hashing.a);
    private static final long serialVersionUID = 0;
    private final int seed;

    static final class a extends fei {
        private long a;
        private long b;
        private int c = 0;

        a(int i) {
            super(16);
            long j = (long) i;
            this.a = j;
            this.b = j;
        }

        private static long a(long j) {
            long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
            long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
            return j3 ^ (j3 >>> 33);
        }

        private static long b(long j) {
            return Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
        }

        private static long c(long j) {
            return Long.rotateLeft(j * 5545529020109919103L, 33) * -8663945395140668459L;
        }

        public final void a(ByteBuffer byteBuffer) {
            long j = byteBuffer.getLong();
            long j2 = byteBuffer.getLong();
            this.a = b(j) ^ this.a;
            this.a = Long.rotateLeft(this.a, 27);
            long j3 = this.a;
            long j4 = this.b;
            this.a = j3 + j4;
            this.a = (this.a * 5) + 1390208809;
            this.b = c(j2) ^ j4;
            this.b = Long.rotateLeft(this.b, 31);
            this.b += this.a;
            this.b = (this.b * 5) + 944331445;
            this.c += 16;
        }

        public final HashCode b() {
            long j = this.a;
            int i = this.c;
            this.a = j ^ ((long) i);
            this.b ^= (long) i;
            long j2 = this.a;
            long j3 = this.b;
            this.a = j2 + j3;
            long j4 = this.a;
            this.b = j3 + j4;
            this.a = a(j4);
            this.b = a(this.b);
            long j5 = this.a;
            long j6 = this.b;
            this.a = j5 + j6;
            this.b = j6 + this.a;
            return HashCode.a(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.a).putLong(this.b).array());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
            r0 = r0 ^ (((long) (r12.get(11) & 255)) << 24);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
            r0 = r0 ^ (((long) (r12.get(10) & 255)) << 16);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
            r0 = r0 ^ (((long) (r12.get(9) & 255)) << 8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0076, code lost:
            r0 = r0 ^ ((long) (r12.get(8) & 255));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
            r2 = r12.getLong() ^ 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
            r0 = r0 ^ (((long) (r12.get(5) & 255)) << 40);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x009f, code lost:
            r0 = r0 ^ (((long) (r12.get(4) & 255)) << 32);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ac, code lost:
            r0 = r0 ^ (((long) (r12.get(3) & 255)) << 24);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b8, code lost:
            r0 = r0 ^ (((long) (r12.get(2) & 255)) << 16);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c4, code lost:
            r0 = r0 ^ (((long) (r12.get(1) & 255)) << 8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d0, code lost:
            r2 = ((long) (r12.get(0) & 255)) ^ r0;
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00da, code lost:
            r11.a = b(r2) ^ r11.a;
            r11.b = c(r0) ^ r11.b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ec, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
            r0 = r0 ^ (((long) (r12.get(13) & 255)) << 40);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
            r0 = r0 ^ (((long) (r12.get(12) & 255)) << 32);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(java.nio.ByteBuffer r12) {
            /*
                r11 = this;
                int r0 = r11.c
                int r1 = r12.remaining()
                int r0 = r0 + r1
                r11.c = r0
                int r0 = r12.remaining()
                r1 = 48
                r2 = 40
                r3 = 32
                r4 = 24
                r5 = 16
                r6 = 8
                r7 = 0
                switch(r0) {
                    case 1: goto L_0x00cf;
                    case 2: goto L_0x00c3;
                    case 3: goto L_0x00b7;
                    case 4: goto L_0x00ab;
                    case 5: goto L_0x009e;
                    case 6: goto L_0x0092;
                    case 7: goto L_0x0086;
                    case 8: goto L_0x007f;
                    case 9: goto L_0x0075;
                    case 10: goto L_0x0068;
                    case 11: goto L_0x005b;
                    case 12: goto L_0x004e;
                    case 13: goto L_0x0040;
                    case 14: goto L_0x0033;
                    case 15: goto L_0x0026;
                    default: goto L_0x001e;
                }
            L_0x001e:
                java.lang.AssertionError r12 = new java.lang.AssertionError
                java.lang.String r0 = "Should never get here."
                r12.<init>(r0)
                throw r12
            L_0x0026:
                r0 = 14
                byte r0 = r12.get(r0)
                r0 = r0 & 255(0xff, float:3.57E-43)
                long r9 = (long) r0
                long r0 = r9 << r1
                long r0 = r0 ^ r7
                goto L_0x0034
            L_0x0033:
                r0 = r7
            L_0x0034:
                r9 = 13
                byte r9 = r12.get(r9)
                r9 = r9 & 255(0xff, float:3.57E-43)
                long r9 = (long) r9
                long r9 = r9 << r2
                long r0 = r0 ^ r9
                goto L_0x0041
            L_0x0040:
                r0 = r7
            L_0x0041:
                r2 = 12
                byte r2 = r12.get(r2)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r9 = (long) r2
                long r2 = r9 << r3
                long r0 = r0 ^ r2
                goto L_0x004f
            L_0x004e:
                r0 = r7
            L_0x004f:
                r2 = 11
                byte r2 = r12.get(r2)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r2 = (long) r2
                long r2 = r2 << r4
                long r0 = r0 ^ r2
                goto L_0x005c
            L_0x005b:
                r0 = r7
            L_0x005c:
                r2 = 10
                byte r2 = r12.get(r2)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r2 = (long) r2
                long r2 = r2 << r5
                long r0 = r0 ^ r2
                goto L_0x0069
            L_0x0068:
                r0 = r7
            L_0x0069:
                r2 = 9
                byte r2 = r12.get(r2)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r2 = (long) r2
                long r2 = r2 << r6
                long r0 = r0 ^ r2
                goto L_0x0076
            L_0x0075:
                r0 = r7
            L_0x0076:
                byte r2 = r12.get(r6)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r2 = (long) r2
                long r0 = r0 ^ r2
                goto L_0x0080
            L_0x007f:
                r0 = r7
            L_0x0080:
                long r2 = r12.getLong()
                long r2 = r2 ^ r7
                goto L_0x00da
            L_0x0086:
                r0 = 6
                byte r0 = r12.get(r0)
                r0 = r0 & 255(0xff, float:3.57E-43)
                long r9 = (long) r0
                long r0 = r9 << r1
                long r0 = r0 ^ r7
                goto L_0x0093
            L_0x0092:
                r0 = r7
            L_0x0093:
                r9 = 5
                byte r9 = r12.get(r9)
                r9 = r9 & 255(0xff, float:3.57E-43)
                long r9 = (long) r9
                long r9 = r9 << r2
                long r0 = r0 ^ r9
                goto L_0x009f
            L_0x009e:
                r0 = r7
            L_0x009f:
                r2 = 4
                byte r2 = r12.get(r2)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r9 = (long) r2
                long r2 = r9 << r3
                long r0 = r0 ^ r2
                goto L_0x00ac
            L_0x00ab:
                r0 = r7
            L_0x00ac:
                r2 = 3
                byte r2 = r12.get(r2)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r2 = (long) r2
                long r2 = r2 << r4
                long r0 = r0 ^ r2
                goto L_0x00b8
            L_0x00b7:
                r0 = r7
            L_0x00b8:
                r2 = 2
                byte r2 = r12.get(r2)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r2 = (long) r2
                long r2 = r2 << r5
                long r0 = r0 ^ r2
                goto L_0x00c4
            L_0x00c3:
                r0 = r7
            L_0x00c4:
                r2 = 1
                byte r2 = r12.get(r2)
                r2 = r2 & 255(0xff, float:3.57E-43)
                long r2 = (long) r2
                long r2 = r2 << r6
                long r0 = r0 ^ r2
                goto L_0x00d0
            L_0x00cf:
                r0 = r7
            L_0x00d0:
                r2 = 0
                byte r12 = r12.get(r2)
                r12 = r12 & 255(0xff, float:3.57E-43)
                long r2 = (long) r12
                long r2 = r2 ^ r0
                r0 = r7
            L_0x00da:
                long r4 = r11.a
                long r2 = b(r2)
                long r2 = r2 ^ r4
                r11.a = r2
                long r2 = r11.b
                long r0 = c(r0)
                long r0 = r0 ^ r2
                r11.b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.Murmur3_128HashFunction.a.b(java.nio.ByteBuffer):void");
        }
    }

    Murmur3_128HashFunction(int i) {
        this.seed = i;
    }

    public final fek a() {
        return new a(this.seed);
    }

    public final int b() {
        return 128;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Murmur3_128HashFunction) {
            if (this.seed == ((Murmur3_128HashFunction) obj).seed) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.seed;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Hashing.murmur3_128(");
        sb.append(this.seed);
        sb.append(")");
        return sb.toString();
    }
}
