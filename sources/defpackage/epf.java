package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import com.google.android.gms.internal.measurement.zzve;
import com.google.android.gms.internal.measurement.zzwe;
import java.util.Arrays;

/* renamed from: epf reason: default package */
public final class epf {
    private static final epf f = new epf(0, new int[0], new Object[0], false);
    int a;
    int[] b;
    Object[] c;
    int d;
    boolean e;

    public static epf a() {
        return f;
    }

    static epf b() {
        return new epf();
    }

    static epf a(epf epf, epf epf2) {
        int i = epf.a + epf2.a;
        int[] copyOf = Arrays.copyOf(epf.b, i);
        System.arraycopy(epf2.b, 0, copyOf, epf.a, epf2.a);
        Object[] copyOf2 = Arrays.copyOf(epf.c, i);
        System.arraycopy(epf2.c, 0, copyOf2, epf.a, epf2.a);
        return new epf(i, copyOf, copyOf2, true);
    }

    private epf() {
        this(0, new int[8], new Object[8], true);
    }

    private epf(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final void a(epr epr) {
        if (this.a != 0) {
            if (epr.a() == e.j) {
                for (int i = 0; i < this.a; i++) {
                    a(this.b[i], this.c[i], epr);
                }
                return;
            }
            for (int i2 = this.a - 1; i2 >= 0; i2--) {
                a(this.b[i2], this.c[i2], epr);
            }
        }
    }

    private static void a(int i, Object obj, epr epr) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            epr.a(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            epr.d(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            epr.a(i2, (zzun) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                epr.d(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzwe.e());
        } else if (epr.a() == e.j) {
            epr.a(i2);
            ((epf) obj).a(epr);
            epr.b(i2);
        } else {
            epr.b(i2);
            ((epf) obj).a(epr);
            epr.a(i2);
        }
    }

    public final int c() {
        int i;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a; i4++) {
            int i5 = this.b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zzve.e(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 1) {
                ((Long) this.c[i4]).longValue();
                i = zzve.g(i6);
            } else if (i7 == 2) {
                i = zzve.c(i6, (zzun) this.c[i4]);
            } else if (i7 == 3) {
                i = (zzve.l(i6) << 1) + ((epf) this.c[i4]).c();
            } else if (i7 == 5) {
                ((Integer) this.c[i4]).intValue();
                i = zzve.e(i6);
            } else {
                throw new IllegalStateException(zzwe.e());
            }
            i3 += i;
        }
        this.d = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof epf)) {
            return false;
        }
        epf epf = (epf) obj;
        int i = this.a;
        if (i == epf.a) {
            int[] iArr = this.b;
            int[] iArr2 = epf.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.c;
                Object[] objArr2 = epf.c;
                int i3 = this.a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        for (int i7 = 0; i7 < this.a; i7++) {
            i3 = (i3 * 31) + objArr[i7].hashCode();
        }
        return i6 + i3;
    }

    /* access modifiers changed from: 0000 */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            eoa.a(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, Object obj) {
        if (this.e) {
            int i2 = this.a;
            if (i2 == this.b.length) {
                int i3 = this.a + (i2 < 4 ? 8 : i2 >> 1);
                this.b = Arrays.copyOf(this.b, i3);
                this.c = Arrays.copyOf(this.c, i3);
            }
            int[] iArr = this.b;
            int i4 = this.a;
            iArr[i4] = i;
            this.c[i4] = obj;
            this.a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
