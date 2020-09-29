package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;

/* renamed from: soe reason: default package */
public final class soe implements vua<sod> {
    private final wlc<Activity> a;
    private final wlc<PlayerStateCompat> b;

    private soe(wlc<Activity> wlc, wlc<PlayerStateCompat> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static soe a(wlc<Activity> wlc, wlc<PlayerStateCompat> wlc2) {
        return new soe(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new sod((Activity) this.a.get(), (PlayerStateCompat) this.b.get());
    }
}
