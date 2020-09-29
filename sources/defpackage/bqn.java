package defpackage;

import android.os.RemoteException;

/* renamed from: bqn reason: default package */
public final class bqn {
    private static final ein a = new ein("DiscoveryManager", 0);
    private final bra b;

    bqn(bra bra) {
        this.b = bra;
    }

    public final cbi a() {
        try {
            return this.b.a();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "getWrappedThis", bra.class.getSimpleName());
            return null;
        }
    }
}
