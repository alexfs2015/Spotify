package defpackage;

/* renamed from: dgt reason: default package */
public final class dgt implements Cloneable {
    static final dgu a = new dgu();
    int[] b;
    dgu[] c;
    int d;
    private boolean e;

    dgt() {
        this(10);
    }

    private dgt(int i) {
        this.e = false;
        int a2 = a(i);
        this.b = new int[a2];
        this.c = new dgu[a2];
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
        dgt dgt = new dgt(i);
        System.arraycopy(this.b, 0, dgt.b, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            dgu[] dguArr = this.c;
            if (dguArr[i2] != null) {
                dgt.c[i2] = (dgu) dguArr[i2].clone();
            }
        }
        dgt.d = i;
        return dgt;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dgt)) {
            return false;
        }
        dgt dgt = (dgt) obj;
        int i = this.d;
        if (i != dgt.d) {
            return false;
        }
        int[] iArr = this.b;
        int[] iArr2 = dgt.b;
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
            dgu[] dguArr = this.c;
            dgu[] dguArr2 = dgt.c;
            int i3 = this.d;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!dguArr[i4].equals(dguArr2[i4])) {
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
