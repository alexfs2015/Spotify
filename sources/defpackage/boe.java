package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: boe reason: default package */
public final class boe {
    public static final ehw a = new ehw("SessionManager", 0);
    public final bqp b;
    private final Context c;

    public boe(bqp bqp, Context context) {
        this.b = bqp;
        this.c = context;
    }

    public final bod a() {
        bwx.b("Must be called from the main thread.");
        try {
            return (bod) cas.a(this.b.a());
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", bqp.class.getSimpleName());
            return null;
        }
    }

    public final bnx b() {
        bwx.b("Must be called from the main thread.");
        bod a2 = a();
        if (a2 == null || !(a2 instanceof bnx)) {
            return null;
        }
        return (bnx) a2;
    }

    public final void a(boolean z) {
        bwx.b("Must be called from the main thread.");
        try {
            this.b.a(z);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "endCurrentSession", bqp.class.getSimpleName());
        }
    }

    public final <T extends bod> void a(bof<T> bof, Class<T> cls) {
        bwx.a(bof);
        bwx.a(cls);
        bwx.b("Must be called from the main thread.");
        try {
            this.b.a((bqr) new bpu(bof, cls));
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "addSessionManagerListener", bqp.class.getSimpleName());
        }
    }

    public final car c() {
        try {
            return this.b.b();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "getWrappedThis", bqp.class.getSimpleName());
            return null;
        }
    }
}
