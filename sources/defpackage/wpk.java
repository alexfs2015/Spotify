package defpackage;

import java.util.Comparator;

/* renamed from: wpk reason: default package */
public final class wpk {
    public int a = 0;

    public final wpk a(Object obj, Object obj2, Comparator<?> comparator) {
        if (this.a != 0 || obj == obj2) {
            return this;
        }
        if (obj == null) {
            this.a = -1;
            return this;
        } else if (obj2 == null) {
            this.a = 1;
            return this;
        } else {
            if (obj.getClass().isArray()) {
                if (obj instanceof long[]) {
                    a((long[]) obj, (long[]) obj2);
                } else if (obj instanceof int[]) {
                    a((int[]) obj, (int[]) obj2);
                } else if (obj instanceof short[]) {
                    a((short[]) obj, (short[]) obj2);
                } else if (obj instanceof char[]) {
                    a((char[]) obj, (char[]) obj2);
                } else if (obj instanceof byte[]) {
                    a((byte[]) obj, (byte[]) obj2);
                } else if (obj instanceof double[]) {
                    a((double[]) obj, (double[]) obj2);
                } else if (obj instanceof float[]) {
                    a((float[]) obj, (float[]) obj2);
                } else if (obj instanceof boolean[]) {
                    a((boolean[]) obj, (boolean[]) obj2);
                } else {
                    a((Object[]) obj, (Object[]) obj2, comparator);
                }
            } else if (comparator == null) {
                this.a = ((Comparable) obj).compareTo(obj2);
            } else {
                this.a = comparator.compare(obj, obj2);
            }
            return this;
        }
    }

    private wpk a(long j, long j2) {
        if (this.a != 0) {
            return this;
        }
        int i = j < j2 ? -1 : j > j2 ? 1 : 0;
        this.a = i;
        return this;
    }

    private wpk a(int i, int i2) {
        if (this.a != 0) {
            return this;
        }
        int i3 = i < i2 ? -1 : i > i2 ? 1 : 0;
        this.a = i3;
        return this;
    }

    private wpk a(short s, short s2) {
        if (this.a != 0) {
            return this;
        }
        int i = s < s2 ? -1 : s > s2 ? 1 : 0;
        this.a = i;
        return this;
    }

    private wpk a(char c, char c2) {
        if (this.a != 0) {
            return this;
        }
        int i = c < c2 ? -1 : c > c2 ? 1 : 0;
        this.a = i;
        return this;
    }

    private wpk a(byte b, byte b2) {
        if (this.a != 0) {
            return this;
        }
        int i = b < b2 ? -1 : b > b2 ? 1 : 0;
        this.a = i;
        return this;
    }

    private wpk a(double d, double d2) {
        if (this.a != 0) {
            return this;
        }
        this.a = Double.compare(d, d2);
        return this;
    }

    private wpk a(float f, float f2) {
        if (this.a != 0) {
            return this;
        }
        this.a = Float.compare(f, f2);
        return this;
    }

    private wpk a(boolean z, boolean z2) {
        if (this.a != 0 || z == z2) {
            return this;
        }
        if (!z) {
            this.a = -1;
        } else {
            this.a = 1;
        }
        return this;
    }

