package defpackage;

/* renamed from: dgc reason: default package */
public final class dgc implements Cloneable {
    static final dgd a = new dgd();
    int[] b;
    dgd[] c;
    int d;
    private boolean e;

    dgc() {
        this(10);
    }

    private dgc(int i) {
        this.e = false;
        int a2 = a(i);
        this.b = new int[a2];
        this.c = new dgd[a2];
        this.d = 0;
    }

    static int a(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    /* access modifiers changed from: 0000 */
    public final int b(int i) {
        int i2 = this.d - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.b[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    public final /* synthetic */ Object clone() {
        int i = this.d;
        dgc dgc = new dgc(i);
        System.arraycopy(this.b, 0, dgc.b, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            dgd[] dgdArr = this.c;
            if (dgdArr[i2] != null) {
                dgc.c[i2] = (dgd) dgdArr[i2].clone();
            }
        }
        dgc.d = i;
        return dgc;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dgc)) {
            return false;
        }
        dgc dgc = (dgc) obj;
        int i = this.d;
        if (i != dgc.d) {
            return false;
        }
        int[] iArr = this.b;
        int[] iArr2 = dgc.b;
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
            dgd[] dgdArr = this.c;
            dgd[] dgdArr2 = dgc.c;
            int i3 = this.d;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!dgdArr[i4].equals(dgdArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (((i * 31) + this.b[i2]) * 31) + this.c[i2].hashCode();
        }
        return i;
    }
}
