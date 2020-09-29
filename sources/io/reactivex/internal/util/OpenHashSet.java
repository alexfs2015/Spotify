package io.reactivex.internal.util;

public final class OpenHashSet<T> {
    public int a;
    public int b;
    public T[] c;
    private float d;
    private int e;

    public OpenHashSet() {
        this(16, 0.75f);
    }

    public OpenHashSet(int i) {
        this(i, 0.75f);
    }

    private OpenHashSet(int i, float f) {
        this.d = 0.75f;
        int a2 = Pow2.a(i);
        this.a = a2 - 1;
        this.e = (int) (((float) a2) * 0.75f);
        this.c = (Object[]) new Object[a2];
    }

    public static int a(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    private void a() {
        T[] tArr = this.c;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (Object[]) new Object[i];
        int i3 = this.b;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int a2 = a(tArr[length].hashCode()) & i2;
                if (tArr2[a2] != null) {
                    do {
                        a2 = (a2 + 1) & i2;
                    } while (tArr2[a2] != null);
                }
                tArr2[a2] = tArr[length];
                i3 = i4;
            } else {
                this.a = i2;
                this.e = (int) (((float) i) * this.d);
                this.c = tArr2;
                return;
            }
        }
    }

    public final boolean a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int a2 = a(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a2 || a2 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= a2 && a2 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public final boolean a(T t) {
        T t2;
        T[] tArr = this.c;
        int i = this.a;
        int a2 = a(t.hashCode()) & i;
        T t3 = tArr[a2];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a2 = (a2 + 1) & i;
                t2 = tArr[a2];
                if (t2 != null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a2] = t;
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 >= this.e) {
            a();
        }
        return true;
    }
}
