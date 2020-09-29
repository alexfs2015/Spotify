package defpackage;

import com.google.android.gms.internal.ads.zzaxl;
import com.google.android.gms.internal.ads.zzayd;
import java.util.Arrays;

/* renamed from: cwx reason: default package */
public final class cwx<P> {
    final P a;
    private final byte[] b;
    private final zzaxl c;
    private final zzayd d;

    public cwx(P p, byte[] bArr, zzaxl zzaxl, zzayd zzayd) {
        this.a = p;
        this.b = Arrays.copyOf(bArr, bArr.length);
        this.c = zzaxl;
        this.d = zzayd;
    }

    public final byte[] a() {
        byte[] bArr = this.b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
