package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.features.phonenumbersignup.datasource.AuthenticatorDataSource;

/* renamed from: oay reason: default package */
public final class oay implements vua<AuthenticatorDataSource> {
    private final wlc<a> a;
    private final wlc<gne> b;

    private oay(wlc<a> wlc, wlc<gne> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static oay a(wlc<a> wlc, wlc<gne> wlc2) {
        return new oay(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new AuthenticatorDataSource((a) this.a.get(), (gne) this.b.get());
    }
}
