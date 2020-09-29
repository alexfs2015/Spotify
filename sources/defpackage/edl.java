package defpackage;

import android.os.RemoteException;

/* renamed from: edl reason: default package */
public final class edl extends dra {
    private final Object a = new Object();
    private volatile drc b;

    public final void a() {
        throw new RemoteException();
    }

    public final void a(drc drc) {
        synchronized (this.a) {
            this.b = drc;
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

    public final drc h() {
        drc drc;
        synchronized (this.a) {
            drc = this.b;
        }
        return drc;
    }

    public final boolean i() {
        throw new RemoteException();
    }

    public final boolean j() {
        throw new RemoteException();
    }
}
