package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;

/* renamed from: qpq reason: default package */
public final class qpq implements vua<qpp> {
    private final wlc<ConnectManager> a;

    private qpq(wlc<ConnectManager> wlc) {
        this.a = wlc;
    }

    public static qpq a(wlc<ConnectManager> wlc) {
        return new qpq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qpp((ConnectManager) this.a.get());
    }
}