    private wpk a(Object[] objArr, Object[] objArr2, Comparator<?> comparator) {
        if (this.a != 0 || objArr == objArr2) {
            return this;
        }
        int i = -1;
        if (objArr == null) {
            this.a = -1;
            return this;
        } else if (objArr2 == null) {
            this.a = 1;
            return this;
        } else if (objArr.length != objArr2.length) {
            if (objArr.length >= objArr2.length) {
                i = 1;
            }
            this.a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < objArr.length && this.a == 0; i2++) {
                a(objArr[i2], objArr2[i2], comparator);
            }
            return this;
        }
    }

    private wpk a(long[] jArr, long[] jArr2) {
        if (this.a != 0 || jArr == jArr2) {
            return this;
        }
        int i = -1;
        if (jArr == null) {
            this.a = -1;
            return this;
        } else if (jArr2 == null) {
            this.a = 1;
            return this;
        } else if (jArr.length != jArr2.length) {
            if (jArr.length >= jArr2.length) {
                i = 1;
            }
            this.a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < jArr.length && this.a == 0; i2++) {
                a(jArr[i2], jArr2[i2]);
            }
            return this;
        }
    }

    private wpk a(int[] iArr, int[] iArr2) {
        if (this.a != 0 || iArr == iArr2) {
            return this;
        }
        int i = -1;
        if (iArr == null) {
            this.a = -1;
            return this;
        } else if (iArr2 == null) {
            this.a = 1;
            return this;
        } else if (iArr.length != iArr2.length) {
            if (iArr.length >= iArr2.length) {
                i = 1;
            }
            this.a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < iArr.length && this.a == 0; i2++) {
                a(iArr[i2], iArr2[i2]);
            }
            return this;
        }
    }

    private wpk a(short[] sArr, short[] sArr2) {
        if (this.a != 0 || sArr == sArr2) {
            return this;
        }
        int i = -1;
        if (sArr == null) {
            this.a = -1;
            return this;
        } else if (sArr2 == null) {
            this.a = 1;
            return this;
        } else if (sArr.length != sArr2.length) {
            if (sArr.length >= sArr2.length) {
                i = 1;
            }
            this.a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < sArr.length && this.a == 0; i2++) {
                a(sArr[i2], sArr2[i2]);
            }
            return this;
        }
    }

    private wpk a(char[] cArr, char[] cArr2) {
        if (this.a != 0 || cArr == cArr2) {
            return this;
        }
        int i = -1;
        if (cArr == null) {
            this.a = -1;
            return this;
        } else if (cArr2 == null) {
            this.a = 1;
            return this;
        } else if (cArr.length != cArr2.length) {
            if (cArr.length >= cArr2.length) {
                i = 1;
            }
            this.a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < cArr.length && this.a == 0; i2++) {
                a(cArr[i2], cArr2[i2]);
            }
            return this;
        }
    }

    private wpk a(byte[] bArr, byte[] bArr2) {
        if (this.a != 0 || bArr == bArr2) {
            return this;
        }
        int i = -1;
        if (bArr == null) {
            this.a = -1;
            return this;
        } else if (bArr2 == null) {
            this.a = 1;
            return this;
        } else if (bArr.length != bArr2.length) {
            if (bArr.length >= bArr2.length) {
                i = 1;
            }
            this.a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < bArr.length && this.a == 0; i2++) {
                a(bArr[i2], bArr2[i2]);
            }
            return this;
        }
    }

    private wpk a(double[] dArr, double[] dArr2) {
        if (this.a != 0 || dArr == dArr2) {
            return this;
        }
        int i = -1;
        if (dArr == null) {
            this.a = -1;
            return this;
        } else if (dArr2 == null) {
            this.a = 1;
            return this;
        } else if (dArr.length != dArr2.length) {
            if (dArr.length >= dArr2.length) {
                i = 1;
            }
            this.a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < dArr.length && this.a == 0; i2++) {
                a(dArr[i2], dArr2[i2]);
            }
            return this;
        }
    }

    private wpk a(float[] fArr, float[] fArr2) {
        if (this.a != 0 || fArr == fArr2) {
            return this;
        }
        int i = -1;
        if (fArr == null) {
            this.a = -1;
            return this;
        } else if (fArr2 == null) {
            this.a = 1;
            return this;
        } else if (fArr.length != fArr2.length) {
            if (fArr.length >= fArr2.length) {
                i = 1;
            }
            this.a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < fArr.length && this.a == 0; i2++) {
                a(fArr[i2], fArr2[i2]);
            }
            return this;
        }
    }

    private wpk a(boolean[] zArr, boolean[] zArr2) {
        if (this.a != 0 || zArr == zArr2) {
            return this;
        }
        int i = -1;
        if (zArr == null) {
            this.a = -1;
            return this;
        } else if (zArr2 == null) {
            this.a = 1;
            return this;
        } else if (zArr.length != zArr2.length) {
            if (zArr.length >= zArr2.length) {
                i = 1;
            }
            this.a = i;
            return this;
        } else {
            for (int i2 = 0; i2 < zArr.length && this.a == 0; i2++) {
                a(zArr[i2], zArr2[i2]);
            }
            return this;
        }
    }
}
