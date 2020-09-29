package defpackage;

import com.google.android.gms.internal.ads.zzbfh;

/* renamed from: dgo reason: default package */
public final class dgo {
    final byte[] a;
    final int b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h = Integer.MAX_VALUE;
    private int i;
    private int j = 64;
    private int k = 67108864;

    private dgo(byte[] bArr, int i2, int i3) {
        this.a = bArr;
        this.b = 0;
        int i4 = i3 + 0;
        this.d = i4;
        this.c = i4;
        this.f = 0;
    }

    public static dgo a(byte[] bArr, int i2) {
        return new dgo(bArr, 0, i2);
    }

    private final void f(int i2) {
        if (i2 >= 0) {
            int i3 = this.f;
            int i4 = i3 + i2;
            int i5 = this.h;
            if (i4 > i5) {
                f(i5 - i3);
                throw zzbfh.a();
            } else if (i2 <= this.d - i3) {
                this.f = i3 + i2;
            } else {
                throw zzbfh.a();
            }
        } else {
            throw zzbfh.b();
        }
    }

    private final void j() {
        this.d += this.e;
        int i2 = this.d;
        int i3 = this.h;
        if (i2 > i3) {
            this.e = i2 - i3;
            this.d = i2 - this.e;
            return;
        }
        this.e = 0;
    }

    private final byte k() {
        int i2 = this.f;
        if (i2 != this.d) {
            byte[] bArr = this.a;
            this.f = i2 + 1;
            return bArr[i2];
        }
        throw zzbfh.a();
    }

    public final int a() {
        if (this.f == this.d) {
            this.g = 0;
            return 0;
        }
        this.g = f();
        int i2 = this.g;
        if (i2 != 0) {
            return i2;
        }
        throw new zzbfh("Protocol message contained an invalid tag (zero).");
    }

    public final void a(int i2) {
        if (this.g != i2) {
            throw new zzbfh("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, int i3) {
        int i4 = this.f;
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
            this.f = i5 + i2;
            this.g = i3;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final void a(dgw dgw) {
        int f2 = f();
        if (this.i < this.j) {
            int c2 = c(f2);
            this.i++;
            dgw.a(this);
            a(0);
            this.i--;
            d(c2);
            return;
        }
        throw new zzbfh("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final int b() {
        return f();
    }

    public final boolean b(int i2) {
        int a2;
        int i3 = i2 & 7;
        if (i3 == 0) {
            f();
            return true;
        } else if (i3 == 1) {
            k();
            k();
            k();
            k();
            k();
            k();
            k();
            k();
            return true;
        } else if (i3 == 2) {
            f(f());
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
                k();
                k();
                k();
                k();
                return true;
            }
            throw new zzbfh("Protocol message tag had invalid wire type.");
        }
    }

    public final int c(int i2) {
        if (i2 >= 0) {
            int i3 = i2 + this.f;
            int i4 = this.h;
            if (i3 <= i4) {
                this.h = i3;
                j();
                return i4;
            }
            throw zzbfh.a();
        }
        throw zzbfh.b();
    }

    public final boolean c() {
        return f() != 0;
    }

    public final String d() {
        int f2 = f();
        if (f2 >= 0) {
            int i2 = this.d;
            int i3 = this.f;
            if (f2 <= i2 - i3) {
                String str = new String(this.a, i3, f2, dgv.a);
                this.f += f2;
                return str;
            }
            throw zzbfh.a();
        }
        throw zzbfh.b();
    }

    public final void d(int i2) {
        this.h = i2;
        j();
    }

    public final void e(int i2) {
        a(i2, this.g);
    }

    public final byte[] e() {
        int f2 = f();
        if (f2 < 0) {
            throw zzbfh.b();
        } else if (f2 == 0) {
            return dgz.e;
        } else {
            int i2 = this.d;
            int i3 = this.f;
            if (f2 <= i2 - i3) {
                byte[] bArr = new byte[f2];
                System.arraycopy(this.a, i3, bArr, 0, f2);
                this.f += f2;
                return bArr;
            }
            throw zzbfh.a();
        }
    }

    public final int f() {
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
                        throw zzbfh.c();
                    }
                    return b2;
                }
            }
        }
        b2 = b3 | i2;
        return b2;
    }

    public final long g() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte k2 = k();
            j2 |= ((long) (k2 & Byte.MAX_VALUE)) << i2;
            if ((k2 & 128) == 0) {
                return j2;
            }
        }
        throw zzbfh.c();
    }

    public final int h() {
        int i2 = this.h;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - this.f;
    }

    public final int i() {
        return this.f - this.b;
    }
}
