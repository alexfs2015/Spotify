package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import com.google.android.gms.internal.measurement.zzux;
import com.google.android.gms.internal.measurement.zzve;

/* renamed from: emr reason: default package */
public final class emr {
    final zzve a;
    private final byte[] b;

    private emr(int i) {
        this.b = new byte[i];
        this.a = zzve.a(this.b);
    }

    public /* synthetic */ emr(int i, byte b2) {
        this(i);
    }

    public final zzun a() {
        if (this.a.i() == 0) {
            return new zzux(this.b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }
}
