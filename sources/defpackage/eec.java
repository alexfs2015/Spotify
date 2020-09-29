package defpackage;

import android.os.RemoteException;

/* renamed from: eec reason: default package */
public final class eec extends drr {
    private final Object a = new Object();
    private volatile drt b;

    public final void a() {
        throw new RemoteException();
    }

    public final void a(drt drt) {
        synchronized (this.a) {
            this.b = drt;
        }
    }

    public final void a(boolean z) {
        throw new RemoteException();
    }

    public final void b() {
        throw new RemoteException();
    }

    public final boolean c() {
        throw new RemoteException();
    }

    public final int d() {
        throw new RemoteException();
    }

    public final float e() {
        throw new RemoteException();
    }

    public final float f() {
        throw new RemoteException();
    }

    public final float g() {
        throw new RemoteException();
    }

    public final drt h() {
        drt drt;
        synchronized (this.a) {
            drt = this.b;
        }
        return drt;
    }

    public final boolean i() {
        throw new RemoteException();
    }

    public final boolean j() {
        throw new RemoteException();
    }
}
