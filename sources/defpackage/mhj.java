package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import io.reactivex.Observable;

/* renamed from: mhj reason: default package */
public final class mhj implements vua<mhi> {
    private final wlc<Observable<ConnectManager>> a;
    private final wlc<gkw> b;

    private mhj(wlc<Observable<ConnectManager>> wlc, wlc<gkw> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mhj a(wlc<Observable<ConnectManager>> wlc, wlc<gkw> wlc2) {
        return new mhj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mhi((Observable) this.a.get(), (gkw) this.b.get());
    }
}
