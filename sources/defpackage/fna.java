package defpackage;

import java.lang.reflect.Array;

/* renamed from: fna reason: default package */
public final class fna {
    int a;
    private final fnb[] b;
    private final int c;
    private final int d;

    fna(int i, int i2) {
        this.b = new fnb[i];
        int length = this.b.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.b[i3] = new fnb(((i2 + 4) * 17) + 1);
        }
        this.d = i2 * 17;
        this.c = i;
        this.a = -1;
    }

    /* access modifiers changed from: 0000 */
    public final fnb a() {
        return this.b[this.a];
    }

    public final byte[][] a(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, new int[]{this.c * i2, this.d * i});
        int i3 = this.c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.b[i4 / i2].a(i);
        }
        return bArr;
    }
}
