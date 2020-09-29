package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;

/* renamed from: ore reason: default package */
public final class ore implements vua<ord> {
    private final wlc<PlayOrigin> a;

    private ore(wlc<PlayOrigin> wlc) {
        this.a = wlc;
    }

    public static ore a(wlc<PlayOrigin> wlc) {
        return new ore(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ord(this.a);
    }
}
