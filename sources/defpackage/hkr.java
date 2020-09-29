package defpackage;

import android.os.Binder;
import com.spotify.mobile.android.connect.ConnectManager;

/* renamed from: hkr reason: default package */
public class hkr extends Binder {
    public final hie a;
    private final ConnectManager b;
    private final hlf c;
    private final jkp d;

    hkr(hie hie, ConnectManager connectManager, hlf hlf, jkp jkp) {
        this.a = hie;
        this.b = connectManager;
        this.c = hlf;
        this.d = jkp;
    }

    public ConnectManager a() {
        return (ConnectManager) fbp.a(this.b);
    }
}
