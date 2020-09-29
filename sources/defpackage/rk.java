package defpackage;

import android.os.IBinder;

/* renamed from: rk reason: default package */
final class rk implements rm {
    private final IBinder a;

    rk(IBinder iBinder) {
        this.a = iBinder;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rk) && ((rk) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
