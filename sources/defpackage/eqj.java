package defpackage;

import com.google.android.gms.internal.measurement.zzwe;
import com.google.android.gms.internal.measurement.zzzq;
import java.io.IOException;

/* renamed from: eqj reason: default package */
public final class eqj {
    final byte[] a;
    final int b;
    int c;
    int d = 64;
    private final int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j = Integer.MAX_VALUE;
    private int k = 67108864;
    private emt l;

    private eqj(byte[] bArr, int i2, int i3) {
        this.a = bArr;
        this.b = 0;
        int i4 = i3 + 0;
        this.f = i4;
        this.e = i4;
        this.h = 0;
    }

    public static eqj a(byte[] bArr, int i2) {
        return new eqj(bArr, 0, i2);
    }

    private final void f(int i2) {
        if (i2 >= 0) {
            int i3 = this.h;
            int i4 = i3 + i2;
            int i5 = this.j;
            if (i4 > i5) {
                f(i5 - i3);
                throw zzzq.a();
            } else if (i2 <= this.f - i3) {
                this.h = i3 + i2;
            } else {
                throw zzzq.a();
            }
        } else {
            throw zzzq.b();
        }
    }

    private final void j() {
        this.f += this.g;
        int i2 = this.f;
        int i3 = this.j;
        if (i2 > i3) {
            this.g = i2 - i3;
            this.f = i2 - this.g;
            return;
        }
        this.g = 0;
    }

    private final byte k() {
        int i2 = this.h;
        if (i2 != this.f) {
            byte[] bArr = this.a;
            this.h = i2 + 1;
            return bArr[i2];
        }
        throw zzzq.a();
    }

    public final int a() {
        if (this.h == this.f) {
            this.i = 0;
            return 0;
        }
        this.i = d();
        int i2 = this.i;
        if (i2 != 0) {
            return i2;
        }
        throw new zzzq("Protocol message contained an invalid tag (zero).");
    }

    public final <T extends enn<T, ?>> T a(eoy<T> eoy) {
        try {
            if (this.l == null) {
                this.l = emt.a(this.a, this.b, this.e);
            }
            int u = this.l.u();
            int i2 = this.h - this.b;
            if (u <= i2) {
                this.l.e(i2 - u);
                emt emt = this.l;
                int i3 = this.d - this.c;
                if (i3 >= 0) {
                    int i4 = emt.b;
                    emt.b = i3;
                    T t = (enn) this.l.a(eoy, enc.b());
                    b(this.i);
                    return t;
                }
                StringBuilder sb = new StringBuilder(47);
                sb.append("Recursion limit cannot be negative: ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(u), Integer.valueOf(i2)}));
        } catch (zzwe e2) {
            throw new zzzq("", e2);
        }
    }

    public final void a(int i2) {
        if (this.i != i2) {
            throw new zzzq("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, int i3) {
        int i4 = this.h;
        int i5 = this.b;
        if (i2 > i4 - i5) {
            int i6 = i4 - i5;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i2);
            sb.append(" is beyond current ");
            sb.append(i6);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0) {
            this.h = i5 + i2;
            this.i = i3;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final void a(eqq eqq) {
        int d2 = d();
        if (this.c < this.d) {
            int c2 = c(d2);
            this.c++;
            eqq.a(this);
            a(0);
            this.c--;
            d(c2);
            return;
        }
        throw zzzq.d();
    }

    public final boolean b() {
        return d() != 0;
    }

    public final boolean b(int i2) {
        int a2;
        int i3 = i2 & 7;
        if (i3 == 0) {
            d();
            return true;
        } else if (i3 == 1) {
            g();
            return true;
        } else if (i3 == 2) {
            f(d());
            return true;
        } else if (i3 == 3) {
            do {
                a2 = a();
                if (a2 == 0) {
                    break;
                }
            } while (b(a2));
            a(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                f();
                return true;
            }
            throw new zzzq("Protocol message tag had invalid wire type.");
        }
    }

    public final int c(int i2) {
        if (i2 >= 0) {
            int i3 = i2 + this.h;
            int i4 = this.j;
            if (i3 <= i4) {
                this.j = i3;
                j();
                return i4;
            }
            throw zzzq.a();
        }
        throw zzzq.b();
    }

    public final String c() {
        int d2 = d();
        if (d2 >= 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (d2 <= i2 - i3) {
                String str = new String(this.a, i3, d2, eqp.a);
                this.h += d2;
                return str;
            }
            throw zzzq.a();
        }
        throw zzzq.b();
    }

    public final int d() {
        byte b2;
        int i2;
        byte k2 = k();
        if (k2 >= 0) {
            return k2;
        }
        byte b3 = k2 & Byte.MAX_VALUE;
        byte k3 = k();
        if (k3 >= 0) {
            i2 = k3 << 7;
        } else {
            b3 |= (k3 & Byte.MAX_VALUE) << 7;
            byte k4 = k();
            if (k4 >= 0) {
                i2 = k4 << 14;
            } else {
                b3 |= (k4 & Byte.MAX_VALUE) << 14;
                byte k5 = k();
                if (k5 >= 0) {
                    i2 = k5 << 21;
                } else {
                    byte b4 = b3 | ((k5 & Byte.MAX_VALUE) << 21);
                    byte k6 = k();
                    b2 = b4 | (k6 << 28);
                    if (k6 < 0) {
                        for (int i3 = 0; i3 < 5; i3++) {
                            if (k() >= 0) {
                                return b2;
                            }
                        }
                        throw zzzq.c();
                    }
                    return b2;
                }
            }
        }
        b2 = b3 | i2;
        return b2;
    }

    public final void d(int i2) {
        this.j = i2;
        j();
    }

    public final long e() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte k2 = k();
            j2 |= ((long) (k2 & Byte.MAX_VALUE)) << i2;
            if ((k2 & 128) == 0) {
                return j2;
            }
        }
        throw zzzq.c();
    }

    public final void e(int i2) {
        a(i2, this.i);
    }

    public final int f() {
        return (k() & 255) | ((k() & 255) << 8) | ((k() & 255) << 16) | ((k() & 255) << 24);
    }

    public final long g() {
        byte k2 = k();
        byte k3 = k();
        return ((((long) k3) & 255) << 8) | (((long) k2) & 255) | ((((long) k()) & 255) << 16) | ((((long) k()) & 255) << 24) | ((((long) k()) & 255) << 32) | ((((long) k()) & 255) << 40) | ((((long) k()) & 255) << 48) | ((((long) k()) & 255) << 56);
    }

    public final int h() {
        int i2 = this.j;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - this.h;
    }

    public final int i() {
        return this.h - this.b;
    }
}
