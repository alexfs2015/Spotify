package defpackage;

/* renamed from: fmk reason: default package */
final class fmk {
    final fmj a;
    final int[] b;

    fmk(fmj fmj, int[] iArr) {
        if (iArr.length != 0) {
            this.a = fmj;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.b = new int[]{0};
                return;
            }
            this.b = new int[(length - i)];
            int[] iArr2 = this.b;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    private int a(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    private fmk b(fmk fmk) {
        if (!this.a.equals(fmk.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (a()) {
            return fmk;
        } else {
            if (fmk.a()) {
                return this;
            }
            int[] iArr = this.b;
            int[] iArr2 = fmk.b;
            if (iArr.length > iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr2.length];
            int length = iArr2.length - iArr.length;
            System.arraycopy(iArr2, 0, iArr4, 0, length);
            for (int i = length; i < iArr2.length; i++) {
                iArr4[i] = fmj.a(iArr[i - length], iArr2[i]);
            }
            return new fmk(this.a, iArr4);
        }
    }

    /* access modifiers changed from: 0000 */
    public final fmk a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.a.i;
        } else {
            int length = this.b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.a.b(this.b[i3], i2);
            }
            return new fmk(this.a, iArr);
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return this.b[0] == 0;
    }

    /* access modifiers changed from: 0000 */
    public final fmk[] a(fmk fmk) {
        fmk fmk2;
        if (!this.a.equals(fmk.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!fmk.a()) {
            fmk fmk3 = this.a.i;
            int a2 = fmk.a(fmk.b.length - 1);
            fmj fmj = this.a;
            if (a2 != 0) {
                int i = fmj.g[(fmj.j - fmj.h[a2]) - 1];
                fmk fmk4 = fmk3;
                fmk fmk5 = this;
                while (fmk5.b.length - 1 >= fmk.b.length - 1 && !fmk5.a()) {
                    int[] iArr = fmk5.b;
                    int length = (iArr.length - 1) - (fmk.b.length - 1);
                    int b2 = this.a.b(fmk5.a(iArr.length - 1), i);
                    fmk a3 = fmk.a(length, b2);
                    fmj fmj2 = this.a;
                    if (length >= 0) {
                        if (b2 == 0) {
                            fmk2 = fmj2.i;
                        } else {
                            int[] iArr2 = new int[(length + 1)];
                            iArr2[0] = b2;
                            fmk2 = new fmk(fmj2, iArr2);
                        }
                        fmk4 = fmk4.b(fmk2);
                        fmk5 = fmk5.b(a3);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return new fmk[]{fmk4, fmk5};
            }
            throw new ArithmeticException();
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.b.length - 1) * 8);
        for (int length = this.b.length - 1; length >= 0; length--) {
            int a2 = a(length);
            if (a2 != 0) {
                if (a2 < 0) {
                    sb.append(" - ");
                    a2 = -a2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (length == 0 || a2 != 1) {
                    fmj fmj = this.a;
                    if (a2 != 0) {
                        int i = fmj.h[a2];
                        if (i == 0) {
                            sb.append('1');
                        } else if (i == 1) {
                            sb.append('a');
                        } else {
                            sb.append("a^");
                            sb.append(i);
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                if (length != 0) {
                    if (length == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(length);
                    }
                }
            }
        }
        return sb.toString();
    }
}
