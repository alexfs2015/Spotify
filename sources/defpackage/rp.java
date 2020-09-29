package defpackage;

import android.os.IBinder;

/* renamed from: rp reason: default package */
final class rp implements rr {
    private final IBinder a;

    rp(IBinder iBinder) {
        this.a = iBinder;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rp) && ((rp) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
