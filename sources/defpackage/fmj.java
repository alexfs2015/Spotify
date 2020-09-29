package defpackage;

import com.spotify.core.http.HttpConnection;

/* renamed from: fmj reason: default package */
public final class fmj {
    public static final fmj a = new fmj(4201, 4096, 1);
    public static final fmj b = new fmj(1033, 1024, 1);
    public static final fmj c = new fmj(67, 64, 1);
    public static final fmj d = new fmj(19, 16, 1);
    public static final fmj e = new fmj(285, 256, 0);
    public static final fmj f = new fmj(HttpConnection.kErrorHttpConnectTimeout, 256, 1);
    final int[] g;
    final int[] h;
    final fmk i;
    final int j;
    final int k;
    private final fmk l;
    private final int m;

    private fmj(int i2, int i3, int i4) {
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
        this.i = new fmk(this, new int[]{0});
        this.l = new fmk(this, new int[]{1});
    }

    static int a(int i2, int i3) {
        return i2 ^ i3;
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
