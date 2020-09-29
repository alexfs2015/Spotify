package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: mvf reason: default package */
public final class mvf implements vua<mve> {
    private final wlc<a> a;
    private final wlc<muh> b;

    private mvf(wlc<a> wlc, wlc<muh> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mvf a(wlc<a> wlc, wlc<muh> wlc2) {
        return new mvf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mve((a) this.a.get(), (muh) this.b.get());
    }
}
