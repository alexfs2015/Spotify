package defpackage;

import java.lang.reflect.Array;

/* renamed from: fnj reason: default package */
public final class fnj {
    final byte[][] a;
    public final int b;
    public final int c;

    public fnj(int i, int i2) {
        this.a = (byte[][]) Array.newInstance(byte.class, new int[]{i2, i});
        this.b = i;
        this.c = i2;
    }

    public final byte a(int i, int i2) {
        return this.a[i2][i];
    }

    public final void a(int i, int i2, int i3) {
        this.a[i2][i] = (byte) i3;
    }

    public final void a(int i, int i2, boolean z) {
        this.a[i2][i] = z ? (byte) 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.b * 2 * this.c) + 2);
        for (int i = 0; i < this.c; i++) {
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b2 = this.a[i][i2];
                if (b2 == 0) {
                    sb.append(" 0");
                } else if (b2 != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
