package defpackage;

import android.os.Binder;
import com.spotify.mobile.android.connect.ConnectManager;

/* renamed from: hhx reason: default package */
public class hhx extends Binder {
    public final hfi a;
    private final ConnectManager b;
    private final hil c;
    private final jhz d;

    hhx(hfi hfi, ConnectManager connectManager, hil hil, jhz jhz) {
        this.a = hfi;
        this.b = connectManager;
        this.c = hil;
        this.d = jhz;
    }

    public ConnectManager a() {
        return (ConnectManager) fay.a(this.b);
    }
}
