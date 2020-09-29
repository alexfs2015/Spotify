package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: auh reason: default package */
final class auh extends aun {
    bdb a;
    private a d;

    /* renamed from: auh$a */
    class a implements atb, aul {
        long[] a;
        long[] b;
        long c = -1;
        private long d = -1;

        public final atb a() {
            return this;
        }

        public final boolean l_() {
            return true;
        }

        public a() {
        }

        public final long a(asu asu) {
            long j = this.d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.d = -1;
            return j2;
        }

        public final long a_(long j) {
            long b2 = auh.this.b(j);
            this.d = this.a[bdw.a(this.a, b2, true, true)];
            return b2;
        }

        public final defpackage.atb.a a(long j) {
            int a2 = bdw.a(this.a, auh.this.b(j), true, true);
            long a3 = auh.this.a(this.a[a2]);
            atc atc = new atc(a3, this.c + this.b[a2]);
            if (a3 < j) {
                long[] jArr = this.a;
                if (a2 != jArr.length - 1) {
                    int i = a2 + 1;
                    return new defpackage.atb.a(atc, new atc(auh.this.a(jArr[i]), this.c + this.b[i]));
                }
            }
            return new defpackage.atb.a(atc);
        }

        public final long b() {
            bdb bdb = auh.this.a;
            return (bdb.d * 1000000) / ((long) bdb.a);
        }
    }

    auh() {
    }

    public static boolean a(bdj bdj) {
        return bdj.b() >= 5 && bdj.c() == 127 && bdj.g() == 1179402563;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.a = null;
            this.d = null;
        }
    }

    private static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    public final long b(bdj bdj) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!a(bdj.a)) {
            return -1;
        }
        int i5 = (bdj.a[2] & 255) >> 4;
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
                bdj.d(4);
                long j = (long) bdj.a[bdj.b];
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
                        byte b = bdj.a[bdj.b + i8];
                        if ((b & 192) == 128) {
                            j2 = (j2 << 6) | ((long) (b & 63));
                            i8++;
                        } else {
                            StringBuilder sb = new StringBuilder("Invalid UTF-8 sequence continuation byte: ");
                            sb.append(j2);
                            throw new NumberFormatException(sb.toString());
                        }
                    }
                    bdj.b += i4;
                    int c = i5 == 6 ? bdj.c() : bdj.d();
                    bdj.c(0);
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

    /* access modifiers changed from: protected */
    public final boolean a(bdj bdj, long j, a aVar) {
        bdj bdj2 = bdj;
        a aVar2 = aVar;
        byte[] bArr = bdj2.a;
        if (this.a == null) {
            this.a = new bdb(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, bdj2.c);
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            bdb bdb = this.a;
            aVar2.a = aqe.a((String) null, "audio/flac", (String) null, -1, bdb.c * bdb.a, this.a.b, this.a.a, singletonList, (asc) null, 0, (String) null);
        } else {
            if ((bArr[0] & Byte.MAX_VALUE) == 3) {
                this.d = new a();
                a aVar3 = this.d;
                bdj2.d(1);
                int f = bdj.f() / 18;
                aVar3.a = new long[f];
                aVar3.b = new long[f];
                for (int i = 0; i < f; i++) {
                    aVar3.a[i] = bdj.k();
                    aVar3.b[i] = bdj.k();
                    bdj2.d(2);
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
}
