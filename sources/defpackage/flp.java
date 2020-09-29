package defpackage;

import com.spotify.core.http.HttpConnection;

/* renamed from: flp reason: default package */
public final class flp {
    public static final flp a = new flp(4201, 4096, 1);
    public static final flp b = new flp(1033, 1024, 1);
    public static final flp c = new flp(67, 64, 1);
    public static final flp d = new flp(19, 16, 1);
    public static final flp e = new flp(285, 256, 0);
    public static final flp f = new flp(HttpConnection.kErrorHttpConnectTimeout, 256, 1);
    final int[] g;
    final int[] h;
    final flq i;
    final int j;
    final int k;
    private final flq l;
    private final int m;

    static int a(int i2, int i3) {
        return i2 ^ i3;
    }

    private flp(int i2, int i3, int i4) {
        this.m = i2;
        this.j = i3;
        this.k = i4;
        this.g = new int[i3];
        this.h = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.g[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.h[this.g[i7]] = i7;
        }
        this.i = new flq(this, new int[]{0});
        this.l = new flq(this, new int[]{1});
    }

    /* access modifiers changed from: 0000 */
    public final int b(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.g;
        int[] iArr2 = this.h;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.j - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.m));
        sb.append(',');
        sb.append(this.j);
        sb.append(')');
        return sb.toString();
    }
}
