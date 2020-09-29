package defpackage;

import android.os.RemoteException;

/* renamed from: bpw reason: default package */
public final class bpw {
    private static final ehw a = new ehw("DiscoveryManager", 0);
    private final bqj b;

    bpw(bqj bqj) {
        this.b = bqj;
    }

    public final car a() {
        try {
            return this.b.a();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "getWrappedThis", bqj.class.getSimpleName());
            return null;
        }
    }
}
