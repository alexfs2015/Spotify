package defpackage;

import android.os.RemoteException;

/* renamed from: eis reason: default package */
public final class eis extends a {
    private static final ehw a = new ehw("MediaRouterCallback", 0);
    private final eiq b;

    public eis(eiq eiq) {
        this.b = (eiq) bwx.a(eiq);
    }

    public final void a(f fVar) {
        try {
            this.b.d(fVar.c, fVar.q);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onRouteSelected", eiq.class.getSimpleName());
        }
    }

    public final void a(nd ndVar, f fVar, int i) {
        try {
            this.b.a(fVar.c, fVar.q, i);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onRouteUnselected", eiq.class.getSimpleName());
        }
    }

    public final void a(nd ndVar, f fVar) {
        try {
            this.b.a(fVar.c, fVar.q);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onRouteAdded", eiq.class.getSimpleName());
        }
    }

    public final void c(nd ndVar, f fVar) {
        try {
            this.b.b(fVar.c, fVar.q);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onRouteChanged", eiq.class.getSimpleName());
        }
    }

    public final void b(nd ndVar, f fVar) {
        try {
            this.b.c(fVar.c, fVar.q);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onRouteRemoved", eiq.class.getSimpleName());
        }
    }
}
