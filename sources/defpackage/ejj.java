package defpackage;

import android.os.RemoteException;

/* renamed from: ejj reason: default package */
public final class ejj extends a {
    private static final ein a = new ein("MediaRouterCallback", 0);
    private final ejh b;

    public ejj(ejh ejh) {
        this.b = (ejh) bxo.a(ejh);
    }

    public final void a(f fVar) {
        try {
            this.b.d(fVar.c, fVar.q);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onRouteSelected", ejh.class.getSimpleName());
        }
    }

    public final void a(ni niVar, f fVar) {
        try {
            this.b.a(fVar.c, fVar.q);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onRouteAdded", ejh.class.getSimpleName());
        }
    }

    public final void a(ni niVar, f fVar, int i) {
        try {
            this.b.a(fVar.c, fVar.q, i);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onRouteUnselected", ejh.class.getSimpleName());
        }
    }

    public final void b(ni niVar, f fVar) {
        try {
            this.b.c(fVar.c, fVar.q);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onRouteRemoved", ejh.class.getSimpleName());
        }
    }

    public final void c(ni niVar, f fVar) {
        try {
            this.b.b(fVar.c, fVar.q);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onRouteChanged", ejh.class.getSimpleName());
        }
    }
}
