package defpackage;

/* renamed from: xlv reason: default package */
public final class xlv<T> {
    public final float a;
    public int b;
    public int c;
    public int d;
    public T[] e;

    public xlv() {
        this(16, 0.75f);
    }

    private xlv(int i, float f) {
        this.a = 0.75f;
        int a2 = xmp.a(16);
        this.b = a2 - 1;
        this.d = (int) (((float) a2) * 0.75f);
        this.e = (Object[]) new Object[a2];
    }

    public static int a(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    public final boolean a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.c--;
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
}
