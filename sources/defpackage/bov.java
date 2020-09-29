package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: bov reason: default package */
public final class bov {
    public static final ein a = new ein("SessionManager", 0);
    public final brg b;
    private final Context c;

    public bov(brg brg, Context context) {
        this.b = brg;
        this.c = context;
    }

    public final bou a() {
        bxo.b("Must be called from the main thread.");
        try {
            return (bou) cbj.a(this.b.a());
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", brg.class.getSimpleName());
            return null;
        }
    }

    public final <T extends bou> void a(bow<T> bow, Class<T> cls) {
        bxo.a(bow);
        bxo.a(cls);
        bxo.b("Must be called from the main thread.");
        try {
            this.b.a((bri) new bql(bow, cls));
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "addSessionManagerListener", brg.class.getSimpleName());
        }
    }

    public final void a(boolean z) {
        bxo.b("Must be called from the main thread.");
        try {
            this.b.a(z);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "endCurrentSession", brg.class.getSimpleName());
        }
    }

    public final boo b() {
        bxo.b("Must be called from the main thread.");
        bou a2 = a();
        if (a2 == null || !(a2 instanceof boo)) {
            return null;
        }
        return (boo) a2;
    }

    public final cbi c() {
        try {
            return this.b.b();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "getWrappedThis", brg.class.getSimpleName());
            return null;
        }
    }
}
