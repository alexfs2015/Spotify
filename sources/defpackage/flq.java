package defpackage;

/* renamed from: flq reason: default package */
final class flq {
    final flp a;
    final int[] b;

    flq(flp flp, int[] iArr) {
        if (iArr.length != 0) {
            this.a = flp;
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

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return this.b[0] == 0;
    }

    private int a(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    private flq b(flq flq) {
        if (!this.a.equals(flq.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (a()) {
            return flq;
        } else {
            if (flq.a()) {
                return this;
            }
            int[] iArr = this.b;
            int[] iArr2 = flq.b;
            if (iArr.length > iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr2.length];
            int length = iArr2.length - iArr.length;
            System.arraycopy(iArr2, 0, iArr4, 0, length);
            for (int i = length; i < iArr2.length; i++) {
                iArr4[i] = flp.a(iArr[i - length], iArr2[i]);
            }
            return new flq(this.a, iArr4);
        }
    }

    /* access modifiers changed from: 0000 */
    public final flq a(int i, int i2) {
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
            return new flq(this.a, iArr);
        }
    }

    /* access modifiers changed from: 0000 */
    public final flq[] a(flq flq) {
        flq flq2;
        if (!this.a.equals(flq.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!flq.a()) {
            flq flq3 = this.a.i;
            int a2 = flq.a(flq.b.length - 1);
            flp flp = this.a;
            if (a2 != 0) {
                int i = flp.g[(flp.j - flp.h[a2]) - 1];
                flq flq4 = flq3;
                flq flq5 = this;
                while (flq5.b.length - 1 >= flq.b.length - 1 && !flq5.a()) {
                    int[] iArr = flq5.b;
                    int length = (iArr.length - 1) - (flq.b.length - 1);
                    int b2 = this.a.b(flq5.a(iArr.length - 1), i);
                    flq a3 = flq.a(length, b2);
                    flp flp2 = this.a;
                    if (length >= 0) {
                        if (b2 == 0) {
                            flq2 = flp2.i;
                        } else {
                            int[] iArr2 = new int[(length + 1)];
                            iArr2[0] = b2;
                            flq2 = new flq(flp2, iArr2);
                        }
                        flq4 = flq4.b(flq2);
                        flq5 = flq5.b(a3);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return new flq[]{flq4, flq5};
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
                    flp flp = this.a;
                    if (a2 != 0) {
                        int i = flp.h[a2];
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
