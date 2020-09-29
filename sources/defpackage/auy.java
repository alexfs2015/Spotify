package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: auy reason: default package */
final class auy extends ave {
    bds a;
    private a d;

    /* renamed from: auy$a */
    class a implements ats, avc {
        long[] a;
        long[] b;
        long c = -1;
        private long d = -1;

        public a() {
        }

        public final long a(atl atl) {
            long j = this.d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.d = -1;
            return j2;
        }

        public final defpackage.ats.a a(long j) {
            int a2 = ben.a(this.a, auy.this.b(j), true, true);
            long a3 = auy.this.a(this.a[a2]);
            att att = new att(a3, this.c + this.b[a2]);
            if (a3 < j) {
                long[] jArr = this.a;
                if (a2 != jArr.length - 1) {
                    int i = a2 + 1;
                    return new defpackage.ats.a(att, new att(auy.this.a(jArr[i]), this.c + this.b[i]));
                }
            }
            return new defpackage.ats.a(att);
        }

        public final ats a() {
            return this;
        }

        public final long a_(long j) {
            long b2 = auy.this.b(j);
            this.d = this.a[ben.a(this.a, b2, true, true)];
            return b2;
        }

        public final long b() {
            bds bds = auy.this.a;
            return (bds.d * 1000000) / ((long) bds.a);
        }

        public final boolean l_() {
            return true;
        }
    }

    auy() {
    }

    public static boolean a(bea bea) {
        return bea.b() >= 5 && bea.c() == 127 && bea.g() == 1179402563;
    }

    private static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.a = null;
            this.d = null;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(bea bea, long j, a aVar) {
        bea bea2 = bea;
        a aVar2 = aVar;
        byte[] bArr = bea2.a;
        if (this.a == null) {
            this.a = new bds(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, bea2.c);
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            bds bds = this.a;
            aVar2.a = aqv.a((String) null, "audio/flac", (String) null, -1, bds.c * bds.a, this.a.b, this.a.a, singletonList, (ast) null, 0, (String) null);
        } else {
            if ((bArr[0] & Byte.MAX_VALUE) == 3) {
                this.d = new a();
                a aVar3 = this.d;
                bea2.d(1);
                int f = bea.f() / 18;
                aVar3.a = new long[f];
                aVar3.b = new long[f];
                for (int i = 0; i < f; i++) {
                    aVar3.a[i] = bea.k();
                    aVar3.b[i] = bea.k();
                    bea2.d(2);
                }
            } else if (a(bArr)) {
                a aVar4 = this.d;
                if (aVar4 != null) {
                    aVar4.c = j;
                    aVar2.b = aVar4;
                }
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final long b(bea bea) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!a(bea.a)) {
            return -1;
        }
        int i5 = (bea.a[2] & 255) >> 4;
        switch (i5) {
            case 1:
                i = 192;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i2 = 576;
                i3 = i5 - 2;
                break;
            case 6:
            case 7:
                bea.d(4);
                long j = (long) bea.a[bea.b];
                int i6 = 7;
                while (true) {
                    if (i6 >= 0) {
                        int i7 = 1 << i6;
                        if ((((long) i7) & j) != 0) {
                            i6--;
                        } else if (i6 < 6) {
                            j &= (long) (i7 - 1);
                            i4 = 7 - i6;
                        } else if (i6 == 7) {
                            i4 = 1;
                        }
                    }
                }
                i4 = 0;
                if (i4 != 0) {
                    long j2 = j;
                    int i8 = 1;
                    while (i8 < i4) {
                        byte b = bea.a[bea.b + i8];
                        if ((b & 192) == 128) {
                            j2 = (j2 << 6) | ((long) (b & 63));
                            i8++;
                        } else {
                            StringBuilder sb = new StringBuilder("Invalid UTF-8 sequence continuation byte: ");
                            sb.append(j2);
                            throw new NumberFormatException(sb.toString());
                        }
                    }
                    bea.b += i4;
                    int c = i5 == 6 ? bea.c() : bea.d();
                    bea.c(0);
                    i = c + 1;
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("Invalid UTF-8 sequence first byte: ");
                    sb2.append(j);
                    throw new NumberFormatException(sb2.toString());
                }
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 256;
                i3 = i5 - 8;
                break;
            default:
                i = -1;
                break;
        }
        i = i2 << i3;
        return (long) i;
    }
}
