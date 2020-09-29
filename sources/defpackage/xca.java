package defpackage;

import com.spotify.mobile.android.core.internal.AudioDriver;

/* renamed from: xca reason: default package */
public final class xca {
    int a;
    final int[] b = new int[10];

    /* access modifiers changed from: 0000 */
    public final int a() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    public final xca a(int i, int i2) {
        if (i >= 0 && i < 10) {
            this.a = (1 << i) | this.a;
            this.b[i] = i2;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(int i) {
        return ((1 << i) & this.a) != 0;
    }

    /* access modifiers changed from: 0000 */
    public final int b() {
        return (this.a & 128) != 0 ? this.b[7] : AudioDriver.SPOTIFY_MAX_VOLUME;
    }
}
