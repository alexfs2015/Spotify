package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import com.google.android.gms.internal.measurement.zzux;
import com.google.android.gms.internal.measurement.zzve;

/* renamed from: ema reason: default package */
public final class ema {
    final zzve a;
    private final byte[] b;

    private ema(int i) {
        this.b = new byte[i];
        this.a = zzve.a(this.b);
    }

    public final zzun a() {
        if (this.a.i() == 0) {
            return new zzux(this.b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public /* synthetic */ ema(int i, byte b2) {
        this(i);
    }
}
