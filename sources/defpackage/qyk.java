package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;

/* renamed from: qyk reason: default package */
public final class qyk implements vua<qyj> {
    private final wlc<ioo> a;
    private final wlc<PlayOrigin> b;

    private qyk(wlc<ioo> wlc, wlc<PlayOrigin> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qyk a(wlc<ioo> wlc, wlc<PlayOrigin> wlc2) {
        return new qyk(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qyj((ioo) this.a.get(), (PlayOrigin) this.b.get());
    }
}
